package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceAuthDialog extends DialogFragment {
    private static final String l = "device/login";
    private static final String m = "device/login_status";
    private static final String n = "request_state";
    private static final int o = 1349172;
    private static final int p = 1349173;
    private static final int q = 1349174;
    private static final int r = 1349152;
    private View a;
    private TextView b;
    private TextView c;
    private DeviceAuthMethodHandler d;
    private volatile GraphRequestAsyncTask f;
    private volatile ScheduledFuture g;
    private volatile RequestState h;
    private AtomicBoolean e = new AtomicBoolean();
    private boolean i = false;
    private boolean j = false;
    private LoginClient.Request k = null;

    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new a();
        private String a;
        private String b;
        private String c;
        private long d;
        private long e;

        public static class a implements Parcelable.Creator<RequestState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        }

        public RequestState() {
        }

        public String a() {
            return this.a;
        }

        public long b() {
            return this.d;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(long j) {
            this.d = j;
        }

        public void f(long j) {
            this.e = j;
        }

        public void g(String str) {
            this.c = str;
        }

        public void h(String str) {
            this.b = str;
            this.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", str);
        }

        public boolean i() {
            return this.e != 0 && (new Date().getTime() - this.e) - (this.d * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }

        public RequestState(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readLong();
            this.e = parcel.readLong();
        }
    }

    public class a extends Dialog {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            DeviceAuthDialog.this.onBackButtonPressed();
            super.onBackPressed();
        }
    }

    public class b implements GraphRequest.Callback {
        public b() {
        }

        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            if (DeviceAuthDialog.this.i) {
                return;
            }
            if (graphResponse.getError() != null) {
                DeviceAuthDialog.this.onError(graphResponse.getError().getIo.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION java.lang.String());
                return;
            }
            JSONObject graphObject = graphResponse.getGraphObject();
            RequestState requestState = new RequestState();
            try {
                requestState.h(graphObject.getString("user_code"));
                requestState.g(graphObject.getString("code"));
                requestState.e(graphObject.getLong("interval"));
                DeviceAuthDialog.this.t(requestState);
            } catch (JSONException e) {
                DeviceAuthDialog.this.onError(new FacebookException(e));
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                DeviceAuthDialog.this.onCancel();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                DeviceAuthDialog.this.q();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public class e implements GraphRequest.Callback {
        public e() {
        }

        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            if (DeviceAuthDialog.this.e.get()) {
                return;
            }
            FacebookRequestError error = graphResponse.getError();
            if (error == null) {
                try {
                    JSONObject graphObject = graphResponse.getGraphObject();
                    DeviceAuthDialog.this.p(graphObject.getString("access_token"), Long.valueOf(graphObject.getLong("expires_in")), Long.valueOf(graphObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
                    return;
                } catch (JSONException e) {
                    DeviceAuthDialog.this.onError(new FacebookException(e));
                    return;
                }
            }
            int subErrorCode = error.getSubErrorCode();
            if (subErrorCode != DeviceAuthDialog.r) {
                switch (subErrorCode) {
                    case DeviceAuthDialog.o /* 1349172 */:
                    case DeviceAuthDialog.q /* 1349174 */:
                        DeviceAuthDialog.this.s();
                        break;
                    case DeviceAuthDialog.p /* 1349173 */:
                        DeviceAuthDialog.this.onCancel();
                        break;
                    default:
                        DeviceAuthDialog.this.onError(graphResponse.getError().getIo.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION java.lang.String());
                        break;
                }
                return;
            }
            if (DeviceAuthDialog.this.h != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.this.h.d());
            }
            if (DeviceAuthDialog.this.k == null) {
                DeviceAuthDialog.this.onCancel();
            } else {
                DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                deviceAuthDialog.startLogin(deviceAuthDialog.k);
            }
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.getDialog().setContentView(DeviceAuthDialog.this.initializeContentView(false));
            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
            deviceAuthDialog.startLogin(deviceAuthDialog.k);
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ Utility.PermissionsLists b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Date d;
        public final /* synthetic */ Date e;

        public g(String str, Utility.PermissionsLists permissionsLists, String str2, Date date, Date date2) {
            this.a = str;
            this.b = permissionsLists;
            this.c = str2;
            this.d = date;
            this.e = date2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.n(this.a, this.b, this.c, this.d, this.e);
        }
    }

    public class h implements GraphRequest.Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ Date c;

        public h(String str, Date date, Date date2) {
            this.a = str;
            this.b = date;
            this.c = date2;
        }

        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            if (DeviceAuthDialog.this.e.get()) {
                return;
            }
            if (graphResponse.getError() != null) {
                DeviceAuthDialog.this.onError(graphResponse.getError().getIo.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION java.lang.String());
                return;
            }
            try {
                JSONObject graphObject = graphResponse.getGraphObject();
                String string = graphObject.getString("id");
                Utility.PermissionsLists permissionsListsHandlePermissionResponse = Utility.handlePermissionResponse(graphObject);
                String string2 = graphObject.getString("name");
                DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.this.h.d());
                if (!FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId()).getSmartLoginOptions().contains(SmartLoginOption.RequireConfirm) || DeviceAuthDialog.this.j) {
                    DeviceAuthDialog.this.n(string, permissionsListsHandlePermissionResponse, this.a, this.b, this.c);
                } else {
                    DeviceAuthDialog.this.j = true;
                    DeviceAuthDialog.this.r(string, permissionsListsHandlePermissionResponse, this.a, string2, this.b, this.c);
                }
            } catch (JSONException e) {
                DeviceAuthDialog.this.onError(new FacebookException(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str, Utility.PermissionsLists permissionsLists, String str2, Date date, Date date2) {
        this.d.e(str2, FacebookSdk.getApplicationId(), str, permissionsLists.getGrantedPermissions(), permissionsLists.getDeclinedPermissions(), permissionsLists.getExpiredPermissions(), AccessTokenSource.DEVICE_AUTH, date, null, date2);
        getDialog().dismiss();
    }

    private GraphRequest o() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.h.c());
        return new GraphRequest(null, m, bundle, HttpMethod.POST, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, Long l2, Long l3) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, "id,permissions,name");
        Date date = l2.longValue() != 0 ? new Date(new Date().getTime() + (l2.longValue() * 1000)) : null;
        Date date2 = l3.longValue() != 0 ? new Date(l3.longValue() * 1000) : null;
        new GraphRequest(new AccessToken(str, FacebookSdk.getApplicationId(), "0", null, null, null, null, date, null, date2), TournamentShareDialogURIBuilder.me, bundle, HttpMethod.GET, new h(str, date, date2)).executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.h.f(new Date().getTime());
        this.f = o().executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Utility.PermissionsLists permissionsLists, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_title);
        String string2 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_continue_as);
        String string3 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_cancel);
        String str4 = String.format(string2, str3);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str4, new g(str, permissionsLists, str2, date, date2)).setPositiveButton(string3, new f());
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.g = DeviceAuthMethodHandler.b().schedule(new d(), this.h.b(), TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(RequestState requestState) {
        this.h = requestState;
        this.b.setText(requestState.d());
        this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), DeviceRequestsHelper.generateQRCode(requestState.a())), (Drawable) null, (Drawable) null);
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        if (!this.j && DeviceRequestsHelper.startAdvertisementService(requestState.d())) {
            new InternalAppEventsLogger(getContext()).logEventImplicitly(AnalyticsEvents.EVENT_SMART_LOGIN_SERVICE);
        }
        if (requestState.i()) {
            s();
        } else {
            q();
        }
    }

    @LayoutRes
    public int getLayoutResId(boolean z) {
        return z ? com.facebook.common.R.layout.com_facebook_smart_device_dialog_fragment : com.facebook.common.R.layout.com_facebook_device_auth_dialog_fragment;
    }

    public View initializeContentView(boolean z) {
        View viewInflate = getActivity().getLayoutInflater().inflate(getLayoutResId(z), (ViewGroup) null);
        this.a = viewInflate.findViewById(com.facebook.common.R.id.progress_bar);
        this.b = (TextView) viewInflate.findViewById(com.facebook.common.R.id.confirmation_code);
        ((Button) viewInflate.findViewById(com.facebook.common.R.id.cancel_button)).setOnClickListener(new c());
        TextView textView = (TextView) viewInflate.findViewById(com.facebook.common.R.id.com_facebook_device_auth_instructions);
        this.c = textView;
        textView.setText(Html.fromHtml(getString(com.facebook.common.R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    @Nullable
    public Map<String, String> m() {
        return null;
    }

    public void onBackButtonPressed() {
    }

    public void onCancel() {
        if (this.e.compareAndSet(false, true)) {
            if (this.h != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(this.h.d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.d;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.c();
            }
            getDialog().dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        a aVar = new a(getActivity(), com.facebook.common.R.style.com_facebook_auth_dialog);
        aVar.setContentView(initializeContentView(DeviceRequestsHelper.isAvailable() && !this.j));
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.d = (DeviceAuthMethodHandler) ((LoginFragment) ((FacebookActivity) getActivity()).getCurrentFragment()).b().l();
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable(n)) != null) {
            t(requestState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.i = true;
        this.e.set(true);
        super.onDestroyView();
        if (this.f != null) {
            this.f.cancel(true);
        }
        if (this.g != null) {
            this.g.cancel(true);
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.i) {
            return;
        }
        onCancel();
    }

    public void onError(FacebookException facebookException) {
        if (this.e.compareAndSet(false, true)) {
            if (this.h != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(this.h.d());
            }
            this.d.d(facebookException);
            getDialog().dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.h != null) {
            bundle.putParcelable(n, this.h);
        }
    }

    public void startLogin(LoginClient.Request request) {
        this.k = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.i()));
        String strF = request.f();
        if (strF != null) {
            bundle.putString("redirect_uri", strF);
        }
        String strE = request.e();
        if (strE != null) {
            bundle.putString(DeviceRequestsHelper.DEVICE_TARGET_USER_ID, strE);
        }
        bundle.putString("access_token", Validate.hasAppID() + AESEncryptionHelper.SEPARATOR + Validate.hasClientToken());
        bundle.putString(DeviceRequestsHelper.DEVICE_INFO_PARAM, DeviceRequestsHelper.getDeviceInfo(m()));
        new GraphRequest(null, l, bundle, HttpMethod.POST, new b()).executeAsync();
    }
}
