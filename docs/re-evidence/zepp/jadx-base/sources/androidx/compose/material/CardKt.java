package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.b;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001af\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a¬\u0001\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", b.H, "contentColor", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Card", "onClick", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "", Constants.ENABLED, "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Card-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 5, 1})
public final class CardKt {
    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x013c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x014d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0155  */
    /* JADX WARN: Code duplicated, block: B:119:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0160  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:125:0x016f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0179  */
    /* JADX WARN: Code duplicated, block: B:130:0x017c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0180  */
    /* JADX WARN: Code duplicated, block: B:134:0x0188  */
    /* JADX WARN: Code duplicated, block: B:135:0x018b  */
    /* JADX WARN: Code duplicated, block: B:140:0x019e  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:166:0x0202  */
    /* JADX WARN: Code duplicated, block: B:167:0x0205  */
    /* JADX WARN: Code duplicated, block: B:170:0x020a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0218  */
    /* JADX WARN: Code duplicated, block: B:174:0x021d  */
    /* JADX WARN: Code duplicated, block: B:175:0x022b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0231  */
    /* JADX WARN: Code duplicated, block: B:179:0x0240  */
    /* JADX WARN: Code duplicated, block: B:181:0x0246  */
    /* JADX WARN: Code duplicated, block: B:184:0x024a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0251  */
    /* JADX WARN: Code duplicated, block: B:188:0x0263  */
    /* JADX WARN: Code duplicated, block: B:190:0x0271  */
    /* JADX WARN: Code duplicated, block: B:193:0x0277  */
    /* JADX WARN: Code duplicated, block: B:194:0x0287  */
    /* JADX WARN: Code duplicated, block: B:196:0x028b  */
    /* JADX WARN: Code duplicated, block: B:197:0x028d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0291  */
    /* JADX WARN: Code duplicated, block: B:200:0x0293  */
    /* JADX WARN: Code duplicated, block: B:202:0x0297  */
    /* JADX WARN: Code duplicated, block: B:203:0x0299  */
    /* JADX WARN: Code duplicated, block: B:209:0x0312  */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: Card-9VG74zQ, reason: not valid java name */
    public static final void m612Card9VG74zQ(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable BorderStroke borderStroke, float f, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Indication indication, boolean z, @Nullable String str, @Nullable Role role, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Shape shape2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        float fM2965constructorimpl;
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
        Modifier modifier3;
        Shape medium;
        long jM642getSurface0d7_KjU;
        long jM656contentColorForek8zF_U;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        boolean z2;
        String str2;
        Role role2;
        Role role3;
        String str3;
        int i20;
        long j3;
        boolean z3;
        long j4;
        Object objRememberedValue;
        final String str4;
        final Role role4;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z4;
        final long j5;
        final Shape shape3;
        final float f2;
        final Indication indication3;
        final long j6;
        final Modifier modifier4;
        final BorderStroke borderStroke3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i21;
        int i22;
        Composer composerStartRestartGroup = composer.startRestartGroup(1541787181);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i23 = i3 & 2;
        if (i23 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i3 & 4) == 0) {
                    shape2 = shape;
                    int i24 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                    i4 |= i24;
                } else {
                    shape2 = shape;
                }
                i4 |= i24;
            } else {
                shape2 = shape;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                if ((i3 & 8) == 0 || !composerStartRestartGroup.changed(j)) {
                    i22 = 1024;
                } else {
                    i22 = 2048;
                }
                i4 |= i22;
            }
            if ((i & 57344) != 0) {
                if ((i3 & 16) == 0 || !composerStartRestartGroup.changed(j2)) {
                    i21 = 8192;
                } else {
                    i21 = 16384;
                }
                i4 |= i21;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                i4 |= 196608;
                borderStroke2 = borderStroke;
            } else {
                borderStroke2 = borderStroke;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                i4 |= 1572864;
                fM2965constructorimpl = f;
            } else {
                fM2965constructorimpl = f;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(fM2965constructorimpl)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            if ((i & 234881024) != 0) {
                i4 |= ((i3 & 256) == 0 || !composerStartRestartGroup.changed(indication)) ? 33554432 : 67108864;
            }
            i11 = i3 & 512;
            if (i11 != 0) {
                i4 |= C.ENCODING_PCM_32BIT;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
                i14 |= 48;
            } else if ((i2 & 112) == 0) {
                if (composerStartRestartGroup.changed(role)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
                i14 |= i17;
            }
            i18 = i14;
            if ((i3 & 4096) != 0) {
                if ((i2 & 896) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i18 |= i19;
                }
                if (((i4 & 1533916891) ^ 306783378) != 0 && ((i18 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    j6 = j;
                    j5 = j2;
                    z4 = z;
                    str4 = str;
                    role4 = role;
                    modifier4 = modifier2;
                    shape3 = shape2;
                    borderStroke3 = borderStroke2;
                    f2 = fM2965constructorimpl;
                    mutableInteractionSource3 = mutableInteractionSource;
                    indication3 = indication;
                } else {
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i3 & 4) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i4 &= -897;
                        } else {
                            medium = shape2;
                        }
                        if ((i3 & 8) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i4 &= -7169;
                        } else {
                            jM642getSurface0d7_KjU = j;
                        }
                        if ((i3 & 16) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                            i4 &= -57345;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if (i5 != 0) {
                            borderStroke2 = null;
                        }
                        if (i7 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(1);
                        }
                        if (i9 != 0) {
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
                            i4 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        if (i11 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i13 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i16 != 0) {
                            role2 = null;
                        } else {
                            role2 = role;
                        }
                        composerStartRestartGroup.endDefaults();
                        role3 = role2;
                        str3 = str2;
                        i20 = i4;
                        j3 = jM656contentColorForek8zF_U;
                        long j7 = jM642getSurface0d7_KjU;
                        modifier2 = modifier3;
                        shape2 = medium;
                        z3 = z2;
                        j4 = j7;
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        j4 = j;
                        mutableInteractionSource2 = mutableInteractionSource;
                        indication2 = indication;
                        z3 = z;
                        str3 = str;
                        role3 = role;
                        i20 = i4;
                        j3 = j2;
                    }
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shape2, j4, j3, borderStroke2, fM2965constructorimpl, mutableInteractionSource2, indication2, z3, str3, role3, function2, composerStartRestartGroup, (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i18 & 14) | (i18 & 112) | (i18 & 896), 0);
                    str4 = str3;
                    role4 = role3;
                    BorderStroke borderStroke4 = borderStroke2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    Indication indication4 = indication2;
                    z4 = z3;
                    j5 = j3;
                    shape3 = shape2;
                    f2 = fM2965constructorimpl;
                    indication3 = indication4;
                    j6 = j4;
                    modifier4 = modifier2;
                    borderStroke3 = borderStroke4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CardKt$Card$3
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
                        CardKt.m612Card9VG74zQ(function0, modifier4, shape3, j6, j5, borderStroke3, f2, mutableInteractionSource3, indication3, z4, str4, role4, function2, composer2, i | 1, i2, i3);
                    }
                });
            }
            i18 |= 384;
            if (((i4 & 1533916891) ^ 306783378) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i4 &= -897;
                    } else {
                        medium = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i4 &= -7169;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                        i4 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i5 != 0) {
                        borderStroke2 = null;
                    }
                    if (i7 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i9 != 0) {
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
                        i4 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i16 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    role3 = role2;
                    str3 = str2;
                    i20 = i4;
                    j3 = jM656contentColorForek8zF_U;
                    long j8 = jM642getSurface0d7_KjU;
                    modifier2 = modifier3;
                    shape2 = medium;
                    z3 = z2;
                    j4 = j8;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i4 &= -897;
                    } else {
                        medium = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i4 &= -7169;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                        i4 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i5 != 0) {
                        borderStroke2 = null;
                    }
                    if (i7 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i9 != 0) {
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
                        i4 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i16 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    role3 = role2;
                    str3 = str2;
                    i20 = i4;
                    j3 = jM656contentColorForek8zF_U;
                    long j9 = jM642getSurface0d7_KjU;
                    modifier2 = modifier3;
                    shape2 = medium;
                    z3 = z2;
                    j4 = j9;
                }
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shape2, j4, j3, borderStroke2, fM2965constructorimpl, mutableInteractionSource2, indication2, z3, str3, role3, function2, composerStartRestartGroup, (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i18 & 14) | (i18 & 112) | (i18 & 896), 0);
                str4 = str3;
                role4 = role3;
                BorderStroke borderStroke5 = borderStroke2;
                mutableInteractionSource3 = mutableInteractionSource2;
                Indication indication5 = indication2;
                z4 = z3;
                j5 = j3;
                shape3 = shape2;
                f2 = fM2965constructorimpl;
                indication3 = indication5;
                j6 = j4;
                modifier4 = modifier2;
                borderStroke3 = borderStroke5;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i4 &= -897;
                    } else {
                        medium = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i4 &= -7169;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                        i4 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i5 != 0) {
                        borderStroke2 = null;
                    }
                    if (i7 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i9 != 0) {
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
                        i4 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i16 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    role3 = role2;
                    str3 = str2;
                    i20 = i4;
                    j3 = jM656contentColorForek8zF_U;
                    long j10 = jM642getSurface0d7_KjU;
                    modifier2 = modifier3;
                    shape2 = medium;
                    z3 = z2;
                    j4 = j10;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i4 &= -897;
                    } else {
                        medium = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i4 &= -7169;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                        i4 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i5 != 0) {
                        borderStroke2 = null;
                    }
                    if (i7 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i9 != 0) {
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
                        i4 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i16 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    role3 = role2;
                    str3 = str2;
                    i20 = i4;
                    j3 = jM656contentColorForek8zF_U;
                    long j11 = jM642getSurface0d7_KjU;
                    modifier2 = modifier3;
                    shape2 = medium;
                    z3 = z2;
                    j4 = j11;
                }
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shape2, j4, j3, borderStroke2, fM2965constructorimpl, mutableInteractionSource2, indication2, z3, str3, role3, function2, composerStartRestartGroup, (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i18 & 14) | (i18 & 112) | (i18 & 896), 0);
                str4 = str3;
                role4 = role3;
                BorderStroke borderStroke6 = borderStroke2;
                mutableInteractionSource3 = mutableInteractionSource2;
                Indication indication6 = indication2;
                z4 = z3;
                j5 = j3;
                shape3 = shape2;
                f2 = fM2965constructorimpl;
                indication3 = indication6;
                j6 = j4;
                modifier4 = modifier2;
                borderStroke3 = borderStroke6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CardKt$Card$3
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
                    CardKt.m612Card9VG74zQ(function0, modifier4, shape3, j6, j5, borderStroke3, f2, mutableInteractionSource3, indication3, z4, str4, role4, function2, composer2, i | 1, i2, i3);
                }
            });
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i3 & 4) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i4 |= i24;
            } else {
                shape2 = shape;
            }
            i4 |= i24;
        } else {
            shape2 = shape;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
            if ((i3 & 8) == 0) {
                i22 = 1024;
            } else {
                i22 = 1024;
            }
            i4 |= i22;
        }
        if ((i & 57344) != 0) {
            if ((i3 & 16) == 0) {
                i21 = 8192;
            } else {
                i21 = 8192;
            }
            i4 |= i21;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= 196608;
            borderStroke2 = borderStroke;
        } else {
            borderStroke2 = borderStroke;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(borderStroke2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
            fM2965constructorimpl = f;
        } else {
            fM2965constructorimpl = f;
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(fM2965constructorimpl)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        if ((i & 234881024) != 0) {
            i4 |= ((i3 & 256) == 0 || !composerStartRestartGroup.changed(indication)) ? 33554432 : 67108864;
        }
        i11 = i3 & 512;
        if (i11 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
            i14 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (composerStartRestartGroup.changed(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i2 | i15;
        } else {
            i14 = i2;
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
            i14 |= 48;
        } else if ((i2 & 112) == 0) {
            if (composerStartRestartGroup.changed(role)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i14 |= i17;
        }
        i18 = i14;
        if ((i3 & 4096) != 0) {
            if ((i2 & 896) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i18 |= i19;
            }
            if (((i4 & 1533916891) ^ 306783378) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i4 &= -897;
                    } else {
                        medium = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i4 &= -7169;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                        i4 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i5 != 0) {
                        borderStroke2 = null;
                    }
                    if (i7 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i9 != 0) {
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
                        i4 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i16 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    role3 = role2;
                    str3 = str2;
                    i20 = i4;
                    j3 = jM656contentColorForek8zF_U;
                    long j12 = jM642getSurface0d7_KjU;
                    modifier2 = modifier3;
                    shape2 = medium;
                    z3 = z2;
                    j4 = j12;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i4 &= -897;
                    } else {
                        medium = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i4 &= -7169;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                        i4 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i5 != 0) {
                        borderStroke2 = null;
                    }
                    if (i7 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i9 != 0) {
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
                        i4 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i16 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    role3 = role2;
                    str3 = str2;
                    i20 = i4;
                    j3 = jM656contentColorForek8zF_U;
                    long j13 = jM642getSurface0d7_KjU;
                    modifier2 = modifier3;
                    shape2 = medium;
                    z3 = z2;
                    j4 = j13;
                }
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shape2, j4, j3, borderStroke2, fM2965constructorimpl, mutableInteractionSource2, indication2, z3, str3, role3, function2, composerStartRestartGroup, (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i18 & 14) | (i18 & 112) | (i18 & 896), 0);
                str4 = str3;
                role4 = role3;
                BorderStroke borderStroke7 = borderStroke2;
                mutableInteractionSource3 = mutableInteractionSource2;
                Indication indication7 = indication2;
                z4 = z3;
                j5 = j3;
                shape3 = shape2;
                f2 = fM2965constructorimpl;
                indication3 = indication7;
                j6 = j4;
                modifier4 = modifier2;
                borderStroke3 = borderStroke7;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i4 &= -897;
                    } else {
                        medium = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i4 &= -7169;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                        i4 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i5 != 0) {
                        borderStroke2 = null;
                    }
                    if (i7 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i9 != 0) {
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
                        i4 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i16 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    role3 = role2;
                    str3 = str2;
                    i20 = i4;
                    j3 = jM656contentColorForek8zF_U;
                    long j14 = jM642getSurface0d7_KjU;
                    modifier2 = modifier3;
                    shape2 = medium;
                    z3 = z2;
                    j4 = j14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i4 &= -897;
                    } else {
                        medium = shape2;
                    }
                    if ((i3 & 8) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i4 &= -7169;
                    } else {
                        jM642getSurface0d7_KjU = j;
                    }
                    if ((i3 & 16) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                        i4 &= -57345;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if (i5 != 0) {
                        borderStroke2 = null;
                    }
                    if (i7 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i9 != 0) {
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
                        i4 &= -234881025;
                    } else {
                        indication2 = indication;
                    }
                    if (i11 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i13 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i16 != 0) {
                        role2 = null;
                    } else {
                        role2 = role;
                    }
                    composerStartRestartGroup.endDefaults();
                    role3 = role2;
                    str3 = str2;
                    i20 = i4;
                    j3 = jM656contentColorForek8zF_U;
                    long j15 = jM642getSurface0d7_KjU;
                    modifier2 = modifier3;
                    shape2 = medium;
                    z3 = z2;
                    j4 = j15;
                }
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shape2, j4, j3, borderStroke2, fM2965constructorimpl, mutableInteractionSource2, indication2, z3, str3, role3, function2, composerStartRestartGroup, (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i18 & 14) | (i18 & 112) | (i18 & 896), 0);
                str4 = str3;
                role4 = role3;
                BorderStroke borderStroke8 = borderStroke2;
                mutableInteractionSource3 = mutableInteractionSource2;
                Indication indication8 = indication2;
                z4 = z3;
                j5 = j3;
                shape3 = shape2;
                f2 = fM2965constructorimpl;
                indication3 = indication8;
                j6 = j4;
                modifier4 = modifier2;
                borderStroke3 = borderStroke8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CardKt$Card$3
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
                    CardKt.m612Card9VG74zQ(function0, modifier4, shape3, j6, j5, borderStroke3, f2, mutableInteractionSource3, indication3, z4, str4, role4, function2, composer2, i | 1, i2, i3);
                }
            });
        }
        i18 |= 384;
        if (((i4 & 1533916891) ^ 306783378) != 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i23 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i4 &= -897;
                } else {
                    medium = shape2;
                }
                if ((i3 & 8) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i4 &= -7169;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((i3 & 16) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                    i4 &= -57345;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (i5 != 0) {
                    borderStroke2 = null;
                }
                if (i7 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                if (i9 != 0) {
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
                    i4 &= -234881025;
                } else {
                    indication2 = indication;
                }
                if (i11 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i13 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i16 != 0) {
                    role2 = null;
                } else {
                    role2 = role;
                }
                composerStartRestartGroup.endDefaults();
                role3 = role2;
                str3 = str2;
                i20 = i4;
                j3 = jM656contentColorForek8zF_U;
                long j16 = jM642getSurface0d7_KjU;
                modifier2 = modifier3;
                shape2 = medium;
                z3 = z2;
                j4 = j16;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i23 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i4 &= -897;
                } else {
                    medium = shape2;
                }
                if ((i3 & 8) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i4 &= -7169;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((i3 & 16) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                    i4 &= -57345;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (i5 != 0) {
                    borderStroke2 = null;
                }
                if (i7 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                if (i9 != 0) {
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
                    i4 &= -234881025;
                } else {
                    indication2 = indication;
                }
                if (i11 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i13 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i16 != 0) {
                    role2 = null;
                } else {
                    role2 = role;
                }
                composerStartRestartGroup.endDefaults();
                role3 = role2;
                str3 = str2;
                i20 = i4;
                j3 = jM656contentColorForek8zF_U;
                long j17 = jM642getSurface0d7_KjU;
                modifier2 = modifier3;
                shape2 = medium;
                z3 = z2;
                j4 = j17;
            }
            SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shape2, j4, j3, borderStroke2, fM2965constructorimpl, mutableInteractionSource2, indication2, z3, str3, role3, function2, composerStartRestartGroup, (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i18 & 14) | (i18 & 112) | (i18 & 896), 0);
            str4 = str3;
            role4 = role3;
            BorderStroke borderStroke9 = borderStroke2;
            mutableInteractionSource3 = mutableInteractionSource2;
            Indication indication9 = indication2;
            z4 = z3;
            j5 = j3;
            shape3 = shape2;
            f2 = fM2965constructorimpl;
            indication3 = indication9;
            j6 = j4;
            modifier4 = modifier2;
            borderStroke3 = borderStroke9;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i23 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i4 &= -897;
                } else {
                    medium = shape2;
                }
                if ((i3 & 8) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i4 &= -7169;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((i3 & 16) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                    i4 &= -57345;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (i5 != 0) {
                    borderStroke2 = null;
                }
                if (i7 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                if (i9 != 0) {
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
                    i4 &= -234881025;
                } else {
                    indication2 = indication;
                }
                if (i11 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i13 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i16 != 0) {
                    role2 = null;
                } else {
                    role2 = role;
                }
                composerStartRestartGroup.endDefaults();
                role3 = role2;
                str3 = str2;
                i20 = i4;
                j3 = jM656contentColorForek8zF_U;
                long j18 = jM642getSurface0d7_KjU;
                modifier2 = modifier3;
                shape2 = medium;
                z3 = z2;
                j4 = j18;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i23 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i4 &= -897;
                } else {
                    medium = shape2;
                }
                if ((i3 & 8) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i4 &= -7169;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                if ((i3 & 16) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                    i4 &= -57345;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if (i5 != 0) {
                    borderStroke2 = null;
                }
                if (i7 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                if (i9 != 0) {
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
                    i4 &= -234881025;
                } else {
                    indication2 = indication;
                }
                if (i11 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i13 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i16 != 0) {
                    role2 = null;
                } else {
                    role2 = role;
                }
                composerStartRestartGroup.endDefaults();
                role3 = role2;
                str3 = str2;
                i20 = i4;
                j3 = jM656contentColorForek8zF_U;
                long j19 = jM642getSurface0d7_KjU;
                modifier2 = modifier3;
                shape2 = medium;
                z3 = z2;
                j4 = j19;
            }
            SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shape2, j4, j3, borderStroke2, fM2965constructorimpl, mutableInteractionSource2, indication2, z3, str3, role3, function2, composerStartRestartGroup, (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i18 & 14) | (i18 & 112) | (i18 & 896), 0);
            str4 = str3;
            role4 = role3;
            BorderStroke borderStroke10 = borderStroke2;
            mutableInteractionSource3 = mutableInteractionSource2;
            Indication indication10 = indication2;
            z4 = z3;
            j5 = j3;
            shape3 = shape2;
            f2 = fM2965constructorimpl;
            indication3 = indication10;
            j6 = j4;
            modifier4 = modifier2;
            borderStroke3 = borderStroke10;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CardKt$Card$3
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
                CardKt.m612Card9VG74zQ(function0, modifier4, shape3, j6, j5, borderStroke3, f2, mutableInteractionSource3, indication3, z4, str4, role4, function2, composer2, i | 1, i2, i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x014a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    @Composable
    /* JADX INFO: renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m613CardFjzlyU(@Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable BorderStroke borderStroke, float f, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long jM642getSurface0d7_KjU;
        long jM656contentColorForek8zF_U;
        BorderStroke borderStroke2;
        int i4;
        float fM2965constructorimpl;
        int i5;
        int i6;
        Modifier modifier3;
        final BorderStroke borderStroke3;
        final Modifier modifier4;
        final float f2;
        final Shape shape3;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1541784673);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
                shape2 = shape;
                int i8 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            i3 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jM642getSurface0d7_KjU = j;
                int i9 = composerStartRestartGroup.changed(jM642getSurface0d7_KjU) ? 256 : 128;
                i3 |= i9;
            } else {
                jM642getSurface0d7_KjU = j;
            }
            i3 |= i9;
        } else {
            jM642getSurface0d7_KjU = j;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                jM656contentColorForek8zF_U = j2;
                int i10 = composerStartRestartGroup.changed(jM656contentColorForek8zF_U) ? 2048 : 1024;
                i3 |= i10;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i3 |= i10;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 57344) == 0) {
                borderStroke2 = borderStroke;
                i3 |= composerStartRestartGroup.changed(borderStroke2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((i & 458752) == 0) {
                    fM2965constructorimpl = f;
                    if (composerStartRestartGroup.changed(fM2965constructorimpl)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                if (((i3 & 2995931) ^ 599186) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            CornerBasedShape medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            shape2 = medium;
                        }
                        if ((i2 & 4) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i11 != 0) {
                            borderStroke2 = null;
                        }
                        if (i4 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(1);
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
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                    }
                    int i12 = i3;
                    BorderStroke borderStroke4 = borderStroke2;
                    float f3 = fM2965constructorimpl;
                    SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke4, f3, function2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
                    long j5 = jM656contentColorForek8zF_U;
                    borderStroke3 = borderStroke4;
                    modifier4 = modifier2;
                    f2 = f3;
                    shape3 = shape2;
                    j3 = jM642getSurface0d7_KjU;
                    j4 = j5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    shape3 = shape2;
                    j3 = jM642getSurface0d7_KjU;
                    j4 = jM656contentColorForek8zF_U;
                    borderStroke3 = borderStroke2;
                    f2 = fM2965constructorimpl;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CardKt$Card$1
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
                        CardKt.m613CardFjzlyU(modifier4, shape3, j3, j4, borderStroke3, f2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            fM2965constructorimpl = f;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if (((i3 & 2995931) ^ 599186) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        CornerBasedShape medium2 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        shape2 = medium2;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i11 != 0) {
                        borderStroke2 = null;
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        CornerBasedShape medium3 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        shape2 = medium3;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i11 != 0) {
                        borderStroke2 = null;
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                int i13 = i3;
                BorderStroke borderStroke5 = borderStroke2;
                float f4 = fM2965constructorimpl;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke5, f4, function2, composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896) | (i13 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i13) | (458752 & i13) | (i13 & 3670016), 0);
                long j6 = jM656contentColorForek8zF_U;
                borderStroke3 = borderStroke5;
                modifier4 = modifier2;
                f2 = f4;
                shape3 = shape2;
                j3 = jM642getSurface0d7_KjU;
                j4 = j6;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        CornerBasedShape medium4 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        shape2 = medium4;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i11 != 0) {
                        borderStroke2 = null;
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        CornerBasedShape medium5 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        shape2 = medium5;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i11 != 0) {
                        borderStroke2 = null;
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                int i14 = i3;
                BorderStroke borderStroke6 = borderStroke2;
                float f5 = fM2965constructorimpl;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke6, f5, function2, composerStartRestartGroup, (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                long j7 = jM656contentColorForek8zF_U;
                borderStroke3 = borderStroke6;
                modifier4 = modifier2;
                f2 = f5;
                shape3 = shape2;
                j3 = jM642getSurface0d7_KjU;
                j4 = j7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CardKt$Card$1
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
                    CardKt.m613CardFjzlyU(modifier4, shape3, j3, j4, borderStroke3, f2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        borderStroke2 = borderStroke;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((i & 458752) == 0) {
                fM2965constructorimpl = f;
                if (composerStartRestartGroup.changed(fM2965constructorimpl)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if (((i3 & 2995931) ^ 599186) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        CornerBasedShape medium6 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        shape2 = medium6;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i11 != 0) {
                        borderStroke2 = null;
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        CornerBasedShape medium7 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        shape2 = medium7;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i11 != 0) {
                        borderStroke2 = null;
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                int i15 = i3;
                BorderStroke borderStroke7 = borderStroke2;
                float f6 = fM2965constructorimpl;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke7, f6, function2, composerStartRestartGroup, (i15 & 14) | (i15 & 112) | (i15 & 896) | (i15 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i15) | (458752 & i15) | (i15 & 3670016), 0);
                long j8 = jM656contentColorForek8zF_U;
                borderStroke3 = borderStroke7;
                modifier4 = modifier2;
                f2 = f6;
                shape3 = shape2;
                j3 = jM642getSurface0d7_KjU;
                j4 = j8;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        CornerBasedShape medium8 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        shape2 = medium8;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i11 != 0) {
                        borderStroke2 = null;
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        CornerBasedShape medium9 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        shape2 = medium9;
                    }
                    if ((i2 & 4) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                    }
                    if (i11 != 0) {
                        borderStroke2 = null;
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                int i16 = i3;
                BorderStroke borderStroke8 = borderStroke2;
                float f7 = fM2965constructorimpl;
                SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke8, f7, function2, composerStartRestartGroup, (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i16) | (458752 & i16) | (i16 & 3670016), 0);
                long j9 = jM656contentColorForek8zF_U;
                borderStroke3 = borderStroke8;
                modifier4 = modifier2;
                f2 = f7;
                shape3 = shape2;
                j3 = jM642getSurface0d7_KjU;
                j4 = j9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CardKt$Card$1
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
                    CardKt.m613CardFjzlyU(modifier4, shape3, j3, j4, borderStroke3, f2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 196608;
        fM2965constructorimpl = f;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(function2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if (((i3 & 2995931) ^ 599186) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    CornerBasedShape medium10 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    shape2 = medium10;
                }
                if ((i2 & 4) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i11 != 0) {
                    borderStroke2 = null;
                }
                if (i4 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    CornerBasedShape medium11 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    shape2 = medium11;
                }
                if ((i2 & 4) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i11 != 0) {
                    borderStroke2 = null;
                }
                if (i4 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            int i17 = i3;
            BorderStroke borderStroke9 = borderStroke2;
            float f8 = fM2965constructorimpl;
            SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke9, f8, function2, composerStartRestartGroup, (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i17) | (458752 & i17) | (i17 & 3670016), 0);
            long j10 = jM656contentColorForek8zF_U;
            borderStroke3 = borderStroke9;
            modifier4 = modifier2;
            f2 = f8;
            shape3 = shape2;
            j3 = jM642getSurface0d7_KjU;
            j4 = j10;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    CornerBasedShape medium12 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    shape2 = medium12;
                }
                if ((i2 & 4) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i11 != 0) {
                    borderStroke2 = null;
                }
                if (i4 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    CornerBasedShape medium13 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getMedium();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    shape2 = medium13;
                }
                if ((i2 & 4) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                    i3 &= -7169;
                }
                if (i11 != 0) {
                    borderStroke2 = null;
                }
                if (i4 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            int i18 = i3;
            BorderStroke borderStroke10 = borderStroke2;
            float f9 = fM2965constructorimpl;
            SurfaceKt.m815SurfaceFjzlyU(modifier2, shape2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, borderStroke10, f9, function2, composerStartRestartGroup, (i18 & 14) | (i18 & 112) | (i18 & 896) | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i18) | (458752 & i18) | (i18 & 3670016), 0);
            long j11 = jM656contentColorForek8zF_U;
            borderStroke3 = borderStroke10;
            modifier4 = modifier2;
            f2 = f9;
            shape3 = shape2;
            j3 = jM642getSurface0d7_KjU;
            j4 = j11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CardKt$Card$1
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
                CardKt.m613CardFjzlyU(modifier4, shape3, j3, j4, borderStroke3, f2, function2, composer2, i | 1, i2);
            }
        });
    }
}
