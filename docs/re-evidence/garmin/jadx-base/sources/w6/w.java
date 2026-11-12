package w6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class w {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public final float A;
    public final float B;
    public final int C;
    public final int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f183053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f183054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f183055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f183056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f183057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f183058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f183059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f183060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f183061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f183062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f183063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f183064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f183065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f183066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f183067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f183068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f183069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f183070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f183071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f183072t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f183073u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f183074v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f183075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f183076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f183077y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f183078z;

    public w(Context context, q qVar, XmlPullParser xmlPullParser) {
        this.f183053a = 0;
        this.f183054b = 0;
        this.f183055c = 0;
        this.f183056d = -1;
        this.f183057e = -1;
        this.f183058f = -1;
        this.f183059g = 0.5f;
        this.f183060h = 0.5f;
        this.f183061i = -1;
        this.f183062j = false;
        this.f183063k = 0.0f;
        this.f183064l = 1.0f;
        this.f183065m = false;
        this.f183066n = new float[2];
        this.f183067o = new int[2];
        this.f183071s = 4.0f;
        this.f183072t = 1.2f;
        this.f183073u = true;
        this.f183074v = 1.0f;
        this.f183075w = 0;
        this.f183076x = 10.0f;
        this.f183077y = 10.0f;
        this.f183078z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f183070r = qVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f6326r);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            if (index == 16) {
                this.f183056d = typedArrayObtainStyledAttributes.getResourceId(index, this.f183056d);
            } else if (index == 17) {
                int i15 = typedArrayObtainStyledAttributes.getInt(index, this.f183053a);
                this.f183053a = i15;
                float[] fArr = E[i15];
                this.f183060h = fArr[0];
                this.f183059g = fArr[1];
            } else if (index == 1) {
                int i16 = typedArrayObtainStyledAttributes.getInt(index, this.f183054b);
                this.f183054b = i16;
                if (i16 < 6) {
                    float[] fArr2 = F[i16];
                    this.f183063k = fArr2[0];
                    this.f183064l = fArr2[1];
                } else {
                    this.f183064l = Float.NaN;
                    this.f183063k = Float.NaN;
                    this.f183062j = true;
                }
            } else if (index == 6) {
                this.f183071s = typedArrayObtainStyledAttributes.getFloat(index, this.f183071s);
            } else if (index == 5) {
                this.f183072t = typedArrayObtainStyledAttributes.getFloat(index, this.f183072t);
            } else if (index == 7) {
                this.f183073u = typedArrayObtainStyledAttributes.getBoolean(index, this.f183073u);
            } else if (index == 2) {
                this.f183074v = typedArrayObtainStyledAttributes.getFloat(index, this.f183074v);
            } else if (index == 3) {
                this.f183076x = typedArrayObtainStyledAttributes.getFloat(index, this.f183076x);
            } else if (index == 18) {
                this.f183057e = typedArrayObtainStyledAttributes.getResourceId(index, this.f183057e);
            } else if (index == 9) {
                this.f183055c = typedArrayObtainStyledAttributes.getInt(index, this.f183055c);
            } else if (index == 8) {
                this.f183075w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f183058f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f183061i = typedArrayObtainStyledAttributes.getResourceId(index, this.f183061i);
            } else if (index == 12) {
                this.f183077y = typedArrayObtainStyledAttributes.getFloat(index, this.f183077y);
            } else if (index == 13) {
                this.f183078z = typedArrayObtainStyledAttributes.getFloat(index, this.f183078z);
            } else if (index == 14) {
                this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
            } else if (index == 15) {
                this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
            } else if (index == 11) {
                this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
            } else if (index == 0) {
                this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i14 = this.f183058f;
        if (i14 == -1 || (viewFindViewById = viewGroup.findViewById(i14)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i14 = this.f183057e;
        if (i14 == -1 || (viewFindViewById = viewGroup.findViewById(i14)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z14) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z14) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f183053a];
        this.f183060h = fArr3[0];
        this.f183059g = fArr3[1];
        int i14 = this.f183054b;
        if (i14 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i14];
        this.f183063k = fArr4[0];
        this.f183064l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f183063k)) {
            return "rotation";
        }
        return this.f183063k + " , " + this.f183064l;
    }

    public w(q qVar, t tVar) {
        this.f183053a = 0;
        this.f183054b = 0;
        this.f183055c = 0;
        this.f183056d = -1;
        this.f183057e = -1;
        this.f183058f = -1;
        this.f183059g = 0.5f;
        this.f183060h = 0.5f;
        this.f183061i = -1;
        this.f183062j = false;
        this.f183063k = 0.0f;
        this.f183064l = 1.0f;
        this.f183065m = false;
        this.f183066n = new float[2];
        this.f183067o = new int[2];
        this.f183071s = 4.0f;
        this.f183072t = 1.2f;
        this.f183073u = true;
        this.f183074v = 1.0f;
        this.f183075w = 0;
        this.f183076x = 10.0f;
        this.f183077y = 10.0f;
        this.f183078z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f183070r = qVar;
        tVar.getClass();
        this.f183056d = -1;
        this.f183053a = 0;
        float[] fArr = E[0];
        this.f183060h = fArr[0];
        this.f183059g = fArr[1];
        this.f183054b = 0;
        float[] fArr2 = F[0];
        this.f183063k = fArr2[0];
        this.f183064l = fArr2[1];
        this.f183071s = 4.0f;
        this.f183072t = 1.2f;
        this.f183073u = true;
        this.f183074v = 1.0f;
        this.f183076x = 10.0f;
        this.f183057e = -1;
        this.f183055c = 0;
        this.f183075w = 0;
        this.f183058f = -1;
        this.f183061i = -1;
        this.C = 0;
        this.f183077y = Float.NaN;
        this.f183078z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.D = 0;
    }
}
