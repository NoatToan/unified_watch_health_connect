package org.junit.experimental.categories;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes23.dex */
public class Categories extends Suite {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ExcludeCategory {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface IncludeCategory {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    public Categories(Class<?> cls, RunnerBuilder runnerBuilder) throws InitializationError {
        super(cls, runnerBuilder);
        try {
            filter(CategoryFilter.categoryFilter(u(cls), r(cls), t(cls), q(cls)));
            m(getDescription());
        } catch (NoTestsRemainException e) {
            throw new InitializationError(e);
        }
    }

    private static void m(Description description) throws InitializationError {
        if (!o(description)) {
            n(description);
        }
        Iterator<Description> it2 = description.getChildren().iterator();
        while (it2.hasNext()) {
            m(it2.next());
        }
    }

    private static void n(Description description) throws InitializationError {
        for (Description description2 : description.getChildren()) {
            if (description2.getAnnotation(Category.class) != null) {
                throw new InitializationError("Category annotations on Parameterized classes are not supported on individual methods.");
            }
            n(description2);
        }
    }

    private static boolean o(Description description) {
        Iterator<Description> it2 = description.getChildren().iterator();
        while (it2.hasNext()) {
            if (it2.next().getTestClass() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<Class<?>> p(Class<?>... clsArr) {
        HashSet hashSet = new HashSet();
        if (clsArr != null) {
            Collections.addAll(hashSet, clsArr);
        }
        return hashSet;
    }

    private static Set<Class<?>> q(Class<?> cls) {
        ExcludeCategory excludeCategory = (ExcludeCategory) cls.getAnnotation(ExcludeCategory.class);
        return p(excludeCategory == null ? null : excludeCategory.value());
    }

    private static Set<Class<?>> r(Class<?> cls) {
        IncludeCategory includeCategory = (IncludeCategory) cls.getAnnotation(IncludeCategory.class);
        return p(includeCategory == null ? null : includeCategory.value());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(Set<Class<?>> set, Class<?> cls) {
        Iterator<Class<?>> it2 = set.iterator();
        while (it2.hasNext()) {
            if (cls.isAssignableFrom(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean t(Class<?> cls) {
        ExcludeCategory excludeCategory = (ExcludeCategory) cls.getAnnotation(ExcludeCategory.class);
        return excludeCategory == null || excludeCategory.matchAny();
    }

    private static boolean u(Class<?> cls) {
        IncludeCategory includeCategory = (IncludeCategory) cls.getAnnotation(IncludeCategory.class);
        return includeCategory == null || includeCategory.matchAny();
    }

    public static class CategoryFilter extends Filter {
        private final Set<Class<?>> a;
        private final Set<Class<?>> b;
        private final boolean c;
        private final boolean d;

        public CategoryFilter(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            this.c = z;
            this.d = z2;
            this.a = b(set);
            this.b = b(set2);
        }

        private static Set<Class<?>> a(Description description) {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, c(description));
            Collections.addAll(hashSet, c(h(description)));
            return hashSet;
        }

        private static Set<Class<?>> b(Set<Class<?>> set) {
            HashSet hashSet = new HashSet();
            if (set != null) {
                hashSet.addAll(set);
            }
            hashSet.remove(null);
            return hashSet;
        }

        private static Class<?>[] c(Description description) {
            if (description == null) {
                return new Class[0];
            }
            Category category = (Category) description.getAnnotation(Category.class);
            return category == null ? new Class[0] : category.value();
        }

        public static CategoryFilter categoryFilter(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            return new CategoryFilter(z, set, z2, set2);
        }

        private boolean d(Description description) {
            Set<Class<?>> setA = a(description);
            if (setA.isEmpty()) {
                return this.a.isEmpty();
            }
            if (!this.b.isEmpty()) {
                if (this.d) {
                    if (g(setA, this.b)) {
                        return false;
                    }
                } else if (f(setA, this.b)) {
                    return false;
                }
            }
            if (this.a.isEmpty()) {
                return true;
            }
            return this.c ? g(setA, this.a) : f(setA, this.a);
        }

        private static boolean e(Class<?>... clsArr) {
            if (clsArr == null) {
                return false;
            }
            for (Class<?> cls : clsArr) {
                if (cls == null) {
                    return true;
                }
            }
            return false;
        }

        public static CategoryFilter exclude(boolean z, Class<?>... clsArr) {
            if (e(clsArr)) {
                throw new NullPointerException("has null category");
            }
            return categoryFilter(true, null, z, Categories.p(clsArr));
        }

        private boolean f(Set<Class<?>> set, Set<Class<?>> set2) {
            Iterator<Class<?>> it2 = set2.iterator();
            while (it2.hasNext()) {
                if (!Categories.s(set, it2.next())) {
                    return false;
                }
            }
            return true;
        }

        private boolean g(Set<Class<?>> set, Set<Class<?>> set2) {
            Iterator<Class<?>> it2 = set2.iterator();
            while (it2.hasNext()) {
                if (Categories.s(set, it2.next())) {
                    return true;
                }
            }
            return false;
        }

        private static Description h(Description description) {
            Class<?> testClass = description.getTestClass();
            if (testClass == null) {
                return null;
            }
            return Description.createSuiteDescription(testClass);
        }

        public static CategoryFilter include(boolean z, Class<?>... clsArr) {
            if (e(clsArr)) {
                throw new NullPointerException("has null category");
            }
            return categoryFilter(z, Categories.p(clsArr), true, null);
        }

        @Override // org.junit.runner.manipulation.Filter
        public String describe() {
            return toString();
        }

        @Override // org.junit.runner.manipulation.Filter
        public boolean shouldRun(Description description) {
            if (d(description)) {
                return true;
            }
            Iterator<Description> it2 = description.getChildren().iterator();
            while (it2.hasNext()) {
                if (shouldRun(it2.next())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("categories ");
            sb.append(this.a.isEmpty() ? "[all]" : this.a);
            if (!this.b.isEmpty()) {
                sb.append(" - ");
                sb.append(this.b);
            }
            return sb.toString();
        }

        public static CategoryFilter exclude(Class<?> cls) {
            return exclude(true, cls);
        }

        public static CategoryFilter include(Class<?> cls) {
            return include(true, cls);
        }

        public static CategoryFilter exclude(Class<?>... clsArr) {
            return exclude(true, clsArr);
        }

        public static CategoryFilter include(Class<?>... clsArr) {
            return include(true, clsArr);
        }
    }
}
