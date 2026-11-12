package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsIn;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yov implements KfsConstraintValidator<KfsIn, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53710a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f53711c;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsIn kfsIn) {
        this.f53711c = Arrays.asList(kfsIn.strArr());
        this.f53710a = yoi.b(kfsIn.message(), str + " must in strArr:" + Arrays.toString(kfsIn.strArr()));
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isValid(String str) {
        if (str == null) {
            return true;
        }
        return this.f53711c.contains(str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53710a;
    }
}
