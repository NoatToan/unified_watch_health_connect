package defpackage;

import android.content.Context;
import com.huawei.hihealthkit.context.H5ProAppInfo;
import com.huawei.hihealthkit.context.OutOfBandContext;

/* JADX INFO: loaded from: classes10.dex */
public class krn extends OutOfBandContext {
    private H5ProAppInfo d;

    public krn(Context context, H5ProAppInfo h5ProAppInfo) {
        super(context);
        this.d = h5ProAppInfo;
    }

    @Override // com.huawei.hihealthkit.context.OutOfBandContext
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public H5ProAppInfo getOutOfBandData() {
        return this.d;
    }
}
