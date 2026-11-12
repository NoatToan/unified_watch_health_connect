package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.GenericDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.aej;
import defpackage.aya;
import defpackage.b5i;
import defpackage.dpd;
import defpackage.exh;
import defpackage.ey9;
import defpackage.f0i;
import defpackage.f52;
import defpackage.idq;
import defpackage.j0s;
import defpackage.jag;
import defpackage.k1a;
import defpackage.kag;
import defpackage.o0b;
import defpackage.p4d;
import defpackage.pd8;
import defpackage.rbl;
import defpackage.s5d;
import defpackage.sxk;
import defpackage.t4d;
import defpackage.uj4;
import defpackage.v5d;
import defpackage.vr1;
import defpackage.w14;
import defpackage.wqk;
import defpackage.y92;
import defpackage.ypk;
import defpackage.zxa;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ReactImageView extends GenericDraweeView {
    public static float[] G = new float[4];
    public static final Matrix H = new Matrix();
    public static final Matrix I = new Matrix();
    public static final Matrix J = new Matrix();
    public uj4 A;
    public uj4 B;
    public final Object C;
    public int D;
    public boolean E;
    public ReadableMap F;
    public ImageResizeMethod g;
    public final List<v5d> h;
    public v5d i;
    public v5d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f7514k;
    public Drawable l;
    public sxk m;
    public int n;
    public int o;
    public int p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7515r;
    public float[] s;
    public rbl.b t;
    public Shader.TileMode u;
    public boolean v;
    public final AbstractDraweeControllerBuilder w;
    public final b x;
    public final c y;
    public dpd z;

    public class a extends f52<p4d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pd8 f7516b;

        public a(pd8 pd8Var) {
            this.f7516b = pd8Var;
        }

        @Override // defpackage.f52, defpackage.uj4
        public void b(String str, Object obj) {
            this.f7516b.dispatchEvent(new t4d(ReactImageView.this.getId(), 4));
        }

        @Override // defpackage.f52, defpackage.uj4
        public void d(String str, Throwable th) {
            this.f7516b.dispatchEvent(new t4d(ReactImageView.this.getId(), 1, true, th.getMessage()));
        }

        @Override // defpackage.f52, defpackage.uj4
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(String str, p4d p4dVar, Animatable animatable) {
            if (p4dVar != null) {
                this.f7516b.dispatchEvent(new t4d(ReactImageView.this.getId(), 2, ReactImageView.this.i.d(), p4dVar.getWidth(), p4dVar.getHeight()));
                this.f7516b.dispatchEvent(new t4d(ReactImageView.this.getId(), 3));
            }
        }
    }

    public class b extends y92 {
        public b() {
        }

        @Override // defpackage.y92
        public void f(Bitmap bitmap, Bitmap bitmap2) {
            ReactImageView.this.q(ReactImageView.G);
            bitmap.setHasAlpha(true);
            if (ey9.a(ReactImageView.G[0], 0.0f) && ey9.a(ReactImageView.G[1], 0.0f) && ey9.a(ReactImageView.G[2], 0.0f) && ey9.a(ReactImageView.G[3], 0.0f)) {
                super.f(bitmap, bitmap2);
                return;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
            Canvas canvas = new Canvas(bitmap);
            float[] fArr = new float[8];
            g(bitmap2, ReactImageView.G, fArr);
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight()), fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }

        public void g(Bitmap bitmap, float[] fArr, float[] fArr2) {
            ReactImageView.this.t.a(ReactImageView.H, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            ReactImageView.H.invert(ReactImageView.I);
            float fMapRadius = ReactImageView.I.mapRadius(fArr[0]);
            fArr2[0] = fMapRadius;
            fArr2[1] = fMapRadius;
            float fMapRadius2 = ReactImageView.I.mapRadius(fArr[1]);
            fArr2[2] = fMapRadius2;
            fArr2[3] = fMapRadius2;
            float fMapRadius3 = ReactImageView.I.mapRadius(fArr[2]);
            fArr2[4] = fMapRadius3;
            fArr2[5] = fMapRadius3;
            float fMapRadius4 = ReactImageView.I.mapRadius(fArr[3]);
            fArr2[6] = fMapRadius4;
            fArr2[7] = fMapRadius4;
        }

        public /* synthetic */ b(ReactImageView reactImageView, a aVar) {
            this();
        }
    }

    public class c extends y92 {
        public c() {
        }

        @Override // defpackage.y92, defpackage.b5i
        public w14<Bitmap> a(Bitmap bitmap, f0i f0iVar) {
            Rect rect = new Rect(0, 0, ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            ReactImageView.this.t.a(ReactImageView.J, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, ReactImageView.this.u, ReactImageView.this.u);
            bitmapShader.setLocalMatrix(ReactImageView.J);
            paint.setShader(bitmapShader);
            w14<Bitmap> w14VarA = f0iVar.a(ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            try {
                new Canvas(w14VarA.n()).drawRect(rect, paint);
                return w14VarA.clone();
            } finally {
                w14.l(w14VarA);
            }
        }

        public /* synthetic */ c(ReactImageView reactImageView, a aVar) {
            this();
        }
    }

    public ReactImageView(Context context, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, o0b o0bVar, Object obj) {
        super(context, p(context));
        this.g = ImageResizeMethod.AUTO;
        this.n = 0;
        this.f7515r = Float.NaN;
        this.u = s5d.a();
        this.D = -1;
        this.t = s5d.b();
        this.w = abstractDraweeControllerBuilder;
        a aVar = null;
        this.x = new b(this, aVar);
        this.y = new c(this, aVar);
        this.C = obj;
        this.h = new LinkedList();
    }

    public static zxa p(Context context) {
        return new aya(context.getResources()).J(RoundingParams.a(0.0f)).a();
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.v = this.v || r() || s();
        t();
    }

    public final void q(float[] fArr) {
        float f = !j0s.a(this.f7515r) ? this.f7515r : 0.0f;
        float[] fArr2 = this.s;
        fArr[0] = (fArr2 == null || j0s.a(fArr2[0])) ? f : this.s[0];
        float[] fArr3 = this.s;
        fArr[1] = (fArr3 == null || j0s.a(fArr3[1])) ? f : this.s[1];
        float[] fArr4 = this.s;
        fArr[2] = (fArr4 == null || j0s.a(fArr4[2])) ? f : this.s[2];
        float[] fArr5 = this.s;
        if (fArr5 != null && !j0s.a(fArr5[3])) {
            f = this.s[3];
        }
        fArr[3] = f;
    }

    public final boolean r() {
        return this.h.size() > 1;
    }

    public final boolean s() {
        return this.u != Shader.TileMode.CLAMP;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.n != i) {
            this.n = i;
            this.m = new sxk(i);
            this.v = true;
        }
    }

    public void setBlurRadius(float f) {
        int iC = (int) exh.c(f);
        if (iC == 0) {
            this.z = null;
        } else {
            this.z = new dpd(iC);
        }
        this.v = true;
    }

    public void setBorderColor(int i) {
        this.o = i;
        this.v = true;
    }

    public void setBorderRadius(float f) {
        if (ey9.a(this.f7515r, f)) {
            return;
        }
        this.f7515r = f;
        this.v = true;
    }

    public void setBorderWidth(float f) {
        this.q = exh.c(f);
        this.v = true;
    }

    public void setControllerListener(uj4 uj4Var) {
        this.B = uj4Var;
        this.v = true;
        t();
    }

    public void setDefaultSource(String str) {
        this.f7514k = wqk.b().c(getContext(), str);
        this.v = true;
    }

    public void setFadeDuration(int i) {
        this.D = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.F = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable drawableC = wqk.b().c(getContext(), str);
        this.l = drawableC != null ? new vr1(drawableC, 1000) : null;
        this.v = true;
    }

    public void setOverlayColor(int i) {
        this.p = i;
        this.v = true;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.E = z;
    }

    public void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        this.g = imageResizeMethod;
        this.v = true;
    }

    public void setScaleType(rbl.b bVar) {
        this.t = bVar;
        this.v = true;
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (z) {
            this.A = new a(((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher());
        } else {
            this.A = null;
        }
        this.v = true;
    }

    public void setSource(ReadableArray readableArray) {
        this.h.clear();
        if (readableArray == null || readableArray.size() == 0) {
            this.h.add(new v5d(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else {
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString(SportRecordBundleKey.BUNDLE_PARAM_URI);
                v5d v5dVar = new v5d(getContext(), string);
                this.h.add(v5dVar);
                if (Uri.EMPTY.equals(v5dVar.e())) {
                    x(string);
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    String string2 = map.getString(SportRecordBundleKey.BUNDLE_PARAM_URI);
                    v5d v5dVar2 = new v5d(getContext(), string2, map.getDouble("width"), map.getDouble("height"));
                    this.h.add(v5dVar2);
                    if (Uri.EMPTY.equals(v5dVar2.e())) {
                        x(string2);
                    }
                }
            }
        }
        this.v = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        this.u = tileMode;
        this.v = true;
    }

    public void t() {
        if (this.v) {
            if (!r() || (getWidth() > 0 && getHeight() > 0)) {
                v();
                v5d v5dVar = this.i;
                if (v5dVar == null) {
                    return;
                }
                boolean zW = w(v5dVar);
                if (!zW || (getWidth() > 0 && getHeight() > 0)) {
                    if (!s() || (getWidth() > 0 && getHeight() > 0)) {
                        zxa hierarchy = getHierarchy();
                        hierarchy.p(this.t);
                        Drawable drawable = this.f7514k;
                        if (drawable != null) {
                            hierarchy.t(drawable, this.t);
                        }
                        Drawable drawable2 = this.l;
                        if (drawable2 != null) {
                            hierarchy.t(drawable2, rbl.b.e);
                        }
                        rbl.b bVar = this.t;
                        boolean z = (bVar == rbl.b.g || bVar == rbl.b.h) ? false : true;
                        RoundingParams roundingParamsL = hierarchy.l();
                        q(G);
                        float[] fArr = G;
                        roundingParamsL.o(fArr[0], fArr[1], fArr[2], fArr[3]);
                        sxk sxkVar = this.m;
                        if (sxkVar != null) {
                            sxkVar.a(this.o, this.q);
                            this.m.l(roundingParamsL.d());
                            hierarchy.q(this.m);
                        }
                        if (z) {
                            roundingParamsL.p(0.0f);
                        }
                        roundingParamsL.l(this.o, this.q);
                        int i = this.p;
                        if (i != 0) {
                            roundingParamsL.q(i);
                        } else {
                            roundingParamsL.t(RoundingParams.RoundingMethod.BITMAP_ONLY);
                        }
                        hierarchy.v(roundingParamsL);
                        int i2 = this.D;
                        if (i2 < 0) {
                            i2 = this.i.f() ? 0 : 300;
                        }
                        hierarchy.s(i2);
                        LinkedList linkedList = new LinkedList();
                        if (z) {
                            linkedList.add(this.x);
                        }
                        dpd dpdVar = this.z;
                        if (dpdVar != null) {
                            linkedList.add(dpdVar);
                        }
                        if (s()) {
                            linkedList.add(this.y);
                        }
                        b5i b5iVarD = jag.d(linkedList);
                        ypk ypkVar = zW ? new ypk(getWidth(), getHeight()) : null;
                        aej aejVarW = aej.w(ImageRequestBuilder.r(this.i.e()).y(b5iVarD).C(ypkVar).s(true).z(this.E), this.F);
                        this.w.w();
                        this.w.x(true).y(this.C).b(getController()).A(aejVarW);
                        v5d v5dVar2 = this.j;
                        if (v5dVar2 != null) {
                            this.w.B(ImageRequestBuilder.r(v5dVar2.e()).y(b5iVarD).C(ypkVar).s(true).z(this.E).a());
                        }
                        uj4 uj4Var = this.A;
                        if (uj4Var == null || this.B == null) {
                            uj4 uj4Var2 = this.B;
                            if (uj4Var2 != null) {
                                this.w.z(uj4Var2);
                            } else if (uj4Var != null) {
                                this.w.z(uj4Var);
                            }
                        } else {
                            k1a k1aVar = new k1a();
                            k1aVar.g(this.A);
                            k1aVar.g(this.B);
                            this.w.z(k1aVar);
                        }
                        setController(this.w.build());
                        this.v = false;
                        this.w.w();
                    }
                }
            }
        }
    }

    public void u(float f, int i) {
        if (this.s == null) {
            float[] fArr = new float[4];
            this.s = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (ey9.a(this.s[i], f)) {
            return;
        }
        this.s[i] = f;
        this.v = true;
    }

    public final void v() {
        this.i = null;
        if (this.h.isEmpty()) {
            this.h.add(new v5d(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else if (r()) {
            kag.b bVarA = kag.a(getWidth(), getHeight(), this.h);
            this.i = bVarA.a();
            this.j = bVarA.b();
            return;
        }
        this.i = this.h.get(0);
    }

    public final boolean w(v5d v5dVar) {
        ImageResizeMethod imageResizeMethod = this.g;
        if (imageResizeMethod == ImageResizeMethod.AUTO) {
            return idq.h(v5dVar.e()) || idq.i(v5dVar.e());
        }
        return imageResizeMethod == ImageResizeMethod.RESIZE;
    }

    public final void x(String str) {
    }
}
