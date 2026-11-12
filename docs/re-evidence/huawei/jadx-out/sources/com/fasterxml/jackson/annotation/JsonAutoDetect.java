package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAutoDetect {
    Visibility creatorVisibility() default Visibility.DEFAULT;

    Visibility fieldVisibility() default Visibility.DEFAULT;

    Visibility getterVisibility() default Visibility.DEFAULT;

    Visibility isGetterVisibility() default Visibility.DEFAULT;

    Visibility setterVisibility() default Visibility.DEFAULT;

    /* JADX INFO: loaded from: classes21.dex */
    public enum Visibility {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean isVisible(Member member) {
            int i = AnonymousClass1.d[ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 3) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (i != 4) {
                if (i != 5) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class d implements JacksonAnnotationValue<JsonAutoDetect>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected static final d f4051b;
        protected static final d d;
        private static final Visibility h;
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Visibility f4052a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Visibility f4053c;
        protected final Visibility e;
        protected final Visibility f;
        protected final Visibility j;

        static {
            Visibility visibility = Visibility.PUBLIC_ONLY;
            h = visibility;
            d = new d(visibility, Visibility.PUBLIC_ONLY, Visibility.PUBLIC_ONLY, Visibility.ANY, Visibility.PUBLIC_ONLY);
            f4051b = new d(Visibility.DEFAULT, Visibility.DEFAULT, Visibility.DEFAULT, Visibility.DEFAULT, Visibility.DEFAULT);
        }

        private d(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this.e = visibility;
            this.f4053c = visibility2;
            this.f = visibility3;
            this.j = visibility4;
            this.f4052a = visibility5;
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JsonAutoDetect> valueFor() {
            return JsonAutoDetect.class;
        }

        public Visibility a() {
            return this.e;
        }

        public Visibility c() {
            return this.f4053c;
        }

        public Visibility e() {
            return this.f;
        }

        public Visibility d() {
            return this.j;
        }

        public Visibility b() {
            return this.f4052a;
        }

        protected Object readResolve() {
            d dVarD = d(this.e, this.f4053c, this.f, this.j, this.f4052a);
            return dVarD == null ? this : dVarD;
        }

        public String toString() {
            return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", this.e, this.f4053c, this.f, this.j, this.f4052a);
        }

        public int hashCode() {
            return ((this.e.ordinal() + 1) ^ (((this.f4053c.ordinal() * 3) - (this.f.ordinal() * 7)) + (this.j.ordinal() * 11))) ^ (this.f4052a.ordinal() * 13);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && c(this, (d) obj);
        }

        private static d d(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            if (visibility == h) {
                d dVar = d;
                if (visibility2 == dVar.f4053c && visibility3 == dVar.f && visibility4 == dVar.j && visibility5 == dVar.f4052a) {
                    return dVar;
                }
                return null;
            }
            if (visibility == Visibility.DEFAULT && visibility2 == Visibility.DEFAULT && visibility3 == Visibility.DEFAULT && visibility4 == Visibility.DEFAULT && visibility5 == Visibility.DEFAULT) {
                return f4051b;
            }
            return null;
        }

        private static boolean c(d dVar, d dVar2) {
            return dVar.e == dVar2.e && dVar.f4053c == dVar2.f4053c && dVar.f == dVar2.f && dVar.j == dVar2.j && dVar.f4052a == dVar2.f4052a;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.annotation.JsonAutoDetect$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4050a;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            f4050a = iArr;
            try {
                iArr[PropertyAccessor.CREATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4050a[PropertyAccessor.FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4050a[PropertyAccessor.GETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4050a[PropertyAccessor.IS_GETTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4050a[PropertyAccessor.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4050a[PropertyAccessor.SETTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4050a[PropertyAccessor.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[Visibility.values().length];
            d = iArr2;
            try {
                iArr2[Visibility.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[Visibility.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[Visibility.NON_PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[Visibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                d[Visibility.PUBLIC_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }
}
