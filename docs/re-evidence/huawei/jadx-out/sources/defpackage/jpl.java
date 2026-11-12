package defpackage;

import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.ui.commonui.adapter.BaseGroupDataAdapter;

/* JADX INFO: loaded from: classes10.dex */
public class jpl extends BaseGroupDataAdapter.GroupData<HotPathCityInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38798a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38799c;

    public jpl(String str, String str2) {
        this.f38799c = str;
        this.f38798a = str2;
    }

    public HotPathCityInfo a(int i) {
        if (njy.e(getChildList(), i)) {
            return null;
        }
        return getChildList().get(i);
    }

    public String c() {
        return this.f38798a;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseGroupDataAdapter.GroupData
    public String getTitle() {
        return this.f38798a;
    }
}
