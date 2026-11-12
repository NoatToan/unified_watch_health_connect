package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsMax;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypg implements KfsConstraintValidator<KfsMax, Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f53716c;
    private String e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsMax kfsMax) {
        this.e = yoi.e(kfsMax, str);
        this.f53716c = kfsMax.value();
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Integer num) {
        if (num == null || this.f53716c >= 2147483647L) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53716c);
        sb.append("");
        return num.compareTo(Integer.valueOf(Integer.parseInt(sb.toString()))) <= 0;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.e;
    }
}
