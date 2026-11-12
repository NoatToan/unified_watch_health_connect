package androidx.compose.foundation;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aU\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0013\u001aU\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "Image", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class ImageKt {
    @Composable
    public static final void Image(@NotNull final ImageBitmap imageBitmap, @Nullable final String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, @Nullable Composer composer, final int i, final int i2) {
        Alignment center;
        int i3;
        ContentScale fit;
        Composer composerStartRestartGroup = composer.startRestartGroup(-816802257);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            center = Alignment.INSTANCE.getCenter();
        } else {
            center = alignment;
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            i3 &= -57345;
            fit = ContentScale.INSTANCE.getFit();
        } else {
            fit = contentScale;
        }
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        composerStartRestartGroup.startReplaceableGroup(-3686930);
        boolean zChanged = composerStartRestartGroup.changed(imageBitmap);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
            composerStartRestartGroup.updateRememberedValue(bitmapPainter);
            objRememberedValue = bitmapPainter;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Image((BitmapPainter) objRememberedValue, str, modifier2, center, fit, f2, colorFilter2, composerStartRestartGroup, (i3 & 112) | 8 | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final Alignment alignment2 = center;
        final ContentScale contentScale2 = fit;
        final float f3 = f2;
        final ColorFilter colorFilter3 = colorFilter2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                ImageKt.Image(imageBitmap, str, modifier3, alignment2, contentScale2, f3, colorFilter3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:116:0x017e  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    @Composable
    public static final void Image(@NotNull final ImageVector imageVector, @Nullable final String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Alignment center;
        ContentScale fit;
        int i6;
        float f2;
        int i7;
        int i8;
        ColorFilter colorFilter2;
        int i9;
        Modifier modifier3;
        final ColorFilter colorFilter3;
        final float f3;
        final Alignment alignment2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-816800210);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
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
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if ((i2 & 8) == 0) {
                        center = alignment;
                        int i10 = composerStartRestartGroup.changed(center) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        center = alignment;
                    }
                    i3 |= i10;
                } else {
                    center = alignment;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        fit = contentScale;
                        int i11 = composerStartRestartGroup.changed(fit) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        fit = contentScale;
                    }
                    i3 |= i11;
                } else {
                    fit = contentScale;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((i & 458752) == 0) {
                        f2 = f;
                        if (composerStartRestartGroup.changed(f2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((i & 3670016) == 0) {
                            colorFilter2 = colorFilter;
                            if (composerStartRestartGroup.changed(colorFilter2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if (((i3 & 2995931) ^ 599186) != 0 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            alignment2 = center;
                            f3 = f2;
                            colorFilter3 = colorFilter2;
                        } else {
                            if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipCurrentGroup();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i4 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    center = Alignment.INSTANCE.getCenter();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    fit = ContentScale.INSTANCE.getFit();
                                }
                                if (i6 != 0) {
                                    f2 = 1.0f;
                                }
                                if (i8 != 0) {
                                    colorFilter2 = null;
                                }
                                composerStartRestartGroup.endDefaults();
                                modifier2 = modifier3;
                            }
                            float f4 = f2;
                            ColorFilter colorFilter4 = colorFilter2;
                            ContentScale contentScale2 = fit;
                            int i12 = i3;
                            Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i12 & 14), str, modifier2, center, contentScale2, f4, colorFilter4, composerStartRestartGroup, (57344 & i12) | VectorPainter.$stable | (i12 & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i12) | (i12 & 3670016), 0);
                            fit = contentScale2;
                            colorFilter3 = colorFilter4;
                            Alignment alignment3 = center;
                            f3 = f4;
                            alignment2 = alignment3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier4 = modifier2;
                        final ContentScale contentScale3 = fit;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i13) {
                                ImageKt.Image(imageVector, str, modifier4, alignment2, contentScale3, f3, colorFilter3, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 1572864;
                    colorFilter2 = colorFilter;
                    if (((i3 & 2995931) ^ 599186) != 0) {
                        if ((i & 1) == 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        }
                        float f5 = f2;
                        ColorFilter colorFilter5 = colorFilter2;
                        ContentScale contentScale4 = fit;
                        int i13 = i3;
                        Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i13 & 14), str, modifier2, center, contentScale4, f5, colorFilter5, composerStartRestartGroup, (57344 & i13) | VectorPainter.$stable | (i13 & 112) | (i13 & 896) | (i13 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i13) | (i13 & 3670016), 0);
                        fit = contentScale4;
                        colorFilter3 = colorFilter5;
                        Alignment alignment4 = center;
                        f3 = f5;
                        alignment2 = alignment4;
                    } else {
                        if ((i & 1) == 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        }
                        float f6 = f2;
                        ColorFilter colorFilter6 = colorFilter2;
                        ContentScale contentScale5 = fit;
                        int i14 = i3;
                        Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i14 & 14), str, modifier2, center, contentScale5, f6, colorFilter6, composerStartRestartGroup, (57344 & i14) | VectorPainter.$stable | (i14 & 112) | (i14 & 896) | (i14 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i14) | (i14 & 3670016), 0);
                        fit = contentScale5;
                        colorFilter3 = colorFilter6;
                        Alignment alignment5 = center;
                        f3 = f6;
                        alignment2 = alignment5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier5 = modifier2;
                    final ContentScale contentScale6 = fit;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ImageKt.Image(imageVector, str, modifier5, alignment2, contentScale6, f3, colorFilter3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                f2 = f;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((i & 3670016) == 0) {
                        colorFilter2 = colorFilter;
                        if (composerStartRestartGroup.changed(colorFilter2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((i3 & 2995931) ^ 599186) != 0) {
                        if ((i & 1) == 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        }
                        float f7 = f2;
                        ColorFilter colorFilter7 = colorFilter2;
                        ContentScale contentScale7 = fit;
                        int i15 = i3;
                        Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i15 & 14), str, modifier2, center, contentScale7, f7, colorFilter7, composerStartRestartGroup, (57344 & i15) | VectorPainter.$stable | (i15 & 112) | (i15 & 896) | (i15 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i15) | (i15 & 3670016), 0);
                        fit = contentScale7;
                        colorFilter3 = colorFilter7;
                        Alignment alignment6 = center;
                        f3 = f7;
                        alignment2 = alignment6;
                    } else {
                        if ((i & 1) == 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        }
                        float f8 = f2;
                        ColorFilter colorFilter8 = colorFilter2;
                        ContentScale contentScale8 = fit;
                        int i16 = i3;
                        Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i16 & 14), str, modifier2, center, contentScale8, f8, colorFilter8, composerStartRestartGroup, (57344 & i16) | VectorPainter.$stable | (i16 & 112) | (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i16) | (i16 & 3670016), 0);
                        fit = contentScale8;
                        colorFilter3 = colorFilter8;
                        Alignment alignment7 = center;
                        f3 = f8;
                        alignment2 = alignment7;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier6 = modifier2;
                    final ContentScale contentScale9 = fit;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i17) {
                            ImageKt.Image(imageVector, str, modifier6, alignment2, contentScale9, f3, colorFilter3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 1572864;
                colorFilter2 = colorFilter;
                if (((i3 & 2995931) ^ 599186) != 0) {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f9 = f2;
                    ColorFilter colorFilter9 = colorFilter2;
                    ContentScale contentScale10 = fit;
                    int i17 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i17 & 14), str, modifier2, center, contentScale10, f9, colorFilter9, composerStartRestartGroup, (57344 & i17) | VectorPainter.$stable | (i17 & 112) | (i17 & 896) | (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i17) | (i17 & 3670016), 0);
                    fit = contentScale10;
                    colorFilter3 = colorFilter9;
                    Alignment alignment8 = center;
                    f3 = f9;
                    alignment2 = alignment8;
                } else {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f10 = f2;
                    ColorFilter colorFilter10 = colorFilter2;
                    ContentScale contentScale11 = fit;
                    int i18 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i18 & 14), str, modifier2, center, contentScale11, f10, colorFilter10, composerStartRestartGroup, (57344 & i18) | VectorPainter.$stable | (i18 & 112) | (i18 & 896) | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i18) | (i18 & 3670016), 0);
                    fit = contentScale11;
                    colorFilter3 = colorFilter10;
                    Alignment alignment9 = center;
                    f3 = f10;
                    alignment2 = alignment9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier7 = modifier2;
                final ContentScale contentScale12 = fit;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i19) {
                        ImageKt.Image(imageVector, str, modifier7, alignment2, contentScale12, f3, colorFilter3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    center = alignment;
                    if (composerStartRestartGroup.changed(center)) {
                    }
                    i3 |= i10;
                } else {
                    center = alignment;
                }
                i3 |= i10;
            } else {
                center = alignment;
            }
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    fit = contentScale;
                    if (composerStartRestartGroup.changed(fit)) {
                    }
                    i3 |= i11;
                } else {
                    fit = contentScale;
                }
                i3 |= i11;
            } else {
                fit = contentScale;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((i & 458752) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((i & 3670016) == 0) {
                        colorFilter2 = colorFilter;
                        if (composerStartRestartGroup.changed(colorFilter2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((i3 & 2995931) ^ 599186) != 0) {
                        if ((i & 1) == 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        }
                        float f11 = f2;
                        ColorFilter colorFilter11 = colorFilter2;
                        ContentScale contentScale13 = fit;
                        int i19 = i3;
                        Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i19 & 14), str, modifier2, center, contentScale13, f11, colorFilter11, composerStartRestartGroup, (57344 & i19) | VectorPainter.$stable | (i19 & 112) | (i19 & 896) | (i19 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19) | (i19 & 3670016), 0);
                        fit = contentScale13;
                        colorFilter3 = colorFilter11;
                        Alignment alignment10 = center;
                        f3 = f11;
                        alignment2 = alignment10;
                    } else {
                        if ((i & 1) == 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        }
                        float f12 = f2;
                        ColorFilter colorFilter12 = colorFilter2;
                        ContentScale contentScale14 = fit;
                        int i110 = i3;
                        Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i110 & 14), str, modifier2, center, contentScale14, f12, colorFilter12, composerStartRestartGroup, (57344 & i110) | VectorPainter.$stable | (i110 & 112) | (i110 & 896) | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i110) | (i110 & 3670016), 0);
                        fit = contentScale14;
                        colorFilter3 = colorFilter12;
                        Alignment alignment11 = center;
                        f3 = f12;
                        alignment2 = alignment11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier8 = modifier2;
                    final ContentScale contentScale15 = fit;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i111) {
                            ImageKt.Image(imageVector, str, modifier8, alignment2, contentScale15, f3, colorFilter3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 1572864;
                colorFilter2 = colorFilter;
                if (((i3 & 2995931) ^ 599186) != 0) {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f13 = f2;
                    ColorFilter colorFilter13 = colorFilter2;
                    ContentScale contentScale16 = fit;
                    int i111 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i111 & 14), str, modifier2, center, contentScale16, f13, colorFilter13, composerStartRestartGroup, (57344 & i111) | VectorPainter.$stable | (i111 & 112) | (i111 & 896) | (i111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i111) | (i111 & 3670016), 0);
                    fit = contentScale16;
                    colorFilter3 = colorFilter13;
                    Alignment alignment12 = center;
                    f3 = f13;
                    alignment2 = alignment12;
                } else {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f14 = f2;
                    ColorFilter colorFilter14 = colorFilter2;
                    ContentScale contentScale17 = fit;
                    int i112 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i112 & 14), str, modifier2, center, contentScale17, f14, colorFilter14, composerStartRestartGroup, (57344 & i112) | VectorPainter.$stable | (i112 & 112) | (i112 & 896) | (i112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i112) | (i112 & 3670016), 0);
                    fit = contentScale17;
                    colorFilter3 = colorFilter14;
                    Alignment alignment13 = center;
                    f3 = f14;
                    alignment2 = alignment13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier9 = modifier2;
                final ContentScale contentScale18 = fit;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i113) {
                        ImageKt.Image(imageVector, str, modifier9, alignment2, contentScale18, f3, colorFilter3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            f2 = f;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((i & 3670016) == 0) {
                    colorFilter2 = colorFilter;
                    if (composerStartRestartGroup.changed(colorFilter2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((i3 & 2995931) ^ 599186) != 0) {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f15 = f2;
                    ColorFilter colorFilter15 = colorFilter2;
                    ContentScale contentScale19 = fit;
                    int i113 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i113 & 14), str, modifier2, center, contentScale19, f15, colorFilter15, composerStartRestartGroup, (57344 & i113) | VectorPainter.$stable | (i113 & 112) | (i113 & 896) | (i113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i113) | (i113 & 3670016), 0);
                    fit = contentScale19;
                    colorFilter3 = colorFilter15;
                    Alignment alignment14 = center;
                    f3 = f15;
                    alignment2 = alignment14;
                } else {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f16 = f2;
                    ColorFilter colorFilter16 = colorFilter2;
                    ContentScale contentScale110 = fit;
                    int i114 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i114 & 14), str, modifier2, center, contentScale110, f16, colorFilter16, composerStartRestartGroup, (57344 & i114) | VectorPainter.$stable | (i114 & 112) | (i114 & 896) | (i114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i114) | (i114 & 3670016), 0);
                    fit = contentScale110;
                    colorFilter3 = colorFilter16;
                    Alignment alignment15 = center;
                    f3 = f16;
                    alignment2 = alignment15;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier10 = modifier2;
                final ContentScale contentScale111 = fit;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i115) {
                        ImageKt.Image(imageVector, str, modifier10, alignment2, contentScale111, f3, colorFilter3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 1572864;
            colorFilter2 = colorFilter;
            if (((i3 & 2995931) ^ 599186) != 0) {
                if ((i & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                float f17 = f2;
                ColorFilter colorFilter17 = colorFilter2;
                ContentScale contentScale112 = fit;
                int i115 = i3;
                Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i115 & 14), str, modifier2, center, contentScale112, f17, colorFilter17, composerStartRestartGroup, (57344 & i115) | VectorPainter.$stable | (i115 & 112) | (i115 & 896) | (i115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i115) | (i115 & 3670016), 0);
                fit = contentScale112;
                colorFilter3 = colorFilter17;
                Alignment alignment16 = center;
                f3 = f17;
                alignment2 = alignment16;
            } else {
                if ((i & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                float f18 = f2;
                ColorFilter colorFilter18 = colorFilter2;
                ContentScale contentScale113 = fit;
                int i116 = i3;
                Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i116 & 14), str, modifier2, center, contentScale113, f18, colorFilter18, composerStartRestartGroup, (57344 & i116) | VectorPainter.$stable | (i116 & 112) | (i116 & 896) | (i116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i116) | (i116 & 3670016), 0);
                fit = contentScale113;
                colorFilter3 = colorFilter18;
                Alignment alignment17 = center;
                f3 = f18;
                alignment2 = alignment17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11 = modifier2;
            final ContentScale contentScale114 = fit;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i117) {
                    ImageKt.Image(imageVector, str, modifier11, alignment2, contentScale114, f3, colorFilter3, composer2, i | 1, i2);
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
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    center = alignment;
                    if (composerStartRestartGroup.changed(center)) {
                    }
                    i3 |= i10;
                } else {
                    center = alignment;
                }
                i3 |= i10;
            } else {
                center = alignment;
            }
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    fit = contentScale;
                    if (composerStartRestartGroup.changed(fit)) {
                    }
                    i3 |= i11;
                } else {
                    fit = contentScale;
                }
                i3 |= i11;
            } else {
                fit = contentScale;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((i & 458752) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((i & 3670016) == 0) {
                        colorFilter2 = colorFilter;
                        if (composerStartRestartGroup.changed(colorFilter2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((i3 & 2995931) ^ 599186) != 0) {
                        if ((i & 1) == 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        }
                        float f19 = f2;
                        ColorFilter colorFilter19 = colorFilter2;
                        ContentScale contentScale115 = fit;
                        int i117 = i3;
                        Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i117 & 14), str, modifier2, center, contentScale115, f19, colorFilter19, composerStartRestartGroup, (57344 & i117) | VectorPainter.$stable | (i117 & 112) | (i117 & 896) | (i117 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i117) | (i117 & 3670016), 0);
                        fit = contentScale115;
                        colorFilter3 = colorFilter19;
                        Alignment alignment18 = center;
                        f3 = f19;
                        alignment2 = alignment18;
                    } else {
                        if ((i & 1) == 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                center = Alignment.INSTANCE.getCenter();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                fit = ContentScale.INSTANCE.getFit();
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                colorFilter2 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier2 = modifier3;
                        }
                        float f110 = f2;
                        ColorFilter colorFilter110 = colorFilter2;
                        ContentScale contentScale116 = fit;
                        int i118 = i3;
                        Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i118 & 14), str, modifier2, center, contentScale116, f110, colorFilter110, composerStartRestartGroup, (57344 & i118) | VectorPainter.$stable | (i118 & 112) | (i118 & 896) | (i118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i118) | (i118 & 3670016), 0);
                        fit = contentScale116;
                        colorFilter3 = colorFilter110;
                        Alignment alignment19 = center;
                        f3 = f110;
                        alignment2 = alignment19;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier12 = modifier2;
                    final ContentScale contentScale117 = fit;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i119) {
                            ImageKt.Image(imageVector, str, modifier12, alignment2, contentScale117, f3, colorFilter3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 1572864;
                colorFilter2 = colorFilter;
                if (((i3 & 2995931) ^ 599186) != 0) {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f111 = f2;
                    ColorFilter colorFilter111 = colorFilter2;
                    ContentScale contentScale118 = fit;
                    int i119 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i119 & 14), str, modifier2, center, contentScale118, f111, colorFilter111, composerStartRestartGroup, (57344 & i119) | VectorPainter.$stable | (i119 & 112) | (i119 & 896) | (i119 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i119) | (i119 & 3670016), 0);
                    fit = contentScale118;
                    colorFilter3 = colorFilter111;
                    Alignment alignment110 = center;
                    f3 = f111;
                    alignment2 = alignment110;
                } else {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f112 = f2;
                    ColorFilter colorFilter112 = colorFilter2;
                    ContentScale contentScale119 = fit;
                    int i1110 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1110 & 14), str, modifier2, center, contentScale119, f112, colorFilter112, composerStartRestartGroup, (57344 & i1110) | VectorPainter.$stable | (i1110 & 112) | (i1110 & 896) | (i1110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1110) | (i1110 & 3670016), 0);
                    fit = contentScale119;
                    colorFilter3 = colorFilter112;
                    Alignment alignment111 = center;
                    f3 = f112;
                    alignment2 = alignment111;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier13 = modifier2;
                final ContentScale contentScale1110 = fit;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1111) {
                        ImageKt.Image(imageVector, str, modifier13, alignment2, contentScale1110, f3, colorFilter3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            f2 = f;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((i & 3670016) == 0) {
                    colorFilter2 = colorFilter;
                    if (composerStartRestartGroup.changed(colorFilter2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((i3 & 2995931) ^ 599186) != 0) {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f113 = f2;
                    ColorFilter colorFilter113 = colorFilter2;
                    ContentScale contentScale1111 = fit;
                    int i1111 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1111 & 14), str, modifier2, center, contentScale1111, f113, colorFilter113, composerStartRestartGroup, (57344 & i1111) | VectorPainter.$stable | (i1111 & 112) | (i1111 & 896) | (i1111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1111) | (i1111 & 3670016), 0);
                    fit = contentScale1111;
                    colorFilter3 = colorFilter113;
                    Alignment alignment112 = center;
                    f3 = f113;
                    alignment2 = alignment112;
                } else {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f114 = f2;
                    ColorFilter colorFilter114 = colorFilter2;
                    ContentScale contentScale1112 = fit;
                    int i1112 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1112 & 14), str, modifier2, center, contentScale1112, f114, colorFilter114, composerStartRestartGroup, (57344 & i1112) | VectorPainter.$stable | (i1112 & 112) | (i1112 & 896) | (i1112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1112) | (i1112 & 3670016), 0);
                    fit = contentScale1112;
                    colorFilter3 = colorFilter114;
                    Alignment alignment113 = center;
                    f3 = f114;
                    alignment2 = alignment113;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier14 = modifier2;
                final ContentScale contentScale1113 = fit;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1113) {
                        ImageKt.Image(imageVector, str, modifier14, alignment2, contentScale1113, f3, colorFilter3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 1572864;
            colorFilter2 = colorFilter;
            if (((i3 & 2995931) ^ 599186) != 0) {
                if ((i & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                float f115 = f2;
                ColorFilter colorFilter115 = colorFilter2;
                ContentScale contentScale1114 = fit;
                int i1113 = i3;
                Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1113 & 14), str, modifier2, center, contentScale1114, f115, colorFilter115, composerStartRestartGroup, (57344 & i1113) | VectorPainter.$stable | (i1113 & 112) | (i1113 & 896) | (i1113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1113) | (i1113 & 3670016), 0);
                fit = contentScale1114;
                colorFilter3 = colorFilter115;
                Alignment alignment114 = center;
                f3 = f115;
                alignment2 = alignment114;
            } else {
                if ((i & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                float f116 = f2;
                ColorFilter colorFilter116 = colorFilter2;
                ContentScale contentScale1115 = fit;
                int i1114 = i3;
                Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1114 & 14), str, modifier2, center, contentScale1115, f116, colorFilter116, composerStartRestartGroup, (57344 & i1114) | VectorPainter.$stable | (i1114 & 112) | (i1114 & 896) | (i1114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1114) | (i1114 & 3670016), 0);
                fit = contentScale1115;
                colorFilter3 = colorFilter116;
                Alignment alignment115 = center;
                f3 = f116;
                alignment2 = alignment115;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier15 = modifier2;
            final ContentScale contentScale1116 = fit;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1115) {
                    ImageKt.Image(imageVector, str, modifier15, alignment2, contentScale1116, f3, colorFilter3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                center = alignment;
                if (composerStartRestartGroup.changed(center)) {
                }
                i3 |= i10;
            } else {
                center = alignment;
            }
            i3 |= i10;
        } else {
            center = alignment;
        }
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                fit = contentScale;
                if (composerStartRestartGroup.changed(fit)) {
                }
                i3 |= i11;
            } else {
                fit = contentScale;
            }
            i3 |= i11;
        } else {
            fit = contentScale;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((i & 458752) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((i & 3670016) == 0) {
                    colorFilter2 = colorFilter;
                    if (composerStartRestartGroup.changed(colorFilter2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((i3 & 2995931) ^ 599186) != 0) {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f117 = f2;
                    ColorFilter colorFilter117 = colorFilter2;
                    ContentScale contentScale1117 = fit;
                    int i1115 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1115 & 14), str, modifier2, center, contentScale1117, f117, colorFilter117, composerStartRestartGroup, (57344 & i1115) | VectorPainter.$stable | (i1115 & 112) | (i1115 & 896) | (i1115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1115) | (i1115 & 3670016), 0);
                    fit = contentScale1117;
                    colorFilter3 = colorFilter117;
                    Alignment alignment116 = center;
                    f3 = f117;
                    alignment2 = alignment116;
                } else {
                    if ((i & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fit = ContentScale.INSTANCE.getFit();
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            colorFilter2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    }
                    float f118 = f2;
                    ColorFilter colorFilter118 = colorFilter2;
                    ContentScale contentScale1118 = fit;
                    int i1116 = i3;
                    Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1116 & 14), str, modifier2, center, contentScale1118, f118, colorFilter118, composerStartRestartGroup, (57344 & i1116) | VectorPainter.$stable | (i1116 & 112) | (i1116 & 896) | (i1116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1116) | (i1116 & 3670016), 0);
                    fit = contentScale1118;
                    colorFilter3 = colorFilter118;
                    Alignment alignment117 = center;
                    f3 = f118;
                    alignment2 = alignment117;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier16 = modifier2;
                final ContentScale contentScale1119 = fit;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1117) {
                        ImageKt.Image(imageVector, str, modifier16, alignment2, contentScale1119, f3, colorFilter3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 1572864;
            colorFilter2 = colorFilter;
            if (((i3 & 2995931) ^ 599186) != 0) {
                if ((i & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                float f119 = f2;
                ColorFilter colorFilter119 = colorFilter2;
                ContentScale contentScale11110 = fit;
                int i1117 = i3;
                Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1117 & 14), str, modifier2, center, contentScale11110, f119, colorFilter119, composerStartRestartGroup, (57344 & i1117) | VectorPainter.$stable | (i1117 & 112) | (i1117 & 896) | (i1117 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1117) | (i1117 & 3670016), 0);
                fit = contentScale11110;
                colorFilter3 = colorFilter119;
                Alignment alignment118 = center;
                f3 = f119;
                alignment2 = alignment118;
            } else {
                if ((i & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                float f1110 = f2;
                ColorFilter colorFilter1110 = colorFilter2;
                ContentScale contentScale11111 = fit;
                int i1118 = i3;
                Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1118 & 14), str, modifier2, center, contentScale11111, f1110, colorFilter1110, composerStartRestartGroup, (57344 & i1118) | VectorPainter.$stable | (i1118 & 112) | (i1118 & 896) | (i1118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1118) | (i1118 & 3670016), 0);
                fit = contentScale11111;
                colorFilter3 = colorFilter1110;
                Alignment alignment119 = center;
                f3 = f1110;
                alignment2 = alignment119;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier17 = modifier2;
            final ContentScale contentScale11112 = fit;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1119) {
                    ImageKt.Image(imageVector, str, modifier17, alignment2, contentScale11112, f3, colorFilter3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 196608;
        f2 = f;
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((i & 3670016) == 0) {
                colorFilter2 = colorFilter;
                if (composerStartRestartGroup.changed(colorFilter2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((i3 & 2995931) ^ 599186) != 0) {
                if ((i & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                float f1111 = f2;
                ColorFilter colorFilter1111 = colorFilter2;
                ContentScale contentScale11113 = fit;
                int i1119 = i3;
                Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i1119 & 14), str, modifier2, center, contentScale11113, f1111, colorFilter1111, composerStartRestartGroup, (57344 & i1119) | VectorPainter.$stable | (i1119 & 112) | (i1119 & 896) | (i1119 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i1119) | (i1119 & 3670016), 0);
                fit = contentScale11113;
                colorFilter3 = colorFilter1111;
                Alignment alignment1110 = center;
                f3 = f1111;
                alignment2 = alignment1110;
            } else {
                if ((i & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        center = Alignment.INSTANCE.getCenter();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fit = ContentScale.INSTANCE.getFit();
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        colorFilter2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                float f1112 = f2;
                ColorFilter colorFilter1112 = colorFilter2;
                ContentScale contentScale11114 = fit;
                int i11110 = i3;
                Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i11110 & 14), str, modifier2, center, contentScale11114, f1112, colorFilter1112, composerStartRestartGroup, (57344 & i11110) | VectorPainter.$stable | (i11110 & 112) | (i11110 & 896) | (i11110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i11110) | (i11110 & 3670016), 0);
                fit = contentScale11114;
                colorFilter3 = colorFilter1112;
                Alignment alignment1111 = center;
                f3 = f1112;
                alignment2 = alignment1111;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier18 = modifier2;
            final ContentScale contentScale11115 = fit;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11111) {
                    ImageKt.Image(imageVector, str, modifier18, alignment2, contentScale11115, f3, colorFilter3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 1572864;
        colorFilter2 = colorFilter;
        if (((i3 & 2995931) ^ 599186) != 0) {
            if ((i & 1) == 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    center = Alignment.INSTANCE.getCenter();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    fit = ContentScale.INSTANCE.getFit();
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
                if (i8 != 0) {
                    colorFilter2 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    center = Alignment.INSTANCE.getCenter();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    fit = ContentScale.INSTANCE.getFit();
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
                if (i8 != 0) {
                    colorFilter2 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            float f1113 = f2;
            ColorFilter colorFilter1113 = colorFilter2;
            ContentScale contentScale11116 = fit;
            int i11111 = i3;
            Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i11111 & 14), str, modifier2, center, contentScale11116, f1113, colorFilter1113, composerStartRestartGroup, (57344 & i11111) | VectorPainter.$stable | (i11111 & 112) | (i11111 & 896) | (i11111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i11111) | (i11111 & 3670016), 0);
            fit = contentScale11116;
            colorFilter3 = colorFilter1113;
            Alignment alignment1112 = center;
            f3 = f1113;
            alignment2 = alignment1112;
        } else {
            if ((i & 1) == 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    center = Alignment.INSTANCE.getCenter();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    fit = ContentScale.INSTANCE.getFit();
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
                if (i8 != 0) {
                    colorFilter2 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    center = Alignment.INSTANCE.getCenter();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    fit = ContentScale.INSTANCE.getFit();
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
                if (i8 != 0) {
                    colorFilter2 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            float f1114 = f2;
            ColorFilter colorFilter1114 = colorFilter2;
            ContentScale contentScale11117 = fit;
            int i11112 = i3;
            Image(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i11112 & 14), str, modifier2, center, contentScale11117, f1114, colorFilter1114, composerStartRestartGroup, (57344 & i11112) | VectorPainter.$stable | (i11112 & 112) | (i11112 & 896) | (i11112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i11112) | (i11112 & 3670016), 0);
            fit = contentScale11117;
            colorFilter3 = colorFilter1114;
            Alignment alignment1113 = center;
            f3 = f1114;
            alignment2 = alignment1113;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier19 = modifier2;
        final ContentScale contentScale11118 = fit;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11113) {
                ImageKt.Image(imageVector, str, modifier19, alignment2, contentScale11118, f3, colorFilter3, composer2, i | 1, i2);
            }
        });
    }

    @Composable
    public static final void Image(@NotNull final Painter painter, @Nullable final String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifierSemantics$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(-816797925);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i2 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        if (str != null) {
            composerStartRestartGroup.startReplaceableGroup(-816797602);
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                        SemanticsPropertiesKt.m2644setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m2633getImageo7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-816797458);
            composerStartRestartGroup.endReplaceableGroup();
            modifierSemantics$default = Modifier.INSTANCE;
        }
        Modifier modifierPaint$default = PainterModifierKt.paint$default(ClipKt.clipToBounds(modifier2.then(modifierSemantics$default)), painter, false, center, fit, f2, colorFilter2, 2, null);
        AnonymousClass4 anonymousClass4 = new MeasurePolicy() { // from class: androidx.compose.foundation.ImageKt.Image.4
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                return MeasureScope.DefaultImpls.layout$default(measureScope, Constraints.m2937getMinWidthimpl(j), Constraints.m2936getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.ImageKt$Image$4$measure$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
            }
        };
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPaint$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
        Updater.m906setimpl(composerM899constructorimpl, anonymousClass4, companion2.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-820202187);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Alignment alignment2 = center;
        final ContentScale contentScale2 = fit;
        final float f3 = f2;
        final ColorFilter colorFilter3 = colorFilter2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                ImageKt.Image(painter, str, modifier2, alignment2, contentScale2, f3, colorFilter3, composer2, i | 1, i2);
            }
        });
    }
}
