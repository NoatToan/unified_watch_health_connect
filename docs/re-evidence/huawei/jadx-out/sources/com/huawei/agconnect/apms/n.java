package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import com.huawei.operation.utils.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements ijk {
    public final hij abc = new hij();

    @Override // com.huawei.agconnect.apms.ijk
    public final long abc() {
        return System.currentTimeMillis();
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void abc(int i) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void abc(String str) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void abc(String str, Map<String, String> map) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void abc(boolean z) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void bcd(int i) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void bcd(String str) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void bcd(boolean z) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final boolean bcd() {
        return false;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final RuntimeEnvInformation cde() {
        return new RuntimeEnvInformation(0L, 1, Constants.NULL, 0L);
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void cde(boolean z) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final DeviceInformation def() {
        return new DeviceInformation("", "", "");
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void def(boolean z) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final String efg() {
        return "";
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void efg(boolean z) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void fgh(boolean z) {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final boolean fgh() {
        return true;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final PlatformInformation ghi() {
        return new PlatformInformation();
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final String hij() {
        return null;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final Context ijk() {
        return null;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void klm() {
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final UserSettingsInformation lmn() {
        return new UserSettingsInformation();
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final hij nop() {
        return this.abc;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final ApplicationInformation opq() {
        return new ApplicationInformation(Constants.NULL, "0.0", Constants.NULL);
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final boolean pqr() {
        return true;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void start() {
    }
}
