package uu;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luu/f0;", "Lb32/g;", "<init>", "()V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends b32.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f172686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f172687d;

    public f0() {
        super(R.layout.badges_connections_with_badge_header);
    }

    @Override // b32.g, b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        RecyclerView.f0 f0VarA = super.a(viewGroup, i14);
        this.f172686c = (TextView) f0VarA.itemView.findViewById(R.id.connections_with_badge_description);
        return f0VarA;
    }

    @Override // b32.g, b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        Context context = f0Var.itemView.getContext();
        int i15 = this.f172687d;
        TextView textView = this.f172686c;
        if (i15 == 1) {
            if (textView != null) {
                textView.setText(context.getString(R.string.badges_followings_with_badge_description_singular));
            }
        } else if (textView != null) {
            textView.setText(context.getString(R.string.badges_followings_with_badge_description, String.valueOf(i15)));
        }
    }
}
