package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypp implements KfsConstraintValidator<KfsSize, CharSequence> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53730b;
    private int e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.e = kfsSize.min();
        this.f53729a = kfsSize.max();
        this.f53730b = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean isValid(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        int length = charSequence.length();
        return length >= this.e && length <= this.f53729a;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53730b;
    }
}
