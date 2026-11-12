package z12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lz12/q0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "b", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class q0 extends RecyclerView.f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f201462l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f201463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f201464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f201465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f201466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f201467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f201468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f201469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f201470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m0 f201471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m12.r f201472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f201473k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz12/q0$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        SINGLE,
        NORMAL,
        BEGIN,
        END
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201479a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.BEGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SINGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f201479a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q0(ViewGroup viewGroup) {
        viewGroup.getClass();
        f201462l.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_profile_timeline_activity_card, viewGroup, false);
        viewInflate.getClass();
        super(viewInflate);
        this.f201472j = (m12.r) KoinJavaComponent.get$default(m12.r.class, null, null, 6, null);
        this.f201473k = s3.b();
        h();
    }

    public abstract void d(ActivityListItemDTO activityListItemDTO);

    public abstract int e();

    public abstract View f();

    public final Context g() {
        Context context = this.itemView.getContext();
        context.getClass();
        return context;
    }

    public void h() {
        View viewFindViewById = this.itemView.findViewById(R.id.timeline_header);
        viewFindViewById.getClass();
        this.f201463a = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.timeline_header_date);
        viewFindViewById2.getClass();
        this.f201464b = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.timeline_point);
        viewFindViewById3.getClass();
        this.f201465c = viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.timeline_start_line);
        viewFindViewById4.getClass();
        this.f201466d = viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.timeline_top_end_line);
        viewFindViewById5.getClass();
        this.f201467e = viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(R.id.timeline_bottom_end_line);
        viewFindViewById6.getClass();
        this.f201468f = viewFindViewById6;
        View viewFindViewById7 = this.itemView.findViewById(R.id.activity_privacy_only_you);
        viewFindViewById7.getClass();
        this.f201469g = viewFindViewById7;
        View viewFindViewById8 = this.itemView.findViewById(R.id.timeline_content);
        viewFindViewById8.getClass();
        this.f201470h = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = this.itemView.findViewById(R.id.social_section_container);
        viewFindViewById9.getClass();
        View view2 = this.itemView;
        view2.getClass();
        this.f201471i = new m0(view2);
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.card_details_view_stub);
        viewStub.setLayoutResource(e());
        viewStub.inflate();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz12/q0$a;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
