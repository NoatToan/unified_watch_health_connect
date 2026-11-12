package defpackage;

import com.huawei.ui.commonui.base.Consumable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes43.dex */
public class uxe implements Consumable<uxf>, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private uxf f50699a;
    private Consumable.ConsumableType e;

    public uxe(Consumable.ConsumableType consumableType, uxf uxfVar) {
        this.e = consumableType;
        this.f50699a = uxfVar;
    }

    @Override // com.huawei.ui.commonui.base.Consumable
    public Consumable.ConsumableType getType() {
        return this.e;
    }

    @Override // com.huawei.ui.commonui.base.Consumable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public uxf getData() {
        return this.f50699a;
    }
}
