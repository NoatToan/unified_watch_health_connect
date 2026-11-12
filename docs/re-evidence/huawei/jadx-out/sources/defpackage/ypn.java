package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import java.util.Collection;

/* JADX INFO: loaded from: classes20.dex */
public class ypn implements KfsConstraintValidator<KfsSize, Collection> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53726a;
    private int d;
    private int e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.d = kfsSize.min();
        this.e = kfsSize.max();
        this.f53726a = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Collection collection) {
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        return size >= this.d && size <= this.e;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53726a;
    }
}
