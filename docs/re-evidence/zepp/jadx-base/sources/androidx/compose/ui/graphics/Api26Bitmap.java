package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "<init>", "()V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
final class Api26Bitmap {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @RequiresApi(26)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0011\u001a\u00020\t*\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0015\u001a\u00020\u0012*\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0011\u001a\u00020\t*\u00020\u0012H\u0000¢\u0006\u0004\b\u000f\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap$Companion;", "", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "bitmapConfig", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroid/graphics/Bitmap;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "createBitmap", "composeColorSpace$ui_graphics_release", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "composeColorSpace", "Landroid/graphics/ColorSpace;", "toFrameworkColorSpace$ui_graphics_release", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/ColorSpace;", "toFrameworkColorSpace", "(Landroid/graphics/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ColorSpace composeColorSpace$ui_graphics_release(@NotNull Bitmap bitmap) {
            android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
            return colorSpace == null ? ColorSpaces.INSTANCE.getSrgb() : composeColorSpace$ui_graphics_release(colorSpace);
        }

        @NotNull
        /* JADX INFO: renamed from: createBitmap-x__-hDU$ui_graphics_release, reason: not valid java name */
        public final Bitmap m1128createBitmapx__hDU$ui_graphics_release(int width, int height, int bitmapConfig, boolean hasAlpha, @NotNull ColorSpace colorSpace) {
            return Bitmap.createBitmap((DisplayMetrics) null, width, height, AndroidImageBitmap_androidKt.m1094toBitmapConfig1JJdX4A(bitmapConfig), hasAlpha, toFrameworkColorSpace$ui_graphics_release(colorSpace));
        }

        @NotNull
        public final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(@NotNull ColorSpace colorSpace) {
            android.graphics.ColorSpace.Named named;
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
                named = android.graphics.ColorSpace.Named.SRGB;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
                named = android.graphics.ColorSpace.Named.ACES;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
                named = android.graphics.ColorSpace.Named.ACESCG;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
                named = android.graphics.ColorSpace.Named.ADOBE_RGB;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
                named = android.graphics.ColorSpace.Named.BT2020;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
                named = android.graphics.ColorSpace.Named.BT709;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
                named = android.graphics.ColorSpace.Named.CIE_LAB;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
                named = android.graphics.ColorSpace.Named.CIE_XYZ;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
                named = android.graphics.ColorSpace.Named.DCI_P3;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
                named = android.graphics.ColorSpace.Named.DISPLAY_P3;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
                named = android.graphics.ColorSpace.Named.EXTENDED_SRGB;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
                named = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
                named = android.graphics.ColorSpace.Named.LINEAR_SRGB;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
                named = android.graphics.ColorSpace.Named.NTSC_1953;
            } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
                named = android.graphics.ColorSpace.Named.PRO_PHOTO_RGB;
            } else {
                named = Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC()) ? android.graphics.ColorSpace.Named.SMPTE_C : android.graphics.ColorSpace.Named.SRGB;
            }
            return android.graphics.ColorSpace.get(named);
        }

        @NotNull
        public final ColorSpace composeColorSpace$ui_graphics_release(@NotNull android.graphics.ColorSpace colorSpace) {
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB))) {
                return ColorSpaces.INSTANCE.getSrgb();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACES))) {
                return ColorSpaces.INSTANCE.getAces();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACESCG))) {
                return ColorSpaces.INSTANCE.getAcescg();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ADOBE_RGB))) {
                return ColorSpaces.INSTANCE.getAdobeRgb();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020))) {
                return ColorSpaces.INSTANCE.getBt2020();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT709))) {
                return ColorSpaces.INSTANCE.getBt709();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_LAB))) {
                return ColorSpaces.INSTANCE.getCieLab();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_XYZ))) {
                return ColorSpaces.INSTANCE.getCieXyz();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3))) {
                return ColorSpaces.INSTANCE.getDciP3();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3))) {
                return ColorSpaces.INSTANCE.getDisplayP3();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.EXTENDED_SRGB))) {
                return ColorSpaces.INSTANCE.getExtendedSrgb();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
                return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_SRGB))) {
                return ColorSpaces.INSTANCE.getLinearSrgb();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.NTSC_1953))) {
                return ColorSpaces.INSTANCE.getNtsc1953();
            }
            if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.PRO_PHOTO_RGB))) {
                return ColorSpaces.INSTANCE.getProPhotoRgb();
            }
            return Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SMPTE_C)) ? ColorSpaces.INSTANCE.getSmpteC() : ColorSpaces.INSTANCE.getSrgb();
        }
    }
}
