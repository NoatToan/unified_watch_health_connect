package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Root$$main implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put(FaceSchema.FACE_PAGE_MAIN, ARouter$$Group$$main.class);
    }
}
