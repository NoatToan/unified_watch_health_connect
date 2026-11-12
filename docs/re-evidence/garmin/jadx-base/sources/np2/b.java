package np2;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnp2/b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f126868c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Button f126869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f126870b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126871a;

        static {
            int[] iArr = new int[mp2.a.values().length];
            try {
                iArr[mp2.a.f120061e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mp2.a.f120062f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mp2.a.f120057a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f126871a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.verification_button);
        viewFindViewById.getClass();
        this.f126869a = (Button) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.verification_user_consent);
        viewFindViewById2.getClass();
        this.f126870b = (TextView) viewFindViewById2;
    }
}
