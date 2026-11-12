package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypu implements KfsConstraintValidator<KfsSize, int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53740b;
    private String e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.f53739a = kfsSize.min();
        this.f53740b = kfsSize.max();
        this.e = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean isValid(int[] iArr) {
        if (iArr == null) {
            return true;
        }
        int length = iArr.length;
        return length >= this.f53739a && length <= this.f53740b;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.e;
    }
}
