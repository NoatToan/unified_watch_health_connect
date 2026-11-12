package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.mi.health.qrcode.CaptureActivity;
import com.mi.health.qrcode.QRCodeExportKt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$qrcode_scan implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(QRCodeExportKt.PATH_CAPTURE, RouteMeta.build(RouteType.ACTIVITY, CaptureActivity.class, QRCodeExportKt.PATH_CAPTURE, "qrcode_scan", null, -1, Integer.MIN_VALUE));
    }
}
