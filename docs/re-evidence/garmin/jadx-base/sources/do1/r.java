package do1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ldo1/r;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f60612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f60613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f60614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f60615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f60616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f60617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f60618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f60619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f60620i;

    static {
        new a(null);
    }

    public r(View view2) {
        view2.getClass();
        this.f60612a = (RelativeLayout) view2.findViewById(R.id.activity_top_section_layout);
        View viewFindViewById = view2.findViewById(R.id.like_icon);
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        this.f60613b = imageView;
        View viewFindViewById2 = view2.findViewById(R.id.comment_icon);
        viewFindViewById2.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById2;
        this.f60614c = imageView2;
        View viewFindViewById3 = view2.findViewById(R.id.add_photo_icon);
        viewFindViewById3.getClass();
        ImageView imageView3 = (ImageView) viewFindViewById3;
        this.f60615d = imageView3;
        View viewFindViewById4 = view2.findViewById(R.id.share_icon);
        viewFindViewById4.getClass();
        ImageView imageView4 = (ImageView) viewFindViewById4;
        this.f60616e = imageView4;
        View viewFindViewById5 = view2.findViewById(R.id.like_count);
        viewFindViewById5.getClass();
        this.f60617f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.lbl_bullet);
        viewFindViewById6.getClass();
        this.f60618g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.comment_count);
        viewFindViewById7.getClass();
        this.f60619h = (TextView) viewFindViewById7;
        Context context = view2.getContext();
        context.getClass();
        if (c22.b.a(context) >= 1.5f) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Resources resources = context.getResources();
            resources.getClass();
            layoutParams.width = (int) c22.b.c(context, xy2.b.n(resources, 32.0f), 1.5f);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            Resources resources2 = context.getResources();
            resources2.getClass();
            layoutParams2.height = (int) c22.b.c(context, xy2.b.n(resources2, 40.0f), 1.5f);
            int iC = (int) c22.b.c(context, context.getResources().getDimensionPixelSize(R.dimen.icon_medium), 1.5f);
            imageView2.getLayoutParams().width = iC;
            imageView2.getLayoutParams().height = iC;
            imageView3.getLayoutParams().width = iC;
            imageView3.getLayoutParams().height = iC;
            imageView4.getLayoutParams().width = iC;
            imageView4.getLayoutParams().height = iC;
        }
    }

    public final void a(Context context, int i14, boolean z14) {
        context.getClass();
        int i15 = i14 > 0 ? 0 : 8;
        if (p005kotlin.jvm.internal.s.g(this.f60620i, Boolean.FALSE)) {
            i15 = 8;
        }
        TextView textView = this.f60617f;
        textView.setVisibility(i15);
        int visibility = textView.getVisibility();
        TextView textView2 = this.f60618g;
        if (visibility == 0 && this.f60619h.getVisibility() == 0) {
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        String string = i14 == 1 ? context.getString(R.string.lbl_likes_count_singular, Integer.valueOf(i14)) : context.getString(R.string.lbl_likes_count, Integer.valueOf(i14));
        string.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        textView.setText(lowerCase);
        int i16 = z14 ? R.drawable.favorite_fill : R.drawable.favorite_outline;
        ImageView imageView = this.f60613b;
        imageView.setImageResource(i16);
        imageView.setContentDescription(context.getString(z14 ? R.string.lbl_double_tap_to_unlike : R.string.lbl_double_tap_to_like));
        imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
    }

    public final void b(boolean z14) {
        RelativeLayout relativeLayout = this.f60612a;
        if (relativeLayout != null) {
            v22.e.r(relativeLayout, z14);
        }
        v22.e.r(this.f60613b, z14);
        v22.e.r(this.f60614c, z14);
        v22.e.r(this.f60617f, z14);
        v22.e.r(this.f60618g, z14);
        v22.e.r(this.f60619h, z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ldo1/r$a;", "", "<init>", "()V", "", "TIME_TOOLTIP_SHOULD_SHOW", "I", "TIME_TOOLTIP_SHOULD_SHOW_TICK", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
