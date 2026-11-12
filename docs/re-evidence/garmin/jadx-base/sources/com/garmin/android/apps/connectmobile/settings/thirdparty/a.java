package com.garmin.android.apps.connectmobile.settings.thirdparty;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.settings.model.Office365SettingDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0822a f43960g = new C0822a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ak1.c f43961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Office365SettingDTO f43962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q1 f43963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwitchCompat f43964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SwitchCompat f43965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SwitchCompat f43966f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f43961a = (ak1.c) context;
        } catch (ClassCastException unused) {
            p6.b.m(context, ak1.c.class.getName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("office_settings", Office365SettingDTO.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("office_settings");
                if (!(parcelable2 instanceof Office365SettingDTO)) {
                    parcelable2 = null;
                }
                parcelable = (Office365SettingDTO) parcelable2;
            }
            this.f43962b = (Office365SettingDTO) parcelable;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_office365_connected_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        ((TextView) view2.findViewById(R.id.btn_disconnect)).setOnClickListener(new a32.b(this, 2));
        this.f43964d = (SwitchCompat) view2.findViewById(R.id.push_activity);
        this.f43965e = (SwitchCompat) view2.findViewById(R.id.push_workouts);
        this.f43966f = (SwitchCompat) view2.findViewById(R.id.push_group_events);
        Office365SettingDTO office365SettingDTO = this.f43962b;
        if (office365SettingDTO != null) {
            SwitchCompat switchCompat = this.f43964d;
            boolean z14 = false;
            if (switchCompat != null) {
                switchCompat.setChecked(office365SettingDTO.f43512b);
            }
            SwitchCompat switchCompat2 = this.f43966f;
            if (switchCompat2 != null) {
                Office365SettingDTO office365SettingDTO2 = this.f43962b;
                switchCompat2.setChecked(office365SettingDTO2 != null && office365SettingDTO2.f43513c);
            }
            SwitchCompat switchCompat3 = this.f43965e;
            if (switchCompat3 != null) {
                Office365SettingDTO office365SettingDTO3 = this.f43962b;
                if (office365SettingDTO3 != null && office365SettingDTO3.f43514d) {
                    z14 = true;
                }
                switchCompat3.setChecked(z14);
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.thirdparty.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/a$a;", "", "<init>", "()V", "", "OFFICE_SETTINGS_TAG", "Ljava/lang/String;", "OFFICE_DISCONNECT_CANCELATION_TAG", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0822a {
        public /* synthetic */ C0822a(j jVar) {
            this();
        }

        private C0822a() {
        }
    }
}
