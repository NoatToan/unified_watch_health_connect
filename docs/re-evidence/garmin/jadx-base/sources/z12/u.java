package z12;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz12/u;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends RecyclerView.f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f201489e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f201490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f201491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f201492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f201493d;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(ViewGroup viewGroup) {
        viewGroup.getClass();
        f201489e.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_profile_last_sync_device, viewGroup, false);
        viewInflate.getClass();
        super(viewInflate);
        View viewFindViewById = this.itemView.findViewById(R.id.profile_device_image);
        viewFindViewById.getClass();
        this.f201490a = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.profile_device_name);
        viewFindViewById2.getClass();
        this.f201491b = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.profile_last_sync_text);
        viewFindViewById3.getClass();
        this.f201492c = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.profile_last_sync_privacy);
        viewFindViewById4.getClass();
        this.f201493d = (TextView) viewFindViewById4;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz12/u$a;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
