package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.UserCloseRecord;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fu extends es implements gn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static fu f18827c;
    private static final byte[] d = new byte[0];

    @Override // com.huawei.openalliance.ad.es
    public void e() {
        super.e();
        a(UserCloseRecord.class, (fq) null, (String[]) null);
    }

    @Override // com.huawei.openalliance.ad.gn
    public void a(UserCloseRecord userCloseRecord) {
        a(UserCloseRecord.class, userCloseRecord.d(this.f18718a));
    }

    @Override // com.huawei.openalliance.ad.gn
    public void a(long j) {
        a(UserCloseRecord.class, fq.USER_CLOSE_DELETE_EXPIRE_WHERE, new String[]{String.valueOf(j)});
    }

    @Override // com.huawei.openalliance.ad.gn
    public List<UserCloseRecord> a(long j, long j2) {
        return a(UserCloseRecord.class, null, fq.USER_CLOSE_QUERY_BY_TIME_WHERE, new String[]{String.valueOf(j), String.valueOf(j2)}, null, null);
    }

    public static fu a(Context context) {
        fu fuVar;
        synchronized (d) {
            if (f18827c == null) {
                f18827c = new fu(context);
            }
            fuVar = f18827c;
        }
        return fuVar;
    }

    private fu(Context context) {
        super(context);
    }
}
