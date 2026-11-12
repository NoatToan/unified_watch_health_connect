package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotEmpty;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class yoz implements KfsConstraintValidator<KfsNotEmpty, boolean[]> {
    private String e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsNotEmpty kfsNotEmpty) {
        this.e = yoi.a(kfsNotEmpty, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isValid(boolean[] zArr) {
        return zArr == null || zArr.length > 0;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.e;
    }
}
