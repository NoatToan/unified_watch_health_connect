package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.base.StubActivity;
import com.xiaomi.fitness.common.calendar.CalendarActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$common implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/common/activity/stub", RouteMeta.build(routeType, StubActivity.class, "/common/activity/stub", "common", null, -1, Integer.MIN_VALUE));
        map.put("/common/calendar/CalendarActivity", RouteMeta.build(routeType, CalendarActivity.class, "/common/calendar/calendaractivity", "common", null, -1, Integer.MIN_VALUE));
    }
}
