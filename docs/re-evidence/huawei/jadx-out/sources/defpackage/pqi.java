package defpackage;

import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.huaweimapex.HuaweiMapExApi;

/* JADX INFO: loaded from: classes15.dex */
public class pqi extends AppBundlePluginProxy<HuaweiMapExApi> implements HuaweiMapExApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f45831a = "com.huawei.health.pluginhmsmap.HuaweiMapExImpl";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f45832b = "PluginHmsMap";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile pqi f45833c;
    private HuaweiMapExApi e;

    private pqi() {
        super("Track_plugin_HuaweiMapExProxy", f45832b, f45831a);
        HuaweiMapExApi huaweiMapExApiCreatePluginApi = createPluginApi();
        this.e = huaweiMapExApiCreatePluginApi;
        LogUtil.a("Track_plugin_HuaweiMapExProxy", "the mHuaweiMapExApi is null :", Boolean.valueOf(huaweiMapExApiCreatePluginApi == null));
    }

    public static pqi d() {
        pqi pqiVar;
        LogUtil.a("Track_plugin_HuaweiMapExProxy", "the mHuaweiMapExApi getInstance :");
        if (f45833c == null) {
            synchronized (pqi.class) {
                if (f45833c == null) {
                    f45833c = new pqi();
                }
                pqiVar = f45833c;
            }
            return pqiVar;
        }
        return f45833c;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(HuaweiMapExApi huaweiMapExApi) {
        this.e = huaweiMapExApi;
    }

    @Override // com.huawei.pluginsport.huaweimapex.HuaweiMapExApi
    public boolean set3dMapType(HuaweiMap huaweiMap, boolean z) {
        LogUtil.a("Track_plugin_HuaweiMapExProxy", "enter set3dMapType");
        if (this.e != null) {
            LogUtil.a("Track_plugin_HuaweiMapExProxy", "enter mHuaweiMapExApi != null");
            return this.e.set3dMapType(huaweiMap, z);
        }
        loadPlugin();
        return false;
    }

    @Override // com.huawei.pluginsport.huaweimapex.HuaweiMapExApi
    public boolean set3dScale(HuaweiMap huaweiMap, float f) {
        HuaweiMapExApi huaweiMapExApi = this.e;
        if (huaweiMapExApi != null) {
            return huaweiMapExApi.set3dScale(huaweiMap, f);
        }
        loadPlugin();
        return false;
    }

    @Override // com.huawei.pluginsport.huaweimapex.HuaweiMapExApi
    public Marker set3dMarker(HuaweiMap huaweiMap, jrv jrvVar) {
        LogUtil.a("Track_plugin_HuaweiMapExProxy", "enter set3dMarker");
        if (this.e != null) {
            LogUtil.a("Track_plugin_HuaweiMapExProxy", "enter mHuaweiMapExApi != null,3d marker");
            return this.e.set3dMarker(huaweiMap, jrvVar);
        }
        LogUtil.a("Track_plugin_HuaweiMapExProxy", "enter set3dMarker");
        loadPlugin();
        return null;
    }

    @Override // com.huawei.pluginsport.huaweimapex.HuaweiMapExApi
    public boolean setRotate(Marker marker, float f, float f2, float f3) {
        HuaweiMapExApi huaweiMapExApi = this.e;
        if (huaweiMapExApi != null) {
            return huaweiMapExApi.setRotate(marker, f, f2, f3);
        }
        loadPlugin();
        return false;
    }

    @Override // com.huawei.pluginsport.huaweimapex.HuaweiMapExApi
    public boolean set3dMarkerScale(Marker marker, double d) {
        HuaweiMapExApi huaweiMapExApi = this.e;
        if (huaweiMapExApi != null) {
            return huaweiMapExApi.set3dMarkerScale(marker, d);
        }
        loadPlugin();
        return false;
    }
}
