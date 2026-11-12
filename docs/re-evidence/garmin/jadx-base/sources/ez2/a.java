package ez2;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import ez2.j.f;

/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67534a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67535b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScaleGestureDetector f67536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VelocityTracker f67537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f67539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f67540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f67541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f67542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f67543j;

    /* JADX INFO: renamed from: ez2.a$a, reason: collision with other inner class name */
    public class ScaleGestureDetectorOnScaleGestureListenerC1403a implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetectorOnScaleGestureListenerC1403a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            ((j.a) a.this.f67543j).a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public a(Context context, b bVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f67542i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f67541h = viewConfiguration.getScaledTouchSlop();
        this.f67543j = bVar;
        this.f67536c = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC1403a());
    }

    public final void a(MotionEvent motionEvent) {
        float x14;
        float y14;
        float x15;
        float y15;
        int iRound;
        int i14;
        int iRound2;
        int i15;
        float x16;
        float y16;
        int i16;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            b bVar = this.f67543j;
            if (action == 1) {
                this.f67534a = -1;
                if (this.f67538e && this.f67537d != null) {
                    try {
                        x15 = motionEvent.getX(this.f67535b);
                    } catch (Exception unused) {
                        x15 = motionEvent.getX();
                    }
                    this.f67539f = x15;
                    try {
                        y15 = motionEvent.getY(this.f67535b);
                    } catch (Exception unused2) {
                        y15 = motionEvent.getY();
                    }
                    this.f67540g = y15;
                    this.f67537d.addMovement(motionEvent);
                    this.f67537d.computeCurrentVelocity(1000);
                    float xVelocity = this.f67537d.getXVelocity();
                    float yVelocity = this.f67537d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f67542i) {
                        j jVar = j.this;
                        ImageView imageView = jVar.f67552h;
                        j.f fVar = jVar.new f(imageView.getContext());
                        jVar.f67563t = fVar;
                        int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                        int height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
                        int i17 = (int) (-xVelocity);
                        int i18 = (int) (-yVelocity);
                        j jVar2 = j.this;
                        jVar2.b();
                        Matrix matrixC = jVar2.c();
                        RectF rectF = jVar2.f67558n;
                        Drawable drawable = jVar2.f67552h.getDrawable();
                        if (drawable != null) {
                            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            matrixC.mapRect(rectF);
                        } else {
                            rectF = null;
                        }
                        if (rectF != null) {
                            int iRound3 = Math.round(-rectF.left);
                            float f14 = width;
                            if (f14 < rectF.width()) {
                                iRound = Math.round(rectF.width() - f14);
                                i14 = 0;
                            } else {
                                iRound = iRound3;
                                i14 = iRound;
                            }
                            int iRound4 = Math.round(-rectF.top);
                            float f15 = height;
                            if (f15 < rectF.height()) {
                                iRound2 = Math.round(rectF.height() - f15);
                                i15 = 0;
                            } else {
                                iRound2 = iRound4;
                                i15 = iRound2;
                            }
                            fVar.f67580b = iRound3;
                            fVar.f67581c = iRound4;
                            if (iRound3 != iRound || iRound4 != iRound2) {
                                fVar.f67579a.fling(iRound3, iRound4, i17, i18, i14, iRound, i15, iRound2, 0, 0);
                            }
                        }
                        imageView.post(jVar.f67563t);
                    }
                }
                VelocityTracker velocityTracker = this.f67537d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f67537d = null;
                }
            } else if (action == 2) {
                try {
                    x16 = motionEvent.getX(this.f67535b);
                } catch (Exception unused3) {
                    x16 = motionEvent.getX();
                }
                try {
                    y16 = motionEvent.getY(this.f67535b);
                } catch (Exception unused4) {
                    y16 = motionEvent.getY();
                }
                float f16 = x16 - this.f67539f;
                float f17 = y16 - this.f67540g;
                if (!this.f67538e) {
                    this.f67538e = Math.sqrt((double) ((f17 * f17) + (f16 * f16))) >= ((double) this.f67541h);
                }
                if (this.f67538e) {
                    j jVar3 = j.this;
                    if (!jVar3.f67554j.f67536c.isInProgress()) {
                        jVar3.f67557m.postTranslate(f16, f17);
                        jVar3.a();
                        ViewParent parent = jVar3.f67552h.getParent();
                        if (jVar3.f67550f && !jVar3.f67554j.f67536c.isInProgress() && !jVar3.f67551g) {
                            int i19 = jVar3.f67564v;
                            if ((i19 == 2 || ((i19 == 0 && f16 >= 1.0f) || ((i19 == 1 && f16 <= -1.0f) || (((i16 = jVar3.f67565w) == 0 && f17 >= 1.0f) || (i16 == 1 && f17 <= -1.0f))))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f67539f = x16;
                    this.f67540g = y16;
                    VelocityTracker velocityTracker2 = this.f67537d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f67534a = -1;
                VelocityTracker velocityTracker3 = this.f67537d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f67537d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f67534a) {
                    int i24 = action2 != 0 ? 0 : 1;
                    this.f67534a = motionEvent.getPointerId(i24);
                    this.f67539f = motionEvent.getX(i24);
                    this.f67540g = motionEvent.getY(i24);
                }
            }
        } else {
            this.f67534a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f67537d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x14 = motionEvent.getX(this.f67535b);
            } catch (Exception unused5) {
                x14 = motionEvent.getX();
            }
            this.f67539f = x14;
            try {
                y14 = motionEvent.getY(this.f67535b);
            } catch (Exception unused6) {
                y14 = motionEvent.getY();
            }
            this.f67540g = y14;
            this.f67538e = false;
        }
        int i25 = this.f67534a;
        this.f67535b = motionEvent.findPointerIndex(i25 != -1 ? i25 : 0);
    }
}
