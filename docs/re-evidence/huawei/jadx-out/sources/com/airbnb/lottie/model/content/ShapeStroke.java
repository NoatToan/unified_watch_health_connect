package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.layer.BaseLayer;
import defpackage.cx;
import defpackage.ey;
import defpackage.fu;
import defpackage.fx;
import defpackage.gb;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ShapeStroke implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LineJoinType f1940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LineCapType f1941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fx f1942c;
    private final boolean d;
    private final List<fu> e;
    private final gb f;
    private final float g;
    private final String h;
    private final fu i;
    private final fu j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = AnonymousClass3.f1944c[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i == 2) {
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.SQUARE;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.ShapeStroke$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1943a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f1944c;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f1943a = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1943a[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1943a[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f1944c = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1944c[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1944c[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = AnonymousClass3.f1943a[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public ShapeStroke(String str, fu fuVar, List<fu> list, fx fxVar, gb gbVar, fu fuVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.h = str;
        this.i = fuVar;
        this.e = list;
        this.f1942c = fxVar;
        this.f = gbVar;
        this.j = fuVar2;
        this.f1941b = lineCapType;
        this.f1940a = lineJoinType;
        this.g = f;
        this.d = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new ey(lottieDrawable, baseLayer, this);
    }

    public String g() {
        return this.h;
    }

    public fx e() {
        return this.f1942c;
    }

    public gb j() {
        return this.f;
    }

    public fu i() {
        return this.j;
    }

    public List<fu> d() {
        return this.e;
    }

    public fu c() {
        return this.i;
    }

    public LineCapType a() {
        return this.f1941b;
    }

    public LineJoinType b() {
        return this.f1940a;
    }

    public float h() {
        return this.g;
    }

    public boolean f() {
        return this.d;
    }
}
