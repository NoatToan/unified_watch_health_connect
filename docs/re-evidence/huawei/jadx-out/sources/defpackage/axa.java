package defpackage;

import android.text.TextUtils;
import com.huawei.achievement.MedalInfoAble;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class axa implements MedalInfoAble {
    private static final Object d = new Object();
    private static volatile axa e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, ouq> f730b;

    private axa() {
    }

    public static axa a() {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new axa();
                }
            }
        }
        return e;
    }

    @Override // com.huawei.achievement.MedalInfoAble
    public Task<ouq> obtainMedalInfo(final String str) {
        return Tasks.callInBackground(new Callable<ouq>() { // from class: axa.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ouq call() {
                if (axa.this.f730b == null || axa.this.f730b.size() == 0) {
                    LogUtil.j("AchieveMedalPort", "obtainMedalInfo get new medalConfigMap.");
                    axa.this.f730b = oru.a(BaseApplication.getContext()).h();
                }
                axa axaVar = axa.this;
                return axaVar.a(axaVar.f730b, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ouq a(Map<String, ouq> map, String str) {
        if (map == null || map.size() == 0) {
            LogUtil.j("AchieveMedalPort", "getMedalConfig medalConfigMap is empty.");
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            for (Map.Entry<String, ouq> entry : map.entrySet()) {
                if (str.equals(entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    @Override // com.huawei.achievement.MedalInfoAble
    public Task<ArrayList<our>> obtainMedalGainStatus(List<Integer> list) {
        LogUtil.a("AchieveMedalPort", "LightTask obtainMedalGainStatus startTask");
        return oru.a(BaseApplication.getContext()).f();
    }

    @Override // com.huawei.achievement.MedalInfoAble
    public Task<ArrayList<our>> obtainCurrentMedalGainStatus(List<Integer> list) {
        return Tasks.callInBackground(new Callable<ArrayList<our>>() { // from class: axa.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ArrayList<our> call() {
                ArrayList<our> arrayListN = otl.b(BaseApplication.getContext()).n();
                if (!njy.e(arrayListN)) {
                    String strE = osa.e(BaseApplication.getContext(), "_achieve_gain_id_medal");
                    if (!TextUtils.isEmpty(strE)) {
                        ArrayList<our> arrayList = new ArrayList<>(10);
                        for (our ourVar : arrayListN) {
                            if (strE.equals(ourVar.b())) {
                                arrayList.add(ourVar);
                            }
                        }
                        return arrayList;
                    }
                }
                return arrayListN;
            }
        });
    }
}
