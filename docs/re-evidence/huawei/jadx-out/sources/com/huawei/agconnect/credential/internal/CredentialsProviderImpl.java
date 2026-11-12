package com.huawei.agconnect.credential.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.annotation.Singleton;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.exception.AGCServerException;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.TaskExecutors;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
@Singleton
public class CredentialsProviderImpl implements CredentialsProvider {
    private static final String f = "CredentialsProviderImpl";
    private static final long g = 3600000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f4982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CredentialInfo f4984c = new CredentialInfo();
    private long d;
    private final AGConnectInstance e;

    @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
    public Task<Token> getTokens(final boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (a(z)) {
            this.f4982a.execute(new Runnable() { // from class: com.huawei.agconnect.credential.internal.CredentialsProviderImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (CredentialsProviderImpl.this.a(z)) {
                        CredentialsProviderImpl.this.a((TaskCompletionSource<Token>) taskCompletionSource);
                    } else {
                        taskCompletionSource.setResult(CredentialsProviderImpl.this.f4984c);
                    }
                }
            });
        } else {
            taskCompletionSource.setResult(this.f4984c);
        }
        return taskCompletionSource.getTask();
    }

    @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
    public Task<Token> getTokens() {
        return getTokens(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z) {
        CredentialInfo credentialInfo = this.f4984c;
        if (credentialInfo == null || !credentialInfo.a()) {
            return true;
        }
        if (z) {
            return this.d == 0 || SystemClock.elapsedRealtime() - this.d > 3600000;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final TaskCompletionSource<Token> taskCompletionSource) {
        IllegalArgumentException illegalArgumentException;
        ClientAuthRequest clientAuthRequest = new ClientAuthRequest(this.e);
        if (TextUtils.isEmpty(clientAuthRequest.getClientId())) {
            illegalArgumentException = new IllegalArgumentException("client token request miss client id, please check whether the 'agconnect-services.json' is configured correctly");
        } else {
            if (!TextUtils.isEmpty(clientAuthRequest.getClientSecret())) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                BackendService.sendRequest(clientAuthRequest, 1, ClientAuthResponse.class, new BackendService.Options.Builder().app(this.e).clientToken(false).build()).addOnCompleteListener(TaskExecutors.immediate(), new OnCompleteListener<ClientAuthResponse>() { // from class: com.huawei.agconnect.credential.internal.CredentialsProviderImpl.2
                    @Override // com.huawei.hmf.tasks.OnCompleteListener
                    public void onComplete(Task<ClientAuthResponse> task) {
                        Logger.i(CredentialsProviderImpl.f, "onComplete");
                        if (!task.isSuccessful()) {
                            taskCompletionSource.setException(task.getException());
                            countDownLatch.countDown();
                            return;
                        }
                        ClientAuthResponse result = task.getResult();
                        if (result.getRet() != null && result.getRet().getCode() != 0) {
                            taskCompletionSource.setException(new AGCServerException(result.getRet().getMsg(), result.getRet().getCode()));
                            countDownLatch.countDown();
                            return;
                        }
                        CredentialsProviderImpl.this.f4984c = new CredentialInfo(result.getAccessToken(), result.getExpiresIn());
                        CredentialInfoPreference.b().e(CredentialsProviderImpl.this.f4984c, CredentialsProviderImpl.this.f4983b);
                        CredentialInfoPreference.b().d(CredentialsProviderImpl.this.f4984c, CredentialsProviderImpl.this.f4983b);
                        CredentialInfoPreference.b().f(CredentialsProviderImpl.this.f4984c, CredentialsProviderImpl.this.f4983b);
                        countDownLatch.countDown();
                        CredentialsProviderImpl.this.d = SystemClock.elapsedRealtime();
                        taskCompletionSource.setResult(CredentialsProviderImpl.this.f4984c);
                    }
                });
                try {
                    if (countDownLatch.await(5L, TimeUnit.SECONDS)) {
                        return;
                    }
                    Logger.e(f, "await failed");
                    return;
                } catch (InterruptedException unused) {
                    Logger.e(f, "await InterruptedException");
                    return;
                }
            }
            illegalArgumentException = new IllegalArgumentException("client token request miss client secret, please check whether the 'agconnect-services.json' is configured correctly");
        }
        taskCompletionSource.setException(illegalArgumentException);
    }

    public CredentialsProviderImpl(Context context, AGConnectInstance aGConnectInstance) {
        this.e = aGConnectInstance;
        String identifier = aGConnectInstance.getOptions().getIdentifier();
        this.f4983b = identifier;
        CredentialInfoPreference.b().b(this.f4984c, identifier);
        CredentialInfoPreference.b().a(this.f4984c, identifier);
        CredentialInfoPreference.b().c(this.f4984c, identifier);
        this.f4982a = Executors.newSingleThreadExecutor();
    }
}
