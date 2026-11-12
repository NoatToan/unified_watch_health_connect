package mt0;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/j2;", "Lb32/g;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j2 extends b32.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f120672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f120673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f120674e;

    public j2() {
        super(R.layout.completed_challenges_footer);
    }

    @Override // b32.g, b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        RecyclerView.f0 f0VarA = super.a(viewGroup, i14);
        this.f120674e = (TextView) f0VarA.itemView.findViewById(R.id.footer_text);
        i(this.f120673d);
        return f0VarA;
    }

    public final void i(int i14) {
        this.f120673d = i14;
        TextView textView = this.f120674e;
        if (textView != null && i14 > 0) {
            textView.getClass();
            Context context = textView.getContext();
            if (i14 > 1) {
                textView.setText(context.getString(R.string.badges_lbl_deleted_challenges, Integer.valueOf(i14)));
            } else {
                textView.setText(context.getString(R.string.badges_lbl_deleted_challenges_singular));
            }
        }
    }

    @Override // b32.g, b32.a, b32.d
    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getF120672c() {
        return this.f120672c;
    }
}
