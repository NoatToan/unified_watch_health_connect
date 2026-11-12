package do1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f60585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f60586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f60587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f60588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f60589e;

    public b(View view2) {
        this.f60585a = (TextView) view2.findViewById(R.id.challenge_title);
        this.f60586b = (TextView) view2.findViewById(R.id.challenge_days_left);
        this.f60587c = (TextView) view2.findViewById(R.id.challenge_comment_btn);
        this.f60588d = (ImageView) view2.findViewById(R.id.challenge_comment_icon);
        this.f60589e = (TextView) view2.findViewById(R.id.challenge_comment_count);
    }
}
