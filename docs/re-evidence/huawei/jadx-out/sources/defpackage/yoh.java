package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsLongRange;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class yoh implements KfsConstraintValidator<KfsLongRange, Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f53697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53698c;
    private String d;
    private Long e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsLongRange kfsLongRange) throws yny {
        this.e = Long.valueOf(kfsLongRange.min());
        this.f53697b = Long.valueOf(kfsLongRange.max());
        this.d = str;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Long l) {
        if (l == null) {
            this.f53698c = this.d + " is null";
            return false;
        }
        if (l.longValue() < this.e.longValue()) {
            this.f53698c = this.d + " must >= " + this.e;
            return false;
        }
        if (l.longValue() <= this.f53697b.longValue()) {
            return true;
        }
        this.f53698c = this.d + " must <= " + this.f53697b;
        return false;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53698c;
    }
}
