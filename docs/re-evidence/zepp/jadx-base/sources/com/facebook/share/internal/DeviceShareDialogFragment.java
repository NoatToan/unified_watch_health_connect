package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.common.R;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class DeviceShareDialogFragment extends DialogFragment {
    public static final String TAG = "DeviceShareDialogFragment";
    private static final String g = "device/share";
    private static final String h = "request_state";
    private static final String i = "error";
    private static ScheduledThreadPoolExecutor j;
    private ProgressBar a;
    private TextView b;
    private Dialog c;
    private volatile RequestState d;
    private volatile ScheduledFuture e;
    private ShareContent f;

    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new a();
        private String a;
        private long b;

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

        public long a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }

        public void c(long j) {
            this.b = j;
        }

        public void d(String str) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeLong(this.b);
        }

        public RequestState(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readLong();
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                DeviceShareDialogFragment.this.c.dismiss();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public class b implements GraphRequest.Callback {
        public b() {
        }

        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            FacebookRequestError error = graphResponse.getError();
            if (error != null) {
                DeviceShareDialogFragment.this.f(error);
                return;
            }
            JSONObject graphObject = graphResponse.getGraphObject();
            RequestState requestState = new RequestState();
            try {
                requestState.d(graphObject.getString("user_code"));
                requestState.c(graphObject.getLong("expires_in"));
                DeviceShareDialogFragment.this.i(requestState);
            } catch (JSONException unused) {
                DeviceShareDialogFragment.this.f(new FacebookRequestError(0, "", "Malformed server response"));
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                DeviceShareDialogFragment.this.c.dismiss();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private void d() {
        if (isAdded()) {
            getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    private void e(int i2, Intent intent) {
        if (this.d != null) {
            DeviceRequestsHelper.cleanUpAdvertisementService(this.d.b());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.getErrorMessage(), 0).show();
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(i2, intent);
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(FacebookRequestError facebookRequestError) {
        d();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        e(-1, intent);
    }

    private static synchronized ScheduledThreadPoolExecutor g() {
        if (j == null) {
            j = new ScheduledThreadPoolExecutor(1);
        }
        return j;
    }

    private Bundle h() {
        ShareContent shareContent = this.f;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return WebDialogParameters.create((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return WebDialogParameters.create((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(RequestState requestState) {
        this.d = requestState;
        this.b.setText(requestState.b());
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        this.e = g().schedule(new c(), requestState.a(), TimeUnit.SECONDS);
    }

    private void j() {
        Bundle bundleH = h();
        if (bundleH == null || bundleH.size() == 0) {
            f(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        bundleH.putString("access_token", Validate.hasAppID() + AESEncryptionHelper.SEPARATOR + Validate.hasClientToken());
        bundleH.putString(DeviceRequestsHelper.DEVICE_INFO_PARAM, DeviceRequestsHelper.getDeviceInfo());
        new GraphRequest(null, g, bundleH, HttpMethod.POST, new b()).executeAsync();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        this.c = new Dialog(getActivity(), R.style.com_facebook_auth_dialog);
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.a = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
        this.b = (TextView) viewInflate.findViewById(R.id.confirmation_code);
        ((Button) viewInflate.findViewById(R.id.cancel_button)).setOnClickListener(new a());
        ((TextView) viewInflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        this.c.setContentView(viewInflate);
        j();
        return this.c;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable(h)) != null) {
            i(requestState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.e != null) {
            this.e.cancel(true);
        }
        e(-1, new Intent());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.d != null) {
            bundle.putParcelable(h, this.d);
        }
    }

    public void setShareContent(ShareContent shareContent) {
        this.f = shareContent;
    }
}
