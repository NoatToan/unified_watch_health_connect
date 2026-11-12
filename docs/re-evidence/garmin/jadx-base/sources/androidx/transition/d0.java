package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d0 extends m {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f11103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f11104f;
    }

    public d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f11124c);
        int iD = b7.j.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iD != 0) {
            setMode(iD);
        }
    }

    private void captureValues(t tVar) {
        int visibility = tVar.f11164b.getVisibility();
        HashMap map = tVar.f11163a;
        map.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        map.put(PROPNAME_PARENT, tVar.f11164b.getParent());
        int[] iArr = new int[2];
        tVar.f11164b.getLocationOnScreen(iArr);
        map.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    private c getVisibilityChangeInfo(t tVar, t tVar2) {
        c cVar = new c();
        cVar.f11099a = false;
        cVar.f11100b = false;
        if (tVar != null) {
            HashMap map = tVar.f11163a;
            if (map.containsKey(PROPNAME_VISIBILITY)) {
                cVar.f11101c = ((Integer) map.get(PROPNAME_VISIBILITY)).intValue();
                cVar.f11103e = (ViewGroup) map.get(PROPNAME_PARENT);
            } else {
                cVar.f11101c = -1;
                cVar.f11103e = null;
            }
        } else {
            cVar.f11101c = -1;
            cVar.f11103e = null;
        }
        if (tVar2 != null) {
            HashMap map2 = tVar2.f11163a;
            if (map2.containsKey(PROPNAME_VISIBILITY)) {
                cVar.f11102d = ((Integer) map2.get(PROPNAME_VISIBILITY)).intValue();
                cVar.f11104f = (ViewGroup) map2.get(PROPNAME_PARENT);
            } else {
                cVar.f11102d = -1;
                cVar.f11104f = null;
            }
        } else {
            cVar.f11102d = -1;
            cVar.f11104f = null;
        }
        if (tVar != null && tVar2 != null) {
            int i14 = cVar.f11101c;
            int i15 = cVar.f11102d;
            if (i14 != i15 || cVar.f11103e != cVar.f11104f) {
                if (i14 != i15) {
                    if (i14 == 0) {
                        cVar.f11100b = false;
                        cVar.f11099a = true;
                        return cVar;
                    }
                    if (i15 == 0) {
                        cVar.f11100b = true;
                        cVar.f11099a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f11104f == null) {
                        cVar.f11100b = false;
                        cVar.f11099a = true;
                        return cVar;
                    }
                    if (cVar.f11103e == null) {
                        cVar.f11100b = true;
                        cVar.f11099a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (tVar == null && cVar.f11102d == 0) {
                cVar.f11100b = true;
                cVar.f11099a = true;
                return cVar;
            }
            if (tVar2 == null && cVar.f11101c == 0) {
                cVar.f11100b = false;
                cVar.f11099a = true;
            }
        }
        return cVar;
    }

    @Override // androidx.transition.m
    public void captureEndValues(t tVar) {
        captureValues(tVar);
    }

    @Override // androidx.transition.m
    public void captureStartValues(t tVar) {
        captureValues(tVar);
    }

    @Override // androidx.transition.m
    public Animator createAnimator(ViewGroup viewGroup, t tVar, t tVar2) {
        c visibilityChangeInfo = getVisibilityChangeInfo(tVar, tVar2);
        if (!visibilityChangeInfo.f11099a) {
            return null;
        }
        if (visibilityChangeInfo.f11103e == null && visibilityChangeInfo.f11104f == null) {
            return null;
        }
        boolean z14 = visibilityChangeInfo.f11100b;
        int i14 = visibilityChangeInfo.f11101c;
        int i15 = visibilityChangeInfo.f11102d;
        return z14 ? onAppear(viewGroup, tVar, i14, tVar2, i15) : onDisappear(viewGroup, tVar, i14, tVar2, i15);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.m
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.m
    public boolean isTransitionRequired(t tVar, t tVar2) {
        if (tVar == null && tVar2 == null) {
            return false;
        }
        if (tVar != null && tVar2 != null && tVar2.f11163a.containsKey(PROPNAME_VISIBILITY) != tVar.f11163a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        c visibilityChangeInfo = getVisibilityChangeInfo(tVar, tVar2);
        if (visibilityChangeInfo.f11099a) {
            return visibilityChangeInfo.f11101c == 0 || visibilityChangeInfo.f11102d == 0;
        }
        return false;
    }

    public boolean isVisible(t tVar) {
        if (tVar == null) {
            return false;
        }
        HashMap map = tVar.f11163a;
        return ((Integer) map.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) map.get(PROPNAME_PARENT)) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, t tVar, int i14, t tVar2, int i15) {
        if ((this.mMode & 1) != 1 || tVar2 == null) {
            return null;
        }
        if (tVar == null) {
            View view2 = (View) tVar2.f11164b.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view2, false), getTransitionValues(view2, false)).f11099a) {
                return null;
            }
        }
        return onAppear(viewGroup, tVar2.f11164b, tVar, tVar2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1  */
    /* JADX WARN: Multi-variable type inference failed */
    public Animator onDisappear(ViewGroup viewGroup, t tVar, int i14, t tVar2, int i15) {
        View view2;
        boolean z14;
        View view3;
        char c14;
        Animator animator;
        int i16;
        View view4;
        ViewGroup viewGroup2;
        int i17;
        Bitmap bitmapCreateBitmap;
        if ((this.mMode & 2) != 2 || tVar == null) {
            return null;
        }
        View view5 = tVar.f11164b;
        View view6 = tVar2 != null ? tVar2.f11164b : null;
        View view7 = (View) view5.getTag(R.id.save_overlay_view);
        int i18 = 1;
        if (view7 != null) {
            c14 = 1;
            animator = null;
            view4 = null;
            i16 = 0;
        } else {
            if (view6 == null || view6.getParent() == null) {
                if (view6 != null) {
                    view2 = null;
                    z14 = false;
                } else {
                    z14 = true;
                    view6 = null;
                    view2 = null;
                }
            } else if (i15 == 4 || view5 == view6) {
                view2 = view6;
                view6 = null;
                z14 = false;
            } else {
                z14 = true;
                view6 = null;
                view2 = null;
            }
            if (z14) {
                if (view5.getParent() == null) {
                    view3 = view2;
                    c14 = 1;
                    animator = null;
                    i16 = 0;
                } else {
                    if (view5.getParent() instanceof View) {
                        View view8 = (View) view5.getParent();
                        if (getVisibilityChangeInfo(getTransitionValues(view8, true), getMatchedTransitionValues(view8, true)).f11099a) {
                            view3 = view2;
                            c14 = 1;
                            animator = null;
                            i16 = 0;
                            int id3 = view8.getId();
                            if (view8.getParent() != null || id3 == -1 || viewGroup.findViewById(id3) == null || !this.mCanRemoveViews) {
                            }
                        } else {
                            Matrix matrix = new Matrix();
                            matrix.setTranslate(-view8.getScrollX(), -view8.getScrollY());
                            b0 b0Var = x.f11174a;
                            b0Var.d(view5, matrix);
                            b0Var.e(viewGroup, matrix);
                            animator = null;
                            RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                            matrix.mapRect(rectF);
                            int iRound = Math.round(rectF.left);
                            int iRound2 = Math.round(rectF.top);
                            int iRound3 = Math.round(rectF.right);
                            c14 = 1;
                            int iRound4 = Math.round(rectF.bottom);
                            i16 = 0;
                            ImageView imageView = new ImageView(view5.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            boolean zIsAttachedToWindow = view5.isAttachedToWindow();
                            boolean z15 = viewGroup != null && viewGroup.isAttachedToWindow();
                            if (zIsAttachedToWindow) {
                                viewGroup2 = null;
                                i17 = 0;
                            } else {
                                if (z15) {
                                    viewGroup2 = (ViewGroup) view5.getParent();
                                    int iIndexOfChild = viewGroup2.indexOfChild(view5);
                                    s0.b(view5, viewGroup);
                                    i17 = iIndexOfChild;
                                } else {
                                    bitmapCreateBitmap = null;
                                    view3 = view2;
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view7 = imageView;
                            }
                            view3 = view2;
                            int iRound5 = Math.round(rectF.width());
                            int iRound6 = Math.round(rectF.height());
                            if (iRound5 <= 0 || iRound6 <= 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                int iRound7 = Math.round(iRound5 * fMin);
                                int iRound8 = Math.round(iRound6 * fMin);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(fMin, fMin);
                                Picture picture = new Picture();
                                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                canvasBeginRecording.concat(matrix);
                                view5.draw(canvasBeginRecording);
                                picture.endRecording();
                                bitmapCreateBitmap = Bitmap.createBitmap(picture);
                            }
                            if (!zIsAttachedToWindow) {
                                viewGroup.getOverlay().remove(view5);
                                viewGroup2.addView(view5, i17);
                            }
                            if (bitmapCreateBitmap != null) {
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                            view7 = imageView;
                        }
                    } else {
                        view3 = view2;
                        c14 = 1;
                        animator = null;
                        i16 = 0;
                    }
                    view7 = view6;
                }
                view7 = view5;
            } else {
                view3 = view2;
                c14 = 1;
                animator = null;
                i16 = 0;
                view7 = view6;
            }
            i18 = i16;
            view4 = view3;
        }
        if (view7 == null) {
            if (view4 == null) {
                return animator;
            }
            int visibility = view4.getVisibility();
            x.b(i16, view4);
            Animator animatorOnDisappear = onDisappear(viewGroup, view4, tVar, tVar2);
            if (animatorOnDisappear == null) {
                x.b(visibility, view4);
                return animatorOnDisappear;
            }
            a aVar = new a(view4, i15, c14);
            animatorOnDisappear.addListener(aVar);
            getRootTransition().addListener(aVar);
            return animatorOnDisappear;
        }
        if (i18 == 0) {
            int[] iArr = (int[]) tVar.f11163a.get(PROPNAME_SCREEN_LOCATION);
            int i19 = iArr[i16];
            int i24 = iArr[c14];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view7.offsetLeftAndRight((i19 - iArr2[i16]) - view7.getLeft());
            view7.offsetTopAndBottom((i24 - iArr2[c14]) - view7.getTop());
            s0.b(view7, viewGroup);
        }
        Animator animatorOnDisappear2 = onDisappear(viewGroup, view7, tVar, tVar2);
        if (i18 == 0) {
            if (animatorOnDisappear2 == null) {
                viewGroup.getOverlay().remove(view7);
                return animatorOnDisappear2;
            }
            view5.setTag(R.id.save_overlay_view, view7);
            b bVar = new b(viewGroup, view7, view5);
            animatorOnDisappear2.addListener(bVar);
            animatorOnDisappear2.addPauseListener(bVar);
            getRootTransition().addListener(bVar);
        }
        return animatorOnDisappear2;
    }

    public void setMode(int i14) {
        if ((i14 & (-4)) == 0) {
            this.mMode = i14;
        } else {
            vb.h.s("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    public class b extends AnimatorListenerAdapter implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f11094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f11095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f11096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11097d = true;

        public b(ViewGroup viewGroup, View view2, View view3) {
            this.f11094a = viewGroup;
            this.f11095b = view2;
            this.f11096c = view3;
        }

        public final void a() {
            this.f11096c.setTag(R.id.save_overlay_view, null);
            this.f11094a.getOverlay().remove(this.f11095b);
            this.f11097d = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z14) {
            if (z14) {
                return;
            }
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f11094a.getOverlay().remove(this.f11095b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view2 = this.f11095b;
            if (view2.getParent() == null) {
                s0.b(view2, this.f11094a);
            } else {
                d0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z14) {
            if (z14) {
                View view2 = this.f11096c;
                View view3 = this.f11095b;
                view2.setTag(R.id.save_overlay_view, view3);
                s0.b(view3, this.f11094a);
                this.f11097d = true;
            }
        }

        @Override // androidx.transition.m.h
        public final void onTransitionCancel(m mVar) {
            if (this.f11097d) {
                a();
            }
        }

        @Override // androidx.transition.m.h
        public final void onTransitionEnd(m mVar) {
            mVar.removeListener(this);
        }

        @Override // androidx.transition.m.h
        public final void onTransitionPause(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionResume(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionStart(m mVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a();
        }
    }

    public static class a extends AnimatorListenerAdapter implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f11088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f11090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f11091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f11092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f11093f = false;

        public a(View view2, int i14, boolean z14) {
            this.f11088a = view2;
            this.f11089b = i14;
            this.f11090c = (ViewGroup) view2.getParent();
            this.f11091d = z14;
            a(true);
        }

        public final void a(boolean z14) {
            ViewGroup viewGroup;
            if (!this.f11091d || this.f11092e == z14 || (viewGroup = this.f11090c) == null) {
                return;
            }
            this.f11092e = z14;
            w.a(viewGroup, z14);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f11093f = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z14) {
            if (z14) {
                return;
            }
            if (!this.f11093f) {
                x.b(this.f11089b, this.f11088a);
                ViewGroup viewGroup = this.f11090c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z14) {
            if (z14) {
                x.b(0, this.f11088a);
                ViewGroup viewGroup = this.f11090c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // androidx.transition.m.h
        public final void onTransitionCancel(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionEnd(m mVar) {
            mVar.removeListener(this);
        }

        @Override // androidx.transition.m.h
        public final void onTransitionPause(m mVar) {
            a(false);
            if (this.f11093f) {
                return;
            }
            x.b(this.f11089b, this.f11088a);
        }

        @Override // androidx.transition.m.h
        public final void onTransitionResume(m mVar) {
            a(true);
            if (this.f11093f) {
                return;
            }
            x.b(0, this.f11088a);
        }

        @Override // androidx.transition.m.h
        public final void onTransitionStart(m mVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f11093f) {
                x.b(this.f11089b, this.f11088a);
                ViewGroup viewGroup = this.f11090c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }
    }

    public d0() {
        this.mMode = 3;
    }

    public Animator onAppear(ViewGroup viewGroup, View view2, t tVar, t tVar2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view2, t tVar, t tVar2) {
        return null;
    }
}
