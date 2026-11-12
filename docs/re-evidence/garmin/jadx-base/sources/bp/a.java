package bp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbp/a;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19358a;

    static {
        new C0283a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("toolbarHidden", this.f19358a);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, i.c, b.g, android.app.Activity
    public final void setContentView(int i14) {
        super.setContentView(R.layout.gcm3_content_frame_with_overlay);
        View viewFindViewById = findViewById(R.id.content_frame);
        viewFindViewById.getClass();
        ((FrameLayout) viewFindViewById).addView(LayoutInflater.from(this).inflate(i14, (ViewGroup) null, false));
        View viewFindViewById2 = findViewById(R.id.content_frame_progress_overlay);
        this.mProgressOverlay = viewFindViewById2;
        this.mProgressOverlayMsg = (TextView) viewFindViewById2.findViewById(R.id.progress_bar_title);
    }

    /* JADX INFO: renamed from: bp.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbp/a$a;", "", "<init>", "()V", "", "TOOLBAR_HIDDEN", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0283a {
        public /* synthetic */ C0283a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0283a() {
        }
    }
}
