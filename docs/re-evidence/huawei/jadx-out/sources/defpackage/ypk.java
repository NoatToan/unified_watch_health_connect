package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsMin;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypk implements KfsConstraintValidator<KfsMin, Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53721b;
    private long d;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsMin kfsMin) {
        this.f53721b = yoi.e(kfsMin, str);
        this.d = kfsMin.value();
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Integer num) {
        if (num == null) {
            return true;
        }
        if (this.d >= 2147483647L) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append("");
        return num.compareTo(Integer.valueOf(Integer.parseInt(sb.toString()))) >= 0;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53721b;
    }
}
