package yo0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c3;
import com.garmin.android.apps.connectmobile.consent.DeviceUploadConsentActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import xk1.v;
import z10.d1;
import z10.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyo0/k;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f198403d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f198404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f198405b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c3 f198406c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f198404a = context;
        try {
            this.f198406c = (c3) context;
        } catch (ClassCastException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "MyDaySettingsDataUploadOffFragment", "Activity must implement StatusBannerListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f198405b = arguments.getLong("GCM_deviceUnitID", -1L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.home_data_consent_off_dynamic_device_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        final int i14 = 0;
        ((TextView) view2.findViewById(R.id.device_upload_redirect)).setOnClickListener(new View.OnClickListener(this) { // from class: yo0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f198402b;

            {
                this.f198402b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                k kVar = this.f198402b;
                switch (i15) {
                    case 0:
                        k.a aVar = k.f198403d;
                        DeviceUploadConsentActivity.a aVar2 = DeviceUploadConsentActivity.f32201b;
                        Context context = kVar.f198404a;
                        if (context == null) {
                            s.m("activityContext");
                            throw null;
                        }
                        aVar2.getClass();
                        if (d1.f()) {
                            d1.o(context, new v(12));
                            return;
                        } else {
                            a0.r(context, DeviceUploadConsentActivity.class);
                            return;
                        }
                    default:
                        long j8 = kVar.f198405b;
                        if (j8 != -1) {
                            Context context2 = kVar.f198404a;
                            if (context2 != null) {
                                context2.startActivity(DeviceDetailsActivity.ma(context2, j8));
                                return;
                            } else {
                                s.m("activityContext");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        final int i15 = 1;
        ((TextView) view2.findViewById(R.id.device_settings_redirect)).setOnClickListener(new View.OnClickListener(this) { // from class: yo0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f198402b;

            {
                this.f198402b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                k kVar = this.f198402b;
                switch (i16) {
                    case 0:
                        k.a aVar = k.f198403d;
                        DeviceUploadConsentActivity.a aVar2 = DeviceUploadConsentActivity.f32201b;
                        Context context = kVar.f198404a;
                        if (context == null) {
                            s.m("activityContext");
                            throw null;
                        }
                        aVar2.getClass();
                        if (d1.f()) {
                            d1.o(context, new v(12));
                            return;
                        } else {
                            a0.r(context, DeviceUploadConsentActivity.class);
                            return;
                        }
                    default:
                        long j8 = kVar.f198405b;
                        if (j8 != -1) {
                            Context context2 = kVar.f198404a;
                            if (context2 != null) {
                                context2.startActivity(DeviceDetailsActivity.ma(context2, j8));
                                return;
                            } else {
                                s.m("activityContext");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        c3 c3Var = this.f198406c;
        if (c3Var != null) {
            c3Var.checkConsentBannerStatus(l0.DEVICE_SETTINGS, R.string.msg_more_feature_available_upload);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyo0/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
