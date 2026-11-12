package defpackage;

import android.content.Context;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.ui.view.CombineSportEquipItemDrawer;
import com.huawei.indoorequip.ui.view.SportEquipItemDrawer;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nyw extends CombineSportEquipItemDrawer {
    public nyw(Context context, boolean z) {
        super(context, z);
    }

    public nyw(Context context, int i, boolean z, SupportDataRange supportDataRange) {
        super(context, i, z, supportDataRange);
    }

    public void d(SportEquipItemDrawer sportEquipItemDrawer, Map<Integer, Object> map, int[] iArr) {
        setPageItem(iArr, map);
        fillTitleContainer(sportEquipItemDrawer);
    }

    public void b(SportEquipItemDrawer sportEquipItemDrawer, Map<Integer, Object> map, int[] iArr) {
        setPageItem(iArr, map);
        fillTitleContainer(sportEquipItemDrawer);
    }
}
