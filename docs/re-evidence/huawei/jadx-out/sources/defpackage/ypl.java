package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypl implements KfsConstraintValidator<KfsSize, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53722a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53723c;
    private int e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.f53722a = kfsSize.min();
        this.e = kfsSize.max();
        this.f53723c = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean isValid(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        int length = bArr.length;
        return length >= this.f53722a && length <= this.e;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53723c;
    }
}
