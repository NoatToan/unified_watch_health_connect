package er2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ler2/v;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends RecyclerView.f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f65122f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f65123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f65124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f65125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f65126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f65127e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65128a;

        static {
            int[] iArr = new int[br2.g.values().length];
            try {
                iArr[br2.g.PAY_ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[br2.g.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[br2.g.PAY_NOT_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65128a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.card_details_layout);
        viewFindViewById.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.card_number_layout);
        viewFindViewById2.getClass();
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.card_item_image_small);
        viewFindViewById3.getClass();
        this.f65123a = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.card_item_image_status);
        viewFindViewById4.getClass();
        this.f65124b = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.card_item_action_status);
        viewFindViewById5.getClass();
        this.f65125c = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.card_item_info);
        viewFindViewById6.getClass();
        this.f65126d = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.card_item_name);
        viewFindViewById7.getClass();
        this.f65127e = (TextView) viewFindViewById7;
        Context context = view2.getContext();
        context.getClass();
        if (c22.b.e(context)) {
            linearLayout.setOrientation(1);
            linearLayout2.getLayoutParams().width = -2;
        }
    }

    public final void d(Context context, vr2.q qVar, int i14, boolean z14, boolean z15) {
        context.getClass();
        if (qVar != null) {
            String strA = qVar.f179656c;
            br2.g gVar = qVar.f179659f;
            if ((i14 & 1) != 0) {
                ImageView imageView = this.f65123a;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                Resources resources = context.getResources();
                resources.getClass();
                layoutParams.width = (int) c22.b.c(context, xy2.b.n(resources, 57.0f), 1.8f);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                Resources resources2 = context.getResources();
                resources2.getClass();
                layoutParams2.height = (int) c22.b.c(context, xy2.b.n(resources2, 36.0f), 1.8f);
                is2.b bVar = qVar.f179660g;
                if (bVar != null) {
                    yr2.m.a(bVar).e(imageView, qVar, 10);
                }
            }
            if ((i14 & 2) != 0) {
                this.f65127e.setText(qVar.f179654a);
            }
            if ((i14 & 4) != 0) {
                if (!z14) {
                    if (gVar != null && gVar != br2.g.PAY_ENABLED && gVar != br2.g.PAY_NOT_ENABLED) {
                        strA = gVar.a(context);
                        if (strA == null) {
                            o2.c.m("Not handle all status display string");
                            return;
                        }
                    } else if (w3.x.r(qVar.f179658e)) {
                        strA = qVar.f179657d;
                    }
                }
                boolean zD = g22.n.d(strA);
                TextView textView = this.f65126d;
                if (zD) {
                    textView.setVisibility(0);
                    textView.setText(strA);
                } else {
                    textView.setVisibility(8);
                }
            }
            int i15 = gVar == null ? -1 : a.f65128a[gVar.ordinal()];
            TextView textView2 = this.f65125c;
            ImageView imageView2 = this.f65124b;
            if (i15 != 1 && i15 != 2) {
                if (i15 != 3) {
                    imageView2.setVisibility(8);
                    return;
                } else {
                    textView2.setVisibility(4);
                    imageView2.setVisibility(8);
                    return;
                }
            }
            if (!z14) {
                textView2.setVisibility(8);
                imageView2.setVisibility(8);
            } else if (z15) {
                textView2.setVisibility(0);
                textView2.setText(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.lbl_remove));
                imageView2.setVisibility(8);
            } else {
                textView2.setVisibility(8);
                imageView2.setVisibility(0);
                imageView2.setImageResource(R.drawable.about);
                imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(this.itemView.getContext(), R.color.gcm_icon_primary_action)));
            }
        }
    }
}
