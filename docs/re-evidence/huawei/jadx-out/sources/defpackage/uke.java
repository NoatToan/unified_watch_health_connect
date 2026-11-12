package defpackage;

import com.huawei.ui.commonui.linechart.common.DataLayerType;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.model.MultiDataBarModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class uke implements IStorageModel, MultiDataBarModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ukc f50287c;
    private Map<DataLayerType, Float> d = new HashMap();

    @Override // com.huawei.ui.commonui.linechart.model.MultiDataBarModel
    public void put(DataLayerType dataLayerType, float f) {
        this.d.put(dataLayerType, Float.valueOf(f));
    }

    @Override // com.huawei.ui.commonui.linechart.model.MultiDataBarModel
    public float getCeil(DataLayerType dataLayerType) {
        if (this.d.get(dataLayerType) != null) {
            return this.d.get(dataLayerType).floatValue();
        }
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.model.MultiDataBarModel
    public float getCeil() {
        ukc ukcVar = this.f50287c;
        if (ukcVar != null) {
            return getCeil(ukcVar.c());
        }
        return 0.0f;
    }

    public void d(ukc ukcVar) {
        this.f50287c = ukcVar;
    }
}
