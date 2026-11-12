package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kvu f39556a;

    private kwl() {
        this.f39556a = kvu.a();
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kwl f39557c = new kwl();
    }

    public static kwl e() {
        return e.f39557c;
    }

    public long c(int i, long j, int i2, long j2) {
        if (!b(i, j, i2, j2)) {
            return this.f39556a.insert(kvw.c(i, j, i2, j2));
        }
        LogUtil.a("HiH_DataBusinessRelationManager", "insertBusinessDataRelation data exist.");
        return 0L;
    }

    public boolean b(int i, long j, int i2, long j2) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("business_type =? and business_id =? and relation_type =? and relation_id =? ");
        String[] strArr = {Integer.toString(i), Long.toString(j), Integer.toString(i2), Long.toString(j2)};
        LogUtil.d("HiH_DataBusinessRelationManager", "queryBusinessRelationExist() selector = ", stringBuffer, ",selectorAgs = ", HiJsonUtil.d(strArr));
        return kwf.m(this.f39556a.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> b(int i, long j, int i2) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("relation_id =? and relation_type =? and business_type =? ");
        String[] strArr = {Long.toString(j), Integer.toString(i), Integer.toString(i2)};
        LogUtil.d("HiH_DataBusinessRelationManager", "queryBusinessIdByRelationId() selector = ", stringBuffer, ",selectAgs = ", HiJsonUtil.d(strArr));
        return kwf.c(this.f39556a.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiHealthData> b(long j, int i) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("business_id =? and business_type =? ");
        return kwf.c(this.f39556a.query(stringBuffer.toString(), new String[]{Long.toString(j), Long.toString(i)}, null, null, null));
    }

    public int b(long j) {
        return this.f39556a.delete("relation_id =? ", new String[]{Long.toString(j)});
    }
}
