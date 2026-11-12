package o12;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lo12/j;", "Lb32/g;", "Lo12/j$a;", "binder", "<init>", "(Lo12/j$a;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends b32.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f128559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f128560d;

    public interface a {
        boolean a();

        int b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar) {
        super(R.layout.user_profile_only_me);
        aVar.getClass();
        this.f128559c = aVar;
    }

    @Override // b32.g, b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        RecyclerView.f0 f0VarA = super.a(viewGroup, i14);
        View viewFindViewById = f0VarA.itemView.findViewById(R.id.profile_only_me);
        viewFindViewById.getClass();
        this.f128560d = (TextView) viewFindViewById;
        return f0VarA;
    }

    @Override // b32.g, b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        TextView textView = this.f128560d;
        if (textView != null) {
            textView.setText(this.f128559c.b());
        } else {
            s.m("onlyMeText");
            throw null;
        }
    }

    @Override // b32.g, b32.a, b32.d
    /* JADX INFO: renamed from: isVisible */
    public final boolean getF120672c() {
        return this.f128559c.a();
    }
}
