package er2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ler2/j;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f65086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f65087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f65088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f65089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f65090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f65091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f65092g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ler2/j$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        DEVICE_WITH_CONNECTION_STATE_ITEM,
        DEVICE_ONLY_ITEM,
        DEVICE_WITH_ENABLE_PAY_OPTIONS_ITEM,
        DEVICE_WITH_PAYMENT_CARD_OPTIONS_ITEM
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65098a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DEVICE_WITH_CONNECTION_STATE_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEVICE_ONLY_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.DEVICE_WITH_ENABLE_PAY_OPTIONS_ITEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.DEVICE_WITH_PAYMENT_CARD_OPTIONS_ITEM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f65098a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View view2) {
        super(view2);
        view2.getClass();
        this.f65086a = view2;
        View viewFindViewById = view2.findViewById(R.id.device_item_icon);
        viewFindViewById.getClass();
        this.f65087b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.device_flag_icon);
        viewFindViewById2.getClass();
        this.f65088c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.device_item_action_status);
        viewFindViewById3.getClass();
        this.f65089d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.device_item_action_icon);
        viewFindViewById4.getClass();
        this.f65090e = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.device_item_name);
        viewFindViewById5.getClass();
        this.f65091f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.device_item_status);
        viewFindViewById6.getClass();
        this.f65092g = (TextView) viewFindViewById6;
    }

    public final void d(Context context, br2.f fVar, int i14, a aVar) {
        context.getClass();
        aVar.getClass();
        if (fVar != null) {
            boolean z14 = fVar.f19605g;
            if ((i14 & 1) != 0) {
                com.bumptech.glide.b.c(context).c(context).l(fVar.f19601c).l(j.a.a(context, 2131231499)).E(this.f65087b);
            }
            int i15 = i14 & 2;
            TextView textView = this.f65089d;
            if (i15 != 0) {
                textView.setVisibility(8);
                this.f65091f.setText(fVar.f19600b);
            }
            int i16 = b.f65098a[aVar.ordinal()];
            ImageView imageView = this.f65090e;
            ImageView imageView2 = this.f65088c;
            TextView textView2 = this.f65092g;
            if (i16 == 1) {
                textView2.setVisibility(0);
                textView.setVisibility(8);
                imageView2.setVisibility(8);
                imageView.setVisibility(8);
                if ((i14 & 4) != 0) {
                    textView2.setText(fVar.f19602d.a(context));
                    return;
                }
                return;
            }
            if (i16 == 2) {
                textView2.setVisibility(8);
                imageView2.setVisibility(8);
                if (z14) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            if (i16 == 3) {
                br2.g gVar = fVar.f19607i;
                if (gVar == null || gVar == br2.g.PAY_NOT_ENABLED) {
                    textView2.setVisibility(8);
                    imageView2.setVisibility(8);
                    textView.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView.setVisibility(0);
                    if ((i14 & 32) != 0) {
                        String strA = gVar.a(context);
                        if (strA == null || d53.w.J(strA)) {
                            textView2.setVisibility(8);
                            imageView2.setVisibility(8);
                        } else {
                            textView2.setText(strA);
                            textView2.setVisibility(0);
                            imageView2.setVisibility(0);
                        }
                    }
                }
                imageView.setVisibility(8);
                return;
            }
            if (i16 != 4) {
                u0.r();
                return;
            }
            br2.g gVar2 = fVar.f19607i;
            if (gVar2 != null && gVar2 != br2.g.PAY_NOT_ENABLED) {
                textView2.setVisibility(0);
                textView.setVisibility(0);
                if ((i14 & 32) != 0) {
                    String strA2 = gVar2.a(context);
                    if (strA2 == null || d53.w.J(strA2)) {
                        textView2.setVisibility(8);
                        imageView2.setVisibility(8);
                    } else {
                        textView2.setText(strA2);
                        textView2.setVisibility(0);
                        imageView2.setVisibility(8);
                    }
                }
            }
            if (z14) {
                imageView.setVisibility(0);
            }
        }
    }
}
