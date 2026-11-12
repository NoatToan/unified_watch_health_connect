package defpackage;

import com.huawei.health.provider.cursor.BaseStatisticsHealthCursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class gsi extends BaseStatisticsHealthCursor {
    public gsi(LinkedHashMap<String, Object> linkedHashMap) {
        super(linkedHashMap);
    }

    @Override // com.huawei.health.provider.cursor.HealthCursor
    public void addColumnName() {
        Iterator<String> it = this.mDataMap.keySet().iterator();
        while (it.hasNext()) {
            addColumnName(it.next());
        }
    }

    @Override // com.huawei.health.provider.cursor.HealthCursor
    public void addData() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : getColumnNames()) {
            arrayList.add(String.valueOf(this.mDataMap.get(str)));
        }
        addRowData(arrayList);
    }
}
