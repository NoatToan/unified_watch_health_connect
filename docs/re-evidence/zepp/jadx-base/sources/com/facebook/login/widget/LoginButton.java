package com.facebook.login.widget;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.LoginTargetApp;
import com.facebook.login.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class LoginButton extends FacebookButtonBase {
    private static final String x = LoginButton.class.getName();
    private static final int y = 255;
    private static final int z = 0;
    private boolean i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private ToolTipPopup.Style n;
    private ToolTipMode o;
    private long p;
    public d properties;
    private ToolTipPopup q;
    private AccessTokenTracker r;
    private LoginManager s;
    private Float t;
    private int u;
    private final String v;

    @Nullable
    private CallbackManager w;

    public class LoginClickListener implements View.OnClickListener {

        public class a implements DialogInterface.OnClickListener {
            public final /* synthetic */ LoginManager a;

            public a(LoginManager loginManager) {
                this.a = loginManager;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.a.logOut();
            }
        }

        public LoginClickListener() {
        }

        public LoginManager getLoginManager() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                LoginManager loginManager = LoginManager.getInstance();
                loginManager.setDefaultAudience(LoginButton.this.getDefaultAudience());
                loginManager.setLoginBehavior(LoginButton.this.getLoginBehavior());
                loginManager.setLoginTargetApp(getLoginTargetApp());
                loginManager.setAuthType(LoginButton.this.getAuthType());
                loginManager.setFamilyLogin(isFamilyLogin());
                loginManager.setShouldSkipAccountDeduplication(LoginButton.this.getShouldSkipAccountDeduplication());
                loginManager.setMessengerPageId(LoginButton.this.getMessengerPageId());
                loginManager.setResetMessengerState(LoginButton.this.getResetMessengerState());
                return loginManager;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public LoginTargetApp getLoginTargetApp() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return LoginTargetApp.FACEBOOK;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public boolean isFamilyLogin() {
            CrashShieldHandler.isObjectCrashing(this);
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LoginButton.this.callExternalOnClickListener(view);
                AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
                if (AccessToken.isCurrentAccessTokenActive()) {
                    performLogout(LoginButton.this.getContext());
                } else {
                    performLogin();
                }
                InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(LoginButton.this.getContext());
                Bundle bundle = new Bundle();
                bundle.putInt("logging_in", currentAccessToken != null ? 0 : 1);
                bundle.putInt("access_token_expired", AccessToken.isCurrentAccessTokenActive() ? 1 : 0);
                internalAppEventsLogger.logEventImplicitly(LoginButton.this.l, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        public void performLogin() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LoginManager loginManager = getLoginManager();
                if (LoginButton.this.getAndroidxActivityResultRegistryOwner() != null) {
                    loginManager.logIn(LoginButton.this.getAndroidxActivityResultRegistryOwner(), LoginButton.this.w != null ? LoginButton.this.w : new CallbackManagerImpl(), LoginButton.this.properties.b, LoginButton.this.getLoggerID());
                    return;
                }
                if (LoginButton.this.getFragment() != null) {
                    loginManager.logIn(LoginButton.this.getFragment(), LoginButton.this.properties.b, LoginButton.this.getLoggerID());
                } else if (LoginButton.this.getNativeFragment() != null) {
                    loginManager.logIn(LoginButton.this.getNativeFragment(), LoginButton.this.properties.b, LoginButton.this.getLoggerID());
                } else {
                    loginManager.logIn(LoginButton.this.getActivity(), LoginButton.this.properties.b, LoginButton.this.getLoggerID());
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        public void performLogout(Context context) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LoginManager loginManager = getLoginManager();
                if (!LoginButton.this.i) {
                    loginManager.logOut();
                    return;
                }
                String string = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_log_out_action);
                String string2 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_cancel_action);
                Profile currentProfile = Profile.getCurrentProfile();
                String string3 = (currentProfile == null || currentProfile.getName() == null) ? LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook) : String.format(LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_as), currentProfile.getName());
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string3).setCancelable(true).setPositiveButton(string, new a(loginManager)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public enum ToolTipMode {
        AUTOMATIC(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);

        public static ToolTipMode DEFAULT = AUTOMATIC;
        private int intValue;
        private String stringValue;

        ToolTipMode(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ToolTipMode fromInt(int i) {
            for (ToolTipMode toolTipMode : values()) {
                if (toolTipMode.getValue() == i) {
                    return toolTipMode;
                }
            }
            return null;
        }

        public int getValue() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ String a;

        /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$a$a, reason: collision with other inner class name */
        public class RunnableC0134a implements Runnable {
            public final /* synthetic */ FetchedAppSettings a;

            public RunnableC0134a(FetchedAppSettings fetchedAppSettings) {
                this.a = fetchedAppSettings;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    LoginButton.this.r(this.a);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LoginButton.this.getActivity().runOnUiThread(new RunnableC0134a(FetchedAppSettingsManager.queryAppSettings(this.a, false)));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public class b extends AccessTokenTracker {
        public b() {
        }

        @Override // com.facebook.AccessTokenTracker
        public void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
            LoginButton.this.setButtonText();
            LoginButton.this.setButtonIcon();
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ToolTipMode.values().length];
            a = iArr;
            try {
                iArr[ToolTipMode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class d {
        private DefaultAudience a = DefaultAudience.FRIENDS;
        private List<String> b = Collections.emptyList();
        private LoginBehavior c = LoginBehavior.NATIVE_WITH_FALLBACK;
        private String d = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
        private LoginTargetApp e = LoginTargetApp.FACEBOOK;
        private boolean f = false;

        @Nullable
        private String g;
        private boolean h;

        public void b() {
            this.b = null;
        }

        public String c() {
            return this.d;
        }

        public DefaultAudience d() {
            return this.a;
        }

        public LoginBehavior e() {
            return this.c;
        }

        public LoginTargetApp f() {
            return this.e;
        }

        @Nullable
        public String g() {
            return this.g;
        }

        public List<String> h() {
            return this.b;
        }

        public boolean i() {
            return this.h;
        }

        public boolean j() {
            return this.f;
        }

        public void k(String str) {
            this.d = str;
        }

        public void l(DefaultAudience defaultAudience) {
            this.a = defaultAudience;
        }

        public void m(LoginBehavior loginBehavior) {
            this.c = loginBehavior;
        }

        public void n(LoginTargetApp loginTargetApp) {
            this.e = loginTargetApp;
        }

        public void o(@Nullable String str) {
            this.g = str;
        }

        public void p(List<String> list) {
            this.b = list;
        }

        public void q(boolean z) {
            this.h = z;
        }

        public void r(boolean z) {
            this.f = z;
        }
    }

    public LoginButton(Context context) {
        super(context, null, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        this.properties = new d();
        this.l = AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE;
        this.n = ToolTipPopup.Style.BLUE;
        this.p = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.u = 255;
        this.v = UUID.randomUUID().toString();
        this.w = null;
    }

    private void o() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int i = c.a[this.o.ordinal()];
            if (i == 1) {
                FacebookSdk.getExecutor().execute(new a(Utility.getMetadataApplicationId(getContext())));
            } else {
                if (i != 2) {
                    return;
                }
                p(getResources().getString(R.string.com_facebook_tooltip_default));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void p(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ToolTipPopup toolTipPopup = new ToolTipPopup(str, this);
            this.q = toolTipPopup;
            toolTipPopup.setStyle(this.n);
            this.q.setNuxDisplayTime(this.p);
            this.q.show();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private int q(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + measureTextWidth(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(FetchedAppSettings fetchedAppSettings) {
        if (CrashShieldHandler.isObjectCrashing(this) || fetchedAppSettings == null) {
            return;
        }
        try {
            if (fetchedAppSettings.getNuxEnabled() && getVisibility() == 0) {
                p(fetchedAppSettings.getNuxContent());
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void clearPermissions() {
        this.properties.b();
    }

    @Override // com.facebook.FacebookButtonBase
    public void configureButton(Context context, AttributeSet attributeSet, int i, int i2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.configureButton(context, attributeSet, i, i2);
            setInternalOnClickListener(getNewLoginClickListener());
            parseLoginButtonAttributes(context, attributeSet, i, i2);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(com.facebook.common.R.color.com_facebook_blue));
                this.j = "Continue with Facebook";
            } else {
                this.r = new b();
            }
            setButtonText();
            setButtonRadius();
            setButtonTransparency();
            setButtonIcon();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void dismissToolTip() {
        ToolTipPopup toolTipPopup = this.q;
        if (toolTipPopup != null) {
            toolTipPopup.dismiss();
            this.q = null;
        }
    }

    public String getAuthType() {
        return this.properties.c();
    }

    @Nullable
    public CallbackManager getCallbackManager() {
        return this.w;
    }

    public DefaultAudience getDefaultAudience() {
        return this.properties.d();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    public String getLoggerID() {
        return this.v;
    }

    public LoginBehavior getLoginBehavior() {
        return this.properties.e();
    }

    @StringRes
    public int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    public int getLoginButtonWidth(int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String string = this.j;
            if (string == null) {
                string = resources.getString(R.string.com_facebook_loginview_log_in_button_continue);
                int iQ = q(string);
                if (Button.resolveSize(iQ, i) < iQ) {
                    string = resources.getString(R.string.com_facebook_loginview_log_in_button);
                }
            }
            return q(string);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public LoginManager getLoginManager() {
        if (this.s == null) {
            this.s = LoginManager.getInstance();
        }
        return this.s;
    }

    public LoginTargetApp getLoginTargetApp() {
        return this.properties.f();
    }

    @Nullable
    public String getMessengerPageId() {
        return this.properties.g();
    }

    public LoginClickListener getNewLoginClickListener() {
        return new LoginClickListener();
    }

    public List<String> getPermissions() {
        return this.properties.h();
    }

    public boolean getResetMessengerState() {
        return this.properties.i();
    }

    public boolean getShouldSkipAccountDeduplication() {
        return this.properties.j();
    }

    public long getToolTipDisplayTime() {
        return this.p;
    }

    public ToolTipMode getToolTipMode() {
        return this.o;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            AccessTokenTracker accessTokenTracker = this.r;
            if (accessTokenTracker == null || accessTokenTracker.isTracking()) {
                return;
            }
            this.r.startTracking();
            setButtonText();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            AccessTokenTracker accessTokenTracker = this.r;
            if (accessTokenTracker != null) {
                accessTokenTracker.stopTracking();
            }
            dismissToolTip();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onDraw(canvas);
            if (this.m || isInEditMode()) {
                return;
            }
            this.m = true;
            o();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onLayout(z2, i, i2, i3, i4);
            setButtonText();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int loginButtonWidth = getLoginButtonWidth(i);
            String string = this.k;
            if (string == null) {
                string = resources.getString(R.string.com_facebook_loginview_log_out_button);
            }
            setMeasuredDimension(Button.resolveSize(Math.max(loginButtonWidth, q(string)), i), compoundPaddingTop);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onVisibilityChanged(view, i);
            if (i != 0) {
                dismissToolTip();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void parseLoginButtonAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.o = ToolTipMode.DEFAULT;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_login_view, i, i2);
            try {
                this.i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
                this.j = typedArrayObtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_login_text);
                this.k = typedArrayObtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_logout_text);
                this.o = ToolTipMode.fromInt(typedArrayObtainStyledAttributes.getInt(R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, ToolTipMode.DEFAULT.getValue()));
                int i3 = R.styleable.com_facebook_login_view_com_facebook_login_button_radius;
                if (typedArrayObtainStyledAttributes.hasValue(i3)) {
                    this.t = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(i3, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.com_facebook_login_view_com_facebook_login_button_transparency, 255);
                this.u = integer;
                if (integer < 0) {
                    this.u = 0;
                }
                if (this.u > 255) {
                    this.u = 255;
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void registerCallback(CallbackManager callbackManager, FacebookCallback<LoginResult> facebookCallback) {
        getLoginManager().registerCallback(callbackManager, facebookCallback);
        CallbackManager callbackManager2 = this.w;
        if (callbackManager2 == null) {
            this.w = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            Log.w(x, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public void setAuthType(String str) {
        this.properties.k(str);
    }

    public void setButtonIcon() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(getContext(), com.facebook.common.R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @TargetApi(29)
    public void setButtonRadius() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.t == null) {
                return;
            }
            Drawable background = getBackground();
            if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                StateListDrawable stateListDrawable = (StateListDrawable) background;
                for (int i = 0; i < stateListDrawable.getStateCount(); i++) {
                    GradientDrawable gradientDrawable = (GradientDrawable) stateListDrawable.getStateDrawable(i);
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius(this.t.floatValue());
                    }
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(this.t.floatValue());
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void setButtonText() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.isCurrentAccessTokenActive()) {
                String string = this.k;
                if (string == null) {
                    string = resources.getString(R.string.com_facebook_loginview_log_out_button);
                }
                setText(string);
                return;
            }
            String str = this.j;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            int width = getWidth();
            if (width != 0 && q(string2) > width) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_in_button);
            }
            setText(string2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void setButtonTransparency() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.u);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void setDefaultAudience(DefaultAudience defaultAudience) {
        this.properties.l(defaultAudience);
    }

    public void setLoginBehavior(LoginBehavior loginBehavior) {
        this.properties.m(loginBehavior);
    }

    public void setLoginManager(LoginManager loginManager) {
        this.s = loginManager;
    }

    public void setLoginTargetApp(LoginTargetApp loginTargetApp) {
        this.properties.n(loginTargetApp);
    }

    public void setLoginText(String str) {
        this.j = str;
        setButtonText();
    }

    public void setLogoutText(String str) {
        this.k = str;
        setButtonText();
    }

    public void setMessengerPageId(String str) {
        this.properties.o(str);
    }

    public void setPermissions(List<String> list) {
        this.properties.p(list);
    }

    public void setProperties(d dVar) {
        this.properties = dVar;
    }

    public void setPublishPermissions(List<String> list) {
        this.properties.p(list);
    }

    public void setReadPermissions(List<String> list) {
        this.properties.p(list);
    }

    public void setResetMessengerState(boolean z2) {
        this.properties.q(z2);
    }

    public void setToolTipDisplayTime(long j) {
        this.p = j;
    }

    public void setToolTipMode(ToolTipMode toolTipMode) {
        this.o = toolTipMode;
    }

    public void setToolTipStyle(ToolTipPopup.Style style) {
        this.n = style;
    }

    public void unregisterCallback(CallbackManager callbackManager) {
        getLoginManager().unregisterCallback(callbackManager);
    }

    public void setPermissions(String... strArr) {
        this.properties.p(Arrays.asList(strArr));
    }

    public void setPublishPermissions(String... strArr) {
        this.properties.p(Arrays.asList(strArr));
    }

    public void setReadPermissions(String... strArr) {
        this.properties.p(Arrays.asList(strArr));
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        this.properties = new d();
        this.l = AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE;
        this.n = ToolTipPopup.Style.BLUE;
        this.p = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.u = 255;
        this.v = UUID.randomUUID().toString();
        this.w = null;
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        this.properties = new d();
        this.l = AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE;
        this.n = ToolTipPopup.Style.BLUE;
        this.p = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.u = 255;
        this.v = UUID.randomUUID().toString();
        this.w = null;
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, i, i2, str, str2);
        this.properties = new d();
        this.l = AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE;
        this.n = ToolTipPopup.Style.BLUE;
        this.p = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.u = 255;
        this.v = UUID.randomUUID().toString();
        this.w = null;
    }
}
