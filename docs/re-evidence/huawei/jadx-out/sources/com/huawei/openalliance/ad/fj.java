package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.PlacementRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fj extends es implements gg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18796c = new byte[0];
    private static final byte[] d = new byte[0];
    private static fj e;

    @Override // com.huawei.openalliance.ad.gg
    public void b(String str) {
        a(PlacementRecord.class, fq.PLACEMENT_BY_ID_WHERE, new String[]{str});
    }

    @Override // com.huawei.openalliance.ad.gg
    public void b(PlacementRecord placementRecord) {
        if (placementRecord == null) {
            return;
        }
        synchronized (d) {
            String strA = placementRecord.a();
            if (a(strA) != null) {
                a(PlacementRecord.class, placementRecord.d(this.f18718a), fq.PLACEMENT_BY_ID_WHERE, new String[]{strA});
            } else {
                a(placementRecord);
            }
        }
    }

    public void a(PlacementRecord placementRecord) {
        a(PlacementRecord.class, placementRecord.d(this.f18718a));
    }

    @Override // com.huawei.openalliance.ad.gg
    public List<String> a() {
        return a(a(PlacementRecord.class, new String[]{"contentId"}, null, null, null, null));
    }

    @Override // com.huawei.openalliance.ad.gg
    public PlacementRecord a(String str) {
        List listA = a(PlacementRecord.class, null, fq.PLACEMENT_BY_ID_WHERE, new String[]{str}, null, null);
        if (listA.isEmpty()) {
            return null;
        }
        return (PlacementRecord) listA.get(0);
    }

    private List<String> a(List<PlacementRecord> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<PlacementRecord> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    public static fj a(Context context) {
        fj fjVar;
        synchronized (f18796c) {
            if (e == null) {
                e = new fj(context);
            }
            fjVar = e;
        }
        return fjVar;
    }

    protected fj(Context context) {
        super(context);
    }
}
