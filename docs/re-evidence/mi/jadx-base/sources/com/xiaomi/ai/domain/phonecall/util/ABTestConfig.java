package com.xiaomi.ai.domain.phonecall.util;

import com.typesafe.config.a;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallRequestEnv;
import defpackage.nb4;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ABTestConfig {
    private static final String CFG_PREFIX = "com.xiaomi.ai.domain.phonecall.abtest.";
    private int deviceIdDivisor = -1;
    private int version = -1;
    private Map<Integer, ABTestGroupType> bucketGroupMapping = new HashMap();
    private Set<String> whiteListUserIds = new HashSet();
    private Set<String> whiteListDeviceIds = new HashSet();

    public ABTestGroupType getTestGroup(PhoneCallRequestEnv phoneCallRequestEnv) {
        if (phoneCallRequestEnv == null) {
            return ABTestGroupType.DEFAULT;
        }
        String deviceId = phoneCallRequestEnv.getDeviceId();
        String userId = phoneCallRequestEnv.getUserId();
        if (deviceId == null || deviceId.isEmpty() || deviceId.length() < 30) {
            return ABTestGroupType.DEFAULT;
        }
        if (this.deviceIdDivisor == -1) {
            return ABTestGroupType.DEFAULT;
        }
        if (isWhiteListDeviceId(deviceId)) {
            return ABTestGroupType.WHITE_LIST;
        }
        if (userId != null && isWhiteListUserId(userId)) {
            return ABTestGroupType.WHITE_LIST;
        }
        int i = (int) (Long.parseLong(deviceId.substring(deviceId.length() - 4), 16) % ((long) this.deviceIdDivisor));
        return this.bucketGroupMapping.containsKey(Integer.valueOf(i)) ? this.bucketGroupMapping.get(Integer.valueOf(i)) : ABTestGroupType.DEFAULT;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isWhiteListDeviceId(String str) {
        return this.whiteListDeviceIds.contains(str);
    }

    public boolean isWhiteListUserId(String str) {
        return this.whiteListUserIds.contains(str);
    }

    public void load(InputStream inputStream) throws Exception {
        nb4 nb4VarI = a.i(new InputStreamReader(inputStream));
        this.deviceIdDivisor = nb4VarI.getInt("com.xiaomi.ai.domain.phonecall.abtest.divisor");
        this.version = nb4VarI.getInt("com.xiaomi.ai.domain.phonecall.abtest.version");
        for (nb4 nb4Var : nb4VarI.j("com.xiaomi.ai.domain.phonecall.abtest.testGroups")) {
            ABTestGroupType aBTestGroupTypeFromString = ABTestGroupType.fromString(nb4Var.getString("name"));
            if (aBTestGroupTypeFromString != null) {
                String strReplaceAll = nb4Var.getString("buckets").replaceAll("\\p{Space}", "");
                if (!strReplaceAll.isEmpty()) {
                    for (String str : strReplaceAll.split(",")) {
                        if (str.contains("-")) {
                            int i = Integer.parseInt(str.split("-")[1]);
                            for (int i2 = Integer.parseInt(str.split("-")[0]); i2 <= i; i2++) {
                                this.bucketGroupMapping.put(Integer.valueOf(i2), aBTestGroupTypeFromString);
                            }
                        } else {
                            this.bucketGroupMapping.put(Integer.valueOf(Integer.parseInt(str)), aBTestGroupTypeFromString);
                        }
                    }
                }
            }
        }
        this.whiteListDeviceIds.addAll(nb4VarI.f("com.xiaomi.ai.domain.phonecall.abtest.whiteListDeviceIds"));
        this.whiteListUserIds.addAll(nb4VarI.f("com.xiaomi.ai.domain.phonecall.abtest.whiteListUserIds"));
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
