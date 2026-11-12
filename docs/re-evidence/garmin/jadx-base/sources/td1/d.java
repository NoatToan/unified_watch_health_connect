package td1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltd1/d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f163898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f163899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f163900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view2) {
        super(view2);
        view2.getClass();
        this.f163898a = (TextView) view2.findViewById(R.id.new_reminder_day_title);
        this.f163899b = (ImageView) view2.findViewById(R.id.day_selected_image_view);
    }
}
