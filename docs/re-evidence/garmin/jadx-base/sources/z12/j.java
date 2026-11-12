package z12;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.ContentAdaptedLinearLayoutManager;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz12/j;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends RecyclerView.f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f201414h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f201415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f201416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f201417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f201418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f201419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f201420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m12.r f201421g;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(ViewGroup viewGroup) {
        viewGroup.getClass();
        f201414h.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_profile_badges, viewGroup, false);
        viewInflate.getClass();
        super(viewInflate);
        View viewFindViewById = this.itemView.findViewById(R.id.profile_badges_empty_view);
        viewFindViewById.getClass();
        this.f201415a = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.profile_view_available_badges);
        viewFindViewById2.getClass();
        this.f201416b = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.profile_badges_container);
        viewFindViewById3.getClass();
        this.f201417c = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.recent_badges);
        viewFindViewById4.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.profile_badges_privacy_container);
        viewFindViewById5.getClass();
        this.f201418d = (FrameLayout) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(R.id.profile_all_badges);
        viewFindViewById6.getClass();
        this.f201419e = (TextView) viewFindViewById6;
        f fVar = new f();
        this.f201420f = fVar;
        this.f201421g = (m12.r) KoinJavaComponent.get$default(m12.r.class, null, null, 6, null);
        recyclerView.setAdapter(fVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new ContentAdaptedLinearLayoutManager(this.itemView.getContext(), 0, false));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz12/j$a;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
