package xz0;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxz0/o;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lxz0/a;", "inboxRequestActionListener", "<init>", "(Landroid/view/View;Lxz0/a;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends RecyclerView.f0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f192801j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xz0.a f192802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserLevelImageView f192803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f192804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f192805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f192806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f192807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f192808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f192809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f192810i;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192811a;

        static {
            int[] iArr = new int[vz0.b.values().length];
            try {
                iArr[vz0.b.GROUP_INVITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vz0.b.GROUP_JOIN_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vz0.b.DEVICE_INVITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vz0.b.AUTHORIZED_VIEWER_INVITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vz0.b.FOLLOW_REQUEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f192811a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(View view2, xz0.a aVar) {
        super(view2);
        view2.getClass();
        aVar.getClass();
        this.f192802a = aVar;
        View viewFindViewById = view2.findViewById(R.id.profile_image);
        viewFindViewById.getClass();
        this.f192803b = (UserLevelImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.title_text_view);
        viewFindViewById2.getClass();
        this.f192804c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.info_text);
        viewFindViewById3.getClass();
        this.f192805d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.sub_info_text);
        viewFindViewById4.getClass();
        this.f192806e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.negative_button);
        viewFindViewById5.getClass();
        this.f192807f = (Button) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.positive_button);
        viewFindViewById6.getClass();
        this.f192808g = (Button) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.unread_bubble_image_view);
        viewFindViewById7.getClass();
        this.f192809h = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.action_info_text);
        viewFindViewById8.getClass();
        this.f192810i = (TextView) viewFindViewById8;
    }
}
