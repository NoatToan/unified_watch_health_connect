package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.fitness.data.WorkoutExercises;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a!\u0010\t\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\b\u001a\f\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002\"4\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\"\u001a\u0010%\u001a\u00020\u0002*\u00020\"8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirectionFromInt", "Landroidx/compose/ui/graphics/Matrix;", "other", "", "preTransform-JiSxe2E", "([F[F)V", "preTransform", "m1", WorkoutExercises.ROW, "m2", "column", "", "dot-p89u6pk", "([FI[FI)F", b.x0, "invertTo-JiSxe2E", "invertTo", "Landroidx/compose/ui/geometry/Rect;", "Landroid/graphics/Rect;", "toRect", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroidx/compose/ui/text/input/TextInputService;", "textInputServiceFactory", "Lkotlin/jvm/functions/Function1;", "getTextInputServiceFactory", "()Lkotlin/jvm/functions/Function1;", "setTextInputServiceFactory", "(Lkotlin/jvm/functions/Function1;)V", "getTextInputServiceFactory$annotations", "()V", "Landroid/content/res/Configuration;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "localeLayoutDirection", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidComposeView_androidKt {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    private static Function1<? super PlatformTextInputService, ? extends TextInputService> textInputServiceFactory = new Function1<PlatformTextInputService, TextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$textInputServiceFactory$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final TextInputService invoke(@NotNull PlatformTextInputService platformTextInputService) {
            return new TextInputService(platformTextInputService);
        }
    };

    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m2600dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    @NotNull
    public static final LayoutDirection getLocaleLayoutDirection(@NotNull Configuration configuration) {
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    @NotNull
    public static final Function1<PlatformTextInputService, TextInputService> getTextInputServiceFactory() {
        return textInputServiceFactory;
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getTextInputServiceFactory$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final void m2601invertToJiSxe2E(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr2[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
        fArr2[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
        fArr2[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
        fArr2[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr2[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
        fArr2[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
        float f32 = -f13;
        fArr2[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
        fArr2[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
        fArr2[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
        fArr2[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
        fArr2[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
        fArr2[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
        fArr2[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
        fArr2[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
        fArr2[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
        fArr2[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutDirection layoutDirectionFromInt(int i) {
        if (i != 0) {
            return i != 1 ? LayoutDirection.Ltr : LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m2602preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM2600dotp89u6pk = m2600dotp89u6pk(fArr2, 0, fArr, 0);
        float fM2600dotp89u6pk2 = m2600dotp89u6pk(fArr2, 0, fArr, 1);
        float fM2600dotp89u6pk3 = m2600dotp89u6pk(fArr2, 0, fArr, 2);
        float fM2600dotp89u6pk4 = m2600dotp89u6pk(fArr2, 0, fArr, 3);
        float fM2600dotp89u6pk5 = m2600dotp89u6pk(fArr2, 1, fArr, 0);
        float fM2600dotp89u6pk6 = m2600dotp89u6pk(fArr2, 1, fArr, 1);
        float fM2600dotp89u6pk7 = m2600dotp89u6pk(fArr2, 1, fArr, 2);
        float fM2600dotp89u6pk8 = m2600dotp89u6pk(fArr2, 1, fArr, 3);
        float fM2600dotp89u6pk9 = m2600dotp89u6pk(fArr2, 2, fArr, 0);
        float fM2600dotp89u6pk10 = m2600dotp89u6pk(fArr2, 2, fArr, 1);
        float fM2600dotp89u6pk11 = m2600dotp89u6pk(fArr2, 2, fArr, 2);
        float fM2600dotp89u6pk12 = m2600dotp89u6pk(fArr2, 2, fArr, 3);
        float fM2600dotp89u6pk13 = m2600dotp89u6pk(fArr2, 3, fArr, 0);
        float fM2600dotp89u6pk14 = m2600dotp89u6pk(fArr2, 3, fArr, 1);
        float fM2600dotp89u6pk15 = m2600dotp89u6pk(fArr2, 3, fArr, 2);
        float fM2600dotp89u6pk16 = m2600dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM2600dotp89u6pk;
        fArr[1] = fM2600dotp89u6pk2;
        fArr[2] = fM2600dotp89u6pk3;
        fArr[3] = fM2600dotp89u6pk4;
        fArr[4] = fM2600dotp89u6pk5;
        fArr[5] = fM2600dotp89u6pk6;
        fArr[6] = fM2600dotp89u6pk7;
        fArr[7] = fM2600dotp89u6pk8;
        fArr[8] = fM2600dotp89u6pk9;
        fArr[9] = fM2600dotp89u6pk10;
        fArr[10] = fM2600dotp89u6pk11;
        fArr[11] = fM2600dotp89u6pk12;
        fArr[12] = fM2600dotp89u6pk13;
        fArr[13] = fM2600dotp89u6pk14;
        fArr[14] = fM2600dotp89u6pk15;
        fArr[15] = fM2600dotp89u6pk16;
    }

    public static final void setTextInputServiceFactory(@NotNull Function1<? super PlatformTextInputService, ? extends TextInputService> function1) {
        textInputServiceFactory = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect toRect(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }
}
