package com.huawei.pluginachievement;

import android.content.Context;
import android.os.Handler;
import com.huawei.pluginbase.PluginBaseAdapter;
import defpackage.osc;
import defpackage.osf;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface AchieveDataApi {
    void dealKakaTask(Context context, Handler handler, int i);

    void dealWeChatTask();

    void generateReportHealthData(Context context);

    PluginBaseAdapter getAdapter(Context context);

    osf getData(int i, Map<String, String> map);

    boolean getKakaTaskRedDot(Context context);

    osc getSingleDayData();

    void initAdapter(Context context, PluginBaseAdapter pluginBaseAdapter);
}
