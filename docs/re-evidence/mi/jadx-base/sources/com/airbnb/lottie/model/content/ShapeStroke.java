package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import defpackage.db1;
import defpackage.eb1;
import defpackage.fi4;
import defpackage.gb1;
import defpackage.hh4;
import defpackage.jte;
import defpackage.lse;
import defpackage.slo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ShapeStroke implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb1 f5684b;
    public final List<eb1> c;
    public final db1 d;
    public final gb1 e;
    public final eb1 f;
    public final LineCapType g;
    public final LineJoinType h;
    public final float i;
    public final boolean j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = a.f5685a[ordinal()];
            if (i != 1) {
                return i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = a.f5686b[ordinal()];
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

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5686b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f5686b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5686b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5686b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f5685a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5685a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5685a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, eb1 eb1Var, List<eb1> list, db1 db1Var, gb1 gb1Var, eb1 eb1Var2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f5683a = str;
        this.f5684b = eb1Var;
        this.c = list;
        this.d = db1Var;
        this.e = gb1Var;
        this.f = eb1Var2;
        this.g = lineCapType;
        this.h = lineJoinType;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, com.airbnb.lottie.model.layer.a aVar) {
        return new slo(jteVar, aVar, this);
    }

    public LineCapType b() {
        return this.g;
    }

    public db1 c() {
        return this.d;
    }

    public eb1 d() {
        return this.f5684b;
    }

    public LineJoinType e() {
        return this.h;
    }

    public List<eb1> f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.f5683a;
    }

    public gb1 i() {
        return this.e;
    }

    public eb1 j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}
