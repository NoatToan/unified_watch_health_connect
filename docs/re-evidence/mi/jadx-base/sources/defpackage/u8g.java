package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class u8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap<String, v8g> f35521a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap<String, PropertyValuesHolder[]> f35522b = new SimpleArrayMap<>();

    public static void a(u8g u8gVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            u8gVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            u8gVar.m(objectAnimator.getPropertyName(), v8g.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static u8g c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    public static u8g d(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return e(arrayList);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            return null;
        }
    }

    public static u8g e(List<Animator> list) {
        u8g u8gVar = new u8g();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(u8gVar, list.get(i));
        }
        return u8gVar;
    }

    public final PropertyValuesHolder[] b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u8g) {
            return this.f35521a.equals(((u8g) obj).f35521a);
        }
        return false;
    }

    public <T> ObjectAnimator f(String str, T t, Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, g(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        h(str).a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.f35522b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public v8g h(String str) {
        if (k(str)) {
            return this.f35521a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f35521a.hashCode();
    }

    public long i() {
        int size = this.f35521a.getSize();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            v8g v8gVarValueAt = this.f35521a.valueAt(i);
            jMax = Math.max(jMax, v8gVarValueAt.c() + v8gVarValueAt.d());
        }
        return jMax;
    }

    public boolean j(String str) {
        return this.f35522b.get(str) != null;
    }

    public boolean k(String str) {
        return this.f35521a.get(str) != null;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f35522b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, v8g v8gVar) {
        this.f35521a.put(str, v8gVar);
    }

    public String toString() {
        return '\n' + getClass().getName() + AbstractJsonLexerKt.BEGIN_OBJ + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f35521a + "}\n";
    }
}
