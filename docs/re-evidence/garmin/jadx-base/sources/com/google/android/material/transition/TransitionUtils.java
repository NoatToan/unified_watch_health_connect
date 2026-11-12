package com.google.android.material.transition;

import am.j;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.transition.i;
import androidx.transition.m;
import androidx.transition.s;
import c7.g;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import j20.x;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
class TransitionUtils {
    static final int NO_ATTR_RES_ID = 0;
    static final int NO_DURATION = -1;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final RectF transformAlphaRectF = new RectF();

    public interface CornerSizeBinaryOperator {
        CornerSize apply(CornerSize cornerSize, CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    public static float calculateArea(RectF rectF) {
        return rectF.height() * rectF.width();
    }

    public static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.a
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
            }
        });
    }

    public static Shader createColorShader(int i14) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i14, i14, Shader.TileMode.CLAMP);
    }

    public static <T> T defaultIfNull(T t7, T t14) {
        return t7 != null ? t7 : t14;
    }

    public static View findAncestorById(View view2, int i14) {
        String resourceName = view2.getResources().getResourceName(i14);
        while (view2 != null) {
            if (view2.getId() != i14) {
                Object parent = view2.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view2 = (View) parent;
            } else {
                return view2;
            }
        }
        h.s(k.g(resourceName, " is not a valid ancestor"));
        return null;
    }

    public static View findDescendantOrAncestorById(View view2, int i14) {
        View viewFindViewById = view2.findViewById(i14);
        return viewFindViewById != null ? viewFindViewById : findAncestorById(view2, i14);
    }

    public static RectF getLocationOnScreen(View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i14 = iArr[0];
        int i15 = iArr[1];
        return new RectF(i14, i15, view2.getWidth() + i14, view2.getHeight() + i15);
    }

    public static RectF getRelativeBounds(View view2) {
        return new RectF(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
    }

    public static Rect getRelativeBoundsRect(View view2) {
        return new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        return (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    public static float lerp(float f14, float f15, float f16, float f17, float f18, boolean z14) {
        if (z14 && (f18 < 0.0f || f18 > 1.0f)) {
            return lerp(f14, f15, f18);
        }
        if (f18 < f16) {
            return f14;
        }
        return f18 > f17 ? f15 : lerp(f14, f15, (f18 - f16) / (f17 - f16));
    }

    public static void maybeAddTransition(s sVar, m mVar) {
        if (mVar != null) {
            sVar.a(mVar);
        }
    }

    public static boolean maybeApplyThemeDuration(m mVar, Context context, int i14) {
        int iResolveThemeDuration;
        if (i14 == 0 || mVar.getDuration() != -1 || (iResolveThemeDuration = MotionUtils.resolveThemeDuration(context, i14, -1)) == -1) {
            return false;
        }
        mVar.setDuration(iResolveThemeDuration);
        return true;
    }

    public static boolean maybeApplyThemeInterpolator(m mVar, Context context, int i14, TimeInterpolator timeInterpolator) {
        if (i14 == 0 || mVar.getInterpolator() != null) {
            return false;
        }
        mVar.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i14, timeInterpolator));
        return true;
    }

    public static boolean maybeApplyThemePath(m mVar, Context context, int i14) {
        androidx.transition.h hVarResolveThemePath;
        if (i14 == 0 || (hVarResolveThemePath = resolveThemePath(context, i14)) == null) {
            return false;
        }
        mVar.setPathMotion(hVarResolveThemePath);
        return true;
    }

    public static void maybeRemoveTransition(s sVar, m mVar) {
        if (mVar != null) {
            sVar.c(mVar);
        }
    }

    public static androidx.transition.h resolveThemePath(Context context, int i14) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i14, typedValue, true)) {
            return null;
        }
        int i15 = typedValue.type;
        if (i15 != 16) {
            if (i15 == 3) {
                return new i(g.c(String.valueOf(typedValue.string)));
            }
            h.s("Motion path theme attribute must either be an enum value or path data string");
            return null;
        }
        int i16 = typedValue.data;
        if (i16 == 0) {
            return null;
        }
        if (i16 == 1) {
            return new MaterialArcMotion();
        }
        h.s(j.h(i16, "Invalid motion path type: "));
        return null;
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i14) {
        RectF rectF = transformAlphaRectF;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i14);
    }

    public static void transform(Canvas canvas, Rect rect, float f14, float f15, float f16, int i14, CanvasCompat.CanvasOperation canvasOperation) {
        if (i14 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f14, f15);
        canvas.scale(f16, f16);
        if (i14 < 255) {
            saveLayerAlphaCompat(canvas, rect, i14);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(iSave);
    }

    public static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        return (isShapeAppearanceSignificant(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }

    public static float lerp(float f14, float f15, float f16, float f17, float f18) {
        return lerp(f14, f15, f16, f17, f18, false);
    }

    public static float lerp(float f14, float f15, float f16) {
        return x.a(f15, f14, f16, f14);
    }

    public static int lerp(int i14, int i15, float f14, float f15, float f16) {
        if (f16 < f14) {
            return i14;
        }
        return f16 > f15 ? i15 : (int) lerp(i14, i15, (f16 - f14) / (f15 - f14));
    }

    public static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, final RectF rectF, final RectF rectF2, final float f14, final float f15, final float f16) {
        if (f16 < f14) {
            return shapeAppearanceModel;
        }
        return f16 > f15 ? shapeAppearanceModel2 : transformCornerSizes(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.1
            @Override // com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator
            public CornerSize apply(CornerSize cornerSize, CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.lerp(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF2), f14, f15, f16));
            }
        });
    }
}
