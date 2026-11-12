package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsIntegerRange;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class yok implements KfsConstraintValidator<KfsIntegerRange, Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53700c;
    private int d;
    private int e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsIntegerRange kfsIntegerRange) throws yny {
        this.e = kfsIntegerRange.min();
        this.d = kfsIntegerRange.max();
        this.f53699b = str;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Integer num) {
        if (num == null) {
            this.f53700c = this.f53699b + " is null";
            return false;
        }
        if (this.e > num.intValue()) {
            this.f53700c = this.f53699b + " must >= " + this.e;
            return false;
        }
        if (this.d >= num.intValue()) {
            return true;
        }
        this.f53700c = this.f53699b + " must <= " + this.d;
        return false;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53700c;
    }
}
