package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class yps implements KfsConstraintValidator<KfsSize, double[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53735b;
    private String e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.f53735b = kfsSize.min();
        this.f53734a = kfsSize.max();
        this.e = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean isValid(double[] dArr) {
        if (dArr == null) {
            return true;
        }
        int length = dArr.length;
        return length >= this.f53735b && length <= this.f53734a;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.e;
    }
}
