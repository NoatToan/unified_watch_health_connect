package miuix.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.e0q;
import defpackage.gv5;
import defpackage.u5j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.animation.base.AnimConfig;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Cloneable {
    public static final int[] z = {2, 1, 3, 4};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<Object> f26912r;
    public ArrayList<Object> s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26909a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnimConfig f26910b = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.95f, 0.35f));
    public ArrayList<Integer> c = new ArrayList<>();
    public ArrayList<View> d = new ArrayList<>();
    public ArrayList<String> e = null;
    public ArrayList<Class<?>> f = null;
    public ArrayList<Integer> g = null;
    public ArrayList<View> h = null;
    public ArrayList<Class<?>> i = null;
    public ArrayList<String> j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<Integer> f26911k = null;
    public ArrayList<View> l = null;
    public ArrayList<Class<?>> m = null;
    public MiuixTransitionSet n = null;
    public int[] o = z;
    public e0q p = new e0q();
    public e0q q = new e0q();
    public ViewGroup t = null;
    public boolean u = false;
    public int v = 0;
    public CopyOnWriteArrayList<InterfaceC1036a> w = null;
    public ArrayList<Object> x = new ArrayList<>();
    public int y = 0;

    /* JADX INFO: renamed from: miuix.transition.a$a, reason: collision with other inner class name */
    public interface InterfaceC1036a {
        void a(a aVar);

        void b(a aVar);
    }

    public a() {
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() {
        a aVar = null;
        try {
            a aVar2 = (a) super.clone();
            try {
                aVar2.p = new e0q();
                aVar2.q = new e0q();
                aVar2.f26912r = null;
                aVar2.s = null;
                AnimConfig animConfig = new AnimConfig();
                this.f26910b = animConfig;
                animConfig.copy(aVar2.f26910b);
                return aVar2;
            } catch (CloneNotSupportedException unused) {
                aVar = aVar2;
                return aVar;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public void b() {
        CopyOnWriteArrayList<InterfaceC1036a> copyOnWriteArrayList = this.w;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<InterfaceC1036a> it = this.w.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
        this.x.clear();
        this.f26910b.clear();
    }

    public void c() {
        CopyOnWriteArrayList<InterfaceC1036a> copyOnWriteArrayList = this.w;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator<InterfaceC1036a> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public String d(String str) {
        String str2 = str + getClass().getSimpleName() + gv5.CONNECT_VALUE_STR + Integer.toHexString(hashCode()) + ": ";
        if (this.c.size() <= 0 && this.d.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.c.size() > 0) {
            for (int i = 0; i < this.c.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.c.get(i);
            }
        }
        if (this.d.size() > 0) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.d.get(i2);
            }
        }
        return str3 + ")";
    }

    public String toString() {
        return d("");
    }

    public a(Context context, AttributeSet attributeSet) {
        float[] fArr = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u5j.s);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        boolean z2 = false;
        int i = 1;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == u5j.t) {
                this.f26910b.setDelay(typedArrayObtainStyledAttributes.getInt(index, 0));
            } else if (index == u5j.v) {
                this.f26910b.setFromSpeed(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
            } else {
                if (index == u5j.u) {
                    i = typedArrayObtainStyledAttributes.getInt(index, 1);
                } else if (index == u5j.w) {
                    String[] strArrSplit = typedArrayObtainStyledAttributes.getString(index).split(",");
                    float[] fArr2 = new float[strArrSplit.length];
                    for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                        fArr2[i3] = Float.valueOf(strArrSplit[i3]).floatValue();
                    }
                    fArr = fArr2;
                }
                z2 = true;
            }
        }
        if (z2 && fArr != null) {
            this.f26910b.setEase(i, fArr);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
