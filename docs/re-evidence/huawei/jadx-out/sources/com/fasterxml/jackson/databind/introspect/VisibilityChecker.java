package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import defpackage.acj;
import defpackage.aco;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
public interface VisibilityChecker<T extends VisibilityChecker<T>> {
    boolean isCreatorVisible(AnnotatedMember annotatedMember);

    boolean isCreatorVisible(Member member);

    boolean isFieldVisible(acj acjVar);

    boolean isFieldVisible(Field field);

    boolean isGetterVisible(aco acoVar);

    boolean isGetterVisible(Method method);

    boolean isIsGetterVisible(aco acoVar);

    boolean isIsGetterVisible(Method method);

    boolean isSetterVisible(aco acoVar);

    boolean isSetterVisible(Method method);

    T with(JsonAutoDetect.Visibility visibility);

    T with(JsonAutoDetect jsonAutoDetect);

    T withCreatorVisibility(JsonAutoDetect.Visibility visibility);

    T withFieldVisibility(JsonAutoDetect.Visibility visibility);

    T withGetterVisibility(JsonAutoDetect.Visibility visibility);

    T withIsGetterVisibility(JsonAutoDetect.Visibility visibility);

    T withOverrides(JsonAutoDetect.d dVar);

    T withSetterVisibility(JsonAutoDetect.Visibility visibility);

    T withVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility);

    public static class c implements VisibilityChecker<c>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected static final c f4169c = new c(JsonAutoDetect.Visibility.PUBLIC_ONLY, JsonAutoDetect.Visibility.PUBLIC_ONLY, JsonAutoDetect.Visibility.ANY, JsonAutoDetect.Visibility.ANY, JsonAutoDetect.Visibility.PUBLIC_ONLY);
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final JsonAutoDetect.Visibility f4170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final JsonAutoDetect.Visibility f4171b;
        protected final JsonAutoDetect.Visibility d;
        protected final JsonAutoDetect.Visibility e;
        protected final JsonAutoDetect.Visibility g;

        public static c a() {
            return f4169c;
        }

        public c(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            this.e = visibility;
            this.f4170a = visibility2;
            this.g = visibility3;
            this.f4171b = visibility4;
            this.d = visibility5;
        }

        public c(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                c cVar = f4169c;
                this.e = cVar.e;
                this.f4170a = cVar.f4170a;
                this.g = cVar.g;
                this.f4171b = cVar.f4171b;
                this.d = cVar.d;
                return;
            }
            this.e = visibility;
            this.f4170a = visibility;
            this.g = visibility;
            this.f4171b = visibility;
            this.d = visibility;
        }

        protected c a(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            return (visibility == this.e && visibility2 == this.f4170a && visibility3 == this.g && visibility4 == this.f4171b && visibility5 == this.d) ? this : new c(visibility, visibility2, visibility3, visibility4, visibility5);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c with(JsonAutoDetect jsonAutoDetect) {
            return jsonAutoDetect != null ? a(b(this.e, jsonAutoDetect.getterVisibility()), b(this.f4170a, jsonAutoDetect.isGetterVisibility()), b(this.g, jsonAutoDetect.setterVisibility()), b(this.f4171b, jsonAutoDetect.creatorVisibility()), b(this.d, jsonAutoDetect.fieldVisibility())) : this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c withOverrides(JsonAutoDetect.d dVar) {
            return dVar != null ? a(b(this.e, dVar.c()), b(this.f4170a, dVar.e()), b(this.g, dVar.d()), b(this.f4171b, dVar.b()), b(this.d, dVar.a())) : this;
        }

        private JsonAutoDetect.Visibility b(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2) {
            return visibility2 == JsonAutoDetect.Visibility.DEFAULT ? visibility : visibility2;
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c with(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                return f4169c;
            }
            return new c(visibility);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c withVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
            switch (AnonymousClass3.d[propertyAccessor.ordinal()]) {
                case 1:
                    return withGetterVisibility(visibility);
                case 2:
                    return withSetterVisibility(visibility);
                case 3:
                    return withCreatorVisibility(visibility);
                case 4:
                    return withFieldVisibility(visibility);
                case 5:
                    return withIsGetterVisibility(visibility);
                case 6:
                    return with(visibility);
                default:
                    return this;
            }
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c withGetterVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = f4169c.e;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.e == visibility2 ? this : new c(visibility2, this.f4170a, this.g, this.f4171b, this.d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c withIsGetterVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = f4169c.f4170a;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.f4170a == visibility2 ? this : new c(this.e, visibility2, this.g, this.f4171b, this.d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public c withSetterVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = f4169c.g;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.g == visibility2 ? this : new c(this.e, this.f4170a, visibility2, this.f4171b, this.d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c withCreatorVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = f4169c.f4171b;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.f4171b == visibility2 ? this : new c(this.e, this.f4170a, this.g, visibility2, this.d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c withFieldVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = f4169c.d;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this.d == visibility2 ? this : new c(this.e, this.f4170a, this.g, this.f4171b, visibility2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isCreatorVisible(Member member) {
            return this.f4171b.isVisible(member);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isCreatorVisible(AnnotatedMember annotatedMember) {
            return isCreatorVisible(annotatedMember.getMember());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isFieldVisible(Field field) {
            return this.d.isVisible(field);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isFieldVisible(acj acjVar) {
            return isFieldVisible(acjVar.getAnnotated());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isGetterVisible(Method method) {
            return this.e.isVisible(method);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isGetterVisible(aco acoVar) {
            return isGetterVisible(acoVar.getAnnotated());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isIsGetterVisible(Method method) {
            return this.f4170a.isVisible(method);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isIsGetterVisible(aco acoVar) {
            return isIsGetterVisible(acoVar.getAnnotated());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isSetterVisible(Method method) {
            return this.g.isVisible(method);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isSetterVisible(aco acoVar) {
            return isSetterVisible(acoVar.getAnnotated());
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this.e, this.f4170a, this.g, this.f4171b, this.d);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.VisibilityChecker$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            d = iArr;
            try {
                iArr[PropertyAccessor.GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[PropertyAccessor.SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[PropertyAccessor.CREATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[PropertyAccessor.FIELD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[PropertyAccessor.IS_GETTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[PropertyAccessor.ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
