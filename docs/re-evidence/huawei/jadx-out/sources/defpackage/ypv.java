package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypv implements KfsConstraintValidator<KfsSize, short[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53742c;
    private String e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.f53741b = kfsSize.min();
        this.f53742c = kfsSize.max();
        this.e = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean isValid(short[] sArr) {
        if (sArr == null) {
            return true;
        }
        int length = sArr.length;
        return length >= this.f53741b && length <= this.f53742c;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.e;
    }
}
