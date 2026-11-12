package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsConstraint;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsValid;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yqb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<yqd> f53751a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f53752b;
    private final String d;
    private yqa e;

    public yqb(String str, Field field) throws yny {
        this.d = str;
        this.f53752b = field;
        field.setAccessible(true);
        for (Annotation annotation : field.getDeclaredAnnotations()) {
            if (((KfsConstraint) annotation.annotationType().getAnnotation(KfsConstraint.class)) != null) {
                if (annotation.annotationType() != KfsValid.class) {
                    this.f53751a.add(new yqd(d(), annotation, field.getType()));
                } else {
                    this.e = new yqa(str, field.getType());
                }
            }
        }
    }

    private String d() {
        return this.d + "." + this.f53752b.getName();
    }

    public boolean e() {
        return this.f53751a.size() > 0 || this.e != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void a(T t) throws yny {
        try {
            Object obj = this.f53752b.get(t);
            Iterator<yqd> it = this.f53751a.iterator();
            while (it.hasNext()) {
                it.next().c(obj);
            }
            yqa yqaVar = this.e;
            if (yqaVar != 0) {
                yqaVar.d(obj);
            }
        } catch (IllegalAccessException e) {
            throw new yny("field validate failed:" + e.getMessage());
        }
    }
}
