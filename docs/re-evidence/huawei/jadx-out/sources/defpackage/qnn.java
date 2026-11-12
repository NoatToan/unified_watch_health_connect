package defpackage;

import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.model.MultiDataBarModel;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel;

/* JADX INFO: loaded from: classes16.dex */
public class qnn {
    public static float d(IStorageModel iStorageModel) {
        if (qna.e(iStorageModel)) {
            return 0.0f;
        }
        return c(iStorageModel);
    }

    public static float g(IStorageModel iStorageModel) {
        if (qna.e(iStorageModel)) {
            return 0.0f;
        }
        return c(iStorageModel);
    }

    public static float b(IStorageModel iStorageModel) {
        if (qna.e(iStorageModel)) {
            return 0.0f;
        }
        if (iStorageModel instanceof qmf) {
            return ((qmf) iStorageModel).c();
        }
        if (iStorageModel instanceof StorageGenericModel) {
            StorageGenericModel.PresentStyle presentStyleB = ((StorageGenericModel) iStorageModel).b();
            if (!(presentStyleB instanceof StorageGenericModel.a)) {
                throw new RuntimeException("parseBarFloor IStorageModel found presentStyle not bar");
            }
            return ((StorageGenericModel.a) presentStyleB).a();
        }
        if (iStorageModel instanceof qmr) {
            return ((qmr) iStorageModel).c();
        }
        if (iStorageModel instanceof MultiDataBarModel) {
            return 0.0f;
        }
        throw new RuntimeException("parseBarFloor failed");
    }

    public static float f(IStorageModel iStorageModel) {
        if (qna.e(iStorageModel)) {
            return 0.0f;
        }
        if (iStorageModel instanceof qmq) {
            return ((qmq) iStorageModel).e();
        }
        if (iStorageModel instanceof StorageGenericModel) {
            StorageGenericModel.PresentStyle presentStyleB = ((StorageGenericModel) iStorageModel).b();
            if (!(presentStyleB instanceof StorageGenericModel.d)) {
                throw new RuntimeException("parseLineValue IStorageModel found presentStyle not bar");
            }
            return ((StorageGenericModel.d) presentStyleB).d();
        }
        throw new RuntimeException("parseLineValue failed");
    }

    public static int a(IStorageModel iStorageModel) {
        if (qna.e(iStorageModel)) {
            return 0;
        }
        if (iStorageModel instanceof qmr) {
            return ((qmr) iStorageModel).a();
        }
        if (iStorageModel instanceof qmf) {
            return ((qmf) iStorageModel).f();
        }
        return 0;
    }

    public static int e(IStorageModel iStorageModel) {
        if (qna.e(iStorageModel)) {
            return 0;
        }
        if (iStorageModel instanceof qmr) {
            return ((qmr) iStorageModel).e();
        }
        if (iStorageModel instanceof qmf) {
            return ((qmf) iStorageModel).i();
        }
        return 0;
    }

    public static float c(IStorageModel iStorageModel) {
        if (iStorageModel instanceof qmf) {
            return ((qmf) iStorageModel).b();
        }
        if (iStorageModel instanceof StorageGenericModel) {
            StorageGenericModel.PresentStyle presentStyleB = ((StorageGenericModel) iStorageModel).b();
            if (!(presentStyleB instanceof StorageGenericModel.a)) {
                throw new RuntimeException("parseBarCeil IStorageModel found presentStyle not bar");
            }
            return ((StorageGenericModel.a) presentStyleB).c();
        }
        if (iStorageModel instanceof qmr) {
            return ((qmr) iStorageModel).c();
        }
        if (iStorageModel instanceof MultiDataBarModel) {
            return ((MultiDataBarModel) iStorageModel).getCeil();
        }
        throw new RuntimeException("parseBarCeil failed");
    }
}
