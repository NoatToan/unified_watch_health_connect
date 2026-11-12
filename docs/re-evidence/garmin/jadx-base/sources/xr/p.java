package xr;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxr/p;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends RelativeLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f192009g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f192010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k32.k f192011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f192012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UserLevelImageView f192013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f192014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f192015f;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        ComposeView composeView;
        super(context);
        context.getClass();
        View.inflate(context, R.layout.activity_details_trails_section, this);
        View viewFindViewById = findViewById(R.id.trail_item);
        this.f192010a = viewFindViewById;
        if (viewFindViewById != null) {
            this.f192011b = new k32.k(viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.trail_review_item);
        this.f192012c = viewFindViewById2;
        this.f192013d = viewFindViewById2 != null ? (UserLevelImageView) viewFindViewById2.findViewById(R.id.user_avatar) : null;
        this.f192014e = viewFindViewById2 != null ? (TextView) viewFindViewById2.findViewById(R.id.leave_review_label) : null;
        if (viewFindViewById2 == null || (composeView = (ComposeView) viewFindViewById2.findViewById(R.id.user_rating_view)) == null) {
            return;
        }
        this.f192015f = new r(composeView);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxr/p$a;", "", "<init>", "()V", "", "DEFAULT_IMAGE_SIZE", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
