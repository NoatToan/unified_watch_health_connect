package k32;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/u;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends RecyclerView.f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f102736h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f102737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f102738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f102739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f102740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f102741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f102742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f102743g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.text1);
        viewFindViewById.getClass();
        this.f102737a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text2);
        viewFindViewById2.getClass();
        this.f102738b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.text3);
        viewFindViewById3.getClass();
        this.f102739c = (TextView) viewFindViewById3;
        this.f102740d = (TextView) view2.findViewById(R.id.text4);
        View viewFindViewById4 = view2.findViewById(R.id.text5);
        viewFindViewById4.getClass();
        this.f102741e = (TextView) viewFindViewById4;
        this.f102742f = (TextView) view2.findViewById(R.id.text6);
        this.f102743g = (ImageView) view2.findViewById(R.id.list_item_icon_right);
    }

    public final String d() {
        CharSequence contentDescription;
        CharSequence contentDescription2;
        CharSequence contentDescription3;
        CharSequence contentDescription4;
        CharSequence contentDescription5;
        CharSequence contentDescription6;
        CharSequence contentDescription7;
        TextView textView = this.f102737a;
        CharSequence charSequence = "";
        if (v22.e.d(textView)) {
            contentDescription = textView.getContentDescription();
            if (contentDescription == null) {
                contentDescription = textView.getText();
            }
        } else {
            contentDescription = "";
        }
        TextView textView2 = this.f102738b;
        if (v22.e.d(textView2)) {
            contentDescription2 = textView2.getContentDescription();
            if (contentDescription2 == null) {
                contentDescription2 = textView2.getText();
            }
        } else {
            contentDescription2 = "";
        }
        TextView textView3 = this.f102739c;
        if (v22.e.d(textView3)) {
            contentDescription3 = textView3.getContentDescription();
            if (contentDescription3 == null) {
                String string = textView3.getText().toString();
                Context context = this.itemView.getContext();
                context.getClass();
                contentDescription3 = oi0.c.A(context, new jy0.b(18), string);
            }
        } else {
            contentDescription3 = "";
        }
        TextView textView4 = this.f102740d;
        if (textView4 == null || !v22.e.d(textView4)) {
            contentDescription4 = "";
        } else {
            contentDescription4 = textView4.getContentDescription();
            if (contentDescription4 == null) {
                contentDescription4 = textView4.getText();
            }
        }
        TextView textView5 = this.f102741e;
        if (v22.e.d(textView5)) {
            contentDescription5 = textView5.getContentDescription();
            if (contentDescription5 == null) {
                String string2 = textView5.getText().toString();
                Context context2 = this.itemView.getContext();
                context2.getClass();
                contentDescription5 = oi0.c.A(context2, new jy0.b(19), string2);
            }
        } else {
            contentDescription5 = "";
        }
        TextView textView6 = this.f102742f;
        if (textView6 == null || !v22.e.d(textView6)) {
            contentDescription6 = "";
        } else {
            contentDescription6 = textView6.getContentDescription();
            if (contentDescription6 == null) {
                contentDescription6 = textView6.getText();
            }
        }
        ImageView imageView = this.f102743g;
        if (imageView != null && v22.e.d(imageView) && (contentDescription7 = imageView.getContentDescription()) != null) {
            charSequence = contentDescription7;
        }
        return ((Object) contentDescription) + StringUtils.SPACE + ((Object) contentDescription2) + " \n " + ((Object) contentDescription3) + StringUtils.SPACE + ((Object) contentDescription4) + StringUtils.SPACE + ((Object) contentDescription5) + StringUtils.SPACE + ((Object) contentDescription6) + StringUtils.SPACE + ((Object) charSequence) + StringUtils.SPACE;
    }
}
