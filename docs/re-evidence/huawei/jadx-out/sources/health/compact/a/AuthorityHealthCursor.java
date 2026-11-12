package health.compact.a;

import com.huawei.health.provider.cursor.HealthCursor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorityHealthCursor extends HealthCursor {
    public AuthorityHealthCursor() {
        initData();
    }

    @Override // com.huawei.health.provider.cursor.HealthCursor
    public void addColumnName() {
        addColumnName("authority_age");
        addColumnName("authority_gender");
        addColumnName("authority_sport");
        addColumnName("authority_sleep");
        addColumnName("authority_weight");
        addColumnName("authority_height");
        addColumnName("authority_heart_rate");
        addColumnName("authority_blood_sugar");
        addColumnName("authority_blood_pressure");
    }

    @Override // com.huawei.health.provider.cursor.HealthCursor
    public void addData() {
        ArrayList<String> arrayList = new ArrayList<>(9);
        b(arrayList, 0);
        b(arrayList, 1);
        b(arrayList, 2);
        b(arrayList, 3);
        b(arrayList, 4);
        b(arrayList, 5);
        b(arrayList, 7);
        b(arrayList, 8);
        b(arrayList, 9);
        addRowData(arrayList);
    }

    private void b(ArrayList<String> arrayList, int i) {
        com.huawei.hwlogsmodel.LogUtil.a("Step_AuthorityHealthCursor", "addAuthorityColumn ", Integer.valueOf(i));
        arrayList.add(String.valueOf(1));
    }
}
