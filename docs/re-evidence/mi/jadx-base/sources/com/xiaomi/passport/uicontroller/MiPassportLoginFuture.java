package com.xiaomi.passport.uicontroller;

import android.os.RemoteException;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.MiLoginResult;
import com.xiaomi.accountsdk.account.data.NotificationAuthResult;
import com.xiaomi.accountsdk.account.exception.IllegalDeviceException;
import com.xiaomi.accountsdk.account.exception.InvalidCredentialException;
import com.xiaomi.accountsdk.account.exception.InvalidStep2codeException;
import com.xiaomi.accountsdk.account.exception.InvalidUserNameException;
import com.xiaomi.accountsdk.account.exception.NeedCaptchaException;
import com.xiaomi.accountsdk.account.exception.NeedNotificationException;
import com.xiaomi.accountsdk.account.exception.NeedVerificationException;
import com.xiaomi.accountsdk.account.exception.PassportIOException;
import com.xiaomi.accountsdk.futureservice.ClientFuture;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MiPassportLoginFuture extends UIControllerFuture<MiLoginResult, AccountInfo> {

    public static final class AddOrUpdateAccountFuture extends UIControllerFuture<Void, Void> {
        public AddOrUpdateAccountFuture(UIControllerFuture.UICallback<Void> uICallback) {
            super(uICallback);
        }

        @Override // com.xiaomi.passport.uicontroller.UIControllerFuture
        public Void convertModelDataToUIData(Void r1) {
            return null;
        }

        @Override // com.xiaomi.accountsdk.futureservice.ClientFuture
        public void interpretExecutionException(ExecutionException executionException) throws RemoteException {
            Throwable cause = executionException.getCause();
            if (cause instanceof RemoteException) {
                throw ((RemoteException) cause);
            }
            throw new IllegalStateException("unknown exception met: " + executionException.getCause().getMessage());
        }
    }

    public static abstract class AddOrUpdateUICallback implements UIControllerFuture.UICallback {
        @Override // com.xiaomi.accountsdk.futureservice.ClientFuture.ClientCallback
        public final void call(ClientFuture clientFuture) {
            call((AddOrUpdateAccountFuture) clientFuture);
        }

        public abstract void call(AddOrUpdateAccountFuture addOrUpdateAccountFuture);
    }

    public static class NotificationAuthFuture extends UIControllerFuture<NotificationAuthResult, NotificationAuthResult> {
        public NotificationAuthFuture(UIControllerFuture.UICallback<NotificationAuthResult> uICallback) {
            super(uICallback);
        }

        @Override // com.xiaomi.passport.uicontroller.UIControllerFuture
        public NotificationAuthResult convertModelDataToUIData(NotificationAuthResult notificationAuthResult) {
            return notificationAuthResult;
        }

        @Override // com.xiaomi.accountsdk.futureservice.ClientFuture
        public void interpretExecutionException(ExecutionException executionException) throws Exception {
            if (executionException.getCause() instanceof RemoteException) {
                throw ((RemoteException) executionException.getCause());
            }
            throw new IllegalStateException("unknown exception met: " + executionException.getCause().getMessage());
        }
    }

    public static abstract class NotificationAuthUICallback implements UIControllerFuture.UICallback {
        @Override // com.xiaomi.accountsdk.futureservice.ClientFuture.ClientCallback
        public final void call(ClientFuture clientFuture) {
            call((NotificationAuthFuture) clientFuture);
        }

        public abstract void call(NotificationAuthFuture notificationAuthFuture);
    }

    public static final class NotificationLoginFuture extends MiPassportLoginFuture {
        public NotificationLoginFuture(UIControllerFuture.UICallback<AccountInfo> uICallback) {
            super(uICallback);
        }

        @Override // com.xiaomi.passport.uicontroller.MiPassportLoginFuture, com.xiaomi.accountsdk.futureservice.ClientFuture
        public void interpretExecutionException(ExecutionException executionException) throws NeedNotificationException, InvalidUserNameException, AccessDeniedException, IllegalDeviceException, InvalidCredentialException, RemoteException, IOException, InvalidResponseException {
            try {
                super.interpretExecutionException(executionException);
            } catch (InvalidStep2codeException unused) {
                throw new IllegalStateException("this should not be happen");
            } catch (NeedCaptchaException unused2) {
                throw new IllegalStateException("this should not be happen");
            } catch (NeedVerificationException unused3) {
                throw new IllegalStateException("this should not be happen");
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xiaomi.passport.uicontroller.MiPassportLoginFuture, com.xiaomi.passport.uicontroller.UIControllerFuture
        public AccountInfo convertModelDataToUIData(MiLoginResult miLoginResult) throws NeedNotificationException, InvalidUserNameException, AccessDeniedException, IllegalDeviceException, InvalidCredentialException, IOException, RemoteException, InvalidResponseException {
            try {
                return super.convertModelDataToUIData(miLoginResult);
            } catch (InvalidStep2codeException unused) {
                throw new IllegalStateException("this should not be happen");
            } catch (NeedCaptchaException unused2) {
                throw new IllegalStateException("this should not be happen");
            } catch (NeedVerificationException unused3) {
                throw new IllegalStateException("this should not be happen");
            }
        }
    }

    public static abstract class NotificationLoginUICallback implements UIControllerFuture.UICallback {
        @Override // com.xiaomi.accountsdk.futureservice.ClientFuture.ClientCallback
        public final void call(ClientFuture clientFuture) {
            call((NotificationLoginFuture) clientFuture);
        }

        public abstract void call(NotificationLoginFuture notificationLoginFuture);
    }

    public static final class PasswordLoginFuture extends MiPassportLoginFuture {
        public PasswordLoginFuture(UIControllerFuture.UICallback<AccountInfo> uICallback) {
            super(uICallback);
        }

        @Override // com.xiaomi.passport.uicontroller.MiPassportLoginFuture, com.xiaomi.accountsdk.futureservice.ClientFuture
        public void interpretExecutionException(ExecutionException executionException) throws NeedNotificationException, InvalidUserNameException, AccessDeniedException, IllegalDeviceException, NeedVerificationException, NeedCaptchaException, InvalidCredentialException, RemoteException, IOException, InvalidResponseException {
            try {
                super.interpretExecutionException(executionException);
            } catch (InvalidStep2codeException unused) {
                throw new IllegalStateException("this should not be happen");
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xiaomi.passport.uicontroller.MiPassportLoginFuture, com.xiaomi.passport.uicontroller.UIControllerFuture
        public AccountInfo convertModelDataToUIData(MiLoginResult miLoginResult) throws NeedNotificationException, InvalidUserNameException, AccessDeniedException, IllegalDeviceException, NeedVerificationException, InvalidCredentialException, NeedCaptchaException, IOException, RemoteException, InvalidResponseException {
            try {
                return super.convertModelDataToUIData(miLoginResult);
            } catch (InvalidStep2codeException unused) {
                throw new IllegalStateException("this should not be happen");
            }
        }
    }

    public static abstract class PasswordLoginUICallback implements UIControllerFuture.UICallback {
        @Override // com.xiaomi.accountsdk.futureservice.ClientFuture.ClientCallback
        public final void call(ClientFuture clientFuture) {
            call((PasswordLoginFuture) clientFuture);
        }

        public abstract void call(PasswordLoginFuture passwordLoginFuture);
    }

    public static final class Step2LoginFuture extends MiPassportLoginFuture {
        public Step2LoginFuture(UIControllerFuture.UICallback<AccountInfo> uICallback) {
            super(uICallback);
        }

        @Override // com.xiaomi.passport.uicontroller.MiPassportLoginFuture, com.xiaomi.accountsdk.futureservice.ClientFuture
        public void interpretExecutionException(ExecutionException executionException) throws InvalidUserNameException, InvalidStep2codeException, AccessDeniedException, IllegalDeviceException, InvalidCredentialException, RemoteException, IOException, InvalidResponseException {
            try {
                super.interpretExecutionException(executionException);
            } catch (NeedCaptchaException unused) {
                throw new IllegalStateException("this should not be happen");
            } catch (NeedNotificationException unused2) {
                throw new IllegalStateException("this should not be happen");
            } catch (NeedVerificationException unused3) {
                throw new IllegalStateException("this should not be happen");
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xiaomi.passport.uicontroller.MiPassportLoginFuture, com.xiaomi.passport.uicontroller.UIControllerFuture
        public AccountInfo convertModelDataToUIData(MiLoginResult miLoginResult) throws InvalidUserNameException, InvalidStep2codeException, AccessDeniedException, IllegalDeviceException, InvalidCredentialException, IOException, RemoteException, InvalidResponseException {
            try {
                return super.convertModelDataToUIData(miLoginResult);
            } catch (NeedCaptchaException unused) {
                throw new IllegalStateException("this should not be happen");
            } catch (NeedNotificationException unused2) {
                throw new IllegalStateException("this should not be happen");
            } catch (NeedVerificationException unused3) {
                throw new IllegalStateException("this should not be happen");
            }
        }
    }

    public static abstract class Step2LoginUICallback implements UIControllerFuture.UICallback {
        @Override // com.xiaomi.accountsdk.futureservice.ClientFuture.ClientCallback
        public final void call(ClientFuture clientFuture) {
            call((Step2LoginFuture) clientFuture);
        }

        public abstract void call(Step2LoginFuture step2LoginFuture);
    }

    public MiPassportLoginFuture(UIControllerFuture.UICallback<AccountInfo> uICallback) {
        super(uICallback);
    }

    @Override // com.xiaomi.accountsdk.futureservice.ClientFuture
    public void interpretExecutionException(ExecutionException executionException) throws NeedNotificationException, InvalidUserNameException, InvalidStep2codeException, AccessDeniedException, IllegalDeviceException, NeedVerificationException, NeedCaptchaException, InvalidCredentialException, RemoteException, IOException, InvalidResponseException {
        Throwable cause = executionException.getCause();
        if (cause instanceof NeedNotificationException) {
            throw ((NeedNotificationException) cause);
        }
        if (cause instanceof NeedVerificationException) {
            throw ((NeedVerificationException) cause);
        }
        if (cause instanceof InvalidStep2codeException) {
            throw ((InvalidStep2codeException) cause);
        }
        if (cause instanceof IOException) {
            throw ((IOException) cause);
        }
        if (cause instanceof InvalidCredentialException) {
            throw ((InvalidCredentialException) cause);
        }
        if (cause instanceof NeedCaptchaException) {
            throw ((NeedCaptchaException) cause);
        }
        if (cause instanceof InvalidUserNameException) {
            throw ((InvalidUserNameException) cause);
        }
        if (cause instanceof AccessDeniedException) {
            throw ((AccessDeniedException) cause);
        }
        if (cause instanceof InvalidResponseException) {
            throw ((InvalidResponseException) cause);
        }
        if (cause instanceof SSLException) {
            throw ((SSLException) cause);
        }
        if (cause instanceof IllegalDeviceException) {
            throw ((IllegalDeviceException) cause);
        }
        if (cause instanceof IllegalStateException) {
            throw ((IllegalStateException) cause);
        }
        if (cause instanceof RemoteException) {
            throw ((RemoteException) cause);
        }
        throw new IllegalStateException("unknown exception met: " + cause.getMessage());
    }

    @Override // com.xiaomi.passport.uicontroller.UIControllerFuture
    public AccountInfo convertModelDataToUIData(MiLoginResult miLoginResult) throws NeedNotificationException, InvalidStep2codeException, RemoteException, IOException, InvalidUserNameException, AccessDeniedException, IllegalDeviceException, NeedVerificationException, InvalidCredentialException, NeedCaptchaException, InvalidResponseException {
        if (miLoginResult == null) {
            throw new InvalidResponseException("result is null");
        }
        switch (miLoginResult.resultCode) {
            case 0:
                return miLoginResult.accountInfo;
            case 1:
                throw new NeedCaptchaException(miLoginResult.captchaUrl, miLoginResult.captchaType);
            case 2:
                throw new NeedVerificationException(miLoginResult.metaLoginData, miLoginResult.step1Token, miLoginResult.userId);
            case 3:
                throw new NeedNotificationException(miLoginResult.userId, miLoginResult.notificationUrl);
            case 4:
                throw new InvalidCredentialException(miLoginResult.hasPwd).metaLoginData(miLoginResult.metaLoginData).captchaUrl(miLoginResult.captchaUrl);
            case 5:
                if (!miLoginResult.isStsCallbackError) {
                    throw new IOException("network error");
                }
                PassportIOException passportIOException = new PassportIOException(0, "http exception");
                passportIOException.stsUrlRequestError(miLoginResult.serviceId);
                throw passportIOException;
            case 6:
                InvalidResponseException invalidResponseException = new InvalidResponseException("server error");
                if (miLoginResult.serverError != null) {
                    invalidResponseException = new InvalidResponseException(miLoginResult.serverError);
                }
                if (!miLoginResult.isStsCallbackError) {
                    throw invalidResponseException;
                }
                invalidResponseException.stsUrlRequestError(miLoginResult.serviceId);
                throw invalidResponseException;
            case 7:
                AccessDeniedException accessDeniedException = new AccessDeniedException(403, "access denied");
                if (!miLoginResult.isStsCallbackError) {
                    throw accessDeniedException;
                }
                accessDeniedException.stsUrlRequestError(miLoginResult.serviceId);
                throw accessDeniedException;
            case 8:
                throw new InvalidUserNameException();
            case 9:
                throw new IllegalDeviceException("device id should not be null");
            case 10:
                throw new SSLException("time or network error");
            case 11:
                throw new InvalidStep2codeException();
            case 12:
            default:
                throw new IllegalStateException("this should not be happen");
            case 13:
                throw new RemoteException("Service side fatal error");
        }
    }
}
