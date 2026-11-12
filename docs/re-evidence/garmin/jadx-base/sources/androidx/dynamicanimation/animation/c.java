package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> {
    final String mPropertyName;

    public static class a extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FloatProperty f7010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.f7010a = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.c
        public final float getValue(T t7) {
            return ((Float) this.f7010a.get(t7)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.c
        public final void setValue(T t7, float f14) {
            this.f7010a.setValue(t7, f14);
        }
    }

    public c(String str) {
        this.mPropertyName = str;
    }

    public static <T> c<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t7);

    public abstract void setValue(T t7, float f14);
}
