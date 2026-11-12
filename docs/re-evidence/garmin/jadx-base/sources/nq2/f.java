package nq2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnq2/f;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f126969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f126970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f126971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f126972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTimeFormatter f126973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view2) {
        super(view2);
        view2.getClass();
        this.f126969a = (ImageView) view2.findViewById(R.id.system_icon);
        this.f126970b = (TextView) view2.findViewById(R.id.transaction_content_text);
        this.f126971c = (TextView) view2.findViewById(R.id.transaction_time_text);
        this.f126972d = (TextView) view2.findViewById(R.id.transaction_balance);
        this.f126973e = DateTimeFormat.shortDateTime();
    }

    public final d92.a d() {
        int i14 = this.itemView.getContext().getResources().getConfiguration().uiMode & 48;
        return (i14 == 0 || i14 == 16) ? j92.a.b() : j92.a.a();
    }
}
