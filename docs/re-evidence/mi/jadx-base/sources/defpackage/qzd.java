package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class qzd {
    public static int f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32024b;
    public String c;
    public int d;
    public HashMap<String, ConstraintAttribute> e;

    public qzd() {
        int i = f;
        this.f32023a = i;
        this.f32024b = i;
        this.c = null;
    }

    public abstract void a(HashMap<String, xwq> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract qzd clone();

    public qzd c(qzd qzdVar) {
        this.f32023a = qzdVar.f32023a;
        this.f32024b = qzdVar.f32024b;
        this.c = qzdVar.c;
        this.d = qzdVar.d;
        this.e = qzdVar.e;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public boolean f(String str) {
        String str2 = this.c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void g(int i) {
        this.f32023a = i;
    }

    public void h(HashMap<String, Integer> map) {
    }

    public qzd i(int i) {
        this.f32024b = i;
        return this;
    }

    public boolean j(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public float k(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int l(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
