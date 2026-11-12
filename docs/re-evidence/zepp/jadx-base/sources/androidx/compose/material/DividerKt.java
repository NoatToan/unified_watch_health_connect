package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a=\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\"\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/Dp;", "thickness", "startIndent", "", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "Divider", "", "DividerAlpha", "F", "material_release"}, k = 2, mv = {1, 5, 1})
public final class DividerKt {
    private static final float DividerAlpha = 0.12f;

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0129  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @Composable
    /* JADX INFO: renamed from: Divider-oMI9zvI, reason: not valid java name */
    public static final void m675DivideroMI9zvI(@Nullable Modifier modifier, long j, float f, float f2, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float fM2965constructorimpl;
        int i4;
        float fM2965constructorimpl2;
        int i5;
        final Modifier modifier3;
        final long jM1211copywmQWz5c$default;
        boolean z;
        Modifier modifierM285paddingqDBjuR0$default;
        final float f3;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1228913708);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
                j2 = j;
                int i7 = composerStartRestartGroup.changed(j2) ? 32 : 16;
                i3 |= i7;
            } else {
                j2 = j;
            }
            i3 |= i7;
        } else {
            j2 = j;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 896) == 0) {
                fM2965constructorimpl = f;
                i3 |= composerStartRestartGroup.changed(fM2965constructorimpl) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    fM2965constructorimpl2 = f2;
                    if (composerStartRestartGroup.changed(fM2965constructorimpl2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if (((i3 & 5851) ^ 1170) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM1211copywmQWz5c$default = j2;
                        }
                        if (i8 != 0) {
                            fM2965constructorimpl = Dp.m2965constructorimpl(1);
                        }
                        if (i4 != 0) {
                            fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        modifier3 = modifier2;
                        jM1211copywmQWz5c$default = j2;
                    }
                    if (fM2965constructorimpl2 == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        modifierM285paddingqDBjuR0$default = Modifier.INSTANCE;
                    } else {
                        modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, fM2965constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    BoxKt.Box(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM285paddingqDBjuR0$default), 0.0f, 1, null), fM2965constructorimpl), jM1211copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    jM1211copywmQWz5c$default = j2;
                }
                f3 = fM2965constructorimpl;
                f4 = fM2965constructorimpl2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        DividerKt.m675DivideroMI9zvI(modifier3, jM1211copywmQWz5c$default, f3, f4, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            fM2965constructorimpl2 = f2;
            if (((i3 & 5851) ^ 1170) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1211copywmQWz5c$default = j2;
                    }
                    if (i8 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1211copywmQWz5c$default = j2;
                    }
                    if (i8 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                if (fM2965constructorimpl2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, fM2965constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    modifierM285paddingqDBjuR0$default = Modifier.INSTANCE;
                }
                BoxKt.Box(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM285paddingqDBjuR0$default), 0.0f, 1, null), fM2965constructorimpl), jM1211copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1211copywmQWz5c$default = j2;
                    }
                    if (i8 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1211copywmQWz5c$default = j2;
                    }
                    if (i8 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                if (fM2965constructorimpl2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, fM2965constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    modifierM285paddingqDBjuR0$default = Modifier.INSTANCE;
                }
                BoxKt.Box(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM285paddingqDBjuR0$default), 0.0f, 1, null), fM2965constructorimpl), jM1211copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
            }
            f3 = fM2965constructorimpl;
            f4 = fM2965constructorimpl2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    DividerKt.m675DivideroMI9zvI(modifier3, jM1211copywmQWz5c$default, f3, f4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        fM2965constructorimpl = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                fM2965constructorimpl2 = f2;
                if (composerStartRestartGroup.changed(fM2965constructorimpl2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if (((i3 & 5851) ^ 1170) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1211copywmQWz5c$default = j2;
                    }
                    if (i8 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1211copywmQWz5c$default = j2;
                    }
                    if (i8 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                if (fM2965constructorimpl2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, fM2965constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    modifierM285paddingqDBjuR0$default = Modifier.INSTANCE;
                }
                BoxKt.Box(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM285paddingqDBjuR0$default), 0.0f, 1, null), fM2965constructorimpl), jM1211copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1211copywmQWz5c$default = j2;
                    }
                    if (i8 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM1211copywmQWz5c$default = j2;
                    }
                    if (i8 != 0) {
                        fM2965constructorimpl = Dp.m2965constructorimpl(1);
                    }
                    if (i4 != 0) {
                        fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                if (fM2965constructorimpl2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, fM2965constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    modifierM285paddingqDBjuR0$default = Modifier.INSTANCE;
                }
                BoxKt.Box(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM285paddingqDBjuR0$default), 0.0f, 1, null), fM2965constructorimpl), jM1211copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
            }
            f3 = fM2965constructorimpl;
            f4 = fM2965constructorimpl2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    DividerKt.m675DivideroMI9zvI(modifier3, jM1211copywmQWz5c$default, f3, f4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        fM2965constructorimpl2 = f2;
        if (((i3 & 5851) ^ 1170) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1211copywmQWz5c$default = j2;
                }
                if (i8 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                if (i4 != 0) {
                    fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1211copywmQWz5c$default = j2;
                }
                if (i8 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                if (i4 != 0) {
                    fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                }
                composerStartRestartGroup.endDefaults();
            }
            if (fM2965constructorimpl2 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, fM2965constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                modifierM285paddingqDBjuR0$default = Modifier.INSTANCE;
            }
            BoxKt.Box(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM285paddingqDBjuR0$default), 0.0f, 1, null), fM2965constructorimpl), jM1211copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1211copywmQWz5c$default = j2;
                }
                if (i8 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                if (i4 != 0) {
                    fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1211copywmQWz5c$default = j2;
                }
                if (i8 != 0) {
                    fM2965constructorimpl = Dp.m2965constructorimpl(1);
                }
                if (i4 != 0) {
                    fM2965constructorimpl2 = Dp.m2965constructorimpl(0);
                }
                composerStartRestartGroup.endDefaults();
            }
            if (fM2965constructorimpl2 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(Modifier.INSTANCE, fM2965constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                modifierM285paddingqDBjuR0$default = Modifier.INSTANCE;
            }
            BoxKt.Box(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM285paddingqDBjuR0$default), 0.0f, 1, null), fM2965constructorimpl), jM1211copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
        }
        f3 = fM2965constructorimpl;
        f4 = fM2965constructorimpl2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i9) {
                DividerKt.m675DivideroMI9zvI(modifier3, jM1211copywmQWz5c$default, f3, f4, composer2, i | 1, i2);
            }
        });
    }
}
