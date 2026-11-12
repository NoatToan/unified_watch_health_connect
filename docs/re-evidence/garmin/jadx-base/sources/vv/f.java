package vv;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o13.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vg1.f0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvv/f;", "Lvg1/f0;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f extends f0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f180406o = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f180407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f180408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public tv.d f180409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f180410l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f180411m = e.UNKNOWN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iz1.g f180412n = new iz1.g(this, 27);

    @Override // vg1.f0
    public final void la() {
        View viewFindViewById = findViewById(R.id.page_content);
        viewFindViewById.getClass();
        this.f180407i = (LinearLayout) viewFindViewById;
        LayoutInflater layoutInflater = getLayoutInflater();
        LinearLayout linearLayout = this.f180407i;
        if (linearLayout == null) {
            s.m(TtmlNode.RUBY_CONTAINER);
            throw null;
        }
        layoutInflater.inflate(R.layout.bike_sensors_device_disconnected_layout, linearLayout);
        View viewFindViewById2 = findViewById(R.id.error_msg_layout);
        viewFindViewById2.getClass();
        this.f180408j = viewFindViewById2;
        na();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void na() {
        tv.d dVar;
        if (this.f180407i == null || (dVar = this.f180409k) == null) {
            return;
        }
        boolean zA = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(dVar.f166500a);
        y0 y0Var = dVar.f166501b;
        fw.m mVar = (fw.m) y0Var.d();
        if (mVar != null ? s.g(mVar.f73770c, Boolean.valueOf(zA)) : false) {
            return;
        }
        y0Var.m(fw.m.a.g(fw.m.f73767e, Boolean.valueOf(zA), 1));
    }

    public abstract p<String, String> oa(e eVar);

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        tv.d dVar = this.f180409k;
        if (dVar != null) {
            da2.d.b().f58886a.i(dVar);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        tv.d dVar = new tv.d(this.f178102a.getDeviceUnitId());
        dVar.f166501b.f(this, this.f180412n);
        this.f180409k = dVar;
        da2.d.b().f58886a.b(dVar);
        na();
    }
}
