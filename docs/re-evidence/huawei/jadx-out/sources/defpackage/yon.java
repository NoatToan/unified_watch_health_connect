package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringRegex;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class yon implements KfsConstraintValidator<KfsStringRegex, String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53701c;
    private String e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsStringRegex kfsStringRegex) throws yny {
        this.f53701c = kfsStringRegex.regex();
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean isValid(String str) {
        if (str == null) {
            this.e = "string is null";
            return false;
        }
        if (str.matches(this.f53701c)) {
            return true;
        }
        this.e = "value is not match";
        return false;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.e;
    }
}
