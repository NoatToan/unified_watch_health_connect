package defpackage;

import com.huawei.ui.commonui.linechart.common.MotionType;
import com.huawei.ui.commonui.linechart.common.MultiMotionBarModel;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class qms implements IStorageModel, MultiMotionBarModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<MotionType, Float> f46495b = new HashMap();

    @Override // com.huawei.ui.commonui.linechart.common.MultiMotionBarModel
    public void put(MotionType motionType, float f) {
        this.f46495b.put(motionType, Float.valueOf(f));
    }

    @Override // com.huawei.ui.commonui.linechart.common.MultiMotionBarModel
    public float getMotionType(MotionType motionType) {
        if (this.f46495b.get(motionType) != null) {
            return this.f46495b.get(motionType).floatValue();
        }
        return 0.0f;
    }
}
