package defpackage;

import cn.hutool.core.collection.CollUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class bnq extends ObjectInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<String> f4407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<String> f4408b;

    public bnq(InputStream inputStream, Class<?>... clsArr) throws IOException {
        super(inputStream);
        a(clsArr);
    }

    public void a(Class<?>... clsArr) {
        if (this.f4407a == null) {
            this.f4407a = new HashSet();
        }
        for (Class<?> cls : clsArr) {
            this.f4407a.add(cls.getName());
        }
    }

    public final void b(String str) throws InvalidClassException {
        if (CollUtil.j(this.f4408b) && this.f4408b.contains(str)) {
            throw new InvalidClassException("Unauthorized deserialization attempt by black list", str);
        }
        if (!CollUtil.h(this.f4407a) && !str.startsWith("java.") && !this.f4407a.contains(str)) {
            throw new InvalidClassException("Unauthorized deserialization attempt", str);
        }
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        b(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }
}
