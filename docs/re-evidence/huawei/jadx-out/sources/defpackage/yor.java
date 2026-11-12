package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsIn;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yor implements KfsConstraintValidator<KfsIn, Short> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53705b;
    private List<Integer> d;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsIn kfsIn) {
        this.d = new ArrayList();
        for (int i : kfsIn.intArr()) {
            this.d.add(Integer.valueOf(i));
        }
        this.f53705b = yoi.b(kfsIn.message(), str + " must in intArr:" + Arrays.toString(kfsIn.intArr()));
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Short sh) {
        if (sh == null) {
            return true;
        }
        return this.d.contains(Integer.valueOf(sh.shortValue()));
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53705b;
    }
}
