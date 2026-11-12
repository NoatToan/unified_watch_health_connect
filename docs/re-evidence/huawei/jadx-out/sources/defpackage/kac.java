package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtils;
import health.compact.a.ReleaseLogUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes33.dex */
public class kac {
    private static final List<String> d = Arrays.asList("900200007", "900200009", "900200008", "900200006");

    public static void e(qgc qgcVar) {
        if (qgcVar == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeConfigUtil", "updateConfig queryTasksResp is null");
            return;
        }
        List<qfy> listB = qgcVar.b();
        if (njy.e(listB)) {
            return;
        }
        HashMap map = new HashMap();
        for (qfy qfyVar : listB) {
            if (qfyVar != null) {
                String strH = qfyVar.h();
                String strS = qfyVar.s();
                TaskEnum taskEnumFromTaskId = TaskEnum.fromTaskId(strH);
                if (taskEnumFromTaskId != null && !TextUtils.isEmpty(taskEnumFromTaskId.getConfigId()) && !TextUtils.isEmpty(strS)) {
                    String configId = taskEnumFromTaskId.getConfigId();
                    if (d.contains(configId)) {
                        c(configId, strS);
                    } else {
                        String configKey = taskEnumFromTaskId.getConfigKey();
                        if (!TextUtils.isEmpty(configKey)) {
                            if (map.containsKey(configId)) {
                                ((Map) Objects.requireNonNull((Map) map.get(configId))).put(configKey, strS);
                            } else {
                                HashMap map2 = new HashMap();
                                map2.put(configKey, strS);
                                map.put(configId, map2);
                            }
                        }
                    }
                }
            }
        }
        c(map);
    }

    private static void c(final String str, final String str2) {
        qgm.c(str, new IBaseResponseCallback() { // from class: jzy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                kac.e(str2, str, i, obj);
            }
        });
    }

    static /* synthetic */ void e(String str, final String str2, int i, Object obj) {
        if (!(obj instanceof Integer)) {
            LogUtil.j("R_HL_HealthLifeConfigUtil", "data not instanceof integer");
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        final int iJ = CommonUtils.j(str);
        if (iJ <= 0 || iIntValue == iJ) {
            ReleaseLogUtil.d("R_HL_HealthLifeConfigUtil", "goalValue not change with ", Integer.valueOf(iJ));
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: kaa
                @Override // java.lang.Runnable
                public final void run() {
                    qgm.b(str2, iJ);
                }
            });
        }
    }

    private static void c(Map<String, Map<String, String>> map) {
        map.forEach(new BiConsumer() { // from class: kaf
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                xkb.c(str, new ResponseCallback() { // from class: kae
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj3) {
                        kac.d(str, map, i, (Pair) obj3);
                    }
                });
            }
        });
    }

    static /* synthetic */ void d(String str, Map map, int i, Pair pair) {
        if (pair == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeConfigUtil", "getSampleConfigForHealth pair is null");
            d(str, HiJsonUtil.d(map));
            return;
        }
        String str2 = (String) pair.second;
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.d("R_HL_HealthLifeConfigUtil", "getSampleConfigForHealth configData ", str2);
            d(str, HiJsonUtil.d(map));
        } else {
            Map<String, String> mapB = peh.b(str2);
            mapB.putAll(map);
            d(str, HiJsonUtil.d(mapB));
        }
    }

    private static void d(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("R_HL_HealthLifeConfigUtil", "saveHealthLifeConfig is configId: ", str, " configData: ", str2);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: kag
                @Override // java.lang.Runnable
                public final void run() {
                    xkb.d(str, str2, new HiDataOperateListener() { // from class: kab
                        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                        public final void onResult(int i, Object obj) {
                            ReleaseLogUtil.c("R_HL_HealthLifeConfigUtil", "saveHealthLifeConfig errorCode: ", Integer.valueOf(i));
                        }
                    });
                }
            });
        }
    }
}
