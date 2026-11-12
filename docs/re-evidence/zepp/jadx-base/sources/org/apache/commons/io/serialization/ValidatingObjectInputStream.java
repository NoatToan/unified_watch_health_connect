package org.apache.commons.io.serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
public class ValidatingObjectInputStream extends ObjectInputStream {
    private final List<ClassNameMatcher> a;
    private final List<ClassNameMatcher> b;

    public ValidatingObjectInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private void a(String str) throws InvalidClassException {
        Iterator<ClassNameMatcher> it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (it2.next().matches(str)) {
                invalidClassNameFound(str);
            }
        }
        boolean z = false;
        Iterator<ClassNameMatcher> it3 = this.a.iterator();
        while (it3.hasNext()) {
            if (it3.next().matches(str)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        invalidClassNameFound(str);
    }

    public ValidatingObjectInputStream accept(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.a.add(new a(cls.getName()));
        }
        return this;
    }

    public void invalidClassNameFound(String str) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    public ValidatingObjectInputStream reject(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.b.add(new a(cls.getName()));
        }
        return this;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        a(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }

    public ValidatingObjectInputStream accept(String... strArr) {
        for (String str : strArr) {
            this.a.add(new c(str));
        }
        return this;
    }

    public ValidatingObjectInputStream reject(String... strArr) {
        for (String str : strArr) {
            this.b.add(new c(str));
        }
        return this;
    }

    public ValidatingObjectInputStream accept(Pattern pattern) {
        this.a.add(new b(pattern));
        return this;
    }

    public ValidatingObjectInputStream reject(Pattern pattern) {
        this.b.add(new b(pattern));
        return this;
    }

    public ValidatingObjectInputStream accept(ClassNameMatcher classNameMatcher) {
        this.a.add(classNameMatcher);
        return this;
    }

    public ValidatingObjectInputStream reject(ClassNameMatcher classNameMatcher) {
        this.b.add(classNameMatcher);
        return this;
    }
}
