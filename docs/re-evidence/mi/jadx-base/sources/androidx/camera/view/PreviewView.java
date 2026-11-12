package androidx.camera.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.o;
import androidx.camera.core.r;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import defpackage.adp;
import defpackage.cyp;
import defpackage.d8i;
import defpackage.dg3;
import defpackage.dh3;
import defpackage.gwq;
import defpackage.h8i;
import defpackage.jfh;
import defpackage.kyp;
import defpackage.ni4;
import defpackage.sqo;
import defpackage.tqo;
import defpackage.vtf;
import defpackage.y3j;
import defpackage.ya6;
import defpackage.zpe;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class PreviewView extends FrameLayout {
    public static final ImplementationMode n = ImplementationMode.PERFORMANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImplementationMode f1839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public androidx.camera.view.c f1840b;
    public final androidx.camera.view.b c;
    public boolean d;
    public final MutableLiveData<StreamState> e;
    public final AtomicReference<androidx.camera.view.a> f;
    public h8i g;
    public final ScaleGestureDetector h;
    public dh3 i;
    public MotionEvent j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f1841k;
    public final View.OnLayoutChangeListener l;
    public final o.d m;

    @RequiresApi(21)
    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        ImplementationMode(int i) {
            this.mId = i;
        }

        public static ImplementationMode fromId(int i) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i);
        }

        public int getId() {
            return this.mId;
        }
    }

    @RequiresApi(21)
    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        ScaleType(int i) {
            this.mId = i;
        }

        public static ScaleType fromId(int i) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i);
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum StreamState {
        IDLE,
        STREAMING
    }

    public class a implements o.d {
        public a() {
        }

        @Override // androidx.camera.core.o.d
        public void a(final r rVar) {
            androidx.camera.view.c dVar;
            if (!adp.b()) {
                ni4.h(PreviewView.this.getContext()).execute(new Runnable() { // from class: e8i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16383a.e(rVar);
                    }
                });
                return;
            }
            zpe.a("PreviewView", "Surface requested by Preview.");
            final CameraInternal cameraInternalJ = rVar.j();
            PreviewView.this.i = cameraInternalJ.c();
            rVar.w(ni4.h(PreviewView.this.getContext()), new r.h() { // from class: f8i
                @Override // androidx.camera.core.r.h
                public final void a(r.g gVar) {
                    this.f17528a.f(cameraInternalJ, rVar, gVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (PreviewView.f(rVar, previewView.f1839a)) {
                PreviewView previewView2 = PreviewView.this;
                dVar = new e(previewView2, previewView2.c);
            } else {
                PreviewView previewView3 = PreviewView.this;
                dVar = new androidx.camera.view.d(previewView3, previewView3.c);
            }
            previewView.f1840b = dVar;
            dh3 dh3VarC = cameraInternalJ.c();
            PreviewView previewView4 = PreviewView.this;
            final androidx.camera.view.a aVar = new androidx.camera.view.a(dh3VarC, previewView4.e, previewView4.f1840b);
            PreviewView.this.f.set(aVar);
            cameraInternalJ.e().b(ni4.h(PreviewView.this.getContext()), aVar);
            PreviewView.this.f1840b.g(rVar, new androidx.camera.view.c.a() { // from class: g8i
                @Override // androidx.camera.view.c.a
                public final void a() {
                    this.f18725a.g(aVar, cameraInternalJ);
                }
            });
        }

        public final /* synthetic */ void e(r rVar) {
            PreviewView.this.m.a(rVar);
        }

        public final /* synthetic */ void f(CameraInternal cameraInternal, r rVar, r.g gVar) {
            PreviewView previewView;
            androidx.camera.view.c cVar;
            zpe.a("PreviewView", "Preview transformation info updated. " + gVar);
            PreviewView.this.c.p(gVar, rVar.l(), cameraInternal.c().b().intValue() == 0);
            if (gVar.c() == -1 || ((cVar = (previewView = PreviewView.this).f1840b) != null && (cVar instanceof androidx.camera.view.d))) {
                PreviewView.this.d = true;
            } else {
                previewView.d = false;
            }
            PreviewView.this.i();
            PreviewView.this.e();
        }

        public final /* synthetic */ void g(androidx.camera.view.a aVar, CameraInternal cameraInternal) {
            if (d8i.a(PreviewView.this.f, aVar, null)) {
                aVar.l(StreamState.IDLE);
            }
            aVar.f();
            cameraInternal.e().a(aVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1844b;

        static {
            int[] iArr = new int[ImplementationMode.values().length];
            f1844b = iArr;
            try {
                iArr[ImplementationMode.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1844b[ImplementationMode.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ScaleType.values().length];
            f1843a = iArr2;
            try {
                iArr2[ScaleType.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1843a[ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1843a[ScaleType.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1843a[ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1843a[ScaleType.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1843a[ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public class c implements DisplayManager.DisplayListener {
        public c() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i) {
                return;
            }
            PreviewView.this.i();
            PreviewView.this.e();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PreviewView.this.getClass();
            return true;
        }
    }

    public PreviewView(Context context) {
        this(context, null);
    }

    public static boolean f(r rVar, ImplementationMode implementationMode) {
        int i;
        boolean zEquals = rVar.j().c().g().equals("androidx.camera.camera2.legacy");
        boolean z = (ya6.a(tqo.class) == null && ya6.a(sqo.class) == null) ? false : true;
        if (rVar.m() || zEquals || z || (i = b.f1844b[implementationMode.ordinal()]) == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        switch (b.f1843a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    public final void b(boolean z) {
        adp.a();
        getDisplay();
        getViewPort();
    }

    @SuppressLint({"WrongConstant"})
    public gwq c(int i) {
        adp.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new gwq.a(new Rational(getWidth(), getHeight()), i).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    public final /* synthetic */ void d(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        e();
        b(true);
    }

    @OptIn(markerClass = {cyp.class})
    public void e() {
        adp.a();
        androidx.camera.view.c cVar = this.f1840b;
        if (cVar != null) {
            cVar.h();
        }
        this.g.a(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public final void g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f1841k, new Handler(Looper.getMainLooper()));
    }

    public Bitmap getBitmap() {
        adp.a();
        androidx.camera.view.c cVar = this.f1840b;
        if (cVar == null) {
            return null;
        }
        return cVar.a();
    }

    public dg3 getController() {
        adp.a();
        return null;
    }

    public ImplementationMode getImplementationMode() {
        adp.a();
        return this.f1839a;
    }

    public vtf getMeteringPointFactory() {
        adp.a();
        return this.g;
    }

    @cyp
    public jfh getOutputTransform() {
        Matrix matrixH;
        adp.a();
        try {
            matrixH = this.c.h(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixH = null;
        }
        Rect rectG = this.c.g();
        if (matrixH == null || rectG == null) {
            zpe.a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixH.preConcat(kyp.a(rectG));
        if (this.f1840b instanceof e) {
            matrixH.postConcat(getMatrix());
        } else {
            zpe.k("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new jfh(matrixH, new Size(rectG.width(), rectG.height()));
    }

    public LiveData<StreamState> getPreviewStreamState() {
        return this.e;
    }

    public ScaleType getScaleType() {
        adp.a();
        return this.c.f();
    }

    public o.d getSurfaceProvider() {
        adp.a();
        return this.m;
    }

    public gwq getViewPort() {
        adp.a();
        if (getDisplay() == null) {
            return null;
        }
        return c(getDisplay().getRotation());
    }

    public final void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f1841k);
    }

    public void i() {
        Display display;
        dh3 dh3Var;
        if (!this.d || (display = getDisplay()) == null || (dh3Var = this.i) == null) {
            return;
        }
        this.c.m(dh3Var.e(display.getRotation()), display.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
        g();
        addOnLayoutChangeListener(this.l);
        androidx.camera.view.c cVar = this.f1840b;
        if (cVar != null) {
            cVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.l);
        androidx.camera.view.c cVar = this.f1840b;
        if (cVar != null) {
            cVar.e();
        }
        h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.j = null;
        return super.performClick();
    }

    public void setController(dg3 dg3Var) {
        adp.a();
        b(false);
    }

    public void setImplementationMode(ImplementationMode implementationMode) {
        adp.a();
        this.f1839a = implementationMode;
    }

    public void setScaleType(ScaleType scaleType) {
        adp.a();
        this.c.o(scaleType);
        e();
        b(false);
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ImplementationMode implementationMode = n;
        this.f1839a = implementationMode;
        androidx.camera.view.b bVar = new androidx.camera.view.b();
        this.c = bVar;
        this.d = true;
        this.e = new MutableLiveData<>(StreamState.IDLE);
        this.f = new AtomicReference<>();
        this.g = new h8i(bVar);
        this.f1841k = new c();
        this.l = new View.OnLayoutChangeListener() { // from class: c8i
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                this.f5050a.d(view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        };
        this.m = new a();
        adp.a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, y3j.f39754a, i, i2);
        androidx.core.view.c.p0(this, context, y3j.f39754a, attributeSet, typedArrayObtainStyledAttributes, i, i2);
        try {
            setScaleType(ScaleType.fromId(typedArrayObtainStyledAttributes.getInteger(y3j.c, bVar.f().getId())));
            setImplementationMode(ImplementationMode.fromId(typedArrayObtainStyledAttributes.getInteger(y3j.f39755b, implementationMode.getId())));
            typedArrayObtainStyledAttributes.recycle();
            this.h = new ScaleGestureDetector(context, new d());
            if (getBackground() == null) {
                setBackgroundColor(ni4.c(getContext(), R.color.black));
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
