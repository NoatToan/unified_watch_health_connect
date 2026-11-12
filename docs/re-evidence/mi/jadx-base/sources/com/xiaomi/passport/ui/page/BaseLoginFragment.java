package com.xiaomi.passport.ui.page;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.account.XMPassport;
import com.xiaomi.accountsdk.account.data.BaseConstants;
import com.xiaomi.accountsdk.account.data.Constants;
import com.xiaomi.accountsdk.account.data.RegisterUserInfo;
import com.xiaomi.accountsdk.account.stat.AccountStatInterface;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.accountsdk.request.SimpleRequestForAccount;
import com.xiaomi.passport.task.BgTask;
import com.xiaomi.passport.ui.license.LoginAgreementAndPrivacy;
import com.xiaomi.passport.ui.view.EditTextGroupView;
import com.xiaomi.passport.ui.view.PassportDialog;
import com.xiaomi.verificationsdk.VerificationManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseLoginFragment extends BaseFragment {
    private static final String EXTRA_KEY_LONG_START_TS_MS = "start_ts_ms";
    private BgTask<Bitmap> mAvatarTask;
    protected String mExtBannerBiz;
    protected boolean mExtraUserAgreementSelected;
    protected LoginAgreementAndPrivacy mLoginAgreementAndPrivacy;
    protected PassportDialog mLoginLoadingDialog;
    protected LoginUIAction mLoginUIAction;
    protected boolean mNeedShowUserAgreement;
    private long mPageStartTsMs;
    protected String mSid;
    private VerificationManager mVerificationManager;

    /* JADX INFO: renamed from: com.xiaomi.passport.ui.page.BaseLoginFragment$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$xiaomi$passport$ui$page$BaseLoginFragment$LoginFragmentType;

        static {
            int[] iArr = new int[LoginFragmentType.values().length];
            $SwitchMap$com$xiaomi$passport$ui$page$BaseLoginFragment$LoginFragmentType = iArr;
            try {
                iArr[LoginFragmentType.VERIFY_CODE_LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xiaomi$passport$ui$page$BaseLoginFragment$LoginFragmentType[LoginFragmentType.PASSWORD_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xiaomi$passport$ui$page$BaseLoginFragment$LoginFragmentType[LoginFragmentType.INPUT_PHONE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$xiaomi$passport$ui$page$BaseLoginFragment$LoginFragmentType[LoginFragmentType.PHONE_ACCOUNT_LOGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$xiaomi$passport$ui$page$BaseLoginFragment$LoginFragmentType[LoginFragmentType.PHONE_ACCOUNT_QUICK_LOGIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$xiaomi$passport$ui$page$BaseLoginFragment$LoginFragmentType[LoginFragmentType.SNS_LOGIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum LoginFragmentType {
        VERIFY_CODE_LOGIN,
        PASSWORD_LOGIN,
        INPUT_PHONE_NUMBER,
        PHONE_ACCOUNT_LOGIN,
        PHONE_ACCOUNT_QUICK_LOGIN,
        SNS_LOGIN
    }

    public interface OnCaptchaCallback {
        void onCaptcha(String str, String str2);
    }

    public interface OnChooseLogin {
        void onRegister();

        void onTicketLogin();
    }

    public interface OnDynamicLoginDialogCallback {
        void onDialogCheck(String str, boolean z);
    }

    private void initSettings() {
        if (this.mNeedShowUserAgreement) {
            setUserAgreementState(this.mExtraUserAgreementSelected);
        } else {
            setUserAgreementState(true);
        }
    }

    private void initVars() {
        Bundle fullArguments = getFullArguments();
        String string = fullArguments.getString("service_id");
        this.mSid = string;
        AccountStatInterface.setSidCommonProperty(string);
        this.mExtBannerBiz = fullArguments.getString(BaseConstants.EXTRA_BANNER_BIZ);
        PassportDialog passportDialog = new PassportDialog(getActivity());
        this.mLoginLoadingDialog = passportDialog;
        passportDialog.setLoadingProgressVisible(true);
        this.mLoginLoadingDialog.setMessage(getString(R.string.passport_dialog_loading));
        this.mLoginLoadingDialog.setCancelable(false);
        VerificationManager verificationManager = new VerificationManager(getActivity());
        this.mVerificationManager = verificationManager;
        verificationManager.p0(Constants.VERIFICATIO_URL_DOMAIN);
        this.mVerificationManager.r0(Constants.VERIFICATION_KEY);
        this.mVerificationManager.q0(Boolean.TRUE);
        this.mVerificationManager.k0();
        LoginAgreementAndPrivacy loginAgreementAndPrivacy = (LoginAgreementAndPrivacy) fullArguments.getParcelable(AccountLoginActivity.EXTRA_PARCEL_LOGIN_AGREEMENT_AND_PRIVACY);
        this.mLoginAgreementAndPrivacy = loginAgreementAndPrivacy;
        if (loginAgreementAndPrivacy == null) {
            this.mLoginAgreementAndPrivacy = new LoginAgreementAndPrivacy.Builder(LoginAgreementAndPrivacy.Type.DEF).build();
        }
        this.mNeedShowUserAgreement = fullArguments.getBoolean(AccountLoginActivity.EXTRA_BOOL_SHOW_USER_AGREEMENT, true);
        this.mExtraUserAgreementSelected = fullArguments.getBoolean(AccountLoginActivity.EXTRA_BOOL_USER_AGREEMENT_INIT_SELECTED, false);
    }

    public static BaseLoginFragment newInstance(Bundle bundle, LoginFragmentType loginFragmentType) {
        BaseLoginFragment verifyCodeLoginFragment;
        switch (AnonymousClass7.$SwitchMap$com$xiaomi$passport$ui$page$BaseLoginFragment$LoginFragmentType[loginFragmentType.ordinal()]) {
            case 1:
                verifyCodeLoginFragment = new VerifyCodeLoginFragment();
                break;
            case 2:
                verifyCodeLoginFragment = new PasswordLoginFragment();
                break;
            case 3:
                verifyCodeLoginFragment = new InputPhoneNumberFragment();
                break;
            case 4:
                verifyCodeLoginFragment = new PhoneAccountLoginFragment();
                break;
            case 5:
                verifyCodeLoginFragment = new PhoneAccountQuickLoginFragment();
                break;
            case 6:
                verifyCodeLoginFragment = new SNSLoginFragment();
                break;
            default:
                throw new IllegalArgumentException("unsupported fragment type");
        }
        if (bundle != null) {
            verifyCodeLoginFragment.setArguments(bundle);
        }
        return verifyCodeLoginFragment;
    }

    private void releaseVars() {
        this.mLoginLoadingDialog.dismiss();
        BgTask<Bitmap> bgTask = this.mAvatarTask;
        if (bgTask != null) {
            bgTask.cancelAndRelease();
            this.mAvatarTask = null;
        }
    }

    public void fillOriginalPageStartTsMs(Bundle bundle) {
        bundle.putLong(EXTRA_KEY_LONG_START_TS_MS, this.mPageStartTsMs);
    }

    public String getAgreements() {
        return "";
    }

    public abstract String getLoginTypeStatName();

    public Long getPageStartTsMs() {
        return Long.valueOf(this.mPageStartTsMs);
    }

    public boolean isUserAgreementSelected() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initVars();
        initSettings();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof LoginUIAction)) {
            throw new IllegalArgumentException("the context must be a impl of LoginUIController!");
        }
        this.mLoginUIAction = (LoginUIAction) context;
    }

    public void onCallAgreementConfirm(View.OnClickListener onClickListener) {
        showAgreementDialog(onClickListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        releaseVars();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Intent intent = getActivity().getIntent();
        Bundle bundle2 = new Bundle();
        if (intent != null && intent.getExtras() != null) {
            bundle2.putAll(intent.getExtras());
        }
        if (getArguments() != null) {
            bundle2.putAll(getArguments());
        }
        long j = bundle2.getLong(EXTRA_KEY_LONG_START_TS_MS, -1L);
        this.mPageStartTsMs = j;
        if (j > 0) {
            return;
        }
        this.mPageStartTsMs = SystemClock.elapsedRealtime();
    }

    public void setUserAgreementState(boolean z) {
    }

    public void showAgreementDialog(final View.OnClickListener onClickListener) {
        new PassportDialog(getContext()).setTitle(getString(R.string.passport_attention)).setPositiveButton(getString(R.string.passport_agree), new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.BaseLoginFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseLoginFragment.this.setUserAgreementState(true);
                onClickListener.onClick(view);
            }
        }).setNegativeButton(getString(android.R.string.cancel), null).setMessage(getAgreements()).show();
    }

    public void showCaptcha(String str, final OnCaptchaCallback onCaptchaCallback) {
        View viewInflate = View.inflate(getContext(), R.layout.passport_layout_dialog_captcha_input, null);
        final EditTextGroupView editTextGroupView = (EditTextGroupView) viewInflate.findViewById(R.id.captcha);
        editTextGroupView.setupCaptcha(XMPassport.ACCOUNT_DOMAIN + str);
        PassportDialog passportDialog = new PassportDialog(getContext());
        passportDialog.setTitle(getString(R.string.passport_dialog_captcha_title)).setView(viewInflate).setPositiveButton(getString(android.R.string.ok), new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.BaseLoginFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onCaptchaCallback.onCaptcha(editTextGroupView.getInputText(), editTextGroupView.getCaptchaIck());
            }
        });
        passportDialog.show();
    }

    public void showChooseToLogin(Context context, LayoutInflater layoutInflater, final RegisterUserInfo registerUserInfo, final OnChooseLogin onChooseLogin) {
        final View viewInflate = layoutInflater.inflate(R.layout.passport_layout_choose_to_signin_signup_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text_view_user_info);
        int i = R.string.passport_dialog_nick_name_prefix;
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(registerUserInfo.userName) ? registerUserInfo.maskedUserId : registerUserInfo.userName;
        textView.setText(String.format("%s\n%s", getString(i, objArr), getString(R.string.passport_dialog_phone_number_prefix, registerUserInfo.phone)));
        if (!TextUtils.isEmpty(registerUserInfo.avatarAddress)) {
            BgTask<Bitmap> bgTask = this.mAvatarTask;
            if (bgTask != null) {
                bgTask.cancelAndRelease();
                this.mAvatarTask = null;
            }
            BgTask<Bitmap> bgTask2 = new BgTask<>(new BgTask.BgTaskRunnable<Bitmap>() { // from class: com.xiaomi.passport.ui.page.BaseLoginFragment.3
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Code duplicated, block: B:28:0x0032  */
                /* JADX WARN: Code duplicated, block: B:5:0x000d A[PHI: r0 r1
                  0x000d: PHI (r0v7 java.io.InputStream) = (r0v0 java.io.InputStream), (r0v11 java.io.InputStream) binds: [B:23:0x0028, B:4:0x0009] A[DONT_GENERATE, DONT_INLINE]
                  0x000d: PHI (r1v6 com.xiaomi.accountsdk.request.SimpleRequest$StreamContent) = 
                  (r1v5 com.xiaomi.accountsdk.request.SimpleRequest$StreamContent)
                  (r1v9 com.xiaomi.accountsdk.request.SimpleRequest$StreamContent)
                 binds: [B:23:0x0028, B:4:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.xiaomi.passport.task.BgTask.BgTaskRunnable
                public Bitmap run() throws Throwable {
                    SimpleRequest.StreamContent asStream;
                    Throwable th;
                    InputStream stream = null;
                    try {
                        try {
                            asStream = SimpleRequestForAccount.getAsStream(registerUserInfo.avatarAddress, null, null);
                            try {
                                stream = asStream.getStream();
                            } catch (AccessDeniedException e) {
                                e = e;
                                e.printStackTrace();
                                if (asStream != null) {
                                }
                                return BitmapFactory.decodeStream(stream);
                            } catch (AuthenticationFailureException e2) {
                                e = e2;
                                e.printStackTrace();
                                if (asStream != null) {
                                }
                                return BitmapFactory.decodeStream(stream);
                            } catch (IOException e3) {
                                e = e3;
                                e.printStackTrace();
                                if (asStream != null) {
                                }
                                return BitmapFactory.decodeStream(stream);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (asStream != null) {
                                asStream.closeStream();
                            }
                            throw th;
                        }
                    } catch (AccessDeniedException e4) {
                        e = e4;
                        asStream = null;
                        e.printStackTrace();
                        if (asStream != null) {
                            asStream.closeStream();
                        }
                        return BitmapFactory.decodeStream(stream);
                    } catch (AuthenticationFailureException e5) {
                        e = e5;
                        asStream = null;
                        e.printStackTrace();
                        if (asStream != null) {
                            asStream.closeStream();
                        }
                        return BitmapFactory.decodeStream(stream);
                    } catch (IOException e6) {
                        e = e6;
                        asStream = null;
                        e.printStackTrace();
                        if (asStream != null) {
                            asStream.closeStream();
                        }
                        return BitmapFactory.decodeStream(stream);
                    } catch (Throwable th3) {
                        asStream = null;
                        th = th3;
                        if (asStream != null) {
                            asStream.closeStream();
                        }
                        throw th;
                    }
                    asStream.closeStream();
                    return BitmapFactory.decodeStream(stream);
                }
            }, new BgTask.SuccessResultRunnable<Bitmap>() { // from class: com.xiaomi.passport.ui.page.BaseLoginFragment.4
                @Override // com.xiaomi.passport.task.BgTask.SuccessResultRunnable
                public void run(Bitmap bitmap) {
                    if (BaseLoginFragment.this.isActivityAlive()) {
                        ((ImageView) viewInflate.findViewById(R.id.image_user_avatar)).setImageBitmap(bitmap);
                    }
                }
            }, null);
            this.mAvatarTask = bgTask2;
            bgTask2.execute();
        }
        PassportDialog passportDialog = new PassportDialog(context);
        passportDialog.setTitle(R.string.passport_dialog_is_your_mi_account);
        passportDialog.setView(viewInflate);
        passportDialog.setNegativeButton(getString(R.string.passport_dialog_register_other), new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.BaseLoginFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onChooseLogin.onRegister();
            }
        });
        passportDialog.setPositiveButton(getString(R.string.passport_dialog_is_my_account), new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.BaseLoginFragment.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onChooseLogin.onTicketLogin();
            }
        });
        passportDialog.show();
    }

    public void showVerification(String str, VerificationManager.VerifyResultCallback verifyResultCallback) {
        this.mVerificationManager.o0(str).s0(verifyResultCallback).y0();
    }
}
