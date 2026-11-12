package com.huami.devicex.manager;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/huami/devicex/manager/BaseFlavorFactory;", "K", "Lcom/huami/devicex/manager/AbsFlavorFactory;", "create", "()Ljava/lang/Object;", "", "id", "otherCase", "(I)Ljava/lang/Object;", "createMifit", "createZepp", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class BaseFlavorFactory<K> implements AbsFlavorFactory<K> {
    @Override // com.huami.devicex.manager.AbsFlavorFactory
    public K create() {
        Flavor flavorFindFlavor = DeviceXFunctionsKt.getFlavorService().findFlavor();
        int id = flavorFindFlavor.getId();
        if (id != 1) {
            return id != 2 ? otherCase(flavorFindFlavor.getId()) : createMifit();
        }
        return createZepp();
    }

    public abstract K createMifit();

    public abstract K createZepp();

    public final K otherCase(int id) throws Exception {
        throw new Exception("未处理此种情况");
    }
}
