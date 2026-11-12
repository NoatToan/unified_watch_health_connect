package com.huawei.health.routeradapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.sport.model.WorkoutRecord;
import defpackage.pcd;
import defpackage.pea;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TradePretreatmentService implements PretreatmentService {
    private static Map<String, String> e = new HashMap<String, String>() { // from class: com.huawei.health.routeradapter.TradePretreatmentService.3
        {
            put("1", "/PluginFitnessAdvice/TrainDetail");
            put("12", "/Main/SeriesCourseListActivity");
        }
    };

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.c("TradePretreatmentService", "uri == null");
            return false;
        }
        LogUtil.c("TradePretreatmentService", uriO.toString());
        if (TextUtils.isEmpty(uriO.getQuery())) {
            return false;
        }
        c(context, uriO);
        return false;
    }

    private void c(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("type");
        if (!TextUtils.isEmpty(queryParameter) && e.containsKey(queryParameter)) {
            b(context, queryParameter, uri);
        } else {
            LogUtil.e("TradePretreatmentService", "not support ", queryParameter);
        }
    }

    private void b(Context context, String str, Uri uri) {
        String queryParameter = uri.getQueryParameter("id");
        Bundle bundle = new Bundle();
        if ("1".equals(str)) {
            WorkoutRecord workoutRecord = new WorkoutRecord();
            workoutRecord.saveExerciseTime(new Date().getTime());
            workoutRecord.saveWorkoutId(queryParameter);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(workoutRecord);
            pea.b(context, new pcd(queryParameter), (ArrayList<WorkoutRecord>) arrayList);
            return;
        }
        bundle.putString("id", queryParameter);
        AppRouter.c(e.get(str)).d(268435456).d(bundle).b(context);
    }
}
