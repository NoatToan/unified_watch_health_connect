package u12;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u1.y1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu12/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f167777b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l<? super ip.a, Unit> f167776a = new y1(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f167778c = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f167778c.size() + (this.f167777b != null ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return (i14 != 0 || this.f167777b == null) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (f0Var instanceof l) {
            l lVar = (l) f0Var;
            String str = this.f167777b;
            ((TextView) lVar.itemView.findViewById(R.id.description)).setText(str != null ? str : "");
            lVar.itemView.setClickable(false);
            return;
        }
        if (f0Var instanceof g) {
            if (this.f167777b != null) {
                i14--;
            }
            ip.a aVar = (ip.a) this.f167778c.get(i14);
            g gVar = (g) f0Var;
            aVar.getClass();
            TextView textView = (TextView) gVar.itemView.findViewById(R.id.checkable_row_name);
            Context context = gVar.itemView.getContext();
            context.getClass();
            textView.setText(dh.b.A(context, aVar.f94639a.f4360c));
            View viewFindViewById = gVar.itemView.findViewById(R.id.checkable_row_img);
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(8);
            TextView textView2 = (TextView) gVar.itemView.findViewById(R.id.checkable_row_hint);
            PrivacyType privacyType = aVar.f94640b;
            textView2.getClass();
            textView2.setVisibility(privacyType == null ? 8 : 0);
            if (privacyType != null) {
                textView2.setText(privacyType.getF28797a());
            } else {
                textView2.setText("");
            }
            f0Var.itemView.setOnClickListener(new e(0, this, aVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return i14 == 1 ? new g(n23.j.b(viewGroup, R.layout.item_selection_row, viewGroup, false)) : new l(n23.j.b(viewGroup, R.layout.privacy_type_description_row, viewGroup, false));
    }
}
