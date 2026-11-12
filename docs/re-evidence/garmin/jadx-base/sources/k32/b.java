package k32;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk32/b;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f102666g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f102667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f102668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f102669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f102670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f102671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f102672f;

    static {
        new a(null);
    }

    public b(View view2) {
        view2.getClass();
        this.f102667a = (TextView) view2.findViewById(R.id.banner_headline);
        this.f102668b = (TextView) view2.findViewById(R.id.banner_body);
        this.f102669c = (TextView) view2.findViewById(R.id.banner_action_primary);
        this.f102670d = (TextView) view2.findViewById(R.id.banner_action_secondary);
        this.f102671e = (ImageView) view2.findViewById(R.id.banner_icon);
        this.f102672f = view2.findViewById(R.id.banner_cancel);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk32/b$a;", "", "<init>", "()V", "", "INVALID_DRAWABLE", "I", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
