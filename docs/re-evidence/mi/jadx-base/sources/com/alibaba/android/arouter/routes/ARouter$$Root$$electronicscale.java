package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Root$$electronicscale implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("configwifi", ARouter$$Group$$configwifi.class);
        map.put("electronic", ARouter$$Group$$electronic.class);
    }
}
