package defpackage;

import com.mi.health.RegionLimitAccessFilter;
import com.xiaomi.fitness.dataprovider.DataProviderInfo;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wm5 {
    public static List<DataProviderInfo> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DataProviderInfo("", "", "widget/stand", new Class[]{RegionLimitAccessFilter.class}, new kbo()));
        arrayList.add(new DataProviderInfo("", "", "firstaid", new Class[]{RegionLimitAccessFilter.class}, new io9()));
        arrayList.add(new DataProviderInfo("", "", "sleep", new Class[]{RegionLimitAccessFilter.class}, new ejm()));
        arrayList.add(new DataProviderInfo("", "", "activity/steps", new Class[]{RegionLimitAccessFilter.class}, new vdo()));
        arrayList.add(new DataProviderInfo("", "", "widget/steps", new Class[]{RegionLimitAccessFilter.class}, new tfo()));
        arrayList.add(new DataProviderInfo("", "", "reproductive/period", new Class[]{RegionLimitAccessFilter.class}, new xqh()));
        arrayList.add(new DataProviderInfo("", "", "heartrate", new Class[]{RegionLimitAccessFilter.class}, new w5c()));
        arrayList.add(new DataProviderInfo("", "", "hearing", new Class[]{RegionLimitAccessFilter.class}, new e4c()));
        arrayList.add(new DataProviderInfo("", "", TrackConstants.PRIVACY, null, new v9i()));
        arrayList.add(new DataProviderInfo("", "", "account", null, new nc0()));
        return arrayList;
    }
}
