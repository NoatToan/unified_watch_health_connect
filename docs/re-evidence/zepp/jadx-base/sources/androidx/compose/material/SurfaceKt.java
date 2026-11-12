package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.C;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001af\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a¬\u0001\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001ab\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00002\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "contentColor", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface", "onClick", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "", Constants.ENABLED, "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "clickAndSemanticsModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 5, 1})
public final class SurfaceKt {
    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:113:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0151  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:119:0x015c  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0165  */
    /* JADX WARN: Code duplicated, block: B:124:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x016e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0178  */
    /* JADX WARN: Code duplicated, block: B:130:0x017b  */
    /* JADX WARN: Code duplicated, block: B:132:0x017f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018a  */
    /* JADX WARN: Code duplicated, block: B:140:0x019d  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:164:0x0202  */
    /* JADX WARN: Code duplicated, block: B:166:0x0206  */
    /* JADX WARN: Code duplicated, block: B:167:0x020b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0210  */
    /* JADX WARN: Code duplicated, block: B:171:0x0223  */
    /* JADX WARN: Code duplicated, block: B:174:0x022c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0239  */
    /* JADX WARN: Code duplicated, block: B:177:0x023d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0240  */
    /* JADX WARN: Code duplicated, block: B:181:0x0248  */
    /* JADX WARN: Code duplicated, block: B:183:0x025a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0267  */
    /* JADX WARN: Code duplicated, block: B:188:0x026d  */
    /* JADX WARN: Code duplicated, block: B:189:0x027d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0281  */
    /* JADX WARN: Code duplicated, block: B:192:0x0283  */
    /* JADX WARN: Code duplicated, block: B:194:0x0287  */
    /* JADX WARN: Code duplicated, block: B:195:0x0289  */
    /* JADX WARN: Code duplicated, block: B:197:0x028d  */
    /* JADX WARN: Code duplicated, block: B:198:0x028f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0303  */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: Surface-9VG74zQ, reason: not valid java name */
    public static final void m813Surface9VG74zQ(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable BorderStroke borderStroke, float f, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Indication indication, boolean z, @Nullable String str, @Nullable Role role, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Shape shape2;
        int i6;
        int i7;
        BorderStroke borderStroke2;
        int i8;
        int i9;
        float fM2965constructorimpl;
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
        Modifier modifier2;
        Shape rectangleShape;
        int i22;
        final long jM642getSurface0d7_KjU;
        long jM656contentColorForek8zF_U;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        boolean z2;
        String str2;
        Role role2;
        int i23;
        Role role3;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        String str3;
        Indication indication3;
        Object objRememberedValue;
        final Modifier modifier4;
        Role role4;
        final float f2;
        final Shape shape3;
        final boolean z4;
        final long j3;
        final Indication indication4;
        String str4;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i24;
        int i25;
        Composer composerStartRestartGroup = composer.startRestartGroup(-750962995);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i26 = i3 & 2;
        if (i26 == 0) {
            if ((i & 112) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i & 896) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                    if ((i3 & 8) == 0 || !composerStartRestartGroup.changed(j)) {
                        i25 = 1024;
                    } else {
                        i25 = 2048;
                    }
                    i4 |= i25;
                }
                if ((i & 57344) != 0) {
                    if ((i3 & 16) == 0 || !composerStartRestartGroup.changed(j2)) {
                        i24 = 8192;
                    } else {
                        i24 = 16384;
                    }
                    i4 |= i24;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(borderStroke2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    fM2965constructorimpl = f;
                } else {
                    fM2965constructorimpl = f;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(fM2965constructorimpl)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((234881024 & i) != 0) {
                    i4 |= ((i3 & 256) == 0 || !composerStartRestartGroup.changed(indication)) ? 33554432 : 67108864;
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i3 & 1024;
                if (i15 != 0) {
                    i16 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changed(str)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                    i16 |= 48;
                } else if ((i2 & 112) == 0) {
                    if (composerStartRestartGroup.changed(role)) {
                        i19 = 32;
                    } else {
                        i19 = 16;
                    }
                    i16 |= i19;
                }
                i20 = i16;
                if ((i3 & 4096) != 0) {
                    if ((i2 & 896) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i21 = 256;
                        } else {
                            i21 = 128;
                        }
                        i20 |= i21;
                    }
                    if (((i4 & 1533916891) ^ 306783378) != 0 && ((i20 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        jM642getSurface0d7_KjU = j;
                        j3 = j2;
                        str4 = str;
                        role4 = role;
                        borderStroke3 = borderStroke2;
                        f2 = fM2965constructorimpl;
                        shape3 = shape2;
                        mutableInteractionSource4 = mutableInteractionSource;
                        indication4 = indication;
                        z4 = z;
                    } else {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i5 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i3 & 8) != 0) {
                                i22 = i4 & (-7169);
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            } else {
                                i22 = i4;
                                jM642getSurface0d7_KjU = j;
                            }
                            if ((i3 & 16) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                                i22 &= -57345;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if (i7 != 0) {
                                borderStroke2 = null;
                            }
                            if (i9 != 0) {
                                fM2965constructorimpl = Dp.m2965constructorimpl(0);
                            }
                            if (i11 != 0) {
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
                            if ((i3 & 256) != 0) {
                                indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                                i22 &= -234881025;
                            } else {
                                indication2 = indication;
                            }
                            if (i13 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i15 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i18 != 0) {
                                role2 = null;
                            } else {
                                role2 = role;
                            }
                            composerStartRestartGroup.endDefaults();
                            i23 = i22;
                            role3 = role2;
                            z3 = z2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier3 = modifier2;
                            Shape shape4 = rectangleShape;
                            str3 = str2;
                            indication3 = indication2;
                            shape2 = shape4;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            modifier3 = modifier;
                            jM656contentColorForek8zF_U = j2;
                            mutableInteractionSource3 = mutableInteractionSource;
                            indication3 = indication;
                            z3 = z;
                            str3 = str;
                            role3 = role;
                            i23 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        Modifier modifierM126clickableO2vRcR0 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                        int i27 = i23 >> 3;
                        Indication indication5 = indication3;
                        m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR0, function2, composerStartRestartGroup, (i27 & 458752) | (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i27 & 57344) | ((i20 << 15) & 29360128));
                        modifier4 = modifier3;
                        role4 = role3;
                        f2 = fM2965constructorimpl;
                        shape3 = shape2;
                        z4 = z3;
                        j3 = jM656contentColorForek8zF_U;
                        indication4 = indication5;
                        str4 = str3;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource4 = mutableInteractionSource5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str5 = str4;
                    final Role role5 = role4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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
                            SurfaceKt.m813Surface9VG74zQ(function0, modifier4, shape3, jM642getSurface0d7_KjU, j3, borderStroke3, f2, mutableInteractionSource4, indication4, z4, str5, role5, function2, composer2, i | 1, i2, i3);
                        }
                    });
                }
                i20 |= 384;
                if (((i4 & 1533916891) ^ 306783378) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape5 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape6 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape6;
                    }
                    Modifier modifierM126clickableO2vRcR1 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                    int i28 = i23 >> 3;
                    Indication indication6 = indication3;
                    m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR1, function2, composerStartRestartGroup, (i28 & 458752) | (i28 & 14) | (i28 & 112) | (i28 & 896) | (i28 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i28 & 57344) | ((i20 << 15) & 29360128));
                    modifier4 = modifier3;
                    role4 = role3;
                    f2 = fM2965constructorimpl;
                    shape3 = shape2;
                    z4 = z3;
                    j3 = jM656contentColorForek8zF_U;
                    indication4 = indication6;
                    str4 = str3;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource6;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape7 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape7;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape8 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape8;
                    }
                    Modifier modifierM126clickableO2vRcR2 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                    int i29 = i23 >> 3;
                    Indication indication7 = indication3;
                    m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR2, function2, composerStartRestartGroup, (i29 & 458752) | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i29 & 57344) | ((i20 << 15) & 29360128));
                    modifier4 = modifier3;
                    role4 = role3;
                    f2 = fM2965constructorimpl;
                    shape3 = shape2;
                    z4 = z3;
                    j3 = jM656contentColorForek8zF_U;
                    indication4 = indication7;
                    str4 = str3;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource7;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str6 = str4;
                final Role role6 = role4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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
                        SurfaceKt.m813Surface9VG74zQ(function0, modifier4, shape3, jM642getSurface0d7_KjU, j3, borderStroke3, f2, mutableInteractionSource4, indication4, z4, str6, role6, function2, composer2, i | 1, i2, i3);
                    }
                });
            }
            i4 |= 384;
            shape2 = shape;
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                if ((i3 & 8) == 0) {
                    i25 = 1024;
                } else {
                    i25 = 1024;
                }
                i4 |= i25;
            }
            if ((i & 57344) != 0) {
                if ((i3 & 16) == 0) {
                    i24 = 8192;
                } else {
                    i24 = 8192;
                }
                i4 |= i24;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                borderStroke2 = borderStroke;
            } else {
                borderStroke2 = borderStroke;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                fM2965constructorimpl = f;
            } else {
                fM2965constructorimpl = f;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(fM2965constructorimpl)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            if ((234881024 & i) != 0) {
                i4 |= ((i3 & 256) == 0 || !composerStartRestartGroup.changed(indication)) ? 33554432 : 67108864;
            }
            i13 = i3 & 512;
            if (i13 != 0) {
                i4 |= C.ENCODING_PCM_32BIT;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            i15 = i3 & 1024;
            if (i15 != 0) {
                i16 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
                i16 |= 48;
            } else if ((i2 & 112) == 0) {
                if (composerStartRestartGroup.changed(role)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i16 |= i19;
            }
            i20 = i16;
            if ((i3 & 4096) != 0) {
                if ((i2 & 896) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i21 = 256;
                    } else {
                        i21 = 128;
                    }
                    i20 |= i21;
                }
                if (((i4 & 1533916891) ^ 306783378) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape9 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape9;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape10 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape10;
                    }
                    Modifier modifierM126clickableO2vRcR3 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource3;
                    int i210 = i23 >> 3;
                    Indication indication8 = indication3;
                    m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR3, function2, composerStartRestartGroup, (i210 & 458752) | (i210 & 14) | (i210 & 112) | (i210 & 896) | (i210 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i210 & 57344) | ((i20 << 15) & 29360128));
                    modifier4 = modifier3;
                    role4 = role3;
                    f2 = fM2965constructorimpl;
                    shape3 = shape2;
                    z4 = z3;
                    j3 = jM656contentColorForek8zF_U;
                    indication4 = indication8;
                    str4 = str3;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape11 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape11;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape12 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape12;
                    }
                    Modifier modifierM126clickableO2vRcR4 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource3;
                    int i211 = i23 >> 3;
                    Indication indication9 = indication3;
                    m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR4, function2, composerStartRestartGroup, (i211 & 458752) | (i211 & 14) | (i211 & 112) | (i211 & 896) | (i211 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i211 & 57344) | ((i20 << 15) & 29360128));
                    modifier4 = modifier3;
                    role4 = role3;
                    f2 = fM2965constructorimpl;
                    shape3 = shape2;
                    z4 = z3;
                    j3 = jM656contentColorForek8zF_U;
                    indication4 = indication9;
                    str4 = str3;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str7 = str4;
                final Role role7 = role4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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
                        SurfaceKt.m813Surface9VG74zQ(function0, modifier4, shape3, jM642getSurface0d7_KjU, j3, borderStroke3, f2, mutableInteractionSource4, indication4, z4, str7, role7, function2, composer2, i | 1, i2, i3);
                    }
                });
            }
            i20 |= 384;
            if (((i4 & 1533916891) ^ 306783378) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape13 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape14 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape14;
                }
                Modifier modifierM126clickableO2vRcR5 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource3;
                int i212 = i23 >> 3;
                Indication indication10 = indication3;
                m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR5, function2, composerStartRestartGroup, (i212 & 458752) | (i212 & 14) | (i212 & 112) | (i212 & 896) | (i212 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i212 & 57344) | ((i20 << 15) & 29360128));
                modifier4 = modifier3;
                role4 = role3;
                f2 = fM2965constructorimpl;
                shape3 = shape2;
                z4 = z3;
                j3 = jM656contentColorForek8zF_U;
                indication4 = indication10;
                str4 = str3;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource10;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape15 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape15;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape16 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape16;
                }
                Modifier modifierM126clickableO2vRcR6 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource3;
                int i213 = i23 >> 3;
                Indication indication11 = indication3;
                m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR6, function2, composerStartRestartGroup, (i213 & 458752) | (i213 & 14) | (i213 & 112) | (i213 & 896) | (i213 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i213 & 57344) | ((i20 << 15) & 29360128));
                modifier4 = modifier3;
                role4 = role3;
                f2 = fM2965constructorimpl;
                shape3 = shape2;
                z4 = z3;
                j3 = jM656contentColorForek8zF_U;
                indication4 = indication11;
                str4 = str3;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str8 = str4;
            final Role role8 = role4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier4, shape3, jM642getSurface0d7_KjU, j3, borderStroke3, f2, mutableInteractionSource4, indication4, z4, str8, role8, function2, composer2, i | 1, i2, i3);
                }
            });
        }
        i4 |= 48;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i & 896) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                if ((i3 & 8) == 0) {
                    i25 = 1024;
                } else {
                    i25 = 1024;
                }
                i4 |= i25;
            }
            if ((i & 57344) != 0) {
                if ((i3 & 16) == 0) {
                    i24 = 8192;
                } else {
                    i24 = 8192;
                }
                i4 |= i24;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                borderStroke2 = borderStroke;
            } else {
                borderStroke2 = borderStroke;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                fM2965constructorimpl = f;
            } else {
                fM2965constructorimpl = f;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(fM2965constructorimpl)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            if ((234881024 & i) != 0) {
                i4 |= ((i3 & 256) == 0 || !composerStartRestartGroup.changed(indication)) ? 33554432 : 67108864;
            }
            i13 = i3 & 512;
            if (i13 != 0) {
                i4 |= C.ENCODING_PCM_32BIT;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            i15 = i3 & 1024;
            if (i15 != 0) {
                i16 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
                i16 |= 48;
            } else if ((i2 & 112) == 0) {
                if (composerStartRestartGroup.changed(role)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i16 |= i19;
            }
            i20 = i16;
            if ((i3 & 4096) != 0) {
                if ((i2 & 896) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i21 = 256;
                    } else {
                        i21 = 128;
                    }
                    i20 |= i21;
                }
                if (((i4 & 1533916891) ^ 306783378) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape17 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape17;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape18 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape18;
                    }
                    Modifier modifierM126clickableO2vRcR7 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                    MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource3;
                    int i214 = i23 >> 3;
                    Indication indication12 = indication3;
                    m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR7, function2, composerStartRestartGroup, (i214 & 458752) | (i214 & 14) | (i214 & 112) | (i214 & 896) | (i214 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i214 & 57344) | ((i20 << 15) & 29360128));
                    modifier4 = modifier3;
                    role4 = role3;
                    f2 = fM2965constructorimpl;
                    shape3 = shape2;
                    z4 = z3;
                    j3 = jM656contentColorForek8zF_U;
                    indication4 = indication12;
                    str4 = str3;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource12;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape19 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape19;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            i22 = i4 & (-7169);
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        } else {
                            i22 = i4;
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                            i22 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i7 != 0) {
                            borderStroke2 = null;
                        }
                        if (i9 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        }
                        if (i11 != 0) {
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
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                            i22 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i13 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = i22;
                        role3 = role2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        Shape shape110 = rectangleShape;
                        str3 = str2;
                        indication3 = indication2;
                        shape2 = shape110;
                    }
                    Modifier modifierM126clickableO2vRcR8 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                    MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource3;
                    int i215 = i23 >> 3;
                    Indication indication13 = indication3;
                    m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR8, function2, composerStartRestartGroup, (i215 & 458752) | (i215 & 14) | (i215 & 112) | (i215 & 896) | (i215 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i215 & 57344) | ((i20 << 15) & 29360128));
                    modifier4 = modifier3;
                    role4 = role3;
                    f2 = fM2965constructorimpl;
                    shape3 = shape2;
                    z4 = z3;
                    j3 = jM656contentColorForek8zF_U;
                    indication4 = indication13;
                    str4 = str3;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str9 = str4;
                final Role role9 = role4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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
                        SurfaceKt.m813Surface9VG74zQ(function0, modifier4, shape3, jM642getSurface0d7_KjU, j3, borderStroke3, f2, mutableInteractionSource4, indication4, z4, str9, role9, function2, composer2, i | 1, i2, i3);
                    }
                });
            }
            i20 |= 384;
            if (((i4 & 1533916891) ^ 306783378) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape111 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape112 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape112;
                }
                Modifier modifierM126clickableO2vRcR9 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource3;
                int i216 = i23 >> 3;
                Indication indication14 = indication3;
                m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR9, function2, composerStartRestartGroup, (i216 & 458752) | (i216 & 14) | (i216 & 112) | (i216 & 896) | (i216 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i216 & 57344) | ((i20 << 15) & 29360128));
                modifier4 = modifier3;
                role4 = role3;
                f2 = fM2965constructorimpl;
                shape3 = shape2;
                z4 = z3;
                j3 = jM656contentColorForek8zF_U;
                indication4 = indication14;
                str4 = str3;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource14;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape113 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape114 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape114;
                }
                Modifier modifierM126clickableO2vRcR10 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource3;
                int i217 = i23 >> 3;
                Indication indication15 = indication3;
                m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR10, function2, composerStartRestartGroup, (i217 & 458752) | (i217 & 14) | (i217 & 112) | (i217 & 896) | (i217 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i217 & 57344) | ((i20 << 15) & 29360128));
                modifier4 = modifier3;
                role4 = role3;
                f2 = fM2965constructorimpl;
                shape3 = shape2;
                z4 = z3;
                j3 = jM656contentColorForek8zF_U;
                indication4 = indication15;
                str4 = str3;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource15;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str10 = str4;
            final Role role10 = role4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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

                public final void invoke(@Nullable Composer composer2, int i218) {
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier4, shape3, jM642getSurface0d7_KjU, j3, borderStroke3, f2, mutableInteractionSource4, indication4, z4, str10, role10, function2, composer2, i | 1, i2, i3);
                }
            });
        }
        i4 |= 384;
        shape2 = shape;
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
            if ((i3 & 8) == 0) {
                i25 = 1024;
            } else {
                i25 = 1024;
            }
            i4 |= i25;
        }
        if ((i & 57344) != 0) {
            if ((i3 & 16) == 0) {
                i24 = 8192;
            } else {
                i24 = 8192;
            }
            i4 |= i24;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
            borderStroke2 = borderStroke;
        } else {
            borderStroke2 = borderStroke;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(borderStroke2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
            fM2965constructorimpl = f;
        } else {
            fM2965constructorimpl = f;
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(fM2965constructorimpl)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
        }
        i11 = i3 & 128;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        if ((234881024 & i) != 0) {
            i4 |= ((i3 & 256) == 0 || !composerStartRestartGroup.changed(indication)) ? 33554432 : 67108864;
        }
        i13 = i3 & 512;
        if (i13 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        i15 = i3 & 1024;
        if (i15 != 0) {
            i16 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (composerStartRestartGroup.changed(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i16 = i2 | i17;
        } else {
            i16 = i2;
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i2 & 112) == 0) {
            if (composerStartRestartGroup.changed(role)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i16 |= i19;
        }
        i20 = i16;
        if ((i3 & 4096) != 0) {
            if ((i2 & 896) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i20 |= i21;
            }
            if (((i4 & 1533916891) ^ 306783378) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape115 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape115;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape116 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape116;
                }
                Modifier modifierM126clickableO2vRcR11 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource3;
                int i218 = i23 >> 3;
                Indication indication16 = indication3;
                m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR11, function2, composerStartRestartGroup, (i218 & 458752) | (i218 & 14) | (i218 & 112) | (i218 & 896) | (i218 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i218 & 57344) | ((i20 << 15) & 29360128));
                modifier4 = modifier3;
                role4 = role3;
                f2 = fM2965constructorimpl;
                shape3 = shape2;
                z4 = z3;
                j3 = jM656contentColorForek8zF_U;
                indication4 = indication16;
                str4 = str3;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource16;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape117 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        i22 = i4 & (-7169);
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    } else {
                        i22 = i4;
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                        i22 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i7 != 0) {
                        borderStroke2 = null;
                    }
                    if (i9 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    }
                    if (i11 != 0) {
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
                    if ((i3 & 256) != 0) {
                        indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                        i22 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i15 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = i22;
                    role3 = role2;
                    z3 = z2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    Shape shape118 = rectangleShape;
                    str3 = str2;
                    indication3 = indication2;
                    shape2 = shape118;
                }
                Modifier modifierM126clickableO2vRcR12 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
                MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource3;
                int i219 = i23 >> 3;
                Indication indication17 = indication3;
                m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR12, function2, composerStartRestartGroup, (i219 & 458752) | (i219 & 14) | (i219 & 112) | (i219 & 896) | (i219 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i219 & 57344) | ((i20 << 15) & 29360128));
                modifier4 = modifier3;
                role4 = role3;
                f2 = fM2965constructorimpl;
                shape3 = shape2;
                z4 = z3;
                j3 = jM656contentColorForek8zF_U;
                indication4 = indication17;
                str4 = str3;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str11 = str4;
            final Role role11 = role4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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

                public final void invoke(@Nullable Composer composer2, int i2110) {
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier4, shape3, jM642getSurface0d7_KjU, j3, borderStroke3, f2, mutableInteractionSource4, indication4, z4, str11, role11, function2, composer2, i | 1, i2, i3);
                }
            });
        }
        i20 |= 384;
        if (((i4 & 1533916891) ^ 306783378) != 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i3 & 8) != 0) {
                    i22 = i4 & (-7169);
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                } else {
                    i22 = i4;
                    jM642getSurface0d7_KjU = j;
                }
                if ((i3 & 16) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                    i22 &= -57345;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (i7 != 0) {
                    borderStroke2 = null;
                }
                if (i9 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                if (i11 != 0) {
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
                if ((i3 & 256) != 0) {
                    indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                    i22 &= -234881025;
                } else {
                    indication2 = indication;
                }
                if (i13 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i15 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i18 != 0) {
                    role2 = null;
                } else {
                    role2 = role;
                }
                composerStartRestartGroup.endDefaults();
                i23 = i22;
                role3 = role2;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier3 = modifier2;
                Shape shape119 = rectangleShape;
                str3 = str2;
                indication3 = indication2;
                shape2 = shape119;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i3 & 8) != 0) {
                    i22 = i4 & (-7169);
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                } else {
                    i22 = i4;
                    jM642getSurface0d7_KjU = j;
                }
                if ((i3 & 16) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                    i22 &= -57345;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (i7 != 0) {
                    borderStroke2 = null;
                }
                if (i9 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                if (i11 != 0) {
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
                if ((i3 & 256) != 0) {
                    indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                    i22 &= -234881025;
                } else {
                    indication2 = indication;
                }
                if (i13 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i15 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i18 != 0) {
                    role2 = null;
                } else {
                    role2 = role;
                }
                composerStartRestartGroup.endDefaults();
                i23 = i22;
                role3 = role2;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier3 = modifier2;
                Shape shape1110 = rectangleShape;
                str3 = str2;
                indication3 = indication2;
                shape2 = shape1110;
            }
            Modifier modifierM126clickableO2vRcR13 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
            MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource3;
            int i2110 = i23 >> 3;
            Indication indication18 = indication3;
            m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR13, function2, composerStartRestartGroup, (i2110 & 458752) | (i2110 & 14) | (i2110 & 112) | (i2110 & 896) | (i2110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2110 & 57344) | ((i20 << 15) & 29360128));
            modifier4 = modifier3;
            role4 = role3;
            f2 = fM2965constructorimpl;
            shape3 = shape2;
            z4 = z3;
            j3 = jM656contentColorForek8zF_U;
            indication4 = indication18;
            str4 = str3;
            borderStroke3 = borderStroke2;
            mutableInteractionSource4 = mutableInteractionSource18;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i3 & 8) != 0) {
                    i22 = i4 & (-7169);
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                } else {
                    i22 = i4;
                    jM642getSurface0d7_KjU = j;
                }
                if ((i3 & 16) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                    i22 &= -57345;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (i7 != 0) {
                    borderStroke2 = null;
                }
                if (i9 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                if (i11 != 0) {
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
                if ((i3 & 256) != 0) {
                    indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                    i22 &= -234881025;
                } else {
                    indication2 = indication;
                }
                if (i13 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i15 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i18 != 0) {
                    role2 = null;
                } else {
                    role2 = role;
                }
                composerStartRestartGroup.endDefaults();
                i23 = i22;
                role3 = role2;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier3 = modifier2;
                Shape shape1111 = rectangleShape;
                str3 = str2;
                indication3 = indication2;
                shape2 = shape1111;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i3 & 8) != 0) {
                    i22 = i4 & (-7169);
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                } else {
                    i22 = i4;
                    jM642getSurface0d7_KjU = j;
                }
                if ((i3 & 16) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 9) & 14);
                    i22 &= -57345;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (i7 != 0) {
                    borderStroke2 = null;
                }
                if (i9 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                }
                if (i11 != 0) {
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
                if ((i3 & 256) != 0) {
                    indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                    i22 &= -234881025;
                } else {
                    indication2 = indication;
                }
                if (i13 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i15 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i18 != 0) {
                    role2 = null;
                } else {
                    role2 = role;
                }
                composerStartRestartGroup.endDefaults();
                i23 = i22;
                role3 = role2;
                z3 = z2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier3 = modifier2;
                Shape shape1112 = rectangleShape;
                str3 = str2;
                indication3 = indication2;
                shape2 = shape1112;
            }
            Modifier modifierM126clickableO2vRcR14 = ClickableKt.m126clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication3, z3, str3, role3, function0);
            MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource3;
            int i2111 = i23 >> 3;
            Indication indication19 = indication3;
            m814SurfaceFjzlyU(modifier3, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke2, fM2965constructorimpl, modifierM126clickableO2vRcR14, function2, composerStartRestartGroup, (i2111 & 458752) | (i2111 & 14) | (i2111 & 112) | (i2111 & 896) | (i2111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2111 & 57344) | ((i20 << 15) & 29360128));
            modifier4 = modifier3;
            role4 = role3;
            f2 = fM2965constructorimpl;
            shape3 = shape2;
            z4 = z3;
            j3 = jM656contentColorForek8zF_U;
            indication4 = indication19;
            str4 = str3;
            borderStroke3 = borderStroke2;
            mutableInteractionSource4 = mutableInteractionSource19;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final String str12 = str4;
        final Role role12 = role4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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

            public final void invoke(@Nullable Composer composer2, int i2112) {
                SurfaceKt.m813Surface9VG74zQ(function0, modifier4, shape3, jM642getSurface0d7_KjU, j3, borderStroke3, f2, mutableInteractionSource4, indication4, z4, str12, role12, function2, composer2, i | 1, i2, i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:114:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    @Composable
    /* JADX INFO: renamed from: Surface-F-jzlyU, reason: not valid java name */
    public static final void m815SurfaceFjzlyU(@Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable BorderStroke borderStroke, float f, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        BorderStroke borderStroke2;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        final Modifier modifier3;
        Shape rectangleShape;
        long jM642getSurface0d7_KjU;
        long jM656contentColorForek8zF_U;
        float fM2965constructorimpl;
        int i9;
        BorderStroke borderStroke3;
        float f3;
        final Shape shape3;
        final BorderStroke borderStroke4;
        final long j5;
        final float f4;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-750968235);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                shape2 = shape;
                i3 |= composerStartRestartGroup.changed(shape2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    int i12 = composerStartRestartGroup.changed(j3) ? 256 : 128;
                    i3 |= i12;
                } else {
                    j3 = j;
                }
                i3 |= i12;
            } else {
                j3 = j;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    int i13 = composerStartRestartGroup.changed(j4) ? 2048 : 1024;
                    i3 |= i13;
                } else {
                    j4 = j2;
                }
                i3 |= i13;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 57344) == 0) {
                    borderStroke2 = borderStroke;
                    if (composerStartRestartGroup.changed(borderStroke2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if (((i3 & 2995931) ^ 599186) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i11 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i2 & 4) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -897;
                        } else {
                            jM642getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                            i3 &= -7169;
                        } else {
                            jM656contentColorForek8zF_U = j4;
                        }
                        if (i4 != 0) {
                            borderStroke2 = null;
                        }
                        if (i6 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(0);
                        } else {
                            fM2965constructorimpl = f2;
                        }
                        composerStartRestartGroup.endDefaults();
                        i9 = i3;
                        borderStroke3 = borderStroke2;
                        long j7 = jM642getSurface0d7_KjU;
                        shape2 = rectangleShape;
                        f3 = fM2965constructorimpl;
                        j4 = jM656contentColorForek8zF_U;
                        j3 = j7;
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier;
                        i9 = i3;
                        borderStroke3 = borderStroke2;
                        f3 = f2;
                    }
                    m814SurfaceFjzlyU(modifier3, shape2, j3, j4, borderStroke3, f3, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }
                    }), Unit.INSTANCE, new SurfaceKt$Surface$2(null)), function2, composerStartRestartGroup, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i9) | (458752 & i9) | ((i9 << 3) & 29360128));
                    shape3 = shape2;
                    borderStroke4 = borderStroke3;
                    j5 = j4;
                    f4 = f3;
                    j6 = j3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j6 = j3;
                    j5 = j4;
                    borderStroke4 = borderStroke2;
                    f4 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, shape3, j6, j5, borderStroke4, f4, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            borderStroke2 = borderStroke;
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if (((i3 & 2995931) ^ 599186) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i11 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    } else {
                        jM656contentColorForek8zF_U = j4;
                    }
                    if (i4 != 0) {
                        borderStroke2 = null;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    borderStroke3 = borderStroke2;
                    long j8 = jM642getSurface0d7_KjU;
                    shape2 = rectangleShape;
                    f3 = fM2965constructorimpl;
                    j4 = jM656contentColorForek8zF_U;
                    j3 = j8;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i11 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    } else {
                        jM656contentColorForek8zF_U = j4;
                    }
                    if (i4 != 0) {
                        borderStroke2 = null;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    borderStroke3 = borderStroke2;
                    long j9 = jM642getSurface0d7_KjU;
                    shape2 = rectangleShape;
                    f3 = fM2965constructorimpl;
                    j4 = jM656contentColorForek8zF_U;
                    j3 = j9;
                }
                m814SurfaceFjzlyU(modifier3, shape2, j3, j4, borderStroke3, f3, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                }), Unit.INSTANCE, new SurfaceKt$Surface$2(null)), function2, composerStartRestartGroup, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i9) | (458752 & i9) | ((i9 << 3) & 29360128));
                shape3 = shape2;
                borderStroke4 = borderStroke3;
                j5 = j4;
                f4 = f3;
                j6 = j3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i11 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    } else {
                        jM656contentColorForek8zF_U = j4;
                    }
                    if (i4 != 0) {
                        borderStroke2 = null;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    borderStroke3 = borderStroke2;
                    long j10 = jM642getSurface0d7_KjU;
                    shape2 = rectangleShape;
                    f3 = fM2965constructorimpl;
                    j4 = jM656contentColorForek8zF_U;
                    j3 = j10;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i11 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    } else {
                        jM656contentColorForek8zF_U = j4;
                    }
                    if (i4 != 0) {
                        borderStroke2 = null;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    borderStroke3 = borderStroke2;
                    long j11 = jM642getSurface0d7_KjU;
                    shape2 = rectangleShape;
                    f3 = fM2965constructorimpl;
                    j4 = jM656contentColorForek8zF_U;
                    j3 = j11;
                }
                m814SurfaceFjzlyU(modifier3, shape2, j3, j4, borderStroke3, f3, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                }), Unit.INSTANCE, new SurfaceKt$Surface$2(null)), function2, composerStartRestartGroup, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i9) | (458752 & i9) | ((i9 << 3) & 29360128));
                shape3 = shape2;
                borderStroke4 = borderStroke3;
                j5 = j4;
                f4 = f3;
                j6 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape3, j6, j5, borderStroke4, f4, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        shape2 = shape;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (composerStartRestartGroup.changed(j3)) {
                }
                i3 |= i12;
            } else {
                j3 = j;
            }
            i3 |= i12;
        } else {
            j3 = j;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
                }
                i3 |= i13;
            } else {
                j4 = j2;
            }
            i3 |= i13;
        } else {
            j4 = j2;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 57344) == 0) {
                borderStroke2 = borderStroke;
                if (composerStartRestartGroup.changed(borderStroke2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if (((i3 & 2995931) ^ 599186) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i11 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    } else {
                        jM656contentColorForek8zF_U = j4;
                    }
                    if (i4 != 0) {
                        borderStroke2 = null;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    borderStroke3 = borderStroke2;
                    long j12 = jM642getSurface0d7_KjU;
                    shape2 = rectangleShape;
                    f3 = fM2965constructorimpl;
                    j4 = jM656contentColorForek8zF_U;
                    j3 = j12;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i11 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    } else {
                        jM656contentColorForek8zF_U = j4;
                    }
                    if (i4 != 0) {
                        borderStroke2 = null;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    borderStroke3 = borderStroke2;
                    long j13 = jM642getSurface0d7_KjU;
                    shape2 = rectangleShape;
                    f3 = fM2965constructorimpl;
                    j4 = jM656contentColorForek8zF_U;
                    j3 = j13;
                }
                m814SurfaceFjzlyU(modifier3, shape2, j3, j4, borderStroke3, f3, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                }), Unit.INSTANCE, new SurfaceKt$Surface$2(null)), function2, composerStartRestartGroup, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i9) | (458752 & i9) | ((i9 << 3) & 29360128));
                shape3 = shape2;
                borderStroke4 = borderStroke3;
                j5 = j4;
                f4 = f3;
                j6 = j3;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i11 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    } else {
                        jM656contentColorForek8zF_U = j4;
                    }
                    if (i4 != 0) {
                        borderStroke2 = null;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    borderStroke3 = borderStroke2;
                    long j14 = jM642getSurface0d7_KjU;
                    shape2 = rectangleShape;
                    f3 = fM2965constructorimpl;
                    j4 = jM656contentColorForek8zF_U;
                    j3 = j14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i11 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM642getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    } else {
                        jM656contentColorForek8zF_U = j4;
                    }
                    if (i4 != 0) {
                        borderStroke2 = null;
                    }
                    if (i6 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(0);
                    } else {
                        fM2965constructorimpl = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    i9 = i3;
                    borderStroke3 = borderStroke2;
                    long j15 = jM642getSurface0d7_KjU;
                    shape2 = rectangleShape;
                    f3 = fM2965constructorimpl;
                    j4 = jM656contentColorForek8zF_U;
                    j3 = j15;
                }
                m814SurfaceFjzlyU(modifier3, shape2, j3, j4, borderStroke3, f3, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }
                }), Unit.INSTANCE, new SurfaceKt$Surface$2(null)), function2, composerStartRestartGroup, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i9) | (458752 & i9) | ((i9 << 3) & 29360128));
                shape3 = shape2;
                borderStroke4 = borderStroke3;
                j5 = j4;
                f4 = f3;
                j6 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape3, j6, j5, borderStroke4, f4, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        borderStroke2 = borderStroke;
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(function2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if (((i3 & 2995931) ^ 599186) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i11 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i2 & 4) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -897;
                } else {
                    jM642getSurface0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                    i3 &= -7169;
                } else {
                    jM656contentColorForek8zF_U = j4;
                }
                if (i4 != 0) {
                    borderStroke2 = null;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                } else {
                    fM2965constructorimpl = f2;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                borderStroke3 = borderStroke2;
                long j16 = jM642getSurface0d7_KjU;
                shape2 = rectangleShape;
                f3 = fM2965constructorimpl;
                j4 = jM656contentColorForek8zF_U;
                j3 = j16;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i11 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i2 & 4) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -897;
                } else {
                    jM642getSurface0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                    i3 &= -7169;
                } else {
                    jM656contentColorForek8zF_U = j4;
                }
                if (i4 != 0) {
                    borderStroke2 = null;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                } else {
                    fM2965constructorimpl = f2;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                borderStroke3 = borderStroke2;
                long j17 = jM642getSurface0d7_KjU;
                shape2 = rectangleShape;
                f3 = fM2965constructorimpl;
                j4 = jM656contentColorForek8zF_U;
                j3 = j17;
            }
            m814SurfaceFjzlyU(modifier3, shape2, j3, j4, borderStroke3, f3, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }
            }), Unit.INSTANCE, new SurfaceKt$Surface$2(null)), function2, composerStartRestartGroup, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i9) | (458752 & i9) | ((i9 << 3) & 29360128));
            shape3 = shape2;
            borderStroke4 = borderStroke3;
            j5 = j4;
            f4 = f3;
            j6 = j3;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i11 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i2 & 4) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -897;
                } else {
                    jM642getSurface0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                    i3 &= -7169;
                } else {
                    jM656contentColorForek8zF_U = j4;
                }
                if (i4 != 0) {
                    borderStroke2 = null;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                } else {
                    fM2965constructorimpl = f2;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                borderStroke3 = borderStroke2;
                long j18 = jM642getSurface0d7_KjU;
                shape2 = rectangleShape;
                f3 = fM2965constructorimpl;
                j4 = jM656contentColorForek8zF_U;
                j3 = j18;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i11 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i2 & 4) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -897;
                } else {
                    jM642getSurface0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                    i3 &= -7169;
                } else {
                    jM656contentColorForek8zF_U = j4;
                }
                if (i4 != 0) {
                    borderStroke2 = null;
                }
                if (i6 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(0);
                } else {
                    fM2965constructorimpl = f2;
                }
                composerStartRestartGroup.endDefaults();
                i9 = i3;
                borderStroke3 = borderStroke2;
                long j19 = jM642getSurface0d7_KjU;
                shape2 = rectangleShape;
                f3 = fM2965constructorimpl;
                j4 = jM656contentColorForek8zF_U;
                j3 = j19;
            }
            m814SurfaceFjzlyU(modifier3, shape2, j3, j4, borderStroke3, f3, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }
            }), Unit.INSTANCE, new SurfaceKt$Surface$2(null)), function2, composerStartRestartGroup, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i9) | (458752 & i9) | ((i9 << 3) & 29360128));
            shape3 = shape2;
            borderStroke4 = borderStroke3;
            j5 = j4;
            f4 = f3;
            j6 = j3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                SurfaceKt.m815SurfaceFjzlyU(modifier3, shape3, j6, j5, borderStroke4, f4, function2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* JADX INFO: renamed from: Surface-F-jzlyU, reason: not valid java name */
    public static final void m814SurfaceFjzlyU(final Modifier modifier, final Shape shape, final long j, final long j2, final BorderStroke borderStroke, final float f, final Modifier modifier2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        char c;
        long jMo672apply7g2Lkgo;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-750961937);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(borderStroke) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(function2) ? 8388608 : 4194304;
        }
        final int i3 = i2;
        if (((i3 & 23967451) ^ 4793490) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float fM2965constructorimpl = Dp.m2965constructorimpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m2979unboximpl() + f);
            if (Color.m1213equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU()) && elevationOverlay != null) {
                composerStartRestartGroup.startReplaceableGroup(-750961487);
                c = 0;
                jMo672apply7g2Lkgo = elevationOverlay.mo672apply7g2Lkgo(j, fM2965constructorimpl, composerStartRestartGroup, (i3 >> 6) & 14);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                c = 0;
                composerStartRestartGroup.startReplaceableGroup(-750961417);
                composerStartRestartGroup.endReplaceableGroup();
                jMo672apply7g2Lkgo = j;
            }
            ProvidedValue[] providedValueArr = new ProvidedValue[2];
            providedValueArr[c] = ContentColorKt.getLocalContentColor().provides(Color.m1202boximpl(j2));
            providedValueArr[1] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2963boximpl(fM2965constructorimpl));
            composer2 = composerStartRestartGroup;
            final long j3 = jMo672apply7g2Lkgo;
            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819902387, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$6
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
                public final void invoke(@Nullable Composer composer3, int i4) {
                    if (((i4 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    Modifier modifierM922shadowziNgDLE = ShadowKt.m922shadowziNgDLE(modifier, f, shape, false);
                    BorderStroke borderStroke2 = borderStroke;
                    Modifier modifierThen = ClipKt.clip(BackgroundKt.m110backgroundbw27NRU(modifierM922shadowziNgDLE.then(borderStroke2 != null ? BorderKt.border(Modifier.INSTANCE, borderStroke2, shape) : Modifier.INSTANCE), j3, shape), shape).then(modifier2);
                    Function2<Composer, Integer, Unit> function3 = function2;
                    int i5 = i3;
                    composer3.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(1376089335);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer3);
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    composer3.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(1505976098);
                    function3.invoke(composer3, Integer.valueOf((i5 >> 21) & 14));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                }
            }), composer2, 56);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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

            public final void invoke(@Nullable Composer composer3, int i4) {
                SurfaceKt.m814SurfaceFjzlyU(modifier, shape, j, j2, borderStroke, f, modifier2, (Function2<? super Composer, ? super Integer, Unit>) function2, composer3, i | 1);
            }
        });
    }
}
