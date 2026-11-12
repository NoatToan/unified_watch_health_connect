package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43306f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f43307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f43308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f43311e = new ArrayList();

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "SkipWiFiNetworksFragment", ".onCreate()");
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f43309c = arguments != null ? arguments.getString("GCM_extra_device_image_url") : null;
            this.f43310d = arguments != null ? arguments.getString("GCM_extra_fallback_image_url") : null;
            ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("KEY_CURRENT_STORED_NETWORKS") : null;
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList();
            }
            this.f43311e = parcelableArrayList;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        ImageView imageView;
        layoutInflater.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "SkipWiFiNetworksFragment", ".onCreateView()");
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_wifi_already_stored, (ViewGroup) null);
        this.f43307a = viewInflate;
        if (viewInflate != null && (imageView = (ImageView) viewInflate.findViewById(R.id.device_image)) != null) {
            zp0.c cVar = new zp0.c(this);
            cVar.f206565e = this.f43309c;
            cVar.f206566f = this.f43310d;
            cVar.f206570j = 2131231969;
            cVar.h(imageView);
        }
        View view2 = this.f43307a;
        this.f43308b = view2 != null ? (TextView) view2.findViewById(R.id.welcome_statement) : null;
        if (this.f43311e.size() > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = this.f43311e.iterator();
            while (it.hasNext()) {
                stringBuffer.append(((k) it.next()).f43320a);
                if (it.hasNext()) {
                    stringBuffer.append(", ");
                }
            }
            string = stringBuffer.toString();
            string.getClass();
        } else {
            string = "";
        }
        String string2 = getString(R.string.smart_scale_device_setup_wifi_already_stored_message, string);
        string2.getClass();
        TextView textView = this.f43308b;
        if (textView != null) {
            textView.setText(string2);
        }
        return this.f43307a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "FRAGMENT_NAME", "KEY_CURRENT_STORED_NETWORKS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
