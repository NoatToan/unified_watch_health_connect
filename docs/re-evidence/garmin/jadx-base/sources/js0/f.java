package js0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljs0/f;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f100636f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ks0.c f100637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f100638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f100639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f100640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f100641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view2) {
        super(view2);
        view2.getClass();
        Context context = view2.getContext();
        context.getClass();
        this.f100637a = new ks0.c(context);
        View viewFindViewById = view2.findViewById(R.id.text1);
        viewFindViewById.getClass();
        this.f100638b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text2);
        viewFindViewById2.getClass();
        this.f100639c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.item_tag_text);
        viewFindViewById3.getClass();
        this.f100640d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.jet_jet_lag_expected_text);
        viewFindViewById4.getClass();
        this.f100641e = (TextView) viewFindViewById4;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljs0/f$a;", "", "<init>", "()V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
