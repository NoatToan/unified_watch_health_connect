package z30;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.ConnectionResult;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import tn.k;
import z0.g0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lz30/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f202126f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l<? super Integer, Unit> f202127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f202128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f202129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f202130d = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f202131e = -1;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f202128b = arguments.getString("EXTRA_TITLE");
            this.f202129c = arguments.getString("EXTRA_MESSAGE");
            this.f202130d = arguments.getInt("EXTRA_DISPLAY_INTERVAL", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            this.f202131e = arguments.getInt("EXTRA_REQUEST_CODE", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm3_tip_create_course_success_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new g0(this, 2), this.f202130d);
        if (this.f202128b != null) {
            TextView textView = (TextView) view2.findViewById(R.id.success_info_title);
            textView.getClass();
            textView.setVisibility(0);
            textView.setText(this.f202128b);
        }
        if (this.f202129c != null) {
            TextView textView2 = (TextView) view2.findViewById(R.id.success_info_message);
            textView2.getClass();
            textView2.setVisibility(0);
            textView2.setText(this.f202129c);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lz30/b$a;", "", "<init>", "()V", "", "EXTRA_TITLE", "Ljava/lang/String;", "EXTRA_MESSAGE", "EXTRA_DISPLAY_INTERVAL", "EXTRA_REQUEST_CODE", "", "DEFAULT_SUCCESS_INDICATOR_DISPLAY_INTERVAL", "I", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a() {
            b bVar = new b();
            Bundle bundleD = k.d("EXTRA_TITLE", null, "EXTRA_MESSAGE", null);
            bundleD.putInt("EXTRA_DISPLAY_INTERVAL", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            bundleD.putInt("EXTRA_REQUEST_CODE", -1);
            bVar.setArguments(bundleD);
            return bVar;
        }

        private a() {
        }
    }
}
