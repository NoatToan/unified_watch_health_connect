package defpackage;

import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes41.dex */
public class ozv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<ozy> f45046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AchieveUserLevelInfo f45047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private paa f45048c;

    public void e(AchieveUserLevelInfo achieveUserLevelInfo) {
        this.f45047b = achieveUserLevelInfo;
    }

    public paa d() {
        return this.f45048c;
    }

    public void b(paa paaVar) {
        this.f45048c = paaVar;
    }

    public ArrayList<ozy> e() {
        return this.f45046a;
    }

    public void c(ArrayList<ozy> arrayList) {
        this.f45046a = arrayList;
    }

    public String toString() {
        return "LevelLocationRelationShipData{userLevelInfo=" + this.f45048c + ", LevelListInfo=" + this.f45046a + '}';
    }
}
