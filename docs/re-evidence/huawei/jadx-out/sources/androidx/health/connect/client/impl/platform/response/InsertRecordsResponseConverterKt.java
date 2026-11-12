package androidx.health.connect.client.impl.platform.response;

import androidx.core.view.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.response.InsertRecordsResponse;
import defpackage.yzp;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toKtResponse", "Landroidx/health/connect/client/response/InsertRecordsResponse;", "Landroid/health/connect/InsertRecordsResponse;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InsertRecordsResponseConverterKt {
    public static final InsertRecordsResponse toKtResponse(android.health.connect.InsertRecordsResponse insertRecordsResponse) {
        zcp.c(insertRecordsResponse, "");
        List records = insertRecordsResponse.getRecords();
        zcp.b((Object) records, "");
        List list = records;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String id = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m(it.next()).getMetadata().getId();
            zcp.b((Object) id, "");
            arrayList.add(id);
        }
        return new InsertRecordsResponse(arrayList);
    }
}
