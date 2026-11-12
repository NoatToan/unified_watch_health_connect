package defpackage;

import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel;

/* JADX INFO: loaded from: classes16.dex */
public class qna {
    public static boolean e(IStorageModel iStorageModel) {
        if (iStorageModel instanceof StorageGenericModel) {
            return ((StorageGenericModel) iStorageModel).b() instanceof StorageGenericModel.c;
        }
        return false;
    }
}
