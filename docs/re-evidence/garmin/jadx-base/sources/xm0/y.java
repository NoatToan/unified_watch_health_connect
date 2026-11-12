package xm0;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lxm0/y;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lxm0/y$a;", "callback", "<init>", "(Landroid/view/View;Lxm0/y$a;)V", "a", "b", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends RecyclerView.f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f191484d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f191485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f191486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f191487c;

    public interface a {
        void Q2(k kVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(View view2, a aVar) {
        super(view2);
        view2.getClass();
        aVar.getClass();
        this.f191485a = aVar;
        View viewFindViewById = view2.findViewById(R.id.rank_text_view);
        viewFindViewById.getClass();
        View viewFindViewById2 = view2.findViewById(R.id.profile_image_view);
        viewFindViewById2.getClass();
        View viewFindViewById3 = view2.findViewById(R.id.user_name_text_view);
        viewFindViewById3.getClass();
        View viewFindViewById4 = view2.findViewById(R.id.value_text_view);
        viewFindViewById4.getClass();
        View viewFindViewById5 = view2.findViewById(R.id.user_last_sync_time);
        viewFindViewById5.getClass();
        View viewFindViewById6 = view2.findViewById(R.id.value_locked_image);
        viewFindViewById6.getClass();
        View viewFindViewById7 = view2.findViewById(R.id.connection_item_view);
        viewFindViewById7.getClass();
        this.f191486b = (ConstraintLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.follower_item_view);
        viewFindViewById8.getClass();
        this.f191487c = (ComposeView) viewFindViewById8;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxm0/y$b;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
