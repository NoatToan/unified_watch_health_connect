package zz0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzz0/a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3870a f207580d = new C3870a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f207581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f207582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f207583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.unread_dot_image_view);
        viewFindViewById.getClass();
        this.f207581a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.requests_entry_text_view);
        viewFindViewById2.getClass();
        this.f207582b = (TextView) viewFindViewById2;
        ArrayList arrayList = new ArrayList();
        this.f207583c = arrayList;
        View viewFindViewById3 = view2.findViewById(R.id.layout_profile_images);
        viewFindViewById3.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.bottom_right_profile_image_view);
        viewFindViewById4.getClass();
        arrayList.add(viewFindViewById4);
        View viewFindViewById5 = viewGroup.findViewById(R.id.top_left_profile_image_view);
        viewFindViewById5.getClass();
        arrayList.add(viewFindViewById5);
    }

    /* JADX INFO: renamed from: zz0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzz0/a$a;", "", "<init>", "()V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3870a {
        public /* synthetic */ C3870a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3870a() {
        }
    }
}
