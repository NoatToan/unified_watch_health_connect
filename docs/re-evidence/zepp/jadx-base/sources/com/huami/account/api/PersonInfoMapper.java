package com.huami.account.api;

import com.amap.api.mapcore.util.hl;
import com.huami.account.AccountExternalsKt;
import com.huami.account.usecase.DisplayIDToNickname;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u001a=\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "", "", HMAccountWebAPI.PARAM_DEFAULT_FIELDS, "", "toProfileDataMap", "K", "V", "", hl.k, "v", "", "a", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "accountui_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "PersonInfoMapper")
public final class PersonInfoMapper {
    private static final <K, V> void a(Map<K, V> map, K k, V v) {
        if (v == null) {
            return;
        }
        map.put(k, v);
    }

    @NotNull
    public static final Map<String, Object> toProfileDataMap(@NotNull HMPersonInfo hMPersonInfo, @NotNull Map<String, String> map) {
        String strJoinToString$default;
        HashMap map2 = new HashMap();
        a(map2, "birthday", hMPersonInfo.getUserInfo().getBirthday());
        a(map2, "gender", String.valueOf(hMPersonInfo.getUserInfo().getGender()));
        a(map2, "height", String.valueOf(hMPersonInfo.getUserInfo().getHeight()));
        a(map2, "weight", String.valueOf(hMPersonInfo.getUserInfo().getWeight()));
        a(map2, "age", String.valueOf(hMPersonInfo.getUserInfo().getAge()));
        a(map2, "location", hMPersonInfo.getUserInfo().getLocation());
        a(map2, HMAccountWebAPI.PARAM_BIND_INTRODUCTION, hMPersonInfo.getUserInfo().getUserIntroduction());
        a(map2, HMAccountWebAPI.PARAM_BIND_SIGNATURE, hMPersonInfo.getUserInfo().getSignature());
        if (Intrinsics.areEqual(hMPersonInfo.getUserInfo().getNickname(), DisplayIDToNickname.INSTANCE.execute(hMPersonInfo.getUserInfo().getUserid()))) {
            a(map2, "nick_name", hMPersonInfo.getUserInfo().getNickname());
        }
        if (!map.isEmpty()) {
            map2.put(HMAccountWebAPI.PARAM_DEFAULT_FIELDS, CollectionsKt___CollectionsKt.joinToString$default(map.keySet(), ",", null, null, 0, null, null, 62, null));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        } else {
            List<String> defaultFields = hMPersonInfo.getUserInfo().getDefaultFields();
            if (defaultFields == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(defaultFields, ",", null, null, 0, null, null, 62, null)) == null) {
                strJoinToString$default = "";
            }
            map2.put(HMAccountWebAPI.PARAM_DEFAULT_FIELDS, strJoinToString$default);
        }
        map2.put(HMAccountWebAPI.PARAM_BIND_PERSON_SH, "");
        map2.put("version", "0");
        AccountExternalsKt.getAccountDelegate().interceptUpdateProfile(hMPersonInfo, map2);
        if (hMPersonInfo.getUserInfo().getAvatarPath() != null && (hMPersonInfo.getUserInfo().getSynced() & 1) != 0) {
            File file = new File(hMPersonInfo.getUserInfo().getAvatarPath());
            if (file.exists()) {
                map2.put("icon", file);
            }
        }
        return map2;
    }

    public static /* synthetic */ Map toProfileDataMap$default(HMPersonInfo hMPersonInfo, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = r.emptyMap();
        }
        return toProfileDataMap(hMPersonInfo, map);
    }
}
