package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsMin;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypi implements KfsConstraintValidator<KfsMin, Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f53718a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53719c;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsMin kfsMin) {
        this.f53719c = yoi.e(kfsMin, str);
        this.f53718a = kfsMin.value();
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Long l) {
        return l == null || l.compareTo(Long.valueOf(this.f53718a)) >= 0;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53719c;
    }
}
