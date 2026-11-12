package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.main.MainActivity;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$main implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(MainExtKt.MAIN_ACTIVITY_PATH, RouteMeta.build(RouteType.ACTIVITY, MainActivity.class, MainExtKt.MAIN_ACTIVITY_PATH, FaceSchema.FACE_PAGE_MAIN, null, -1, Integer.MIN_VALUE));
    }
}
