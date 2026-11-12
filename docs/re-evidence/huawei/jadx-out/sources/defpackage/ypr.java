package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypr implements KfsConstraintValidator<KfsSize, long[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53733c;
    private String d;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.f53733c = kfsSize.min();
        this.f53732b = kfsSize.max();
        this.d = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean isValid(long[] jArr) {
        if (jArr == null) {
            return true;
        }
        int length = jArr.length;
        return length >= this.f53733c && length <= this.f53732b;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.d;
    }
}
