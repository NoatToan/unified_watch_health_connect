package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsIn;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yot implements KfsConstraintValidator<KfsIn, Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Long> f53706a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53707c;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsIn kfsIn) {
        this.f53706a = new ArrayList();
        for (int i : kfsIn.intArr()) {
            this.f53706a.add(Long.valueOf(i));
        }
        this.f53707c = yoi.b(kfsIn.message(), str + " must in intArr:" + Arrays.toString(kfsIn.intArr()));
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Long l) {
        if (l == null) {
            return true;
        }
        return this.f53706a.contains(l);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53707c;
    }
}
