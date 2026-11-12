package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsIn;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class you implements KfsConstraintValidator<KfsIn, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f53709b;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsIn kfsIn) {
        this.f53709b = new ArrayList();
        for (int i : kfsIn.intArr()) {
            this.f53709b.add(Integer.valueOf(i));
        }
        this.f53708a = yoi.b(kfsIn.message(), str + " must in intArr:" + Arrays.toString(kfsIn.intArr()));
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Integer num) {
        if (num == null) {
            return true;
        }
        return this.f53709b.contains(num);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53708a;
    }
}
