package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.passport.Configs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u00ad\u0001\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0096\u0001\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/runtime/Composable;", "confirmButton", "Landroidx/compose/ui/Modifier;", "modifier", "dismissButton", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", b.H, "contentColor", "Landroidx/compose/ui/window/DialogProperties;", Configs.Params.PROPERTIES, "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "AlertDialog", MessengerShareContentUtility.BUTTONS, "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0115  */
    /* JADX WARN: Code duplicated, block: B:102:0x0119  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:108:0x012b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0139  */
    /* JADX WARN: Code duplicated, block: B:115:0x014f  */
    /* JADX WARN: Code duplicated, block: B:117:0x015c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:135:0x018e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0191  */
    /* JADX WARN: Code duplicated, block: B:139:0x0195  */
    /* JADX WARN: Code duplicated, block: B:141:0x0198  */
    /* JADX WARN: Code duplicated, block: B:142:0x019a  */
    /* JADX WARN: Code duplicated, block: B:145:0x019f  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:165:0x025d  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    @Composable
    /* JADX INFO: renamed from: AlertDialog-6oU6zVQ, reason: not valid java name */
    public static final void m555AlertDialog6oU6zVQ(@NotNull final Function0<Unit> function0, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, @Nullable Shape shape, long j, long j2, @Nullable DialogProperties dialogProperties, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        int i5;
        int i6;
        int i7;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function7;
        int i9;
        Shape shape2;
        long jM656contentColorForek8zF_U;
        DialogProperties dialogProperties2;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Shape medium;
        long jM642getSurface0d7_KjU;
        DialogProperties dialogProperties3;
        Function2<? super Composer, ? super Integer, Unit> function9;
        final int i10;
        long j3;
        final long j4;
        final Shape shape3;
        final DialogProperties dialogProperties4;
        final long j5;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function10;
        final Function2<? super Composer, ? super Integer, Unit> function11;
        final Function2<? super Composer, ? super Integer, Unit> function12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-585315846);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changed(function6)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(function4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((i & 458752) == 0) {
                            function7 = function5;
                            if (composerStartRestartGroup.changed(function7)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((i & 3670016) == 0) {
                            shape2 = shape;
                            if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(shape2)) {
                                i12 = 524288;
                            } else {
                                i12 = 1048576;
                            }
                            i3 |= i12;
                        } else {
                            shape2 = shape;
                        }
                        if ((i & 29360128) != 0) {
                            i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                        }
                        if ((i & 234881024) == 0) {
                            jM656contentColorForek8zF_U = j2;
                            if ((i2 & 256) == 0 || !composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                                i11 = 33554432;
                            } else {
                                i11 = 67108864;
                            }
                            i3 |= i11;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((1879048192 & i) == 0) {
                            if ((i2 & 512) == 0) {
                                dialogProperties2 = dialogProperties;
                                int i14 = composerStartRestartGroup.changed(dialogProperties2) ? 536870912 : 268435456;
                                i3 |= i14;
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            i3 |= i14;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        if (((i3 & 1533916891) ^ 306783378) == 0 || !composerStartRestartGroup.getSkipping()) {
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.startDefaults();
                                if (i13 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function4;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function13 = i8 == 0 ? function7 : null;
                                if ((i2 & 64) != 0) {
                                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                    i3 &= -3670017;
                                } else {
                                    medium = shape2;
                                }
                                if ((i2 & 128) != 0) {
                                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                    i3 &= -29360129;
                                } else {
                                    jM642getSurface0d7_KjU = j;
                                }
                                if ((i2 & 256) != 0) {
                                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                    i3 &= -234881025;
                                }
                                if ((i2 & 512) != 0) {
                                    dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                    i3 &= -1879048193;
                                }
                                composerStartRestartGroup.endDefaults();
                                Shape shape4 = medium;
                                dialogProperties3 = dialogProperties2;
                                function9 = function13;
                                modifier2 = modifier3;
                                long j6 = jM642getSurface0d7_KjU;
                                i10 = i3;
                                shape2 = shape4;
                                j3 = j6;
                            } else {
                                composerStartRestartGroup.skipCurrentGroup();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                if ((i2 & 512) != 0) {
                                    i3 &= -1879048193;
                                }
                                function8 = function4;
                                dialogProperties3 = dialogProperties2;
                                i10 = i3;
                                function9 = function7;
                                j3 = j;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function14 = function6;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                                    float f = 8;
                                    Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                                    final Function2<Composer, Integer, Unit> function15 = function6;
                                    final int i16 = i10;
                                    final Function2<Composer, Integer, Unit> function16 = function2;
                                    composer2.startReplaceableGroup(-1990474327);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-1253629305);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(350577062);
                                    AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                                return;
                                            }
                                            Function2<Composer, Integer, Unit> function17 = function15;
                                            if (function17 == null) {
                                                composer3.startReplaceableGroup(1918754550);
                                            } else {
                                                composer3.startReplaceableGroup(-1046483349);
                                                function17.invoke(composer3, Integer.valueOf((i16 >> 9) & 14));
                                            }
                                            composer3.endReplaceableGroup();
                                            function16.invoke(composer3, Integer.valueOf((i16 >> 3) & 14));
                                        }
                                    }), composer2, 438);
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                            });
                            int i15 = (i10 & 14) | 48 | (i10 & 896);
                            int i16 = i10 >> 3;
                            m556AlertDialogwqdebIU(function0, composableLambda, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i15 | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i16) | (458752 & i16) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024), 0);
                            j4 = jM656contentColorForek8zF_U;
                            shape3 = shape2;
                            dialogProperties4 = dialogProperties3;
                            j5 = j3;
                            modifier4 = modifier2;
                            function10 = function8;
                            function11 = function14;
                            function12 = function9;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            function11 = function6;
                            j4 = jM656contentColorForek8zF_U;
                            shape3 = shape2;
                            function12 = function7;
                            function10 = function4;
                            j5 = j;
                            dialogProperties4 = dialogProperties2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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
                                AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    function7 = function5;
                    if ((i & 3670016) == 0) {
                        shape2 = shape;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 29360128) != 0) {
                        i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                    }
                    if ((i & 234881024) == 0) {
                        jM656contentColorForek8zF_U = j2;
                        if ((i2 & 256) == 0) {
                            i11 = 33554432;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((1879048192 & i) == 0) {
                        if ((i2 & 512) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (composerStartRestartGroup.changed(dialogProperties2)) {
                            }
                            i3 |= i14;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if (((i3 & 1533916891) ^ 306783378) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape5 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j7 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape5;
                            j3 = j7;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape6 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j8 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape6;
                            j3 = j8;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function15 = function6;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                                float f = 8;
                                Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                                final Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                                final int i18 = i10;
                                final Function2<? super Composer, ? super Integer, Unit> function17 = function2;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(350577062);
                                AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                            return;
                                        }
                                        Function2<Composer, Integer, Unit> function18 = function16;
                                        if (function18 == null) {
                                            composer3.startReplaceableGroup(1918754550);
                                        } else {
                                            composer3.startReplaceableGroup(-1046483349);
                                            function18.invoke(composer3, Integer.valueOf((i18 >> 9) & 14));
                                        }
                                        composer3.endReplaceableGroup();
                                        function17.invoke(composer3, Integer.valueOf((i18 >> 3) & 14));
                                    }
                                }), composer2, 438);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i17 = (i10 & 14) | 48 | (i10 & 896);
                        int i18 = i10 >> 3;
                        m556AlertDialogwqdebIU(function0, composableLambda2, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i17 | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i18) | (458752 & i18) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024), 0);
                        j4 = jM656contentColorForek8zF_U;
                        shape3 = shape2;
                        dialogProperties4 = dialogProperties3;
                        j5 = j3;
                        modifier4 = modifier2;
                        function10 = function8;
                        function11 = function15;
                        function12 = function9;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape7 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j9 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape7;
                            j3 = j9;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape8 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j10 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape8;
                            j3 = j10;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                                float f = 8;
                                Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                                final Function2<? super Composer, ? super Integer, Unit> function17 = function6;
                                final int i110 = i10;
                                final Function2<? super Composer, ? super Integer, Unit> function18 = function2;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(350577062);
                                AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                            return;
                                        }
                                        Function2<Composer, Integer, Unit> function19 = function17;
                                        if (function19 == null) {
                                            composer3.startReplaceableGroup(1918754550);
                                        } else {
                                            composer3.startReplaceableGroup(-1046483349);
                                            function19.invoke(composer3, Integer.valueOf((i110 >> 9) & 14));
                                        }
                                        composer3.endReplaceableGroup();
                                        function18.invoke(composer3, Integer.valueOf((i110 >> 3) & 14));
                                    }
                                }), composer2, 438);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i19 = (i10 & 14) | 48 | (i10 & 896);
                        int i110 = i10 >> 3;
                        m556AlertDialogwqdebIU(function0, composableLambda3, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i19 | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i110) | (458752 & i110) | (i110 & 3670016) | (i110 & 29360128) | (i110 & 234881024), 0);
                        j4 = jM656contentColorForek8zF_U;
                        shape3 = shape2;
                        dialogProperties4 = dialogProperties3;
                        j5 = j3;
                        modifier4 = modifier2;
                        function10 = function8;
                        function11 = function16;
                        function12 = function9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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
                            AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((i & 458752) == 0) {
                        function7 = function5;
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i & 3670016) == 0) {
                        shape2 = shape;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 29360128) != 0) {
                        i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                    }
                    if ((i & 234881024) == 0) {
                        jM656contentColorForek8zF_U = j2;
                        if ((i2 & 256) == 0) {
                            i11 = 33554432;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((1879048192 & i) == 0) {
                        if ((i2 & 512) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (composerStartRestartGroup.changed(dialogProperties2)) {
                            }
                            i3 |= i14;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if (((i3 & 1533916891) ^ 306783378) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape9 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j11 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape9;
                            j3 = j11;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape10 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j12 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape10;
                            j3 = j12;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function17 = function6;
                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                                float f = 8;
                                Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                                final Function2<? super Composer, ? super Integer, Unit> function18 = function6;
                                final int i112 = i10;
                                final Function2<? super Composer, ? super Integer, Unit> function19 = function2;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(350577062);
                                AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                            return;
                                        }
                                        Function2<Composer, Integer, Unit> function110 = function18;
                                        if (function110 == null) {
                                            composer3.startReplaceableGroup(1918754550);
                                        } else {
                                            composer3.startReplaceableGroup(-1046483349);
                                            function110.invoke(composer3, Integer.valueOf((i112 >> 9) & 14));
                                        }
                                        composer3.endReplaceableGroup();
                                        function19.invoke(composer3, Integer.valueOf((i112 >> 3) & 14));
                                    }
                                }), composer2, 438);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i111 = (i10 & 14) | 48 | (i10 & 896);
                        int i112 = i10 >> 3;
                        m556AlertDialogwqdebIU(function0, composableLambda4, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i111 | (i112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i112) | (458752 & i112) | (i112 & 3670016) | (i112 & 29360128) | (i112 & 234881024), 0);
                        j4 = jM656contentColorForek8zF_U;
                        shape3 = shape2;
                        dialogProperties4 = dialogProperties3;
                        j5 = j3;
                        modifier4 = modifier2;
                        function10 = function8;
                        function11 = function17;
                        function12 = function9;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape11 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j13 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape11;
                            j3 = j13;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape12 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j14 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape12;
                            j3 = j14;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function18 = function6;
                        ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                                float f = 8;
                                Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                                final Function2<? super Composer, ? super Integer, Unit> function19 = function6;
                                final int i114 = i10;
                                final Function2<? super Composer, ? super Integer, Unit> function110 = function2;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(350577062);
                                AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                            return;
                                        }
                                        Function2<Composer, Integer, Unit> function111 = function19;
                                        if (function111 == null) {
                                            composer3.startReplaceableGroup(1918754550);
                                        } else {
                                            composer3.startReplaceableGroup(-1046483349);
                                            function111.invoke(composer3, Integer.valueOf((i114 >> 9) & 14));
                                        }
                                        composer3.endReplaceableGroup();
                                        function110.invoke(composer3, Integer.valueOf((i114 >> 3) & 14));
                                    }
                                }), composer2, 438);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i113 = (i10 & 14) | 48 | (i10 & 896);
                        int i114 = i10 >> 3;
                        m556AlertDialogwqdebIU(function0, composableLambda5, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i113 | (i114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i114) | (458752 & i114) | (i114 & 3670016) | (i114 & 29360128) | (i114 & 234881024), 0);
                        j4 = jM656contentColorForek8zF_U;
                        shape3 = shape2;
                        dialogProperties4 = dialogProperties3;
                        j5 = j3;
                        modifier4 = modifier2;
                        function10 = function8;
                        function11 = function18;
                        function12 = function9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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
                            AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                function7 = function5;
                if ((i & 3670016) == 0) {
                    shape2 = shape;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                }
                if ((i & 234881024) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if ((i2 & 256) == 0) {
                        i11 = 33554432;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((1879048192 & i) == 0) {
                    if ((i2 & 512) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape13 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j15 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape13;
                        j3 = j15;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape14 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j16 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape14;
                        j3 = j16;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function19 = function6;
                    ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function110 = function6;
                            final int i116 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function111 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function112 = function110;
                                    if (function112 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function112.invoke(composer3, Integer.valueOf((i116 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function111.invoke(composer3, Integer.valueOf((i116 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i115 = (i10 & 14) | 48 | (i10 & 896);
                    int i116 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda6, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i115 | (i116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i116) | (458752 & i116) | (i116 & 3670016) | (i116 & 29360128) | (i116 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function19;
                    function12 = function9;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape15 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j17 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape15;
                        j3 = j17;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape16 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j18 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape16;
                        j3 = j18;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function110 = function6;
                    ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function111 = function6;
                            final int i118 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function112 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function113 = function111;
                                    if (function113 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function113.invoke(composer3, Integer.valueOf((i118 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function112.invoke(composer3, Integer.valueOf((i118 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i117 = (i10 & 14) | 48 | (i10 & 896);
                    int i118 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda7, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i117 | (i118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i118) | (458752 & i118) | (i118 & 3670016) | (i118 & 29360128) | (i118 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function110;
                    function12 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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
                        AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            function6 = function3;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((i & 458752) == 0) {
                        function7 = function5;
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i & 3670016) == 0) {
                        shape2 = shape;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 29360128) != 0) {
                        i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                    }
                    if ((i & 234881024) == 0) {
                        jM656contentColorForek8zF_U = j2;
                        if ((i2 & 256) == 0) {
                            i11 = 33554432;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((1879048192 & i) == 0) {
                        if ((i2 & 512) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (composerStartRestartGroup.changed(dialogProperties2)) {
                            }
                            i3 |= i14;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if (((i3 & 1533916891) ^ 306783378) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape17 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j19 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape17;
                            j3 = j19;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape18 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j110 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape18;
                            j3 = j110;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function111 = function6;
                        ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                                float f = 8;
                                Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                                final Function2<? super Composer, ? super Integer, Unit> function112 = function6;
                                final int i1110 = i10;
                                final Function2<? super Composer, ? super Integer, Unit> function113 = function2;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(350577062);
                                AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                    public final void invoke(@Nullable Composer composer3, int i1111) {
                                        if (((i1111 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        Function2<Composer, Integer, Unit> function114 = function112;
                                        if (function114 == null) {
                                            composer3.startReplaceableGroup(1918754550);
                                        } else {
                                            composer3.startReplaceableGroup(-1046483349);
                                            function114.invoke(composer3, Integer.valueOf((i1110 >> 9) & 14));
                                        }
                                        composer3.endReplaceableGroup();
                                        function113.invoke(composer3, Integer.valueOf((i1110 >> 3) & 14));
                                    }
                                }), composer2, 438);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i119 = (i10 & 14) | 48 | (i10 & 896);
                        int i1110 = i10 >> 3;
                        m556AlertDialogwqdebIU(function0, composableLambda8, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i119 | (i1110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1110) | (458752 & i1110) | (i1110 & 3670016) | (i1110 & 29360128) | (i1110 & 234881024), 0);
                        j4 = jM656contentColorForek8zF_U;
                        shape3 = shape2;
                        dialogProperties4 = dialogProperties3;
                        j5 = j3;
                        modifier4 = modifier2;
                        function10 = function8;
                        function11 = function111;
                        function12 = function9;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape19 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j111 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape19;
                            j3 = j111;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape110 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j112 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape110;
                            j3 = j112;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function112 = function6;
                        ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                                float f = 8;
                                Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                                final Function2<? super Composer, ? super Integer, Unit> function113 = function6;
                                final int i1112 = i10;
                                final Function2<? super Composer, ? super Integer, Unit> function114 = function2;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(350577062);
                                AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                    public final void invoke(@Nullable Composer composer3, int i1113) {
                                        if (((i1113 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        Function2<Composer, Integer, Unit> function115 = function113;
                                        if (function115 == null) {
                                            composer3.startReplaceableGroup(1918754550);
                                        } else {
                                            composer3.startReplaceableGroup(-1046483349);
                                            function115.invoke(composer3, Integer.valueOf((i1112 >> 9) & 14));
                                        }
                                        composer3.endReplaceableGroup();
                                        function114.invoke(composer3, Integer.valueOf((i1112 >> 3) & 14));
                                    }
                                }), composer2, 438);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i1111 = (i10 & 14) | 48 | (i10 & 896);
                        int i1112 = i10 >> 3;
                        m556AlertDialogwqdebIU(function0, composableLambda9, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1111 | (i1112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1112) | (458752 & i1112) | (i1112 & 3670016) | (i1112 & 29360128) | (i1112 & 234881024), 0);
                        j4 = jM656contentColorForek8zF_U;
                        shape3 = shape2;
                        dialogProperties4 = dialogProperties3;
                        j5 = j3;
                        modifier4 = modifier2;
                        function10 = function8;
                        function11 = function112;
                        function12 = function9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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
                            AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                function7 = function5;
                if ((i & 3670016) == 0) {
                    shape2 = shape;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                }
                if ((i & 234881024) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if ((i2 & 256) == 0) {
                        i11 = 33554432;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((1879048192 & i) == 0) {
                    if ((i2 & 512) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape111 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j113 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape111;
                        j3 = j113;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape112 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j114 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape112;
                        j3 = j114;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function113 = function6;
                    ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                            final int i1114 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function115 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i1115) {
                                    if (((i1115 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function116 = function114;
                                    if (function116 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function116.invoke(composer3, Integer.valueOf((i1114 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function115.invoke(composer3, Integer.valueOf((i1114 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1113 = (i10 & 14) | 48 | (i10 & 896);
                    int i1114 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda10, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1113 | (i1114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1114) | (458752 & i1114) | (i1114 & 3670016) | (i1114 & 29360128) | (i1114 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function113;
                    function12 = function9;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape113 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j115 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape113;
                        j3 = j115;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape114 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j116 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape114;
                        j3 = j116;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                    ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function115 = function6;
                            final int i1116 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function116 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i1117) {
                                    if (((i1117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function117 = function115;
                                    if (function117 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function117.invoke(composer3, Integer.valueOf((i1116 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function116.invoke(composer3, Integer.valueOf((i1116 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1115 = (i10 & 14) | 48 | (i10 & 896);
                    int i1116 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda11, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1115 | (i1116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1116) | (458752 & i1116) | (i1116 & 3670016) | (i1116 & 29360128) | (i1116 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function114;
                    function12 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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
                        AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((i & 458752) == 0) {
                    function7 = function5;
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i & 3670016) == 0) {
                    shape2 = shape;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                }
                if ((i & 234881024) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if ((i2 & 256) == 0) {
                        i11 = 33554432;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((1879048192 & i) == 0) {
                    if ((i2 & 512) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape115 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j117 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape115;
                        j3 = j117;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape116 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j118 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape116;
                        j3 = j118;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function115 = function6;
                    ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function116 = function6;
                            final int i1118 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function117 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i1119) {
                                    if (((i1119 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function118 = function116;
                                    if (function118 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function118.invoke(composer3, Integer.valueOf((i1118 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function117.invoke(composer3, Integer.valueOf((i1118 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1117 = (i10 & 14) | 48 | (i10 & 896);
                    int i1118 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda12, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1117 | (i1118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1118) | (458752 & i1118) | (i1118 & 3670016) | (i1118 & 29360128) | (i1118 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function115;
                    function12 = function9;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape117 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j119 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape117;
                        j3 = j119;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape118 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j1110 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape118;
                        j3 = j1110;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function116 = function6;
                    ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function117 = function6;
                            final int i11110 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function118 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i11111) {
                                    if (((i11111 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function119 = function117;
                                    if (function119 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function119.invoke(composer3, Integer.valueOf((i11110 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function118.invoke(composer3, Integer.valueOf((i11110 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1119 = (i10 & 14) | 48 | (i10 & 896);
                    int i11110 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda13, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1119 | (i11110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11110) | (458752 & i11110) | (i11110 & 3670016) | (i11110 & 29360128) | (i11110 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function116;
                    function12 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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
                        AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            function7 = function5;
            if ((i & 3670016) == 0) {
                shape2 = shape;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
            }
            if ((i & 234881024) == 0) {
                jM656contentColorForek8zF_U = j2;
                if ((i2 & 256) == 0) {
                    i11 = 33554432;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if ((1879048192 & i) == 0) {
                if ((i2 & 512) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                i3 |= i14;
            } else {
                dialogProperties2 = dialogProperties;
            }
            if (((i3 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape119 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j1111 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape119;
                    j3 = j1111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape1110 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j1112 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape1110;
                    j3 = j1112;
                }
                Function2<? super Composer, ? super Integer, Unit> function117 = function6;
                ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                        float f = 8;
                        Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                        final Function2<? super Composer, ? super Integer, Unit> function118 = function6;
                        final int i11112 = i10;
                        final Function2<? super Composer, ? super Integer, Unit> function119 = function2;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(350577062);
                        AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i11113) {
                                if (((i11113 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Function2<Composer, Integer, Unit> function1110 = function118;
                                if (function1110 == null) {
                                    composer3.startReplaceableGroup(1918754550);
                                } else {
                                    composer3.startReplaceableGroup(-1046483349);
                                    function1110.invoke(composer3, Integer.valueOf((i11112 >> 9) & 14));
                                }
                                composer3.endReplaceableGroup();
                                function119.invoke(composer3, Integer.valueOf((i11112 >> 3) & 14));
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11111 = (i10 & 14) | 48 | (i10 & 896);
                int i11112 = i10 >> 3;
                m556AlertDialogwqdebIU(function0, composableLambda14, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i11111 | (i11112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11112) | (458752 & i11112) | (i11112 & 3670016) | (i11112 & 29360128) | (i11112 & 234881024), 0);
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
                dialogProperties4 = dialogProperties3;
                j5 = j3;
                modifier4 = modifier2;
                function10 = function8;
                function11 = function117;
                function12 = function9;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape1111 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j1113 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape1111;
                    j3 = j1113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape1112 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j1114 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape1112;
                    j3 = j1114;
                }
                Function2<? super Composer, ? super Integer, Unit> function118 = function6;
                ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                    public final void invoke(@Nullable Composer composer2, int i11113) {
                        if (((i11113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        float f = 8;
                        Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                        final Function2<? super Composer, ? super Integer, Unit> function119 = function6;
                        final int i11114 = i10;
                        final Function2<? super Composer, ? super Integer, Unit> function1110 = function2;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(350577062);
                        AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i11115) {
                                if (((i11115 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Function2<Composer, Integer, Unit> function1111 = function119;
                                if (function1111 == null) {
                                    composer3.startReplaceableGroup(1918754550);
                                } else {
                                    composer3.startReplaceableGroup(-1046483349);
                                    function1111.invoke(composer3, Integer.valueOf((i11114 >> 9) & 14));
                                }
                                composer3.endReplaceableGroup();
                                function1110.invoke(composer3, Integer.valueOf((i11114 >> 3) & 14));
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11113 = (i10 & 14) | 48 | (i10 & 896);
                int i11114 = i10 >> 3;
                m556AlertDialogwqdebIU(function0, composableLambda15, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i11113 | (i11114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11114) | (458752 & i11114) | (i11114 & 3670016) | (i11114 & 29360128) | (i11114 & 234881024), 0);
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
                dialogProperties4 = dialogProperties3;
                j5 = j3;
                modifier4 = modifier2;
                function10 = function8;
                function11 = function118;
                function12 = function9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

                public final void invoke(@Nullable Composer composer2, int i11115) {
                    AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                function6 = function3;
                if (composerStartRestartGroup.changed(function6)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((i & 458752) == 0) {
                        function7 = function5;
                        if (composerStartRestartGroup.changed(function7)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i & 3670016) == 0) {
                        shape2 = shape;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 29360128) != 0) {
                        i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                    }
                    if ((i & 234881024) == 0) {
                        jM656contentColorForek8zF_U = j2;
                        if ((i2 & 256) == 0) {
                            i11 = 33554432;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((1879048192 & i) == 0) {
                        if ((i2 & 512) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (composerStartRestartGroup.changed(dialogProperties2)) {
                            }
                            i3 |= i14;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if (((i3 & 1533916891) ^ 306783378) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape1113 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j1115 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape1113;
                            j3 = j1115;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape1114 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j1116 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape1114;
                            j3 = j1116;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function119 = function6;
                        ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                            public final void invoke(@Nullable Composer composer2, int i11115) {
                                if (((i11115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                float f = 8;
                                Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                                final Function2<? super Composer, ? super Integer, Unit> function1110 = function6;
                                final int i11116 = i10;
                                final Function2<? super Composer, ? super Integer, Unit> function1111 = function2;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(350577062);
                                AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                    public final void invoke(@Nullable Composer composer3, int i11117) {
                                        if (((i11117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        Function2<Composer, Integer, Unit> function1112 = function1110;
                                        if (function1112 == null) {
                                            composer3.startReplaceableGroup(1918754550);
                                        } else {
                                            composer3.startReplaceableGroup(-1046483349);
                                            function1112.invoke(composer3, Integer.valueOf((i11116 >> 9) & 14));
                                        }
                                        composer3.endReplaceableGroup();
                                        function1111.invoke(composer3, Integer.valueOf((i11116 >> 3) & 14));
                                    }
                                }), composer2, 438);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i11115 = (i10 & 14) | 48 | (i10 & 896);
                        int i11116 = i10 >> 3;
                        m556AlertDialogwqdebIU(function0, composableLambda16, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i11115 | (i11116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11116) | (458752 & i11116) | (i11116 & 3670016) | (i11116 & 29360128) | (i11116 & 234881024), 0);
                        j4 = jM656contentColorForek8zF_U;
                        shape3 = shape2;
                        dialogProperties4 = dialogProperties3;
                        j5 = j3;
                        modifier4 = modifier2;
                        function10 = function8;
                        function11 = function119;
                        function12 = function9;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape1115 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j1117 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape1115;
                            j3 = j1117;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i13 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 128) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -29360129;
                            } else {
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i2 & 256) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                                i3 &= -234881025;
                            }
                            if ((i2 & 512) != 0) {
                                dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -1879048193;
                            }
                            composerStartRestartGroup.endDefaults();
                            Shape shape1116 = medium;
                            dialogProperties3 = dialogProperties2;
                            function9 = function13;
                            modifier2 = modifier3;
                            long j1118 = jM642getSurface0d7_KjU;
                            i10 = i3;
                            shape2 = shape1116;
                            j3 = j1118;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function1110 = function6;
                        ComposableLambda composableLambda17 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                            public final void invoke(@Nullable Composer composer2, int i11117) {
                                if (((i11117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                float f = 8;
                                Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                                final Function2<? super Composer, ? super Integer, Unit> function1111 = function6;
                                final int i11118 = i10;
                                final Function2<? super Composer, ? super Integer, Unit> function1112 = function2;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(350577062);
                                AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                    public final void invoke(@Nullable Composer composer3, int i11119) {
                                        if (((i11119 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        Function2<Composer, Integer, Unit> function1113 = function1111;
                                        if (function1113 == null) {
                                            composer3.startReplaceableGroup(1918754550);
                                        } else {
                                            composer3.startReplaceableGroup(-1046483349);
                                            function1113.invoke(composer3, Integer.valueOf((i11118 >> 9) & 14));
                                        }
                                        composer3.endReplaceableGroup();
                                        function1112.invoke(composer3, Integer.valueOf((i11118 >> 3) & 14));
                                    }
                                }), composer2, 438);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i11117 = (i10 & 14) | 48 | (i10 & 896);
                        int i11118 = i10 >> 3;
                        m556AlertDialogwqdebIU(function0, composableLambda17, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i11117 | (i11118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11118) | (458752 & i11118) | (i11118 & 3670016) | (i11118 & 29360128) | (i11118 & 234881024), 0);
                        j4 = jM656contentColorForek8zF_U;
                        shape3 = shape2;
                        dialogProperties4 = dialogProperties3;
                        j5 = j3;
                        modifier4 = modifier2;
                        function10 = function8;
                        function11 = function1110;
                        function12 = function9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

                        public final void invoke(@Nullable Composer composer2, int i11119) {
                            AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                function7 = function5;
                if ((i & 3670016) == 0) {
                    shape2 = shape;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                }
                if ((i & 234881024) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if ((i2 & 256) == 0) {
                        i11 = 33554432;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((1879048192 & i) == 0) {
                    if ((i2 & 512) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape1117 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j1119 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape1117;
                        j3 = j1119;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape1118 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j11110 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape1118;
                        j3 = j11110;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1111 = function6;
                    ComposableLambda composableLambda18 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                        public final void invoke(@Nullable Composer composer2, int i11119) {
                            if (((i11119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function1112 = function6;
                            final int i111110 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function1113 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i111111) {
                                    if (((i111111 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function1114 = function1112;
                                    if (function1114 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function1114.invoke(composer3, Integer.valueOf((i111110 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function1113.invoke(composer3, Integer.valueOf((i111110 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i11119 = (i10 & 14) | 48 | (i10 & 896);
                    int i111110 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda18, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i11119 | (i111110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111110) | (458752 & i111110) | (i111110 & 3670016) | (i111110 & 29360128) | (i111110 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function1111;
                    function12 = function9;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape1119 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j11111 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape1119;
                        j3 = j11111;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape11110 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j11112 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape11110;
                        j3 = j11112;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1112 = function6;
                    ComposableLambda composableLambda19 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                        public final void invoke(@Nullable Composer composer2, int i111111) {
                            if (((i111111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function1113 = function6;
                            final int i111112 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function1114 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i111113) {
                                    if (((i111113 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function1115 = function1113;
                                    if (function1115 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function1115.invoke(composer3, Integer.valueOf((i111112 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function1114.invoke(composer3, Integer.valueOf((i111112 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i111111 = (i10 & 14) | 48 | (i10 & 896);
                    int i111112 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda19, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i111111 | (i111112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111112) | (458752 & i111112) | (i111112 & 3670016) | (i111112 & 29360128) | (i111112 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function1112;
                    function12 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

                    public final void invoke(@Nullable Composer composer2, int i111113) {
                        AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((i & 458752) == 0) {
                    function7 = function5;
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i & 3670016) == 0) {
                    shape2 = shape;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                }
                if ((i & 234881024) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if ((i2 & 256) == 0) {
                        i11 = 33554432;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((1879048192 & i) == 0) {
                    if ((i2 & 512) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape11111 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j11113 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape11111;
                        j3 = j11113;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape11112 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j11114 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape11112;
                        j3 = j11114;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1113 = function6;
                    ComposableLambda composableLambda110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                        public final void invoke(@Nullable Composer composer2, int i111113) {
                            if (((i111113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function1114 = function6;
                            final int i111114 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function1115 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i111115) {
                                    if (((i111115 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function1116 = function1114;
                                    if (function1116 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function1116.invoke(composer3, Integer.valueOf((i111114 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function1115.invoke(composer3, Integer.valueOf((i111114 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i111113 = (i10 & 14) | 48 | (i10 & 896);
                    int i111114 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda110, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i111113 | (i111114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111114) | (458752 & i111114) | (i111114 & 3670016) | (i111114 & 29360128) | (i111114 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function1113;
                    function12 = function9;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape11113 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j11115 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape11113;
                        j3 = j11115;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape11114 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j11116 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape11114;
                        j3 = j11116;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1114 = function6;
                    ComposableLambda composableLambda111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                        public final void invoke(@Nullable Composer composer2, int i111115) {
                            if (((i111115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function1115 = function6;
                            final int i111116 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function1116 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i111117) {
                                    if (((i111117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function1117 = function1115;
                                    if (function1117 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function1117.invoke(composer3, Integer.valueOf((i111116 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function1116.invoke(composer3, Integer.valueOf((i111116 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i111115 = (i10 & 14) | 48 | (i10 & 896);
                    int i111116 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda111, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i111115 | (i111116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111116) | (458752 & i111116) | (i111116 & 3670016) | (i111116 & 29360128) | (i111116 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function1114;
                    function12 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

                    public final void invoke(@Nullable Composer composer2, int i111117) {
                        AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            function7 = function5;
            if ((i & 3670016) == 0) {
                shape2 = shape;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
            }
            if ((i & 234881024) == 0) {
                jM656contentColorForek8zF_U = j2;
                if ((i2 & 256) == 0) {
                    i11 = 33554432;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if ((1879048192 & i) == 0) {
                if ((i2 & 512) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                i3 |= i14;
            } else {
                dialogProperties2 = dialogProperties;
            }
            if (((i3 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape11115 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j11117 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape11115;
                    j3 = j11117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape11116 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j11118 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape11116;
                    j3 = j11118;
                }
                Function2<? super Composer, ? super Integer, Unit> function1115 = function6;
                ComposableLambda composableLambda112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                    public final void invoke(@Nullable Composer composer2, int i111117) {
                        if (((i111117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        float f = 8;
                        Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                        final Function2<? super Composer, ? super Integer, Unit> function1116 = function6;
                        final int i111118 = i10;
                        final Function2<? super Composer, ? super Integer, Unit> function1117 = function2;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(350577062);
                        AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i111119) {
                                if (((i111119 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Function2<Composer, Integer, Unit> function1118 = function1116;
                                if (function1118 == null) {
                                    composer3.startReplaceableGroup(1918754550);
                                } else {
                                    composer3.startReplaceableGroup(-1046483349);
                                    function1118.invoke(composer3, Integer.valueOf((i111118 >> 9) & 14));
                                }
                                composer3.endReplaceableGroup();
                                function1117.invoke(composer3, Integer.valueOf((i111118 >> 3) & 14));
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i111117 = (i10 & 14) | 48 | (i10 & 896);
                int i111118 = i10 >> 3;
                m556AlertDialogwqdebIU(function0, composableLambda112, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i111117 | (i111118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111118) | (458752 & i111118) | (i111118 & 3670016) | (i111118 & 29360128) | (i111118 & 234881024), 0);
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
                dialogProperties4 = dialogProperties3;
                j5 = j3;
                modifier4 = modifier2;
                function10 = function8;
                function11 = function1115;
                function12 = function9;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape11117 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j11119 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape11117;
                    j3 = j11119;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape11118 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j111110 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape11118;
                    j3 = j111110;
                }
                Function2<? super Composer, ? super Integer, Unit> function1116 = function6;
                ComposableLambda composableLambda113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                    public final void invoke(@Nullable Composer composer2, int i111119) {
                        if (((i111119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        float f = 8;
                        Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                        final Function2<? super Composer, ? super Integer, Unit> function1117 = function6;
                        final int i1111110 = i10;
                        final Function2<? super Composer, ? super Integer, Unit> function1118 = function2;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(350577062);
                        AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i1111111) {
                                if (((i1111111 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Function2<Composer, Integer, Unit> function1119 = function1117;
                                if (function1119 == null) {
                                    composer3.startReplaceableGroup(1918754550);
                                } else {
                                    composer3.startReplaceableGroup(-1046483349);
                                    function1119.invoke(composer3, Integer.valueOf((i1111110 >> 9) & 14));
                                }
                                composer3.endReplaceableGroup();
                                function1118.invoke(composer3, Integer.valueOf((i1111110 >> 3) & 14));
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i111119 = (i10 & 14) | 48 | (i10 & 896);
                int i1111110 = i10 >> 3;
                m556AlertDialogwqdebIU(function0, composableLambda113, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i111119 | (i1111110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111110) | (458752 & i1111110) | (i1111110 & 3670016) | (i1111110 & 29360128) | (i1111110 & 234881024), 0);
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
                dialogProperties4 = dialogProperties3;
                j5 = j3;
                modifier4 = modifier2;
                function10 = function8;
                function11 = function1116;
                function12 = function9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

                public final void invoke(@Nullable Composer composer2, int i1111111) {
                    AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        function6 = function3;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((i & 458752) == 0) {
                    function7 = function5;
                    if (composerStartRestartGroup.changed(function7)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i & 3670016) == 0) {
                    shape2 = shape;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
                }
                if ((i & 234881024) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if ((i2 & 256) == 0) {
                        i11 = 33554432;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((1879048192 & i) == 0) {
                    if ((i2 & 512) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i14;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape11119 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j111111 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape11119;
                        j3 = j111111;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape111110 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j111112 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape111110;
                        j3 = j111112;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1117 = function6;
                    ComposableLambda composableLambda114 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                        public final void invoke(@Nullable Composer composer2, int i1111111) {
                            if (((i1111111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function1118 = function6;
                            final int i1111112 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function1119 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i1111113) {
                                    if (((i1111113 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function11110 = function1118;
                                    if (function11110 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function11110.invoke(composer3, Integer.valueOf((i1111112 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function1119.invoke(composer3, Integer.valueOf((i1111112 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1111111 = (i10 & 14) | 48 | (i10 & 896);
                    int i1111112 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda114, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1111111 | (i1111112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111112) | (458752 & i1111112) | (i1111112 & 3670016) | (i1111112 & 29360128) | (i1111112 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function1117;
                    function12 = function9;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape111111 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j111113 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape111111;
                        j3 = j111113;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 128) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -29360129;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i2 & 256) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -1879048193;
                        }
                        composerStartRestartGroup.endDefaults();
                        Shape shape111112 = medium;
                        dialogProperties3 = dialogProperties2;
                        function9 = function13;
                        modifier2 = modifier3;
                        long j111114 = jM642getSurface0d7_KjU;
                        i10 = i3;
                        shape2 = shape111112;
                        j3 = j111114;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1118 = function6;
                    ComposableLambda composableLambda115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                        public final void invoke(@Nullable Composer composer2, int i1111113) {
                            if (((i1111113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            float f = 8;
                            Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                            final Function2<? super Composer, ? super Integer, Unit> function1119 = function6;
                            final int i1111114 = i10;
                            final Function2<? super Composer, ? super Integer, Unit> function11110 = function2;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(350577062);
                            AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i1111115) {
                                    if (((i1111115 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Function2<Composer, Integer, Unit> function11111 = function1119;
                                    if (function11111 == null) {
                                        composer3.startReplaceableGroup(1918754550);
                                    } else {
                                        composer3.startReplaceableGroup(-1046483349);
                                        function11111.invoke(composer3, Integer.valueOf((i1111114 >> 9) & 14));
                                    }
                                    composer3.endReplaceableGroup();
                                    function11110.invoke(composer3, Integer.valueOf((i1111114 >> 3) & 14));
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1111113 = (i10 & 14) | 48 | (i10 & 896);
                    int i1111114 = i10 >> 3;
                    m556AlertDialogwqdebIU(function0, composableLambda115, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1111113 | (i1111114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111114) | (458752 & i1111114) | (i1111114 & 3670016) | (i1111114 & 29360128) | (i1111114 & 234881024), 0);
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    dialogProperties4 = dialogProperties3;
                    j5 = j3;
                    modifier4 = modifier2;
                    function10 = function8;
                    function11 = function1118;
                    function12 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

                    public final void invoke(@Nullable Composer composer2, int i1111115) {
                        AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            function7 = function5;
            if ((i & 3670016) == 0) {
                shape2 = shape;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
            }
            if ((i & 234881024) == 0) {
                jM656contentColorForek8zF_U = j2;
                if ((i2 & 256) == 0) {
                    i11 = 33554432;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if ((1879048192 & i) == 0) {
                if ((i2 & 512) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                i3 |= i14;
            } else {
                dialogProperties2 = dialogProperties;
            }
            if (((i3 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape111113 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j111115 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape111113;
                    j3 = j111115;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape111114 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j111116 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape111114;
                    j3 = j111116;
                }
                Function2<? super Composer, ? super Integer, Unit> function1119 = function6;
                ComposableLambda composableLambda116 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                    public final void invoke(@Nullable Composer composer2, int i1111115) {
                        if (((i1111115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        float f = 8;
                        Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                        final Function2<? super Composer, ? super Integer, Unit> function11110 = function6;
                        final int i1111116 = i10;
                        final Function2<? super Composer, ? super Integer, Unit> function11111 = function2;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(350577062);
                        AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i1111117) {
                                if (((i1111117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Function2<Composer, Integer, Unit> function11112 = function11110;
                                if (function11112 == null) {
                                    composer3.startReplaceableGroup(1918754550);
                                } else {
                                    composer3.startReplaceableGroup(-1046483349);
                                    function11112.invoke(composer3, Integer.valueOf((i1111116 >> 9) & 14));
                                }
                                composer3.endReplaceableGroup();
                                function11111.invoke(composer3, Integer.valueOf((i1111116 >> 3) & 14));
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i1111115 = (i10 & 14) | 48 | (i10 & 896);
                int i1111116 = i10 >> 3;
                m556AlertDialogwqdebIU(function0, composableLambda116, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1111115 | (i1111116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111116) | (458752 & i1111116) | (i1111116 & 3670016) | (i1111116 & 29360128) | (i1111116 & 234881024), 0);
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
                dialogProperties4 = dialogProperties3;
                j5 = j3;
                modifier4 = modifier2;
                function10 = function8;
                function11 = function1119;
                function12 = function9;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape111115 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j111117 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape111115;
                    j3 = j111117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape111116 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j111118 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape111116;
                    j3 = j111118;
                }
                Function2<? super Composer, ? super Integer, Unit> function11110 = function6;
                ComposableLambda composableLambda117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                    public final void invoke(@Nullable Composer composer2, int i1111117) {
                        if (((i1111117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        float f = 8;
                        Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                        final Function2<? super Composer, ? super Integer, Unit> function11111 = function6;
                        final int i1111118 = i10;
                        final Function2<? super Composer, ? super Integer, Unit> function11112 = function2;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(350577062);
                        AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i1111119) {
                                if (((i1111119 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Function2<Composer, Integer, Unit> function11113 = function11111;
                                if (function11113 == null) {
                                    composer3.startReplaceableGroup(1918754550);
                                } else {
                                    composer3.startReplaceableGroup(-1046483349);
                                    function11113.invoke(composer3, Integer.valueOf((i1111118 >> 9) & 14));
                                }
                                composer3.endReplaceableGroup();
                                function11112.invoke(composer3, Integer.valueOf((i1111118 >> 3) & 14));
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i1111117 = (i10 & 14) | 48 | (i10 & 896);
                int i1111118 = i10 >> 3;
                m556AlertDialogwqdebIU(function0, composableLambda117, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1111117 | (i1111118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111118) | (458752 & i1111118) | (i1111118 & 3670016) | (i1111118 & 29360128) | (i1111118 & 234881024), 0);
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
                dialogProperties4 = dialogProperties3;
                j5 = j3;
                modifier4 = modifier2;
                function10 = function8;
                function11 = function11110;
                function12 = function9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

                public final void invoke(@Nullable Composer composer2, int i1111119) {
                    AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((i & 458752) == 0) {
                function7 = function5;
                if (composerStartRestartGroup.changed(function7)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i & 3670016) == 0) {
                shape2 = shape;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
            }
            if ((i & 234881024) == 0) {
                jM656contentColorForek8zF_U = j2;
                if ((i2 & 256) == 0) {
                    i11 = 33554432;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if ((1879048192 & i) == 0) {
                if ((i2 & 512) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                    }
                    i3 |= i14;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                i3 |= i14;
            } else {
                dialogProperties2 = dialogProperties;
            }
            if (((i3 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape111117 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j111119 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape111117;
                    j3 = j111119;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape111118 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j1111110 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape111118;
                    j3 = j1111110;
                }
                Function2<? super Composer, ? super Integer, Unit> function11111 = function6;
                ComposableLambda composableLambda118 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                    public final void invoke(@Nullable Composer composer2, int i1111119) {
                        if (((i1111119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        float f = 8;
                        Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                        final Function2<? super Composer, ? super Integer, Unit> function11112 = function6;
                        final int i11111110 = i10;
                        final Function2<? super Composer, ? super Integer, Unit> function11113 = function2;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(350577062);
                        AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i11111111) {
                                if (((i11111111 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Function2<Composer, Integer, Unit> function11114 = function11112;
                                if (function11114 == null) {
                                    composer3.startReplaceableGroup(1918754550);
                                } else {
                                    composer3.startReplaceableGroup(-1046483349);
                                    function11114.invoke(composer3, Integer.valueOf((i11111110 >> 9) & 14));
                                }
                                composer3.endReplaceableGroup();
                                function11113.invoke(composer3, Integer.valueOf((i11111110 >> 3) & 14));
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i1111119 = (i10 & 14) | 48 | (i10 & 896);
                int i11111110 = i10 >> 3;
                m556AlertDialogwqdebIU(function0, composableLambda118, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i1111119 | (i11111110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11111110) | (458752 & i11111110) | (i11111110 & 3670016) | (i11111110 & 29360128) | (i11111110 & 234881024), 0);
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
                dialogProperties4 = dialogProperties3;
                j5 = j3;
                modifier4 = modifier2;
                function10 = function8;
                function11 = function11111;
                function12 = function9;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape111119 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j1111111 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape111119;
                    j3 = j1111111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 128) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -29360129;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i2 & 256) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -1879048193;
                    }
                    composerStartRestartGroup.endDefaults();
                    Shape shape1111110 = medium;
                    dialogProperties3 = dialogProperties2;
                    function9 = function13;
                    modifier2 = modifier3;
                    long j1111112 = jM642getSurface0d7_KjU;
                    i10 = i3;
                    shape2 = shape1111110;
                    j3 = j1111112;
                }
                Function2<? super Composer, ? super Integer, Unit> function11112 = function6;
                ComposableLambda composableLambda119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                    public final void invoke(@Nullable Composer composer2, int i11111111) {
                        if (((i11111111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        float f = 8;
                        Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                        final Function2<? super Composer, ? super Integer, Unit> function11113 = function6;
                        final int i11111112 = i10;
                        final Function2<? super Composer, ? super Integer, Unit> function11114 = function2;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(350577062);
                        AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i11111113) {
                                if (((i11111113 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Function2<Composer, Integer, Unit> function11115 = function11113;
                                if (function11115 == null) {
                                    composer3.startReplaceableGroup(1918754550);
                                } else {
                                    composer3.startReplaceableGroup(-1046483349);
                                    function11115.invoke(composer3, Integer.valueOf((i11111112 >> 9) & 14));
                                }
                                composer3.endReplaceableGroup();
                                function11114.invoke(composer3, Integer.valueOf((i11111112 >> 3) & 14));
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11111111 = (i10 & 14) | 48 | (i10 & 896);
                int i11111112 = i10 >> 3;
                m556AlertDialogwqdebIU(function0, composableLambda119, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i11111111 | (i11111112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11111112) | (458752 & i11111112) | (i11111112 & 3670016) | (i11111112 & 29360128) | (i11111112 & 234881024), 0);
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
                dialogProperties4 = dialogProperties3;
                j5 = j3;
                modifier4 = modifier2;
                function10 = function8;
                function11 = function11112;
                function12 = function9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

                public final void invoke(@Nullable Composer composer2, int i11111113) {
                    AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 196608;
        function7 = function5;
        if ((i & 3670016) == 0) {
            shape2 = shape;
            if ((i2 & 64) == 0) {
                i12 = 524288;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        } else {
            shape2 = shape;
        }
        if ((i & 29360128) != 0) {
            i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) ? 4194304 : 8388608;
        }
        if ((i & 234881024) == 0) {
            jM656contentColorForek8zF_U = j2;
            if ((i2 & 256) == 0) {
                i11 = 33554432;
            } else {
                i11 = 33554432;
            }
            i3 |= i11;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        if ((1879048192 & i) == 0) {
            if ((i2 & 512) == 0) {
                dialogProperties2 = dialogProperties;
                if (composerStartRestartGroup.changed(dialogProperties2)) {
                }
                i3 |= i14;
            } else {
                dialogProperties2 = dialogProperties;
            }
            i3 |= i14;
        } else {
            dialogProperties2 = dialogProperties;
        }
        if (((i3 & 1533916891) ^ 306783378) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function6 = null;
                }
                if (i6 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (i8 == 0) {
                }
                if ((i2 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= -3670017;
                } else {
                    medium = shape2;
                }
                if ((i2 & 128) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -29360129;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((i2 & 256) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                    i3 &= -234881025;
                }
                if ((i2 & 512) != 0) {
                    dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                    i3 &= -1879048193;
                }
                composerStartRestartGroup.endDefaults();
                Shape shape1111111 = medium;
                dialogProperties3 = dialogProperties2;
                function9 = function13;
                modifier2 = modifier3;
                long j1111113 = jM642getSurface0d7_KjU;
                i10 = i3;
                shape2 = shape1111111;
                j3 = j1111113;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function6 = null;
                }
                if (i6 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (i8 == 0) {
                }
                if ((i2 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= -3670017;
                } else {
                    medium = shape2;
                }
                if ((i2 & 128) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -29360129;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((i2 & 256) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                    i3 &= -234881025;
                }
                if ((i2 & 512) != 0) {
                    dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                    i3 &= -1879048193;
                }
                composerStartRestartGroup.endDefaults();
                Shape shape1111112 = medium;
                dialogProperties3 = dialogProperties2;
                function9 = function13;
                modifier2 = modifier3;
                long j1111114 = jM642getSurface0d7_KjU;
                i10 = i3;
                shape2 = shape1111112;
                j3 = j1111114;
            }
            Function2<? super Composer, ? super Integer, Unit> function11113 = function6;
            ComposableLambda composableLambda1110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                public final void invoke(@Nullable Composer composer2, int i11111113) {
                    if (((i11111113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    float f = 8;
                    Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                    final Function2<? super Composer, ? super Integer, Unit> function11114 = function6;
                    final int i11111114 = i10;
                    final Function2<? super Composer, ? super Integer, Unit> function11115 = function2;
                    composer2.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(350577062);
                    AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                        public final void invoke(@Nullable Composer composer3, int i11111115) {
                            if (((i11111115 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            Function2<Composer, Integer, Unit> function11116 = function11114;
                            if (function11116 == null) {
                                composer3.startReplaceableGroup(1918754550);
                            } else {
                                composer3.startReplaceableGroup(-1046483349);
                                function11116.invoke(composer3, Integer.valueOf((i11111114 >> 9) & 14));
                            }
                            composer3.endReplaceableGroup();
                            function11115.invoke(composer3, Integer.valueOf((i11111114 >> 3) & 14));
                        }
                    }), composer2, 438);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            });
            int i11111113 = (i10 & 14) | 48 | (i10 & 896);
            int i11111114 = i10 >> 3;
            m556AlertDialogwqdebIU(function0, composableLambda1110, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i11111113 | (i11111114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11111114) | (458752 & i11111114) | (i11111114 & 3670016) | (i11111114 & 29360128) | (i11111114 & 234881024), 0);
            j4 = jM656contentColorForek8zF_U;
            shape3 = shape2;
            dialogProperties4 = dialogProperties3;
            j5 = j3;
            modifier4 = modifier2;
            function10 = function8;
            function11 = function11113;
            function12 = function9;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function6 = null;
                }
                if (i6 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (i8 == 0) {
                }
                if ((i2 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= -3670017;
                } else {
                    medium = shape2;
                }
                if ((i2 & 128) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -29360129;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((i2 & 256) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                    i3 &= -234881025;
                }
                if ((i2 & 512) != 0) {
                    dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                    i3 &= -1879048193;
                }
                composerStartRestartGroup.endDefaults();
                Shape shape1111113 = medium;
                dialogProperties3 = dialogProperties2;
                function9 = function13;
                modifier2 = modifier3;
                long j1111115 = jM642getSurface0d7_KjU;
                i10 = i3;
                shape2 = shape1111113;
                j3 = j1111115;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function6 = null;
                }
                if (i6 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (i8 == 0) {
                }
                if ((i2 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= -3670017;
                } else {
                    medium = shape2;
                }
                if ((i2 & 128) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -29360129;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((i2 & 256) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 21) & 14);
                    i3 &= -234881025;
                }
                if ((i2 & 512) != 0) {
                    dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                    i3 &= -1879048193;
                }
                composerStartRestartGroup.endDefaults();
                Shape shape1111114 = medium;
                dialogProperties3 = dialogProperties2;
                function9 = function13;
                modifier2 = modifier3;
                long j1111116 = jM642getSurface0d7_KjU;
                i10 = i3;
                shape2 = shape1111114;
                j3 = j1111116;
            }
            Function2<? super Composer, ? super Integer, Unit> function11114 = function6;
            ComposableLambda composableLambda1111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894250, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                public final void invoke(@Nullable Composer composer2, int i11111115) {
                    if (((i11111115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    float f = 8;
                    Modifier modifierM281padding3ABfNKs = PaddingKt.m281padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f));
                    final Function2<? super Composer, ? super Integer, Unit> function11115 = function6;
                    final int i11111116 = i10;
                    final Function2<? super Composer, ? super Integer, Unit> function11116 = function2;
                    composer2.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM281padding3ABfNKs);
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
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(350577062);
                    AlertDialogKt.m554AlertDialogFlowRowixp7dh8(Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, -819893937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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
                        public final void invoke(@Nullable Composer composer3, int i11111117) {
                            if (((i11111117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            Function2<Composer, Integer, Unit> function11117 = function11115;
                            if (function11117 == null) {
                                composer3.startReplaceableGroup(1918754550);
                            } else {
                                composer3.startReplaceableGroup(-1046483349);
                                function11117.invoke(composer3, Integer.valueOf((i11111116 >> 9) & 14));
                            }
                            composer3.endReplaceableGroup();
                            function11116.invoke(composer3, Integer.valueOf((i11111116 >> 3) & 14));
                        }
                    }), composer2, 438);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            });
            int i11111115 = (i10 & 14) | 48 | (i10 & 896);
            int i11111116 = i10 >> 3;
            m556AlertDialogwqdebIU(function0, composableLambda1111, modifier2, function8, function9, shape2, j3, jM656contentColorForek8zF_U, dialogProperties3, composerStartRestartGroup, i11111115 | (i11111116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11111116) | (458752 & i11111116) | (i11111116 & 3670016) | (i11111116 & 29360128) | (i11111116 & 234881024), 0);
            j4 = jM656contentColorForek8zF_U;
            shape3 = shape2;
            dialogProperties4 = dialogProperties3;
            j5 = j3;
            modifier4 = modifier2;
            function10 = function8;
            function11 = function11114;
            function12 = function9;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

            public final void invoke(@Nullable Composer composer2, int i11111117) {
                AndroidAlertDialog_androidKt.m555AlertDialog6oU6zVQ(function0, function2, modifier4, function11, function10, function12, shape3, j5, j4, dialogProperties4, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x013d  */
    /* JADX WARN: Code duplicated, block: B:124:0x016a  */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0172  */
    /* JADX WARN: Code duplicated, block: B:130:0x0176  */
    /* JADX WARN: Code duplicated, block: B:133:0x017a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0181  */
    /* JADX WARN: Code duplicated, block: B:137:0x018e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0194  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01af  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x0224  */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:98:0x0108  */
    @Composable
    /* JADX INFO: renamed from: AlertDialog-wqdebIU, reason: not valid java name */
    public static final void m556AlertDialogwqdebIU(@NotNull final Function0<Unit> function0, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Shape shape, long j, long j2, @Nullable DialogProperties dialogProperties, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i7;
        int i8;
        int i9;
        long jM642getSurface0d7_KjU;
        long j3;
        DialogProperties dialogProperties2;
        Modifier modifier3;
        Shape medium;
        long jM656contentColorForek8zF_U;
        DialogProperties dialogProperties3;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function6;
        DialogProperties dialogProperties4;
        long j4;
        final long j5;
        DialogProperties dialogProperties5;
        final Function2<? super Composer, ? super Integer, Unit> function7;
        Shape shape2;
        Function2<? super Composer, ? super Integer, Unit> function8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-585313156);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        function5 = function3;
                        if (composerStartRestartGroup.changed(function5)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            if (composerStartRestartGroup.changed(function4)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((458752 & i) != 0) {
                            i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                        }
                        if ((3670016 & i) == 0) {
                            jM642getSurface0d7_KjU = j;
                            if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(jM642getSurface0d7_KjU)) {
                                i12 = 524288;
                            } else {
                                i12 = 1048576;
                            }
                            i3 |= i12;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((29360128 & i) == 0) {
                            j3 = j2;
                            if ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j3)) {
                                i11 = 4194304;
                            } else {
                                i11 = 8388608;
                            }
                            i3 |= i11;
                        } else {
                            j3 = j2;
                        }
                        if ((234881024 & i) == 0) {
                            if ((i2 & 256) == 0) {
                                dialogProperties2 = dialogProperties;
                                int i13 = composerStartRestartGroup.changed(dialogProperties2) ? 67108864 : 33554432;
                                i3 |= i13;
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            i3 |= i13;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        if (((i3 & 191739611) ^ 38347922) == 0 || !composerStartRestartGroup.getSkipping()) {
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.startDefaults();
                                if (i4 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function9 = i8 == 0 ? function4 : null;
                                if ((i2 & 32) != 0) {
                                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                    i3 &= -458753;
                                } else {
                                    medium = shape;
                                }
                                if ((i2 & 64) != 0) {
                                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                    i3 &= -29360129;
                                } else {
                                    jM656contentColorForek8zF_U = j3;
                                }
                                if ((i2 & 256) != 0) {
                                    dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                    i3 &= -234881025;
                                } else {
                                    dialogProperties3 = dialogProperties2;
                                }
                                composerStartRestartGroup.endDefaults();
                                i10 = i3;
                                function6 = function9;
                                modifier2 = modifier3;
                                dialogProperties4 = dialogProperties3;
                                j4 = jM656contentColorForek8zF_U;
                            } else {
                                composerStartRestartGroup.skipCurrentGroup();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                medium = shape;
                                i10 = i3;
                                dialogProperties4 = dialogProperties2;
                                function6 = function4;
                                j4 = j3;
                            }
                            j5 = jM642getSurface0d7_KjU;
                            final Modifier modifier4 = modifier2;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function5;
                            final Function2<? super Composer, ? super Integer, Unit> function11 = function6;
                            final Shape shape3 = medium;
                            final long j6 = j4;
                            final int i14 = i10;
                            AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                    Function2<Composer, Integer, Unit> function12 = function2;
                                    Modifier modifier5 = modifier4;
                                    Function2<Composer, Integer, Unit> function13 = function10;
                                    Function2<Composer, Integer, Unit> function14 = function11;
                                    Shape shape4 = shape3;
                                    long j7 = j5;
                                    long j8 = j6;
                                    int i16 = i14;
                                    AlertDialogKt.m553AlertDialogContentWMdw5o4(function12, modifier5, function13, function14, shape4, j7, j8, composer2, ((i16 >> 3) & 14) | ((i16 >> 3) & 112) | ((i16 >> 3) & 896) | ((i16 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i16 >> 3)) | (458752 & (i16 >> 3)) | ((i16 >> 3) & 3670016), 0);
                                }
                            }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                            dialogProperties5 = dialogProperties4;
                            function7 = function5;
                            shape2 = medium;
                            function8 = function6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function8 = function4;
                            function7 = function5;
                            shape2 = shape;
                            long j7 = jM642getSurface0d7_KjU;
                            dialogProperties5 = dialogProperties2;
                            j4 = j3;
                            j5 = j7;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier5 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function12 = function8;
                        final Shape shape4 = shape2;
                        final long j8 = j5;
                        final long j9 = j4;
                        final DialogProperties dialogProperties6 = dialogProperties5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                                AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier5, function7, function12, shape4, j8, j9, dialogProperties6, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 24576;
                    if ((458752 & i) != 0) {
                        i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                    }
                    if ((3670016 & i) == 0) {
                        jM642getSurface0d7_KjU = j;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((29360128 & i) == 0) {
                        j3 = j2;
                        if ((i2 & 128) == 0) {
                            i11 = 4194304;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    } else {
                        j3 = j2;
                    }
                    if ((234881024 & i) == 0) {
                        if ((i2 & 256) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (composerStartRestartGroup.changed(dialogProperties2)) {
                            }
                            i3 |= i13;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if (((i3 & 191739611) ^ 38347922) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        }
                        j5 = jM642getSurface0d7_KjU;
                        final Modifier modifier6 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function13 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function14 = function6;
                        final Shape shape5 = medium;
                        final long j10 = j4;
                        final int i15 = i10;
                        AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                Function2<Composer, Integer, Unit> function15 = function2;
                                Modifier modifier7 = modifier6;
                                Function2<Composer, Integer, Unit> function16 = function13;
                                Function2<Composer, Integer, Unit> function17 = function14;
                                Shape shape6 = shape5;
                                long j11 = j5;
                                long j12 = j10;
                                int i17 = i15;
                                AlertDialogKt.m553AlertDialogContentWMdw5o4(function15, modifier7, function16, function17, shape6, j11, j12, composer2, ((i17 >> 3) & 14) | ((i17 >> 3) & 112) | ((i17 >> 3) & 896) | ((i17 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i17 >> 3)) | (458752 & (i17 >> 3)) | ((i17 >> 3) & 3670016), 0);
                            }
                        }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        dialogProperties5 = dialogProperties4;
                        function7 = function5;
                        shape2 = medium;
                        function8 = function6;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        }
                        j5 = jM642getSurface0d7_KjU;
                        final Modifier modifier7 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function15 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                        final Shape shape6 = medium;
                        final long j11 = j4;
                        final int i16 = i10;
                        AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                Function2<Composer, Integer, Unit> function17 = function2;
                                Modifier modifier8 = modifier7;
                                Function2<Composer, Integer, Unit> function18 = function15;
                                Function2<Composer, Integer, Unit> function19 = function16;
                                Shape shape7 = shape6;
                                long j12 = j5;
                                long j13 = j11;
                                int i18 = i16;
                                AlertDialogKt.m553AlertDialogContentWMdw5o4(function17, modifier8, function18, function19, shape7, j12, j13, composer2, ((i18 >> 3) & 14) | ((i18 >> 3) & 112) | ((i18 >> 3) & 896) | ((i18 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i18 >> 3)) | (458752 & (i18 >> 3)) | ((i18 >> 3) & 3670016), 0);
                            }
                        }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        dialogProperties5 = dialogProperties4;
                        function7 = function5;
                        shape2 = medium;
                        function8 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier8 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function17 = function8;
                    final Shape shape7 = shape2;
                    final long j12 = j5;
                    final long j13 = j4;
                    final DialogProperties dialogProperties7 = dialogProperties5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                            AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier8, function7, function17, shape7, j12, j13, dialogProperties7, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 3072;
                function5 = function3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changed(function4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((458752 & i) != 0) {
                        i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                    }
                    if ((3670016 & i) == 0) {
                        jM642getSurface0d7_KjU = j;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((29360128 & i) == 0) {
                        j3 = j2;
                        if ((i2 & 128) == 0) {
                            i11 = 4194304;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    } else {
                        j3 = j2;
                    }
                    if ((234881024 & i) == 0) {
                        if ((i2 & 256) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (composerStartRestartGroup.changed(dialogProperties2)) {
                            }
                            i3 |= i13;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if (((i3 & 191739611) ^ 38347922) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        }
                        j5 = jM642getSurface0d7_KjU;
                        final Modifier modifier9 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function18 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function19 = function6;
                        final Shape shape8 = medium;
                        final long j14 = j4;
                        final int i17 = i10;
                        AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                Function2<Composer, Integer, Unit> function110 = function2;
                                Modifier modifier10 = modifier9;
                                Function2<Composer, Integer, Unit> function111 = function18;
                                Function2<Composer, Integer, Unit> function112 = function19;
                                Shape shape9 = shape8;
                                long j15 = j5;
                                long j16 = j14;
                                int i19 = i17;
                                AlertDialogKt.m553AlertDialogContentWMdw5o4(function110, modifier10, function111, function112, shape9, j15, j16, composer2, ((i19 >> 3) & 14) | ((i19 >> 3) & 112) | ((i19 >> 3) & 896) | ((i19 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i19 >> 3)) | (458752 & (i19 >> 3)) | ((i19 >> 3) & 3670016), 0);
                            }
                        }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        dialogProperties5 = dialogProperties4;
                        function7 = function5;
                        shape2 = medium;
                        function8 = function6;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        }
                        j5 = jM642getSurface0d7_KjU;
                        final Modifier modifier10 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function110 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function111 = function6;
                        final Shape shape9 = medium;
                        final long j15 = j4;
                        final int i18 = i10;
                        AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                Function2<Composer, Integer, Unit> function112 = function2;
                                Modifier modifier11 = modifier10;
                                Function2<Composer, Integer, Unit> function113 = function110;
                                Function2<Composer, Integer, Unit> function114 = function111;
                                Shape shape10 = shape9;
                                long j16 = j5;
                                long j17 = j15;
                                int i110 = i18;
                                AlertDialogKt.m553AlertDialogContentWMdw5o4(function112, modifier11, function113, function114, shape10, j16, j17, composer2, ((i110 >> 3) & 14) | ((i110 >> 3) & 112) | ((i110 >> 3) & 896) | ((i110 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i110 >> 3)) | (458752 & (i110 >> 3)) | ((i110 >> 3) & 3670016), 0);
                            }
                        }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        dialogProperties5 = dialogProperties4;
                        function7 = function5;
                        shape2 = medium;
                        function8 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier11 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function112 = function8;
                    final Shape shape10 = shape2;
                    final long j16 = j5;
                    final long j17 = j4;
                    final DialogProperties dialogProperties8 = dialogProperties5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                            AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier11, function7, function112, shape10, j16, j17, dialogProperties8, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                if ((458752 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((3670016 & i) == 0) {
                    jM642getSurface0d7_KjU = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((29360128 & i) == 0) {
                    j3 = j2;
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                if ((234881024 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 191739611) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier12 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function113 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                    final Shape shape11 = medium;
                    final long j18 = j4;
                    final int i19 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function115 = function2;
                            Modifier modifier13 = modifier12;
                            Function2<Composer, Integer, Unit> function116 = function113;
                            Function2<Composer, Integer, Unit> function117 = function114;
                            Shape shape12 = shape11;
                            long j19 = j5;
                            long j110 = j18;
                            int i111 = i19;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function115, modifier13, function116, function117, shape12, j19, j110, composer2, ((i111 >> 3) & 14) | ((i111 >> 3) & 112) | ((i111 >> 3) & 896) | ((i111 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i111 >> 3)) | (458752 & (i111 >> 3)) | ((i111 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier13 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function115 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function116 = function6;
                    final Shape shape12 = medium;
                    final long j19 = j4;
                    final int i110 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function117 = function2;
                            Modifier modifier14 = modifier13;
                            Function2<Composer, Integer, Unit> function118 = function115;
                            Function2<Composer, Integer, Unit> function119 = function116;
                            Shape shape13 = shape12;
                            long j110 = j5;
                            long j111 = j19;
                            int i112 = i110;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function117, modifier14, function118, function119, shape13, j110, j111, composer2, ((i112 >> 3) & 14) | ((i112 >> 3) & 112) | ((i112 >> 3) & 896) | ((i112 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i112 >> 3)) | (458752 & (i112 >> 3)) | ((i112 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier14 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function117 = function8;
                final Shape shape13 = shape2;
                final long j110 = j5;
                final long j111 = j4;
                final DialogProperties dialogProperties9 = dialogProperties5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                        AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier14, function7, function117, shape13, j110, j111, dialogProperties9, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            modifier2 = modifier;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changed(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changed(function4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((458752 & i) != 0) {
                        i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                    }
                    if ((3670016 & i) == 0) {
                        jM642getSurface0d7_KjU = j;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((29360128 & i) == 0) {
                        j3 = j2;
                        if ((i2 & 128) == 0) {
                            i11 = 4194304;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    } else {
                        j3 = j2;
                    }
                    if ((234881024 & i) == 0) {
                        if ((i2 & 256) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (composerStartRestartGroup.changed(dialogProperties2)) {
                            }
                            i3 |= i13;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if (((i3 & 191739611) ^ 38347922) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        }
                        j5 = jM642getSurface0d7_KjU;
                        final Modifier modifier15 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function118 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function119 = function6;
                        final Shape shape14 = medium;
                        final long j112 = j4;
                        final int i111 = i10;
                        AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                Function2<Composer, Integer, Unit> function1110 = function2;
                                Modifier modifier16 = modifier15;
                                Function2<Composer, Integer, Unit> function1111 = function118;
                                Function2<Composer, Integer, Unit> function1112 = function119;
                                Shape shape15 = shape14;
                                long j113 = j5;
                                long j114 = j112;
                                int i113 = i111;
                                AlertDialogKt.m553AlertDialogContentWMdw5o4(function1110, modifier16, function1111, function1112, shape15, j113, j114, composer2, ((i113 >> 3) & 14) | ((i113 >> 3) & 112) | ((i113 >> 3) & 896) | ((i113 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i113 >> 3)) | (458752 & (i113 >> 3)) | ((i113 >> 3) & 3670016), 0);
                            }
                        }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        dialogProperties5 = dialogProperties4;
                        function7 = function5;
                        shape2 = medium;
                        function8 = function6;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        }
                        j5 = jM642getSurface0d7_KjU;
                        final Modifier modifier16 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function1110 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function1111 = function6;
                        final Shape shape15 = medium;
                        final long j113 = j4;
                        final int i112 = i10;
                        AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                Function2<Composer, Integer, Unit> function1112 = function2;
                                Modifier modifier17 = modifier16;
                                Function2<Composer, Integer, Unit> function1113 = function1110;
                                Function2<Composer, Integer, Unit> function1114 = function1111;
                                Shape shape16 = shape15;
                                long j114 = j5;
                                long j115 = j113;
                                int i114 = i112;
                                AlertDialogKt.m553AlertDialogContentWMdw5o4(function1112, modifier17, function1113, function1114, shape16, j114, j115, composer2, ((i114 >> 3) & 14) | ((i114 >> 3) & 112) | ((i114 >> 3) & 896) | ((i114 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i114 >> 3)) | (458752 & (i114 >> 3)) | ((i114 >> 3) & 3670016), 0);
                            }
                        }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        dialogProperties5 = dialogProperties4;
                        function7 = function5;
                        shape2 = medium;
                        function8 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier17 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1112 = function8;
                    final Shape shape16 = shape2;
                    final long j114 = j5;
                    final long j115 = j4;
                    final DialogProperties dialogProperties10 = dialogProperties5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                            AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier17, function7, function1112, shape16, j114, j115, dialogProperties10, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                if ((458752 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((3670016 & i) == 0) {
                    jM642getSurface0d7_KjU = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((29360128 & i) == 0) {
                    j3 = j2;
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                if ((234881024 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 191739611) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier18 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1113 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function1114 = function6;
                    final Shape shape17 = medium;
                    final long j116 = j4;
                    final int i113 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function1115 = function2;
                            Modifier modifier19 = modifier18;
                            Function2<Composer, Integer, Unit> function1116 = function1113;
                            Function2<Composer, Integer, Unit> function1117 = function1114;
                            Shape shape18 = shape17;
                            long j117 = j5;
                            long j118 = j116;
                            int i115 = i113;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function1115, modifier19, function1116, function1117, shape18, j117, j118, composer2, ((i115 >> 3) & 14) | ((i115 >> 3) & 112) | ((i115 >> 3) & 896) | ((i115 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i115 >> 3)) | (458752 & (i115 >> 3)) | ((i115 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier19 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1115 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function1116 = function6;
                    final Shape shape18 = medium;
                    final long j117 = j4;
                    final int i114 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function1117 = function2;
                            Modifier modifier110 = modifier19;
                            Function2<Composer, Integer, Unit> function1118 = function1115;
                            Function2<Composer, Integer, Unit> function1119 = function1116;
                            Shape shape19 = shape18;
                            long j118 = j5;
                            long j119 = j117;
                            int i116 = i114;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function1117, modifier110, function1118, function1119, shape19, j118, j119, composer2, ((i116 >> 3) & 14) | ((i116 >> 3) & 112) | ((i116 >> 3) & 896) | ((i116 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i116 >> 3)) | (458752 & (i116 >> 3)) | ((i116 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier110 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function1117 = function8;
                final Shape shape19 = shape2;
                final long j118 = j5;
                final long j119 = j4;
                final DialogProperties dialogProperties11 = dialogProperties5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                        AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier110, function7, function1117, shape19, j118, j119, dialogProperties11, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            function5 = function3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(function4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((458752 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((3670016 & i) == 0) {
                    jM642getSurface0d7_KjU = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((29360128 & i) == 0) {
                    j3 = j2;
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                if ((234881024 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 191739611) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier111 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1118 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function1119 = function6;
                    final Shape shape110 = medium;
                    final long j1110 = j4;
                    final int i115 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function11110 = function2;
                            Modifier modifier112 = modifier111;
                            Function2<Composer, Integer, Unit> function11111 = function1118;
                            Function2<Composer, Integer, Unit> function11112 = function1119;
                            Shape shape111 = shape110;
                            long j1111 = j5;
                            long j1112 = j1110;
                            int i117 = i115;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function11110, modifier112, function11111, function11112, shape111, j1111, j1112, composer2, ((i117 >> 3) & 14) | ((i117 >> 3) & 112) | ((i117 >> 3) & 896) | ((i117 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i117 >> 3)) | (458752 & (i117 >> 3)) | ((i117 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier112 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function11110 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function11111 = function6;
                    final Shape shape111 = medium;
                    final long j1111 = j4;
                    final int i116 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function11112 = function2;
                            Modifier modifier113 = modifier112;
                            Function2<Composer, Integer, Unit> function11113 = function11110;
                            Function2<Composer, Integer, Unit> function11114 = function11111;
                            Shape shape112 = shape111;
                            long j1112 = j5;
                            long j1113 = j1111;
                            int i118 = i116;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function11112, modifier113, function11113, function11114, shape112, j1112, j1113, composer2, ((i118 >> 3) & 14) | ((i118 >> 3) & 112) | ((i118 >> 3) & 896) | ((i118 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i118 >> 3)) | (458752 & (i118 >> 3)) | ((i118 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier113 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11112 = function8;
                final Shape shape112 = shape2;
                final long j1112 = j5;
                final long j1113 = j4;
                final DialogProperties dialogProperties12 = dialogProperties5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                        AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier113, function7, function11112, shape112, j1112, j1113, dialogProperties12, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            if ((458752 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((3670016 & i) == 0) {
                jM642getSurface0d7_KjU = j;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                jM642getSurface0d7_KjU = j;
            }
            if ((29360128 & i) == 0) {
                j3 = j2;
                if ((i2 & 128) == 0) {
                    i11 = 4194304;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            } else {
                j3 = j2;
            }
            if ((234881024 & i) == 0) {
                if ((i2 & 256) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                i3 |= i13;
            } else {
                dialogProperties2 = dialogProperties;
            }
            if (((i3 & 191739611) ^ 38347922) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                }
                j5 = jM642getSurface0d7_KjU;
                final Modifier modifier114 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11113 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function11114 = function6;
                final Shape shape113 = medium;
                final long j1114 = j4;
                final int i117 = i10;
                AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                        Function2<Composer, Integer, Unit> function11115 = function2;
                        Modifier modifier115 = modifier114;
                        Function2<Composer, Integer, Unit> function11116 = function11113;
                        Function2<Composer, Integer, Unit> function11117 = function11114;
                        Shape shape114 = shape113;
                        long j1115 = j5;
                        long j1116 = j1114;
                        int i119 = i117;
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function11115, modifier115, function11116, function11117, shape114, j1115, j1116, composer2, ((i119 >> 3) & 14) | ((i119 >> 3) & 112) | ((i119 >> 3) & 896) | ((i119 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i119 >> 3)) | (458752 & (i119 >> 3)) | ((i119 >> 3) & 3670016), 0);
                    }
                }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                dialogProperties5 = dialogProperties4;
                function7 = function5;
                shape2 = medium;
                function8 = function6;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                }
                j5 = jM642getSurface0d7_KjU;
                final Modifier modifier115 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11115 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function11116 = function6;
                final Shape shape114 = medium;
                final long j1115 = j4;
                final int i118 = i10;
                AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                        Function2<Composer, Integer, Unit> function11117 = function2;
                        Modifier modifier116 = modifier115;
                        Function2<Composer, Integer, Unit> function11118 = function11115;
                        Function2<Composer, Integer, Unit> function11119 = function11116;
                        Shape shape115 = shape114;
                        long j1116 = j5;
                        long j1117 = j1115;
                        int i1110 = i118;
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function11117, modifier116, function11118, function11119, shape115, j1116, j1117, composer2, ((i1110 >> 3) & 14) | ((i1110 >> 3) & 112) | ((i1110 >> 3) & 896) | ((i1110 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1110 >> 3)) | (458752 & (i1110 >> 3)) | ((i1110 >> 3) & 3670016), 0);
                    }
                }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                dialogProperties5 = dialogProperties4;
                function7 = function5;
                shape2 = medium;
                function8 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier116 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function11117 = function8;
            final Shape shape115 = shape2;
            final long j1116 = j5;
            final long j1117 = j4;
            final DialogProperties dialogProperties13 = dialogProperties5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                    AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier116, function7, function11117, shape115, j1116, j1117, dialogProperties13, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changed(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changed(function4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((458752 & i) != 0) {
                        i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                    }
                    if ((3670016 & i) == 0) {
                        jM642getSurface0d7_KjU = j;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((29360128 & i) == 0) {
                        j3 = j2;
                        if ((i2 & 128) == 0) {
                            i11 = 4194304;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    } else {
                        j3 = j2;
                    }
                    if ((234881024 & i) == 0) {
                        if ((i2 & 256) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (composerStartRestartGroup.changed(dialogProperties2)) {
                            }
                            i3 |= i13;
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if (((i3 & 191739611) ^ 38347922) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        }
                        j5 = jM642getSurface0d7_KjU;
                        final Modifier modifier117 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function11118 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function11119 = function6;
                        final Shape shape116 = medium;
                        final long j1118 = j4;
                        final int i119 = i10;
                        AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                Function2<Composer, Integer, Unit> function111110 = function2;
                                Modifier modifier118 = modifier117;
                                Function2<Composer, Integer, Unit> function111111 = function11118;
                                Function2<Composer, Integer, Unit> function111112 = function11119;
                                Shape shape117 = shape116;
                                long j1119 = j5;
                                long j11110 = j1118;
                                int i1111 = i119;
                                AlertDialogKt.m553AlertDialogContentWMdw5o4(function111110, modifier118, function111111, function111112, shape117, j1119, j11110, composer2, ((i1111 >> 3) & 14) | ((i1111 >> 3) & 112) | ((i1111 >> 3) & 896) | ((i1111 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1111 >> 3)) | (458752 & (i1111 >> 3)) | ((i1111 >> 3) & 3670016), 0);
                            }
                        }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        dialogProperties5 = dialogProperties4;
                        function7 = function5;
                        shape2 = medium;
                        function8 = function6;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 256) != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                                i3 &= -234881025;
                            } else {
                                dialogProperties3 = dialogProperties2;
                            }
                            composerStartRestartGroup.endDefaults();
                            i10 = i3;
                            function6 = function9;
                            modifier2 = modifier3;
                            dialogProperties4 = dialogProperties3;
                            j4 = jM656contentColorForek8zF_U;
                        }
                        j5 = jM642getSurface0d7_KjU;
                        final Modifier modifier118 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function111110 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function111111 = function6;
                        final Shape shape117 = medium;
                        final long j1119 = j4;
                        final int i1110 = i10;
                        AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                                Function2<Composer, Integer, Unit> function111112 = function2;
                                Modifier modifier119 = modifier118;
                                Function2<Composer, Integer, Unit> function111113 = function111110;
                                Function2<Composer, Integer, Unit> function111114 = function111111;
                                Shape shape118 = shape117;
                                long j11110 = j5;
                                long j11111 = j1119;
                                int i1112 = i1110;
                                AlertDialogKt.m553AlertDialogContentWMdw5o4(function111112, modifier119, function111113, function111114, shape118, j11110, j11111, composer2, ((i1112 >> 3) & 14) | ((i1112 >> 3) & 112) | ((i1112 >> 3) & 896) | ((i1112 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1112 >> 3)) | (458752 & (i1112 >> 3)) | ((i1112 >> 3) & 3670016), 0);
                            }
                        }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        dialogProperties5 = dialogProperties4;
                        function7 = function5;
                        shape2 = medium;
                        function8 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier119 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function111112 = function8;
                    final Shape shape118 = shape2;
                    final long j11110 = j5;
                    final long j11111 = j4;
                    final DialogProperties dialogProperties14 = dialogProperties5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                            AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier119, function7, function111112, shape118, j11110, j11111, dialogProperties14, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                if ((458752 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((3670016 & i) == 0) {
                    jM642getSurface0d7_KjU = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((29360128 & i) == 0) {
                    j3 = j2;
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                if ((234881024 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 191739611) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier1110 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function111113 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function111114 = function6;
                    final Shape shape119 = medium;
                    final long j11112 = j4;
                    final int i1111 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function111115 = function2;
                            Modifier modifier1111 = modifier1110;
                            Function2<Composer, Integer, Unit> function111116 = function111113;
                            Function2<Composer, Integer, Unit> function111117 = function111114;
                            Shape shape1110 = shape119;
                            long j11113 = j5;
                            long j11114 = j11112;
                            int i1113 = i1111;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function111115, modifier1111, function111116, function111117, shape1110, j11113, j11114, composer2, ((i1113 >> 3) & 14) | ((i1113 >> 3) & 112) | ((i1113 >> 3) & 896) | ((i1113 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1113 >> 3)) | (458752 & (i1113 >> 3)) | ((i1113 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier1111 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function111115 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function111116 = function6;
                    final Shape shape1110 = medium;
                    final long j11113 = j4;
                    final int i1112 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function111117 = function2;
                            Modifier modifier1112 = modifier1111;
                            Function2<Composer, Integer, Unit> function111118 = function111115;
                            Function2<Composer, Integer, Unit> function111119 = function111116;
                            Shape shape1111 = shape1110;
                            long j11114 = j5;
                            long j11115 = j11113;
                            int i1114 = i1112;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function111117, modifier1112, function111118, function111119, shape1111, j11114, j11115, composer2, ((i1114 >> 3) & 14) | ((i1114 >> 3) & 112) | ((i1114 >> 3) & 896) | ((i1114 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1114 >> 3)) | (458752 & (i1114 >> 3)) | ((i1114 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier1112 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function111117 = function8;
                final Shape shape1111 = shape2;
                final long j11114 = j5;
                final long j11115 = j4;
                final DialogProperties dialogProperties15 = dialogProperties5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                        AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier1112, function7, function111117, shape1111, j11114, j11115, dialogProperties15, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            function5 = function3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(function4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((458752 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((3670016 & i) == 0) {
                    jM642getSurface0d7_KjU = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((29360128 & i) == 0) {
                    j3 = j2;
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                if ((234881024 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 191739611) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier1113 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function111118 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function111119 = function6;
                    final Shape shape1112 = medium;
                    final long j11116 = j4;
                    final int i1113 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function1111110 = function2;
                            Modifier modifier1114 = modifier1113;
                            Function2<Composer, Integer, Unit> function1111111 = function111118;
                            Function2<Composer, Integer, Unit> function1111112 = function111119;
                            Shape shape1113 = shape1112;
                            long j11117 = j5;
                            long j11118 = j11116;
                            int i1115 = i1113;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function1111110, modifier1114, function1111111, function1111112, shape1113, j11117, j11118, composer2, ((i1115 >> 3) & 14) | ((i1115 >> 3) & 112) | ((i1115 >> 3) & 896) | ((i1115 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1115 >> 3)) | (458752 & (i1115 >> 3)) | ((i1115 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier1114 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1111110 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function1111111 = function6;
                    final Shape shape1113 = medium;
                    final long j11117 = j4;
                    final int i1114 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function1111112 = function2;
                            Modifier modifier1115 = modifier1114;
                            Function2<Composer, Integer, Unit> function1111113 = function1111110;
                            Function2<Composer, Integer, Unit> function1111114 = function1111111;
                            Shape shape1114 = shape1113;
                            long j11118 = j5;
                            long j11119 = j11117;
                            int i1116 = i1114;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function1111112, modifier1115, function1111113, function1111114, shape1114, j11118, j11119, composer2, ((i1116 >> 3) & 14) | ((i1116 >> 3) & 112) | ((i1116 >> 3) & 896) | ((i1116 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1116 >> 3)) | (458752 & (i1116 >> 3)) | ((i1116 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier1115 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function1111112 = function8;
                final Shape shape1114 = shape2;
                final long j11118 = j5;
                final long j11119 = j4;
                final DialogProperties dialogProperties16 = dialogProperties5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                        AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier1115, function7, function1111112, shape1114, j11118, j11119, dialogProperties16, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            if ((458752 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((3670016 & i) == 0) {
                jM642getSurface0d7_KjU = j;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                jM642getSurface0d7_KjU = j;
            }
            if ((29360128 & i) == 0) {
                j3 = j2;
                if ((i2 & 128) == 0) {
                    i11 = 4194304;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            } else {
                j3 = j2;
            }
            if ((234881024 & i) == 0) {
                if ((i2 & 256) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                i3 |= i13;
            } else {
                dialogProperties2 = dialogProperties;
            }
            if (((i3 & 191739611) ^ 38347922) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                }
                j5 = jM642getSurface0d7_KjU;
                final Modifier modifier1116 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function1111113 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function1111114 = function6;
                final Shape shape1115 = medium;
                final long j111110 = j4;
                final int i1115 = i10;
                AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                        Function2<Composer, Integer, Unit> function1111115 = function2;
                        Modifier modifier1117 = modifier1116;
                        Function2<Composer, Integer, Unit> function1111116 = function1111113;
                        Function2<Composer, Integer, Unit> function1111117 = function1111114;
                        Shape shape1116 = shape1115;
                        long j111111 = j5;
                        long j111112 = j111110;
                        int i1117 = i1115;
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function1111115, modifier1117, function1111116, function1111117, shape1116, j111111, j111112, composer2, ((i1117 >> 3) & 14) | ((i1117 >> 3) & 112) | ((i1117 >> 3) & 896) | ((i1117 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1117 >> 3)) | (458752 & (i1117 >> 3)) | ((i1117 >> 3) & 3670016), 0);
                    }
                }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                dialogProperties5 = dialogProperties4;
                function7 = function5;
                shape2 = medium;
                function8 = function6;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                }
                j5 = jM642getSurface0d7_KjU;
                final Modifier modifier1117 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function1111115 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function1111116 = function6;
                final Shape shape1116 = medium;
                final long j111111 = j4;
                final int i1116 = i10;
                AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                        Function2<Composer, Integer, Unit> function1111117 = function2;
                        Modifier modifier1118 = modifier1117;
                        Function2<Composer, Integer, Unit> function1111118 = function1111115;
                        Function2<Composer, Integer, Unit> function1111119 = function1111116;
                        Shape shape1117 = shape1116;
                        long j111112 = j5;
                        long j111113 = j111111;
                        int i1118 = i1116;
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function1111117, modifier1118, function1111118, function1111119, shape1117, j111112, j111113, composer2, ((i1118 >> 3) & 14) | ((i1118 >> 3) & 112) | ((i1118 >> 3) & 896) | ((i1118 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1118 >> 3)) | (458752 & (i1118 >> 3)) | ((i1118 >> 3) & 3670016), 0);
                    }
                }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                dialogProperties5 = dialogProperties4;
                function7 = function5;
                shape2 = medium;
                function8 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier1118 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function1111117 = function8;
            final Shape shape1117 = shape2;
            final long j111112 = j5;
            final long j111113 = j4;
            final DialogProperties dialogProperties17 = dialogProperties5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                    AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier1118, function7, function1111117, shape1117, j111112, j111113, dialogProperties17, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changed(function5)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(function4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((458752 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((3670016 & i) == 0) {
                    jM642getSurface0d7_KjU = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((29360128 & i) == 0) {
                    j3 = j2;
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                if ((234881024 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                        }
                        i3 |= i13;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                if (((i3 & 191739611) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier1119 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1111118 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function1111119 = function6;
                    final Shape shape1118 = medium;
                    final long j111114 = j4;
                    final int i1117 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function11111110 = function2;
                            Modifier modifier11110 = modifier1119;
                            Function2<Composer, Integer, Unit> function11111111 = function1111118;
                            Function2<Composer, Integer, Unit> function11111112 = function1111119;
                            Shape shape1119 = shape1118;
                            long j111115 = j5;
                            long j111116 = j111114;
                            int i1119 = i1117;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function11111110, modifier11110, function11111111, function11111112, shape1119, j111115, j111116, composer2, ((i1119 >> 3) & 14) | ((i1119 >> 3) & 112) | ((i1119 >> 3) & 896) | ((i1119 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i1119 >> 3)) | (458752 & (i1119 >> 3)) | ((i1119 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j3;
                        }
                        if ((i2 & 256) != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                            i3 &= -234881025;
                        } else {
                            dialogProperties3 = dialogProperties2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i10 = i3;
                        function6 = function9;
                        modifier2 = modifier3;
                        dialogProperties4 = dialogProperties3;
                        j4 = jM656contentColorForek8zF_U;
                    }
                    j5 = jM642getSurface0d7_KjU;
                    final Modifier modifier11110 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function11111110 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function11111111 = function6;
                    final Shape shape1119 = medium;
                    final long j111115 = j4;
                    final int i1118 = i10;
                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                            Function2<Composer, Integer, Unit> function11111112 = function2;
                            Modifier modifier11111 = modifier11110;
                            Function2<Composer, Integer, Unit> function11111113 = function11111110;
                            Function2<Composer, Integer, Unit> function11111114 = function11111111;
                            Shape shape11110 = shape1119;
                            long j111116 = j5;
                            long j111117 = j111115;
                            int i11110 = i1118;
                            AlertDialogKt.m553AlertDialogContentWMdw5o4(function11111112, modifier11111, function11111113, function11111114, shape11110, j111116, j111117, composer2, ((i11110 >> 3) & 14) | ((i11110 >> 3) & 112) | ((i11110 >> 3) & 896) | ((i11110 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i11110 >> 3)) | (458752 & (i11110 >> 3)) | ((i11110 >> 3) & 3670016), 0);
                        }
                    }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    dialogProperties5 = dialogProperties4;
                    function7 = function5;
                    shape2 = medium;
                    function8 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier11111 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11111112 = function8;
                final Shape shape11110 = shape2;
                final long j111116 = j5;
                final long j111117 = j4;
                final DialogProperties dialogProperties18 = dialogProperties5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                        AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier11111, function7, function11111112, shape11110, j111116, j111117, dialogProperties18, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            if ((458752 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((3670016 & i) == 0) {
                jM642getSurface0d7_KjU = j;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                jM642getSurface0d7_KjU = j;
            }
            if ((29360128 & i) == 0) {
                j3 = j2;
                if ((i2 & 128) == 0) {
                    i11 = 4194304;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            } else {
                j3 = j2;
            }
            if ((234881024 & i) == 0) {
                if ((i2 & 256) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                i3 |= i13;
            } else {
                dialogProperties2 = dialogProperties;
            }
            if (((i3 & 191739611) ^ 38347922) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                }
                j5 = jM642getSurface0d7_KjU;
                final Modifier modifier11112 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11111113 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function11111114 = function6;
                final Shape shape11111 = medium;
                final long j111118 = j4;
                final int i1119 = i10;
                AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                        Function2<Composer, Integer, Unit> function11111115 = function2;
                        Modifier modifier11113 = modifier11112;
                        Function2<Composer, Integer, Unit> function11111116 = function11111113;
                        Function2<Composer, Integer, Unit> function11111117 = function11111114;
                        Shape shape11112 = shape11111;
                        long j111119 = j5;
                        long j1111110 = j111118;
                        int i11111 = i1119;
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function11111115, modifier11113, function11111116, function11111117, shape11112, j111119, j1111110, composer2, ((i11111 >> 3) & 14) | ((i11111 >> 3) & 112) | ((i11111 >> 3) & 896) | ((i11111 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i11111 >> 3)) | (458752 & (i11111 >> 3)) | ((i11111 >> 3) & 3670016), 0);
                    }
                }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                dialogProperties5 = dialogProperties4;
                function7 = function5;
                shape2 = medium;
                function8 = function6;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                }
                j5 = jM642getSurface0d7_KjU;
                final Modifier modifier11113 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11111115 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function11111116 = function6;
                final Shape shape11112 = medium;
                final long j111119 = j4;
                final int i11110 = i10;
                AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                        Function2<Composer, Integer, Unit> function11111117 = function2;
                        Modifier modifier11114 = modifier11113;
                        Function2<Composer, Integer, Unit> function11111118 = function11111115;
                        Function2<Composer, Integer, Unit> function11111119 = function11111116;
                        Shape shape11113 = shape11112;
                        long j1111110 = j5;
                        long j1111111 = j111119;
                        int i11112 = i11110;
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function11111117, modifier11114, function11111118, function11111119, shape11113, j1111110, j1111111, composer2, ((i11112 >> 3) & 14) | ((i11112 >> 3) & 112) | ((i11112 >> 3) & 896) | ((i11112 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i11112 >> 3)) | (458752 & (i11112 >> 3)) | ((i11112 >> 3) & 3670016), 0);
                    }
                }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                dialogProperties5 = dialogProperties4;
                function7 = function5;
                shape2 = medium;
                function8 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11114 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function11111117 = function8;
            final Shape shape11113 = shape2;
            final long j1111110 = j5;
            final long j1111111 = j4;
            final DialogProperties dialogProperties19 = dialogProperties5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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
                    AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier11114, function7, function11111117, shape11113, j1111110, j1111111, dialogProperties19, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        function5 = function3;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((458752 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((3670016 & i) == 0) {
                jM642getSurface0d7_KjU = j;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                jM642getSurface0d7_KjU = j;
            }
            if ((29360128 & i) == 0) {
                j3 = j2;
                if ((i2 & 128) == 0) {
                    i11 = 4194304;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            } else {
                j3 = j2;
            }
            if ((234881024 & i) == 0) {
                if ((i2 & 256) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                    }
                    i3 |= i13;
                } else {
                    dialogProperties2 = dialogProperties;
                }
                i3 |= i13;
            } else {
                dialogProperties2 = dialogProperties;
            }
            if (((i3 & 191739611) ^ 38347922) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                }
                j5 = jM642getSurface0d7_KjU;
                final Modifier modifier11115 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11111118 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function11111119 = function6;
                final Shape shape11114 = medium;
                final long j1111112 = j4;
                final int i11111 = i10;
                AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                    public final void invoke(@Nullable Composer composer2, int i11112) {
                        if (((i11112 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Function2<Composer, Integer, Unit> function111111110 = function2;
                        Modifier modifier11116 = modifier11115;
                        Function2<Composer, Integer, Unit> function111111111 = function11111118;
                        Function2<Composer, Integer, Unit> function111111112 = function11111119;
                        Shape shape11115 = shape11114;
                        long j1111113 = j5;
                        long j1111114 = j1111112;
                        int i11113 = i11111;
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function111111110, modifier11116, function111111111, function111111112, shape11115, j1111113, j1111114, composer2, ((i11113 >> 3) & 14) | ((i11113 >> 3) & 112) | ((i11113 >> 3) & 896) | ((i11113 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i11113 >> 3)) | (458752 & (i11113 >> 3)) | ((i11113 >> 3) & 3670016), 0);
                    }
                }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                dialogProperties5 = dialogProperties4;
                function7 = function5;
                shape2 = medium;
                function8 = function6;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 256) != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                        i3 &= -234881025;
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i10 = i3;
                    function6 = function9;
                    modifier2 = modifier3;
                    dialogProperties4 = dialogProperties3;
                    j4 = jM656contentColorForek8zF_U;
                }
                j5 = jM642getSurface0d7_KjU;
                final Modifier modifier11116 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function111111110 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function111111111 = function6;
                final Shape shape11115 = medium;
                final long j1111113 = j4;
                final int i11112 = i10;
                AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                    public final void invoke(@Nullable Composer composer2, int i11113) {
                        if (((i11113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Function2<Composer, Integer, Unit> function111111112 = function2;
                        Modifier modifier11117 = modifier11116;
                        Function2<Composer, Integer, Unit> function111111113 = function111111110;
                        Function2<Composer, Integer, Unit> function111111114 = function111111111;
                        Shape shape11116 = shape11115;
                        long j1111114 = j5;
                        long j1111115 = j1111113;
                        int i11114 = i11112;
                        AlertDialogKt.m553AlertDialogContentWMdw5o4(function111111112, modifier11117, function111111113, function111111114, shape11116, j1111114, j1111115, composer2, ((i11114 >> 3) & 14) | ((i11114 >> 3) & 112) | ((i11114 >> 3) & 896) | ((i11114 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i11114 >> 3)) | (458752 & (i11114 >> 3)) | ((i11114 >> 3) & 3670016), 0);
                    }
                }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                dialogProperties5 = dialogProperties4;
                function7 = function5;
                shape2 = medium;
                function8 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11117 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function111111112 = function8;
            final Shape shape11116 = shape2;
            final long j1111114 = j5;
            final long j1111115 = j4;
            final DialogProperties dialogProperties110 = dialogProperties5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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

                public final void invoke(@Nullable Composer composer2, int i11113) {
                    AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier11117, function7, function111111112, shape11116, j1111114, j1111115, dialogProperties110, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        if ((458752 & i) != 0) {
            i3 |= ((i2 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
        }
        if ((3670016 & i) == 0) {
            jM642getSurface0d7_KjU = j;
            if ((i2 & 64) == 0) {
                i12 = 524288;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        } else {
            jM642getSurface0d7_KjU = j;
        }
        if ((29360128 & i) == 0) {
            j3 = j2;
            if ((i2 & 128) == 0) {
                i11 = 4194304;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        } else {
            j3 = j2;
        }
        if ((234881024 & i) == 0) {
            if ((i2 & 256) == 0) {
                dialogProperties2 = dialogProperties;
                if (composerStartRestartGroup.changed(dialogProperties2)) {
                }
                i3 |= i13;
            } else {
                dialogProperties2 = dialogProperties;
            }
            i3 |= i13;
        } else {
            dialogProperties2 = dialogProperties;
        }
        if (((i3 & 191739611) ^ 38347922) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 == 0) {
                }
                if ((i2 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= -458753;
                } else {
                    medium = shape;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j3;
                }
                if ((i2 & 256) != 0) {
                    dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                    i3 &= -234881025;
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                composerStartRestartGroup.endDefaults();
                i10 = i3;
                function6 = function9;
                modifier2 = modifier3;
                dialogProperties4 = dialogProperties3;
                j4 = jM656contentColorForek8zF_U;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 == 0) {
                }
                if ((i2 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= -458753;
                } else {
                    medium = shape;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j3;
                }
                if ((i2 & 256) != 0) {
                    dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                    i3 &= -234881025;
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                composerStartRestartGroup.endDefaults();
                i10 = i3;
                function6 = function9;
                modifier2 = modifier3;
                dialogProperties4 = dialogProperties3;
                j4 = jM656contentColorForek8zF_U;
            }
            j5 = jM642getSurface0d7_KjU;
            final Modifier modifier11118 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function111111113 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function111111114 = function6;
            final Shape shape11117 = medium;
            final long j1111116 = j4;
            final int i11113 = i10;
            AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                public final void invoke(@Nullable Composer composer2, int i11114) {
                    if (((i11114 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Function2<Composer, Integer, Unit> function111111115 = function2;
                    Modifier modifier11119 = modifier11118;
                    Function2<Composer, Integer, Unit> function111111116 = function111111113;
                    Function2<Composer, Integer, Unit> function111111117 = function111111114;
                    Shape shape11118 = shape11117;
                    long j1111117 = j5;
                    long j1111118 = j1111116;
                    int i11115 = i11113;
                    AlertDialogKt.m553AlertDialogContentWMdw5o4(function111111115, modifier11119, function111111116, function111111117, shape11118, j1111117, j1111118, composer2, ((i11115 >> 3) & 14) | ((i11115 >> 3) & 112) | ((i11115 >> 3) & 896) | ((i11115 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i11115 >> 3)) | (458752 & (i11115 >> 3)) | ((i11115 >> 3) & 3670016), 0);
                }
            }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
            dialogProperties5 = dialogProperties4;
            function7 = function5;
            shape2 = medium;
            function8 = function6;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 == 0) {
                }
                if ((i2 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= -458753;
                } else {
                    medium = shape;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j3;
                }
                if ((i2 & 256) != 0) {
                    dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                    i3 &= -234881025;
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                composerStartRestartGroup.endDefaults();
                i10 = i3;
                function6 = function9;
                modifier2 = modifier3;
                dialogProperties4 = dialogProperties3;
                j4 = jM656contentColorForek8zF_U;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 == 0) {
                }
                if ((i2 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= -458753;
                } else {
                    medium = shape;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j3;
                }
                if ((i2 & 256) != 0) {
                    dialogProperties3 = new DialogProperties(false, false, null, 7, null);
                    i3 &= -234881025;
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                composerStartRestartGroup.endDefaults();
                i10 = i3;
                function6 = function9;
                modifier2 = modifier3;
                dialogProperties4 = dialogProperties3;
                j4 = jM656contentColorForek8zF_U;
            }
            j5 = jM642getSurface0d7_KjU;
            final Modifier modifier11119 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function111111115 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function111111116 = function6;
            final Shape shape11118 = medium;
            final long j1111117 = j4;
            final int i11114 = i10;
            AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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
                public final void invoke(@Nullable Composer composer2, int i11115) {
                    if (((i11115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Function2<Composer, Integer, Unit> function111111117 = function2;
                    Modifier modifier111110 = modifier11119;
                    Function2<Composer, Integer, Unit> function111111118 = function111111115;
                    Function2<Composer, Integer, Unit> function111111119 = function111111116;
                    Shape shape11119 = shape11118;
                    long j1111118 = j5;
                    long j1111119 = j1111117;
                    int i11116 = i11114;
                    AlertDialogKt.m553AlertDialogContentWMdw5o4(function111111117, modifier111110, function111111118, function111111119, shape11119, j1111118, j1111119, composer2, ((i11116 >> 3) & 14) | ((i11116 >> 3) & 112) | ((i11116 >> 3) & 896) | ((i11116 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i11116 >> 3)) | (458752 & (i11116 >> 3)) | ((i11116 >> 3) & 3670016), 0);
                }
            }), composerStartRestartGroup, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
            dialogProperties5 = dialogProperties4;
            function7 = function5;
            shape2 = medium;
            function8 = function6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier111110 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function111111117 = function8;
        final Shape shape11119 = shape2;
        final long j1111118 = j5;
        final long j1111119 = j4;
        final DialogProperties dialogProperties111 = dialogProperties5;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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

            public final void invoke(@Nullable Composer composer2, int i11115) {
                AndroidAlertDialog_androidKt.m556AlertDialogwqdebIU(function0, function2, modifier111110, function7, function111111117, shape11119, j1111118, j1111119, dialogProperties111, composer2, i | 1, i2);
            }
        });
    }
}
