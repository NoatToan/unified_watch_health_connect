package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringRange;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class yoq implements KfsConstraintValidator<KfsStringRange, String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53704c;
    private int d;
    private int e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsStringRange kfsStringRange) throws yny {
        this.d = kfsStringRange.min();
        this.e = kfsStringRange.max();
        this.f53704c = str;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean isValid(String str) {
        if (str == null) {
            this.f53703b = this.f53704c + " is null";
            return false;
        }
        if (str.length() < this.d) {
            this.f53703b = this.f53704c + " length must >= " + this.d;
            return false;
        }
        if (str.length() <= this.e) {
            return true;
        }
        this.f53703b = this.f53704c + " length must <= " + this.e;
        return false;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53703b;
    }
}
