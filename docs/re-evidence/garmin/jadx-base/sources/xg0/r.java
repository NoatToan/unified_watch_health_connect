package xg0;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxg0/r;", "", "Landroid/view/View;", "rootView", "Ldo1/o;", "formatter", "<init>", "(Landroid/view/View;Ldo1/o;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f190831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do1.o f190832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f190833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f190834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f190835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f190836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f190837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f190838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f190839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f190840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f190841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<UserLevelImageView> f190842l;

    /* JADX WARN: Multi-variable type inference failed */
    public r(View view2, do1.o oVar) {
        view2.getClass();
        oVar.getClass();
        this.f190831a = view2;
        this.f190832b = oVar;
        View viewFindViewById = view2.findViewById(R.id.layout_social_likes);
        viewFindViewById.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        this.f190833c = viewGroup;
        View viewFindViewById2 = view2.findViewById(R.id.layout_social_comments);
        viewFindViewById2.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        this.f190834d = viewGroup2;
        View viewFindViewById3 = viewGroup2.findViewById(R.id.comment_count_text_view);
        viewFindViewById3.getClass();
        this.f190835e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.view_comment_image_clickable);
        viewFindViewById4.getClass();
        this.f190836f = viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.comment_image);
        viewFindViewById5.getClass();
        this.f190837g = (ImageView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.profile_images_description_text_view);
        viewFindViewById6.getClass();
        this.f190838h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.view_like_image_clickable);
        viewFindViewById7.getClass();
        this.f190839i = viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.like_comments_group);
        viewFindViewById8.getClass();
        this.f190840j = viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.like_image);
        viewFindViewById9.getClass();
        this.f190841k = (ImageView) viewFindViewById9;
        this.f190842l = p13.x.k(view2.findViewById(R.id.profile_image_1), view2.findViewById(R.id.profile_image_2), view2.findViewById(R.id.profile_image_3));
    }

    public final void a(wg0.m mVar, boolean z14) {
        mVar.getClass();
        List listS0 = p13.h0.S0(mVar.f185115h, 3);
        ArrayList arrayList = new ArrayList(p13.y.r(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(((wg0.n) it.next()).f185118c);
        }
        Iterator<T> it3 = this.f190842l.iterator();
        int i14 = 0;
        while (true) {
            boolean z15 = true;
            if (!it3.hasNext()) {
                this.f190838h.setText(this.f190832b.c(mVar.f185109b, mVar.f185113f, true));
                int i15 = mVar.f185113f ? R.drawable.favorite_fill : R.drawable.favorite_outline;
                ImageView imageView = this.f190841k;
                imageView.setImageResource(i15);
                imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(imageView.getContext(), R.color.gcm_icon_primary_action)));
                imageView.setContentDescription(mVar.f185113f ? imageView.getContext().getString(R.string.lbl_unlike) : imageView.getContext().getString(R.string.lbl_like));
                w2.a0.q(imageView, z14);
                return;
            }
            Object next = it3.next();
            int i16 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            UserLevelImageView userLevelImageView = (UserLevelImageView) next;
            String str = (String) p13.h0.e0(i14, arrayList);
            userLevelImageView.setProfileImageData(new b12.b(str, null, null, null, null, 30, null));
            if (str == null) {
                z15 = false;
            }
            v22.e.v(userLevelImageView, z15);
            i14 = i16;
        }
    }
}
