package defpackage;

import com.huawei.health.suggestion.ui.tabfragments.repository.Repository;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes31.dex */
public class idg implements Repository {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONArray f37510c = null;

    public static /* synthetic */ void a(HashMap map, HashMap map2, HttpResCallback httpResCallback, String str) {
        LogUtil.d("Suggestion_RecommendActivityRepository", "HttpPost request url:", str, "/activity/getActivities", " params:", map.toString(), ",headers:", map2.toString());
        ltg.c(str + "/activity/getActivities", map, map2, httpResCallback);
    }
}
