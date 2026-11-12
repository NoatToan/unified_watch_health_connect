package com.huawei.hms.network.file.a;

import com.huawei.hms.network.file.api.Request;
import com.huawei.hms.network.file.core.task.j;
import com.huawei.hms.network.file.download.api.GetRequest;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c extends j<GetRequest, d> {
    public void a(GetRequest getRequest, List<d> list) {
        super.a(getRequest, (List) list);
        if (this.f15762b <= 0) {
            this.f15762b = c(list);
        }
    }

    @Override // com.huawei.hms.network.file.core.task.j
    public /* bridge */ /* synthetic */ void a(Request request, List list) {
        a((GetRequest) request, (List<d>) list);
    }

    @Override // com.huawei.hms.network.file.core.task.j, com.huawei.hms.network.file.core.task.d
    public long a(List<d> list) {
        long jB = b(list);
        long j = this.f;
        long jA = a();
        if (jA == 0) {
            return 0L;
        }
        return (long) (((jB - j) / jA) * 1000.0d);
    }

    public c(com.huawei.hms.network.file.core.task.c cVar) {
        super(cVar);
    }
}
