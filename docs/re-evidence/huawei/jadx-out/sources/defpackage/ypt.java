package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypt implements KfsConstraintValidator<KfsSize, char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53738c;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.f53737b = kfsSize.min();
        this.f53736a = kfsSize.max();
        this.f53738c = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isValid(char[] cArr) {
        if (cArr == null) {
            return true;
        }
        int length = cArr.length;
        return length >= this.f53737b && length <= this.f53736a;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53738c;
    }
}
