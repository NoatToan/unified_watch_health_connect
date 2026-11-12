package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi;
import health.compact.a.util.LogUtil;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = HealthConnectProviderApi.class)
public class xbm implements HealthConnectProviderApi {
    @Override // com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi
    public boolean isAgreeHealthConnect() {
        return wyx.c().a();
    }

    @Override // com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi
    public boolean isSupportHealthConnect() {
        return wyx.c().i();
    }

    @Override // com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi
    public void initHealthConnect() {
        wyx.c().b();
    }

    @Override // com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi
    public void writeSportData(HiHealthData hiHealthData) {
        Set<Integer> hashSet = new HashSet<>();
        if (hiHealthData == null) {
            hashSet.add(40002);
            hashSet.add(40003);
        } else {
            hashSet = b(hiHealthData.getChangeDataInfos());
        }
        wyx.c().c(hashSet);
    }

    @Override // com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi
    public void writeSleepData() {
        wyx.c().l();
    }

    @Override // com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi
    public boolean isHasSportPermission() {
        return wyx.c().j();
    }

    @Override // com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi
    public boolean isHasSleepPermission() {
        return wyx.c().e();
    }

    @Override // com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi
    public boolean isHasStepPermission() {
        return wyx.c().f();
    }

    @Override // com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi
    public boolean isHasCaloriesPermission() {
        return wyx.c().d();
    }

    private Set<Integer> b(String str) {
        HashSet hashSet = new HashSet();
        if (str == null || str.isEmpty()) {
            LogUtil.a("HealthConnectProviderApiImpl", "getTypeList is null or empty");
            return hashSet;
        }
        LogUtil.a("HealthConnectProviderApiImpl", "getTypeList new gson");
        JsonArray jsonArray = (JsonArray) new Gson().fromJson(str, JsonArray.class);
        for (int i = 0; i < jsonArray.size(); i++) {
            int asInt = jsonArray.get(i).getAsJsonObject().get("type").getAsInt();
            if (asInt == 40002 && isHasStepPermission()) {
                hashSet.add(Integer.valueOf(asInt));
            }
            if (asInt == 40003 && isHasCaloriesPermission()) {
                hashSet.add(Integer.valueOf(asInt));
            }
        }
        return hashSet;
    }
}
