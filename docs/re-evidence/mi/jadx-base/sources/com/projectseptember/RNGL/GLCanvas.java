package com.projectseptember.RNGL;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.bg8;
import defpackage.g9p;
import defpackage.hej;
import defpackage.hva;
import defpackage.iva;
import defpackage.jva;
import defpackage.kva;
import defpackage.lva;
import defpackage.mva;
import defpackage.ova;
import defpackage.rj3;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes6.dex */
public class GLCanvas extends GLSurfaceView implements GLSurfaceView.Renderer, Executor, hej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ReactContext f10433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RNGLContext f10434b;
    public boolean c;
    public boolean d;
    public boolean e;
    public kva f;
    public int g;
    public int h;
    public boolean i;
    public hva j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<Uri> f10435k;
    public List<Uri> l;
    public Map<Uri, jva> m;
    public List<ova> n;
    public List<Bitmap> o;
    public Map<Integer, lva> p;
    public Map<Integer, iva> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public bg8 f10436r;
    public final Queue<Runnable> s;
    public List<rj3> t;
    public float u;
    public float v;
    public PointerEvents w;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GLCanvas.this.D();
            if (GLCanvas.this.e) {
                return;
            }
            GLCanvas.this.e = true;
            GLCanvas.this.requestRender();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (GLCanvas.this.F()) {
                    return;
                }
                GLCanvas.this.y();
            } catch (GLShaderCompilationFailed unused) {
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f10439a;

        public c(Uri uri) {
            this.f10439a = uri;
        }

        @Override // java.lang.Runnable
        public void run() {
            GLCanvas.this.r(this.f10439a);
        }
    }

    public GLCanvas(g9p g9pVar, bg8 bg8Var) {
        super(g9pVar);
        this.c = true;
        this.d = true;
        this.e = false;
        this.f10435k = new ArrayList();
        this.l = new ArrayList();
        this.m = new HashMap();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.s = new LinkedList();
        this.t = new ArrayList();
        this.w = PointerEvents.AUTO;
        this.f10433a = g9pVar;
        this.f10436r = bg8Var;
        this.f10434b = (RNGLContext) g9pVar.getNativeModule(RNGLContext.class);
        setEGLContextClientVersion(2);
        float f = this.f10433a.getResources().getDisplayMetrics().density;
        this.v = f;
        this.u = f;
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(3);
        setZOrderOnTop(false);
        setRenderer(this);
        setRenderMode(0);
    }

    public static Bitmap g(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
        }
        if (view.getDrawingCache() == null) {
            view.setDrawingCacheEnabled(true);
        }
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache != null) {
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, -1.0f);
            return Bitmap.createBitmap(drawingCache, 0, 0, drawingCache.getWidth(), drawingCache.getHeight(), matrix, true);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("view.getDrawingCache() is null. view=");
        sb.append(view);
        return Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
    }

    public static <A> Set<A> k(Set<A> set, Set<A> set2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    public Uri A(String str) {
        Uri uri = null;
        if (str == null) {
            return null;
        }
        try {
            Uri uri2 = Uri.parse(str);
            try {
                if (uri2.getScheme() != null) {
                    uri = uri2;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        return uri == null ? jva.c(this.f10433a, str) : uri;
    }

    public final void B(Queue<Runnable> queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                try {
                    queue.poll().run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public Uri C(ReadableMap readableMap) {
        boolean z = readableMap.hasKey("isStatic") && readableMap.getBoolean("isStatic");
        String string = readableMap.hasKey("path") ? readableMap.getString("path") : null;
        if (string == null || z) {
            string = readableMap.getString(SportRecordBundleKey.BUNDLE_PARAM_URI);
        }
        return A(string);
    }

    public int D() {
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup == null ? 0 : viewGroup.getChildCount() - 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (viewGroup2.getChildCount() == 1) {
                    childAt = viewGroup2.getChildAt(0);
                }
            }
            arrayList.add(g(childAt));
        }
        this.o = arrayList;
        return childCount;
    }

    public int E() {
        int iMin = Math.min(this.n.size(), this.o.size());
        for (int i = 0; i < iMin; i++) {
            this.n.get(i).f(this.o.get(i));
        }
        return iMin;
    }

    public final boolean F() {
        if (this.j == null) {
            return true;
        }
        HashMap<Uri, jva> map = new HashMap<>();
        kva kvaVarV = v(this.j, map);
        if (kvaVarV == null) {
            return false;
        }
        Set setK = k(this.m.keySet(), this.m.keySet());
        this.m = map;
        this.l.removeAll(setK);
        this.f = kvaVarV;
        return true;
    }

    public final void G(int i, int i2, float f) {
        float f2 = this.v;
        getHolder().setFixedSize((int) ((i * f) / f2), (int) ((i2 * f) / f2));
    }

    public final int e(int i) {
        switch (i) {
            case 35664:
            case 35667:
            case 35671:
                return 2;
            case 35665:
            case 35668:
            case 35672:
                return 3;
            case 35666:
            case 35669:
            case 35673:
            case 35674:
                return 4;
            case 35670:
            default:
                throw new Error("Invalid array type: " + i);
            case 35675:
                return 9;
            case 35676:
                return 16;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.s) {
            this.s.add(runnable);
            requestRender();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a A[SYNTHETIC] */
    public final void f() {
        Bitmap.CompressFormat compressFormat;
        String str;
        String str2;
        WritableMap writableMapCreateMap;
        Bitmap bitmapI = i();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class);
        for (rj3 rj3Var : this.t) {
            boolean zEquals = rj3Var.f32597b.equals("png");
            boolean z = !zEquals && (rj3Var.f32597b.equals("jpg") || rj3Var.f32597b.equals("jpeg"));
            boolean z2 = (zEquals || z || !rj3Var.f32597b.equals("webm")) ? false : true;
            boolean zEquals2 = rj3Var.f32596a.equals(ViewShot.Results.BASE_64);
            boolean z3 = !zEquals2 && rj3Var.f32596a.equals("file");
            String str3 = null;
            if (zEquals) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else if (z) {
                compressFormat = Bitmap.CompressFormat.JPEG;
            } else {
                compressFormat = z2 ? Bitmap.CompressFormat.WEBP : null;
            }
            int iDoubleValue = (int) (rj3Var.d.doubleValue() * 100.0d);
            if (compressFormat == null) {
                str = "Unsupported capture type '" + rj3Var.f32597b + "'";
            } else {
                if (zEquals2) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapI.compress(compressFormat, iDoubleValue, byteArrayOutputStream);
                        str2 = "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        byteArrayOutputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        str = "Could not capture as base64: " + e.getMessage();
                        str3 = str;
                        str2 = null;
                    }
                } else if (z3) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(rj3Var.c);
                        bitmapI.compress(compressFormat, iDoubleValue, fileOutputStream);
                        fileOutputStream.close();
                        str2 = "file://" + rj3Var.c;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        str = "Could not write file: " + e2.getMessage();
                        str3 = str;
                        str2 = null;
                    }
                } else {
                    str = "Unsupported capture format '" + rj3Var.f32596a + "'";
                }
                writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap(q.f13857a, rj3Var.b());
                if (str3 != null) {
                    writableMapCreateMap.putString("error", str3);
                }
                if (str2 != null) {
                    writableMapCreateMap.putString("result", str2);
                }
                rCTEventEmitter.receiveEvent(getId(), "captureFrame", writableMapCreateMap);
            }
            str3 = str;
            str2 = null;
            writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putMap(q.f13857a, rj3Var.b());
            if (str3 != null) {
                writableMapCreateMap.putString("error", str3);
            }
            if (str2 != null) {
                writableMapCreateMap.putString("result", str2);
            }
            rCTEventEmitter.receiveEvent(getId(), "captureFrame", writableMapCreateMap);
        }
        this.t = new ArrayList();
    }

    @Override // defpackage.hej
    public PointerEvents getPointerEvents() {
        return this.w;
    }

    public final int h() {
        Iterator<Uri> it = this.f10435k.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.l.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    public final Bitmap i() {
        return j(0, 0, this.f.g.intValue(), this.f.h.intValue());
    }

    public final Bitmap j(int i, int i2, int i3, int i4) {
        int i5 = i3 * i4;
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        IntBuffer intBufferWrap = IntBuffer.wrap(iArr);
        intBufferWrap.position(0);
        try {
            GLES20.glReadPixels(i, i2, i3, i4, 6408, 5121, intBufferWrap);
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i6 * i3;
                int i8 = ((i4 - i6) - 1) * i3;
                for (int i9 = 0; i9 < i3; i9++) {
                    int i10 = iArr[i7 + i9];
                    iArr2[i8 + i9] = (i10 & (-16711936)) | ((i10 << 16) & 16711680) | ((i10 >> 16) & 255);
                }
            }
            return Bitmap.createBitmap(iArr2, i3, i4, Bitmap.Config.ARGB_8888);
        } catch (GLException unused) {
            return null;
        }
    }

    public final void l() {
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "load", Arguments.createMap());
    }

    public final void n(double d, int i, int i2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (Double.isNaN(d)) {
            d = 0.0d;
        }
        writableMapCreateMap.putDouble(BroadcastsKt.SILENT_PUSHING_PROGRESS, d);
        writableMapCreateMap.putInt("loaded", i);
        writableMapCreateMap.putInt(SportDataTypeKt.DIMEN_TOTAL, i2);
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), BroadcastsKt.SILENT_PUSHING_PROGRESS, writableMapCreateMap);
    }

    public iva o(Integer num) {
        if (!this.q.containsKey(num)) {
            this.q.put(num, new iva(this));
        }
        return this.q.get(num);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        D();
        requestRender();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        B(this.s);
        int size = this.n.size();
        int i = this.h;
        if (size != i) {
            z(i);
        }
        if (q()) {
            if (this.d) {
                this.d = false;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                return;
            }
            return;
        }
        this.d = false;
        boolean z = this.e || this.i || this.h == 0;
        if (this.h > 0) {
            this.f10433a.runOnUiQueueThread(new a());
        }
        if (z) {
            w();
            this.e = false;
            if (this.t.size() > 0) {
                f();
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        G(i, i2, this.u);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.q = new HashMap();
        this.p = new HashMap();
        this.m = new HashMap();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.f = null;
        y();
    }

    public lva p(Integer num) {
        if (!this.p.containsKey(num)) {
            mva shader = this.f10434b.getShader(num);
            if (shader == null) {
                return null;
            }
            this.p.put(num, new lva(shader, num, this.f10434b));
        }
        return this.p.get(num);
    }

    public final boolean q() {
        Iterator<Uri> it = this.f10435k.iterator();
        while (it.hasNext()) {
            if (!this.l.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void r(Uri uri) {
        this.l.add(uri);
        int iH = h();
        int size = this.f10435k.size();
        n(((double) iH) / ((double) size), iH, size);
        this.c = true;
        y();
    }

    public final FloatBuffer s(ReadableArray readableArray) {
        int size = readableArray.size();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(size * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int i = 0; i < size; i++) {
            floatBufferAsFloatBuffer.put((float) readableArray.getDouble(i));
        }
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public void setAutoRedraw(boolean z) {
        this.i = z;
        setRenderMode(z ? 1 : 0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(16777215 & i);
        if (i == 0) {
            getHolder().setFormat(-3);
        } else {
            getHolder().setFormat(3);
        }
        requestRender();
    }

    public void setData(hva hvaVar) {
        this.j = hvaVar;
        this.f = null;
        if (!q()) {
            D();
        }
        y();
    }

    public void setImagesToPreload(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(A(readableArray.getMap(i).getString(SportRecordBundleKey.BUNDLE_PARAM_URI)));
        }
        this.f10435k = arrayList;
        y();
    }

    public void setNbContentTextures(int i) {
        this.h = i;
        requestRender();
    }

    public void setPixelRatio(float f) {
        this.u = f;
        G(getWidth(), getHeight(), f);
    }

    public void setPointerEvents(PointerEvents pointerEvents) {
        this.w = pointerEvents;
    }

    public void setRenderId(int i) {
        if (this.h > 0) {
            if (!q()) {
                D();
            }
            requestRender();
        }
    }

    public final IntBuffer t(ReadableArray readableArray) {
        int size = readableArray.size();
        IntBuffer intBufferAsIntBuffer = ByteBuffer.allocateDirect(size * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
        for (int i = 0; i < size; i++) {
            intBufferAsIntBuffer.put(readableArray.getInt(i));
        }
        intBufferAsIntBuffer.position(0);
        return intBufferAsIntBuffer;
    }

    public final void u(kva kvaVar) {
        int iIntValue = kvaVar.g.intValue();
        int iIntValue2 = kvaVar.h.intValue();
        Iterator<kva> it = kvaVar.j.iterator();
        while (it.hasNext()) {
            u(it.next());
        }
        Iterator<kva> it2 = kvaVar.f24332k.iterator();
        while (it2.hasNext()) {
            u(it2.next());
        }
        if (kvaVar.i.intValue() == -1) {
            GLES20.glBindFramebuffer(36160, this.g);
            GLES20.glViewport(0, 0, iIntValue, iIntValue2);
            GLES20.glBlendFunc(1, 771);
        } else {
            iva ivaVarO = o(kvaVar.i);
            ivaVarO.e(iIntValue, iIntValue2);
            ivaVarO.b();
            GLES20.glBlendFunc(770, 771);
        }
        kvaVar.f24330a.a();
        for (String str : kvaVar.f.keySet()) {
            kvaVar.f.get(str).b(kvaVar.f24331b.get(str).intValue());
        }
        Map<String, Integer> mapG = kvaVar.f24330a.g();
        for (String str2 : kvaVar.f24331b.keySet()) {
            kvaVar.f24330a.l(str2, kvaVar.f24331b.get(str2));
        }
        for (String str3 : kvaVar.c.keySet()) {
            kvaVar.f24330a.k(str3, kvaVar.c.get(str3));
        }
        for (String str4 : kvaVar.e.keySet()) {
            kvaVar.f24330a.m(str4, kvaVar.e.get(str4), mapG.get(str4).intValue());
        }
        for (String str5 : kvaVar.d.keySet()) {
            kvaVar.f24330a.n(str5, kvaVar.d.get(str5), mapG.get(str5).intValue());
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glDrawArrays(4, 0, 3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x0203. Please report as an issue. */
    public final kva v(hva hvaVar, HashMap<Uri, jva> map) {
        Map map2;
        HashMap map3;
        HashMap<Uri, jva> map4;
        Map<Uri, jva> map5;
        String str;
        Map map6;
        hva hvaVar2 = hvaVar;
        String str2 = "texture uniform '";
        Map<Uri, jva> map7 = this.m;
        lva lvaVarP = p(hvaVar2.f20506a);
        if (lvaVarP == null || !lvaVarP.d()) {
            return null;
        }
        HashMap map8 = new HashMap();
        Map map9 = new HashMap();
        HashMap map10 = new HashMap();
        HashMap map11 = new HashMap();
        HashMap map12 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<hva> it = hvaVar2.g.iterator();
        while (it.hasNext()) {
            kva kvaVarV = v(it.next(), map);
            if (kvaVarV == null) {
                return null;
            }
            arrayList.add(kvaVarV);
        }
        Iterator<hva> it2 = hvaVar2.h.iterator();
        while (it2.hasNext()) {
            kva kvaVarV2 = v(it2.next(), map);
            if (kvaVarV2 == null) {
                return null;
            }
            arrayList2.add(kvaVarV2);
        }
        Map<String, Integer> mapG = lvaVarP.g();
        List<String> listE = lvaVarP.e();
        Map<String, Integer> mapF = lvaVarP.f();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = hvaVar2.f20507b.keySetIterator();
        int i = 0;
        while (true) {
            List<String> list = listE;
            Map<Uri, jva> map13 = map7;
            String str3 = "[";
            if (!readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String str4 = "[";
                Map<String, Integer> map14 = mapF;
                Map map15 = map9;
                HashMap map16 = map12;
                String str5 = "]";
                int[] iArr = new int[1];
                int i2 = 0;
                GLES20.glGetIntegerv(34930, iArr, 0);
                if (i > iArr[0]) {
                    lvaVarP.j("Maximum number of texture reach. got " + i + " >= max " + iArr);
                }
                for (String str6 : list) {
                    Map<String, Integer> map17 = map14;
                    int iIntValue = map17.get(str6).intValue();
                    if (iIntValue != 1) {
                        int i3 = i2;
                        while (i3 < iIntValue) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str6);
                            String str7 = str4;
                            sb.append(str7);
                            sb.append(i3);
                            str5 = str5;
                            sb.append(str5);
                            String string = sb.toString();
                            if (!map15.containsKey(string) && !map8.containsKey(string) && !map11.containsKey(string) && !map10.containsKey(string)) {
                                lvaVarP.j("All defined uniforms must be provided. Missing '" + string + "'");
                            }
                            i3++;
                            str4 = str7;
                        }
                    } else if (!map15.containsKey(str6) && !map8.containsKey(str6) && !map11.containsKey(str6) && !map10.containsKey(str6)) {
                        lvaVarP.j("All defined uniforms must be provided. Missing '" + str6 + "'");
                    }
                    map14 = map17;
                    str4 = str4;
                    i2 = 0;
                }
                return new kva(lvaVarP, map8, map15, map10, map11, map16, Integer.valueOf((int) (hvaVar.c.doubleValue() * hvaVar.e.doubleValue())), Integer.valueOf((int) (hvaVar.d.doubleValue() * hvaVar.e.doubleValue())), hvaVar.f, arrayList, arrayList2);
            }
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Map<String, Integer> map18 = mapG;
            int iIntValue2 = mapG.get(strNextKey).intValue();
            ReadableMapKeySetIterator readableMapKeySetIterator = readableMapKeySetIteratorKeySetIterator;
            int iIntValue3 = mapF.get(strNextKey).intValue();
            Map<String, Integer> map19 = mapF;
            ReadableMap readableMap = hvaVar2.f20507b;
            if (iIntValue2 == 35678 || iIntValue2 == 35680) {
                String str8 = str2;
                map2 = map9;
                HashMap map20 = map12;
                int i4 = i;
                i = i4 + 1;
                map8.put(strNextKey, Integer.valueOf(i4));
                if (readableMap.isNull(strNextKey)) {
                    ova ovaVar = new ova(this);
                    ovaVar.g();
                    map3 = map20;
                    map3.put(strNextKey, ovaVar);
                } else {
                    map3 = map20;
                    try {
                        ReadableMap map21 = readableMap.getMap(strNextKey);
                        String string2 = map21.getString("type");
                        if (string2.equals(MiuiCursorConstants.CONTENT)) {
                            int i5 = map21.getInt("id");
                            if (i5 >= this.n.size()) {
                                z(i5 + 1);
                            }
                            map3.put(strNextKey, this.n.get(i5));
                        } else if (string2.equals("fbo")) {
                            map3.put(strNextKey, o(Integer.valueOf(map21.getInt("id"))).f22125a.get(0));
                        } else if (string2.equals(SportRecordBundleKey.BUNDLE_PARAM_URI)) {
                            Uri uriC = C(map21);
                            if (uriC == null) {
                                StringBuilder sb2 = new StringBuilder();
                                str = str8;
                                sb2.append(str);
                                sb2.append(strNextKey);
                                sb2.append("': Invalid uri format '");
                                sb2.append(map21);
                                sb2.append("'");
                                lvaVarP.j(sb2.toString());
                            } else {
                                str = str8;
                            }
                            map4 = map;
                            jva jvaVar = map4.get(uriC);
                            map5 = map13;
                            if (jvaVar == null && (jvaVar = map5.get(uriC)) != null) {
                                map4.put(uriC, jvaVar);
                            }
                            if (jvaVar == null) {
                                jvaVar = new jva(this, this.f10436r.e(), new c(uriC));
                                jvaVar.g(uriC);
                                map4.put(uriC, jvaVar);
                            }
                            map3.put(strNextKey, jvaVar.d());
                        } else {
                            map4 = map;
                            map5 = map13;
                            str = str8;
                            lvaVarP.j(str + strNextKey + "': Unexpected type '" + iIntValue2 + "'");
                        }
                    } catch (Exception unused) {
                        lvaVarP.j(str8 + strNextKey + "': you cannot directly give require('./img.png') to gl-react, use resolveAssetSource(require('./img.png')) instead.");
                        return null;
                    }
                }
                map4 = map;
                map5 = map13;
                str = str8;
            } else {
                String str9 = "': type not supported: ";
                String str10 = str2;
                String str11 = ". Expected: ";
                HashMap map22 = map12;
                int i6 = i;
                if (iIntValue3 == 1) {
                    if (iIntValue2 == 5124) {
                        map8.put(strNextKey, Integer.valueOf(readableMap.getInt(strNextKey)));
                    } else if (iIntValue2 != 5126) {
                        switch (iIntValue2) {
                            case 35664:
                            case 35665:
                            case 35666:
                            case 35674:
                            case 35675:
                            case 35676:
                                ReadableArray array = readableMap.getArray(strNextKey);
                                if (e(iIntValue2) != array.size()) {
                                    lvaVarP.j("uniform '" + strNextKey + "': Invalid array size: " + array.size() + ". Expected: " + e(iIntValue2));
                                }
                                map11.put(strNextKey, s(array));
                                break;
                            case 35667:
                            case 35668:
                            case 35669:
                            case 35671:
                            case 35672:
                            case 35673:
                                ReadableArray array2 = readableMap.getArray(strNextKey);
                                if (e(iIntValue2) != array2.size()) {
                                    lvaVarP.j("uniform '" + strNextKey + "': Invalid array size: " + array2.size() + ". Expected: " + e(iIntValue2));
                                }
                                map10.put(strNextKey, t(array2));
                                break;
                            case 35670:
                                map8.put(strNextKey, Integer.valueOf(readableMap.getBoolean(strNextKey) ? 1 : 0));
                                break;
                            default:
                                lvaVarP.j("uniform '" + strNextKey + "': type not supported: " + iIntValue2);
                                break;
                        }
                    } else {
                        map9.put(strNextKey, Float.valueOf((float) readableMap.getDouble(strNextKey)));
                    }
                    map2 = map9;
                } else {
                    ReadableArray array3 = readableMap.getArray(strNextKey);
                    if (iIntValue3 != array3.size()) {
                        lvaVarP.j("uniform '" + strNextKey + "': Invalid array size: " + array3.size() + ". Expected: " + iIntValue3);
                    }
                    int i7 = 0;
                    while (i7 < iIntValue3) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(strNextKey);
                        sb3.append(str3);
                        sb3.append(i7);
                        int i8 = iIntValue3;
                        sb3.append("]");
                        String string3 = sb3.toString();
                        if (iIntValue2 == 5124) {
                            str9 = str9;
                            str11 = str11;
                            str3 = str3;
                            map6 = map9;
                            map8.put(string3, Integer.valueOf(array3.getInt(i7)));
                        } else if (iIntValue2 != 5126) {
                            switch (iIntValue2) {
                                case 35664:
                                case 35665:
                                case 35666:
                                case 35674:
                                case 35675:
                                case 35676:
                                    ReadableArray array4 = array3.getArray(i7);
                                    if (e(iIntValue2) != array4.size()) {
                                        lvaVarP.j("uniform '" + string3 + "': Invalid array size: " + array4.size() + str11 + e(iIntValue2));
                                    }
                                    map11.put(string3, s(array4));
                                    break;
                                case 35667:
                                case 35668:
                                case 35669:
                                case 35671:
                                case 35672:
                                case 35673:
                                    ReadableArray array5 = array3.getArray(i7);
                                    if (e(iIntValue2) != array5.size()) {
                                        lvaVarP.j("uniform '" + string3 + "': Invalid array size: " + array5.size() + str11 + e(iIntValue2));
                                    }
                                    map10.put(string3, t(array5));
                                    break;
                                case 35670:
                                    map8.put(string3, Integer.valueOf(array3.getBoolean(i7) ? 1 : 0));
                                    str9 = str9;
                                    str3 = str3;
                                    break;
                                default:
                                    lvaVarP.j("uniform '" + string3 + str9 + iIntValue2);
                                    str9 = str9;
                                    str3 = str3;
                                    break;
                            }
                            map6 = map9;
                        } else {
                            str9 = str9;
                            str11 = str11;
                            str3 = str3;
                            map6 = map9;
                            map6.put(string3, Float.valueOf((float) array3.getDouble(i7)));
                        }
                        i7++;
                        str11 = str11;
                        map9 = map6;
                        iIntValue3 = i8;
                        str9 = str9;
                        str3 = str3;
                    }
                    map2 = map9;
                }
                map4 = map;
                map5 = map13;
                str = str10;
                map3 = map22;
                i = i6;
            }
            listE = list;
            mapF = map19;
            mapG = map18;
            readableMapKeySetIteratorKeySetIterator = readableMapKeySetIterator;
            hvaVar2 = hvaVar;
            Map<Uri, jva> map23 = map5;
            map12 = map3;
            str2 = str;
            map9 = map2;
            map7 = map23;
        }
    }

    public final void w() {
        kva kvaVar = this.f;
        if (kvaVar == null) {
            return;
        }
        E();
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        this.g = iArr[0];
        GLES20.glEnable(3042);
        u(kvaVar);
        GLES20.glDisable(3042);
        GLES20.glBindFramebuffer(36160, this.g);
        GLES20.glBindBuffer(34962, 0);
        if (!this.c || q()) {
            return;
        }
        this.c = false;
        l();
    }

    public void x(rj3 rj3Var) {
        requestRender();
        Iterator<rj3> it = this.t.iterator();
        while (it.hasNext()) {
            if (it.next().equals(rj3Var)) {
                return;
            }
        }
        this.t.add(rj3Var);
    }

    public void y() {
        execute(new b());
    }

    public void z(int i) {
        int size = this.n.size();
        if (size == i) {
            return;
        }
        if (i < size) {
            this.n = this.n.subList(0, i);
            return;
        }
        for (int size2 = this.n.size(); size2 < i; size2++) {
            this.n.add(new ova(this));
        }
    }
}
