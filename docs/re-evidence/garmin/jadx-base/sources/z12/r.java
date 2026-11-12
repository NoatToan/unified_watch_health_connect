package z12;

import android.view.View;
import android.view.ViewGroup;
import androidx.gridlayout.widget.GridLayout;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz12/r;", "Ldz/b;", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends dz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GridLayout f201480h;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
        this.f61656d.setText(viewGroup.getContext().getString(R.string.lbl_what_i_do));
    }

    @Override // dz.b, dz.a
    public final void f(View view2) {
        view2.getClass();
        super.f(view2);
        View viewFindViewById = view2.findViewById(R.id.profile_favorite_activity_types);
        viewFindViewById.getClass();
        this.f201480h = (GridLayout) viewFindViewById;
    }

    @Override // dz.b
    public final int g() {
        return R.layout.user_profile_favorite_activity_types_grid;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz12/r$a;", "", "<init>", "()V", "", "MAX_COLUMN_COUNT", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
