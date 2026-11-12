package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class tu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20292a = "tu";

    private static void a(Context context, ContentRecord contentRecord, List<com.huawei.openalliance.ad.uriaction.interfaces.a> list) {
        if (contentRecord == null || contentRecord.j() == null || !com.huawei.openalliance.ad.utils.i.a(context, contentRecord.j().Q())) {
            return;
        }
        list.add(new tg(context, contentRecord));
        hw.a(f20292a, "add agent action success");
    }

    private static List<com.huawei.openalliance.ad.uriaction.interfaces.a> a(Context context, ContentRecord contentRecord, Map<String, String> map, List<Integer> list) {
        com.huawei.openalliance.ad.uriaction.interfaces.a tqVar;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        a(context, contentRecord, arrayList);
        for (Integer num : list) {
            switch (num.intValue()) {
                case 0:
                    tqVar = new tq();
                    break;
                case 1:
                    tqVar = new tp(context, contentRecord, false, map);
                    break;
                case 2:
                    tqVar = new to(context, contentRecord, map);
                    break;
                case 3:
                    tqVar = new th(context, contentRecord);
                    break;
                case 4:
                    tqVar = new tp(context, contentRecord, true, map);
                    break;
                case 5:
                    tqVar = new ts(context, contentRecord);
                    break;
                case 6:
                    tqVar = new tj(context, contentRecord);
                    break;
                case 7:
                    tqVar = new ti(context, contentRecord);
                    break;
                case 8:
                    tqVar = new tr(context, contentRecord, map);
                    break;
                case 9:
                    tqVar = new tt(context, contentRecord, map);
                    break;
                case 10:
                case 13:
                case 14:
                default:
                    hw.c(f20292a, "unsupport action:" + num);
                    tqVar = null;
                    break;
                case 11:
                    tqVar = new tm(context, contentRecord);
                    break;
                case 12:
                    tqVar = new tl(context, contentRecord);
                    break;
                case 15:
                    tqVar = new tk(context, contentRecord);
                    break;
            }
            if (tqVar != null) {
                tqVar.b(num.intValue());
                arrayList.add(tqVar);
            }
        }
        return arrayList;
    }

    public static com.huawei.openalliance.ad.uriaction.interfaces.a a(Context context, ContentRecord contentRecord, Map<String, String> map) {
        if (context == null || contentRecord == null || map == null) {
            return new tq();
        }
        List<com.huawei.openalliance.ad.uriaction.interfaces.a> listA = a(context, contentRecord, map, contentRecord.O());
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return new tq();
        }
        com.huawei.openalliance.ad.uriaction.interfaces.a aVar = null;
        for (com.huawei.openalliance.ad.uriaction.interfaces.a aVar2 : listA) {
            if (aVar != null) {
                aVar.a(aVar2);
            }
            aVar = aVar2;
        }
        return listA.get(0);
    }
}
