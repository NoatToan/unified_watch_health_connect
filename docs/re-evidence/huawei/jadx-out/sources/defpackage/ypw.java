package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsIn;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsIntegerRange;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsLongRange;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsMax;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsMin;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotBlank;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotEmpty;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotNull;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringNotEmpty;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringRange;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringRegex;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import com.huawei.wisesecurity.kfs.validation.core.ValidatorDescriptor;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class ypw {
    private static final Map<Class<? extends Annotation>, ValidatorDescriptor<?>> d;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        d = concurrentHashMap;
        concurrentHashMap.put(KfsNotNull.class, new yqc(yop.class));
        concurrentHashMap.put(KfsNotEmpty.class, new yqc(yos.class, ypa.class, yox.class, yoz.class, yow.class, yoy.class, ypf.class, ypb.class, ypd.class, ype.class, yph.class, ypc.class));
        concurrentHashMap.put(KfsIn.class, new yqc(yov.class, you.class, yot.class, yor.class));
        concurrentHashMap.put(KfsSize.class, new yqc(ypp.class, ypn.class, ypm.class, ypo.class, ypl.class, ypt.class, yps.class, ypq.class, ypu.class, ypr.class, ypv.class, ypz.class));
        concurrentHashMap.put(KfsNotBlank.class, new yqc(yom.class));
        concurrentHashMap.put(KfsMin.class, new yqc(ypk.class, ypi.class));
        concurrentHashMap.put(KfsMax.class, new yqc(ypg.class, ypj.class));
        concurrentHashMap.put(KfsIntegerRange.class, new yqc(yok.class));
        concurrentHashMap.put(KfsLongRange.class, new yqc(yoh.class));
        concurrentHashMap.put(KfsStringRange.class, new yqc(yoq.class));
        concurrentHashMap.put(KfsStringNotEmpty.class, new yqc(yoo.class));
        concurrentHashMap.put(KfsStringRegex.class, new yqc(yon.class));
    }

    public static <A extends Annotation> Class<? extends KfsConstraintValidator<A, ?>> e(Class<A> cls, Class<?> cls2) throws yny {
        Class<? extends KfsConstraintValidator<A, ?>> validator = d.get(cls).getValidator(cls2);
        if (validator != null) {
            return validator;
        }
        throw new yny("unsupported target class:" + cls2.getSimpleName() + " for constraint:" + cls.getSimpleName());
    }
}
