package com.huawei.hihealth.api;

import android.content.Context;
import com.huawei.hihealth.data.listener.HiCommonListener;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthUserInfoApi implements UserInfoApi {
    private static Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiHealthNativeApi f12248a;

    private HiHealthUserInfoApi() {
        this.f12248a = HiHealthNativeApi.a(d);
    }

    @Override // com.huawei.hihealth.api.UserInfoApi
    public void fetchUserData(HiCommonListener hiCommonListener) {
        this.f12248a.fetchUserData(hiCommonListener);
    }

    static class Instance {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final HiHealthUserInfoApi f12249b = new HiHealthUserInfoApi();

        private Instance() {
        }
    }
}
