package defpackage;

import android.content.Context;
import com.huawei.ads.fund.db.BaseDbHelper;
import com.huawei.ads.fund.db.BaseDbUpdateHelper;

/* JADX INFO: loaded from: classes4.dex */
public class axn extends BaseDbHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static axn f755c;
    private static final byte[] d = new byte[0];

    @Override // com.huawei.ads.fund.db.BaseDbHelper
    public boolean needKeepData() {
        return true;
    }

    @Override // com.huawei.ads.fund.db.BaseDbHelper
    public String getTag() {
        return "AdsRecDbHelper";
    }

    @Override // com.huawei.ads.fund.db.BaseDbHelper
    public BaseDbUpdateHelper getDbUpdateHelper() {
        return new axu(this);
    }

    public static axn e(Context context) {
        axn axnVar;
        synchronized (d) {
            if (f755c == null) {
                f755c = new axn(ayp.b(context.getApplicationContext()));
            }
            BaseDbHelper.OPEN_COUNTER.incrementAndGet();
            axnVar = f755c;
        }
        return axnVar;
    }

    private axn(Context context) {
        super(context, "hiad_recd.db", null, 7);
    }
}
