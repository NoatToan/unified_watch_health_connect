package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsMax;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypj implements KfsConstraintValidator<KfsMax, Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f53720c;
    private String d;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsMax kfsMax) {
        this.d = yoi.e(kfsMax, str);
        this.f53720c = kfsMax.value();
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Long l) {
        return l == null || l.compareTo(Long.valueOf(this.f53720c)) <= 0;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.d;
    }
}
