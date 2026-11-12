package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotEmpty;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ype implements KfsConstraintValidator<KfsNotEmpty, long[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53714b;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsNotEmpty kfsNotEmpty) {
        this.f53714b = yoi.a(kfsNotEmpty, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean isValid(long[] jArr) {
        return jArr == null || jArr.length > 0;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53714b;
    }
}
