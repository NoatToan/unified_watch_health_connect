package com.huawei.agconnect.common.server;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Backend;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.BaseRequest;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.RequestThrottle;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.credential.internal.ClientAuthResponse;
import com.huawei.agconnect.credential.internal.GetDomainResponse;
import com.huawei.agconnect.exception.AGCServerException;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.TaskExecutors;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class BackendServiceImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4878a = "BackendServiceImpl";

    private static <Rsp> Task<Rsp> d(final BaseRequest baseRequest, final int i, final Class<Rsp> cls, final BackendService.Options options) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((CredentialsProvider) a(options).getService(CredentialsProvider.class)).getTokens().addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<Token>() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.4
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Token token) {
                BackendServiceImpl.b(token, baseRequest, options, taskCompletionSource, i, cls);
            }
        }).addOnFailureListener(TaskExecutors.immediate(), new OnFailureListener() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.3
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                taskCompletionSource.setException(exc);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <Rsp> void c(final BaseRequest baseRequest, final int i, final Class<Rsp> cls, final TaskCompletionSource<Rsp> taskCompletionSource, final BackendService.Options options) {
        a(baseRequest, i, cls, options).addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<Rsp>() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.8
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(Rsp rsp) {
                taskCompletionSource.setResult(rsp);
            }
        }).addOnFailureListener(TaskExecutors.immediate(), new OnFailureListener() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.7
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                BackendServiceImpl.b(exc, options, baseRequest, i, cls, taskCompletionSource);
            }
        });
    }

    public static <Rsp> Task<Rsp> c(BaseRequest baseRequest, int i, Class<Rsp> cls, BackendService.Options options) {
        Logger.i(f4878a, "sendRequest2");
        BackendService.Options optionsBuild = options == null ? new BackendService.Options.Builder().app(AGConnectInstance.getInstance()).build() : options;
        if (optionsBuild.getApp() == null) {
            optionsBuild = optionsBuild.newBuilder().app(AGConnectInstance.getInstance()).build();
        }
        baseRequest.initBase(optionsBuild.getApp());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new UrlInterceptorV2(optionsBuild));
        if (!a(cls)) {
            return Backend.call(baseRequest, i, cls, optionsBuild.getFactory(), optionsBuild.getTimeout(), optionsBuild.getTimeUnit(), arrayList, null, a(optionsBuild).getOptions());
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final RequestThrottle.Throttle throttle = optionsBuild.getThrottle();
        Logger.i(f4878a, "clientToken:" + optionsBuild.isClientToken());
        if (optionsBuild.isClientToken()) {
            arrayList.add(new ClientTokenInterceptor(optionsBuild.getApp()));
        }
        if (optionsBuild.isApiKey()) {
            arrayList.add(new ApiKeyInterceptor(optionsBuild.getApp()));
        }
        Logger.i(f4878a, "accessToken:" + optionsBuild.isAccessToken());
        if (optionsBuild.isAccessToken()) {
            arrayList.add(new AccessTokenInterceptor(optionsBuild.getApp(), optionsBuild.getAccessTokenType() == BackendService.AccessTokenType.MUST, optionsBuild.isAccessTokenExtra()));
        }
        if (optionsBuild.getThrottle() != null) {
            if (optionsBuild.getThrottle().getEndTime() > 0) {
                taskCompletionSource.setException(new AGCServerException("fetch throttled, try again later", 1));
                return taskCompletionSource.getTask();
            }
            optionsBuild.getThrottle().addForStart();
        }
        Backend.call(baseRequest, i, cls, optionsBuild.getFactory(), optionsBuild.getTimeout(), optionsBuild.getTimeUnit(), arrayList, new AGCAuthenticator(optionsBuild), a(optionsBuild).getOptions()).addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<Rsp>() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.14
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(Rsp rsp) {
                RequestThrottle.Throttle throttle2 = throttle;
                if (throttle2 != null) {
                    throttle2.addForSuccess();
                }
                taskCompletionSource.setResult(rsp);
            }
        }).addOnFailureListener(TaskExecutors.immediate(), new OnFailureListener() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.13
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                RequestThrottle.Throttle throttle2 = throttle;
                if (throttle2 != null && throttle2.checkFail(exc)) {
                    throttle.addForFail();
                }
                taskCompletionSource.setException(exc);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <Rsp> void b(final Exception exc, final BackendService.Options options, final BaseRequest baseRequest, final int i, final Class<Rsp> cls, final TaskCompletionSource<Rsp> taskCompletionSource) {
        Task<Token> taskAddOnSuccessListener;
        Executor executorImmediate;
        OnFailureListener onFailureListener;
        if (a(exc)) {
            int retCode = ((AGCServerException) exc).getRetCode();
            if (retCode == 205524993 && !options.isClientTokenRefreshed()) {
                options.setClientTokenRefreshed(true);
                taskAddOnSuccessListener = ((CredentialsProvider) a(options).getService(CredentialsProvider.class)).getTokens(true).addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<Token>() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.10
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Token token) {
                        baseRequest.setAuthorization(HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + token.getTokenString());
                        BackendServiceImpl.c(baseRequest, i, cls, taskCompletionSource, options);
                    }
                });
                executorImmediate = TaskExecutors.immediate();
                onFailureListener = new OnFailureListener() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.9
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public void onFailure(Exception exc2) {
                        taskCompletionSource.setException(exc2);
                    }
                };
            } else if (retCode == 205524994 && !options.isAccessTokenRefreshed()) {
                options.setAccessTokenRefreshed(true);
                AuthProvider authProvider = (AuthProvider) a(options).getService(AuthProvider.class);
                if (authProvider == null) {
                    taskCompletionSource.setException(exc);
                    return;
                } else {
                    taskAddOnSuccessListener = authProvider.getTokens(true).addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<Token>() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.12
                        @Override // com.huawei.hmf.tasks.OnSuccessListener
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(Token token) {
                            if (token == null) {
                                taskCompletionSource.setException(exc);
                            } else {
                                baseRequest.setAccessToken(token.getTokenString());
                                BackendServiceImpl.c(baseRequest, i, cls, taskCompletionSource, options);
                            }
                        }
                    });
                    executorImmediate = TaskExecutors.immediate();
                    onFailureListener = new OnFailureListener() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.11
                        @Override // com.huawei.hmf.tasks.OnFailureListener
                        public void onFailure(Exception exc2) {
                            taskCompletionSource.setException(exc2);
                        }
                    };
                }
            }
            taskAddOnSuccessListener.addOnFailureListener(executorImmediate, onFailureListener);
            return;
        }
        taskCompletionSource.setException(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <Rsp> void b(Token token, final BaseRequest baseRequest, final BackendService.Options options, final TaskCompletionSource<Rsp> taskCompletionSource, final int i, final Class<Rsp> cls) {
        baseRequest.setAuthorization(HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + token.getTokenString());
        if (!options.isAccessToken()) {
            b(baseRequest, i, cls, taskCompletionSource, options);
            return;
        }
        AuthProvider authProvider = (AuthProvider) a(options).getService(AuthProvider.class);
        if (authProvider == null) {
            taskCompletionSource.setException(new AGCServerException("no user login", 3));
        } else {
            authProvider.getTokens().addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<Token>() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.6
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Token token2) {
                    if (token2 != null) {
                        baseRequest.setAccessToken(token2.getTokenString());
                        BackendServiceImpl.b(baseRequest, i, cls, taskCompletionSource, options);
                    } else if (options.getAccessTokenType() == BackendService.AccessTokenType.EXPECT) {
                        BackendServiceImpl.b(baseRequest, i, cls, taskCompletionSource, options);
                    } else {
                        taskCompletionSource.setException(new AGCServerException("no user login", 3));
                    }
                }
            }).addOnFailureListener(TaskExecutors.immediate(), new OnFailureListener() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.5
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    taskCompletionSource.setException(exc);
                }
            });
        }
    }

    public static <Rsp> void b(BaseRequest baseRequest, int i, Class<Rsp> cls, TaskCompletionSource<Rsp> taskCompletionSource, BackendService.Options options) {
        if (options.getThrottle() != null) {
            if (options.getThrottle().getEndTime() > 0) {
                taskCompletionSource.setException(new AGCServerException("fetch throttled, try again later", 1));
                return;
            }
            options.getThrottle().addForStart();
        }
        c(baseRequest, i, cls, taskCompletionSource, options);
    }

    public static <Rsp> Task<Rsp> b(BaseRequest baseRequest, int i, Class<Rsp> cls, BackendService.Options options) {
        if (options != null && options.getApp() != null) {
            baseRequest.initBase(options.getApp());
        }
        if (options == null || !options.isClientToken()) {
            return Backend.call(baseRequest, i, cls, a(options).getOptions());
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final RequestThrottle.Throttle throttle = options.getThrottle();
        d(baseRequest, i, cls, options).addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<Rsp>() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.2
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(Rsp rsp) {
                RequestThrottle.Throttle throttle2 = throttle;
                if (throttle2 != null) {
                    throttle2.addForSuccess();
                }
                taskCompletionSource.setResult(rsp);
            }
        }).addOnFailureListener(TaskExecutors.immediate(), new OnFailureListener() { // from class: com.huawei.agconnect.common.server.BackendServiceImpl.1
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                RequestThrottle.Throttle throttle2 = throttle;
                if (throttle2 != null && throttle2.checkFail(exc)) {
                    throttle.addForFail();
                }
                taskCompletionSource.setException(exc);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static boolean a(Exception exc) {
        return (exc instanceof AGCServerException) && ((AGCServerException) exc).getCode() == 401;
    }

    private static boolean a(Class cls) {
        return (cls == ClientAuthResponse.class || cls == GetDomainResponse.class) ? false : true;
    }

    private static <Rsp> Task<Rsp> a(BaseRequest baseRequest, int i, Class<Rsp> cls, BackendService.Options options) {
        return (options == null || options.getFactory() == null) ? Backend.call(baseRequest, i, cls, a(options).getOptions()) : Backend.call(baseRequest, i, cls, options.getFactory(), options.getTimeout(), options.getTimeUnit(), a(options).getOptions());
    }

    private static AGConnectInstance a(BackendService.Options options) {
        return (options == null || options.getApp() == null) ? AGConnectInstance.getInstance() : options.getApp();
    }
}
