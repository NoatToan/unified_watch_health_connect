package defpackage;

import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;

/* JADX INFO: loaded from: classes12.dex */
public class nyg {
    public static boolean b(IndoorEquipViewModel indoorEquipViewModel) {
        return c(indoorEquipViewModel, 0);
    }

    public static boolean c(IndoorEquipViewModel indoorEquipViewModel) {
        return c(indoorEquipViewModel, 1);
    }

    public static boolean d(IndoorEquipViewModel indoorEquipViewModel) {
        return c(indoorEquipViewModel, 2);
    }

    private static boolean c(IndoorEquipViewModel indoorEquipViewModel, int i) {
        return indoorEquipViewModel != null && indoorEquipViewModel.getSportTarget() == i;
    }
}
