package np2;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnp2/a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f126865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f126866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f126867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.card_image_view);
        viewFindViewById.getClass();
        this.f126865a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.pending_verification_title);
        viewFindViewById2.getClass();
        this.f126866b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.device_account_number_text_view);
        viewFindViewById3.getClass();
        this.f126867c = (TextView) viewFindViewById3;
    }

    public final void d(Context context, yo2.b bVar) {
        String strO;
        context.getClass();
        String strF0 = null;
        if (bVar != null && (strO = yo2.b.o(bVar, null, 3)) != null) {
            String cardType = bVar.getCardType();
            ImageView imageView = this.f126865a;
            j.a(imageView, strO, 30, cardType);
            imageView.setContentDescription(bVar.f0(false));
        }
        this.f126866b.setText(context.getString(R.string.wallet_status_pending_verification));
        String string = context.getString(R.string.device_account_number);
        if (bVar != null) {
            Parcelable.Creator<yo2.b> creator = yo2.b.CREATOR;
            strF0 = bVar.f0(true);
        }
        this.f126867c.setText(e5.g(string, StringUtils.SPACE, strF0));
    }
}
