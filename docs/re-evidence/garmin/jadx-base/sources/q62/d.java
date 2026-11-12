package q62;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lq62/d;", "", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f143195f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f143196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f143197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f143198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f143199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f143200e;

    static {
        new a(null);
    }

    public d(View view2) {
        view2.getClass();
        this.f143196a = view2;
        this.f143197b = (ImageView) view2.findViewById(R.id.icon_left);
        this.f143198c = (TextView) view2.findViewById(R.id.label_top);
        this.f143199d = (TextView) view2.findViewById(R.id.label_bottom);
        this.f143200e = (ImageView) view2.findViewById(R.id.icon_right);
        a();
    }

    public final void a() {
        ImageView imageView = this.f143197b;
        imageView.getClass();
        imageView.setVisibility(8);
        TextView textView = this.f143198c;
        textView.getClass();
        textView.setVisibility(8);
        TextView textView2 = this.f143199d;
        textView2.getClass();
        textView2.setVisibility(8);
        ImageView imageView2 = this.f143200e;
        imageView2.getClass();
        imageView2.setVisibility(8);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq62/d$a;", "", "<init>", "()V", "", "INVALID_RES_ID", "I", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
