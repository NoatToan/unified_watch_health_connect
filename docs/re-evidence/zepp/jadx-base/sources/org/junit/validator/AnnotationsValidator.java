package org.junit.validator;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.Annotatable;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes23.dex */
public final class AnnotationsValidator implements TestClassValidator {
    private static final List<b<?>> a;

    public static abstract class b<T extends Annotatable> {
        private static final AnnotationValidatorFactory a = new AnnotationValidatorFactory();

        private b() {
        }

        private List<Exception> b(T t) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : t.getAnnotations()) {
                ValidateWith validateWith = (ValidateWith) annotation.annotationType().getAnnotation(ValidateWith.class);
                if (validateWith != null) {
                    arrayList.addAll(c(a.createAnnotationValidator(validateWith), t));
                }
            }
            return arrayList;
        }

        public abstract Iterable<T> a(TestClass testClass);

        public abstract List<Exception> c(AnnotationValidator annotationValidator, T t);

        public List<Exception> d(TestClass testClass) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = a(testClass).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(b(it2.next()));
            }
            return arrayList;
        }
    }

    public static class c extends b<TestClass> {
        private c() {
            super();
        }

        @Override // org.junit.validator.AnnotationsValidator.b
        public Iterable<TestClass> a(TestClass testClass) {
            return Collections.singletonList(testClass);
        }

        @Override // org.junit.validator.AnnotationsValidator.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<Exception> c(AnnotationValidator annotationValidator, TestClass testClass) {
            return annotationValidator.validateAnnotatedClass(testClass);
        }
    }

    public static class d extends b<FrameworkField> {
        private d() {
            super();
        }

        @Override // org.junit.validator.AnnotationsValidator.b
        public Iterable<FrameworkField> a(TestClass testClass) {
            return testClass.getAnnotatedFields();
        }

        @Override // org.junit.validator.AnnotationsValidator.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<Exception> c(AnnotationValidator annotationValidator, FrameworkField frameworkField) {
            return annotationValidator.validateAnnotatedField(frameworkField);
        }
    }

    public static class e extends b<FrameworkMethod> {
        private e() {
            super();
        }

        @Override // org.junit.validator.AnnotationsValidator.b
        public Iterable<FrameworkMethod> a(TestClass testClass) {
            return testClass.getAnnotatedMethods();
        }

        @Override // org.junit.validator.AnnotationsValidator.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<Exception> c(AnnotationValidator annotationValidator, FrameworkMethod frameworkMethod) {
            return annotationValidator.validateAnnotatedMethod(frameworkMethod);
        }
    }

    static {
        a = Arrays.asList(new c(), new e(), new d());
    }

    @Override // org.junit.validator.TestClassValidator
    public List<Exception> validateTestClass(TestClass testClass) {
        ArrayList arrayList = new ArrayList();
        Iterator<b<?>> it2 = a.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().d(testClass));
        }
        return arrayList;
    }
}
