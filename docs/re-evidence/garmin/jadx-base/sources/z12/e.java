package z12;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz12/e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends RecyclerView.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f201385c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f201386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m12.r f201387b;

    public e(ViewGroup viewGroup) {
        viewGroup.getClass();
        f201385c.getClass();
        Context context = viewGroup.getContext();
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i14 = context.getResources().getDisplayMetrics().widthPixels;
        int i15 = (int) (i14 * 0.05f);
        int i16 = (int) ((i14 - (i15 * 5)) / 4.33f);
        RecyclerView.q qVar = new RecyclerView.q(i16, (int) (((double) (i16 * 2)) / Math.sqrt(3.0d)));
        int i17 = i15 / 2;
        ((ViewGroup.MarginLayoutParams) qVar).leftMargin = i17;
        ((ViewGroup.MarginLayoutParams) qVar).rightMargin = i17;
        imageView.setLayoutParams(qVar);
        super(imageView);
        View view2 = this.itemView;
        view2.getClass();
        this.f201386a = (ImageView) view2;
        this.f201387b = (m12.r) KoinJavaComponent.get$default(m12.r.class, null, null, 6, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lz12/e$a;", "", "<init>", "()V", "", "VISIBLE_BADGE_COUNT", "I", "", "BADGE_PADDING_PERCENT", "F", "NEXT_BADGE_REVEAL_PERCENT", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
