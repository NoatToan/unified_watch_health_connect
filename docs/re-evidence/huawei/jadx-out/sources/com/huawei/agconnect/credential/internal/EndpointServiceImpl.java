package com.huawei.agconnect.credential.internal;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.server.BackendImpl;
import com.huawei.agconnect.common.server.SiteUrl;
import com.huawei.agconnect.core.service.EndpointService;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.Tasks;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes22.dex */
public class EndpointServiceImpl implements EndpointService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4991c = "EndpointServiceImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SiteUrl f4992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4993b;

    static class CheckUrl implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f4994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f4995b;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            if (a(this.f4994a)) {
                return this.f4994a;
            }
            if (a(this.f4995b)) {
                return this.f4995b;
            }
            throw new IOException("main/backup url both are invalid");
        }

        private boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                int iIndexOf = str.indexOf(":");
                Dns.SYSTEM.lookup(iIndexOf != -1 ? str.substring(0, iIndexOf) : str);
                return true;
            } catch (UnknownHostException unused) {
                Logger.e(EndpointServiceImpl.f4991c, "checkUrl#UnknownHostException:" + str);
                return false;
            }
        }

        static CheckUrl a(String str, String str2) {
            CheckUrl checkUrl = new CheckUrl();
            checkUrl.f4994a = str;
            checkUrl.f4995b = str2;
            return checkUrl;
        }

        CheckUrl() {
        }
    }

    @Override // com.huawei.agconnect.core.service.EndpointService
    public Task<String> getEndpointDomain(boolean z) {
        if (z || !this.f4993b) {
            return Tasks.callInBackground(CheckUrl.a(this.f4992a.c(), this.f4992a.a()));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(this.f4992a.f());
        return taskCompletionSource.getTask();
    }

    public EndpointServiceImpl(Context context, AGConnectInstance aGConnectInstance) {
        this.f4993b = false;
        this.f4992a = new SiteUrl(aGConnectInstance.getOptions().getString("agcgw/url"), aGConnectInstance.getOptions().getString("agcgw/backurl"));
        if (BackendImpl.a().b().containsKey(this.f4992a)) {
            this.f4992a = BackendImpl.a().b().get(this.f4992a).c();
            this.f4993b = BackendImpl.a().b().get(this.f4992a).a().booleanValue();
        }
    }
}
