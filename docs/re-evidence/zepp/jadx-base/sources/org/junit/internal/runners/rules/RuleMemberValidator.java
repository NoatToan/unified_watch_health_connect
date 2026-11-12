package org.junit.internal.runners.rules;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.MethodRule;
import org.junit.rules.TestRule;
import org.junit.runners.model.FrameworkMember;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes23.dex */
public class RuleMemberValidator {
    public static final RuleMemberValidator CLASS_RULE_METHOD_VALIDATOR;
    public static final RuleMemberValidator CLASS_RULE_VALIDATOR;
    public static final RuleMemberValidator RULE_METHOD_VALIDATOR;
    public static final RuleMemberValidator RULE_VALIDATOR;
    private final Class<? extends Annotation> a;
    private final boolean b;
    private final List<k> c;

    public static class b {
        private final Class<? extends Annotation> a;
        private boolean b;
        private final List<k> c;

        public RuleMemberValidator d() {
            return new RuleMemberValidator(this);
        }

        public b e() {
            this.b = true;
            return this;
        }

        public b f(k kVar) {
            this.c.add(kVar);
            return this;
        }

        private b(Class<? extends Annotation> cls) {
            this.a = cls;
            this.b = false;
            this.c = new ArrayList();
        }
    }

    public static final class c implements k {
        private c() {
        }

        private boolean b(FrameworkMember<?> frameworkMember) {
            return Modifier.isPublic(frameworkMember.getDeclaringClass().getModifiers());
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.k
        public void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (b(frameworkMember)) {
                return;
            }
            list.add(new org.junit.internal.runners.rules.a(frameworkMember, cls, "must be declared in a public class."));
        }
    }

    public static final class d implements k {
        private d() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.k
        public void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (RuleMemberValidator.f(frameworkMember)) {
                return;
            }
            list.add(new org.junit.internal.runners.rules.a(frameworkMember, cls, "must implement MethodRule or TestRule."));
        }
    }

    public static final class e implements k {
        private e() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.k
        public void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (RuleMemberValidator.g(frameworkMember)) {
                return;
            }
            list.add(new org.junit.internal.runners.rules.a(frameworkMember, cls, "must implement TestRule."));
        }
    }

    public static final class f implements k {
        private f() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.k
        public void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            boolean zE = RuleMemberValidator.e(frameworkMember);
            boolean z = frameworkMember.getAnnotation(ClassRule.class) != null;
            if (frameworkMember.isStatic()) {
                if (zE || !z) {
                    list.add(new org.junit.internal.runners.rules.a(frameworkMember, cls, RuleMemberValidator.e(frameworkMember) ? "must not be static." : "must not be static or it must be annotated with @ClassRule."));
                }
            }
        }
    }

    public static final class g implements k {
        private g() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.k
        public void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (frameworkMember.isPublic()) {
                return;
            }
            list.add(new org.junit.internal.runners.rules.a(frameworkMember, cls, "must be public."));
        }
    }

    public static final class h implements k {
        private h() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.k
        public void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (frameworkMember.isStatic()) {
                return;
            }
            list.add(new org.junit.internal.runners.rules.a(frameworkMember, cls, "must be static."));
        }
    }

    public static final class i implements k {
        private i() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.k
        public void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (RuleMemberValidator.f(frameworkMember)) {
                return;
            }
            list.add(new org.junit.internal.runners.rules.a(frameworkMember, cls, "must return an implementation of MethodRule or TestRule."));
        }
    }

    public static final class j implements k {
        private j() {
        }

        @Override // org.junit.internal.runners.rules.RuleMemberValidator.k
        public void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (RuleMemberValidator.g(frameworkMember)) {
                return;
            }
            list.add(new org.junit.internal.runners.rules.a(frameworkMember, cls, "must return an implementation of TestRule."));
        }
    }

    public interface k {
        void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list);
    }

    static {
        CLASS_RULE_VALIDATOR = d().f(new c()).f(new h()).f(new g()).f(new e()).d();
        RULE_VALIDATOR = h().f(new f()).f(new g()).f(new d()).d();
        CLASS_RULE_METHOD_VALIDATOR = d().e().f(new c()).f(new h()).f(new g()).f(new j()).d();
        RULE_METHOD_VALIDATOR = h().e().f(new f()).f(new g()).f(new i()).d();
    }

    public RuleMemberValidator(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
    }

    private static b d() {
        return new b(ClassRule.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(FrameworkMember<?> frameworkMember) {
        return MethodRule.class.isAssignableFrom(frameworkMember.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(FrameworkMember<?> frameworkMember) {
        return e(frameworkMember) || g(frameworkMember);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(FrameworkMember<?> frameworkMember) {
        return TestRule.class.isAssignableFrom(frameworkMember.getType());
    }

    private static b h() {
        return new b(Rule.class);
    }

    private void i(FrameworkMember<?> frameworkMember, List<Throwable> list) {
        Iterator<k> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().a(frameworkMember, this.a, list);
        }
    }

    public void validate(TestClass testClass, List<Throwable> list) {
        Iterator it2 = (this.b ? testClass.getAnnotatedMethods(this.a) : testClass.getAnnotatedFields(this.a)).iterator();
        while (it2.hasNext()) {
            i((FrameworkMember) it2.next(), list);
        }
    }
}
