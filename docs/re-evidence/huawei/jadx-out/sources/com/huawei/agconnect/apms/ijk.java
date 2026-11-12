package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface ijk {
    long abc();

    void abc(int i);

    void abc(String str);

    void abc(String str, Map<String, String> map);

    void abc(boolean z);

    void bcd(int i);

    void bcd(String str);

    void bcd(boolean z);

    boolean bcd();

    RuntimeEnvInformation cde();

    void cde(boolean z);

    DeviceInformation def();

    void def(boolean z);

    String efg();

    void efg(boolean z);

    void fgh(boolean z);

    boolean fgh();

    PlatformInformation ghi();

    String hij();

    Context ijk();

    void klm();

    UserSettingsInformation lmn();

    hij nop();

    ApplicationInformation opq();

    boolean pqr();

    void start();
}
