package vd1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvd1/f;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "Lvd1/a;", "reminderTimeListener", "<init>", "(Landroid/view/View;Lvd1/a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.f0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f177468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f177469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f177470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view2, a aVar) {
        super(view2);
        view2.getClass();
        aVar.getClass();
        this.f177468a = aVar;
        this.f177469b = (TextView) view2.findViewById(R.id.pregnancy_reminder_times_text_view);
        this.f177470c = (ImageView) view2.findViewById(R.id.remove_time_image_view);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        String string = this.f177469b.getText().toString();
        j0.f23099a.getClass();
        DateTime dateTime = DateTime.parse(string, j0.z());
        dateTime.getClass();
        this.f177468a.b(dateTime);
    }
}
