package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nqw extends nqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dataType")
    private List<DataType> f43493a;

    public List<DataType> h() {
        return this.f43493a;
    }

    public int[] f() {
        ArrayList arrayList = new ArrayList();
        Iterator<DataType> it = this.f43493a.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getmId()));
        }
        return CommonUtil.c((List<Integer>) arrayList);
    }

    @Override // defpackage.nqp
    public String toString() {
        return "SamplePointDeleteRequest{dataTypes=" + this.f43493a + '}';
    }
}
