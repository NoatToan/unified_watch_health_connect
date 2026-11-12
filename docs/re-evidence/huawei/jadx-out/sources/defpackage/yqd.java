package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes20.dex */
public class yqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Annotation f53758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final KfsConstraintValidator f53759c;

    public yqd(String str, Annotation annotation, Class<?> cls) throws yny {
        try {
            this.f53757a = str;
            this.f53758b = annotation;
            this.f53759c = (KfsConstraintValidator) ypw.e(annotation.annotationType(), cls).newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new yny("create constraint meta data for field:" + str + " failed, " + e.getMessage());
        }
    }

    public <T> void c(T t) throws yny {
        KfsConstraintValidator kfsConstraintValidator = this.f53759c;
        if (kfsConstraintValidator == null) {
            return;
        }
        kfsConstraintValidator.initialize(this.f53757a, this.f53758b);
        if (!this.f53759c.isValid(t)) {
            throw new yny(this.f53759c.getMessage());
        }
    }
}
