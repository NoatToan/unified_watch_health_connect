package jr2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ljr2/m;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Ljr2/m$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f100579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<kr2.b> f100580b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljr2/m$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f100581a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            this.f100581a = view2;
        }
    }

    public m(Context context) {
        context.getClass();
        this.f100579a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        List<kr2.b> list = this.f100580b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        List<kr2.b> list = this.f100580b;
        if ((list != null ? list.get(i14) : null) != null) {
            List<kr2.b> list2 = this.f100580b;
            list2.getClass();
            kr2.b bVar = list2.get(i14);
            if (bVar.f106241c != null) {
                aVar.itemView.setOnClickListener(new b0(bVar, i14, 9));
            }
        }
        List<kr2.b> list3 = this.f100580b;
        kr2.b bVar2 = list3 != null ? list3.get(i14) : null;
        View view2 = aVar.f100581a;
        ((TextView) view2.findViewById(R.id.developer_setting_title_label)).setText(bVar2 != null ? bVar2.f106239a : null);
        View viewFindViewById = view2.findViewById(R.id.developer_setting_info_label);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        if ((bVar2 != null ? bVar2.f106240b : null) == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(bVar2.f106240b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f100579a).inflate(R.layout.item_developer_setting, viewGroup, false);
        viewInflate.getClass();
        return new a(viewInflate);
    }

    public final void r(ArrayList arrayList) {
        this.f100580b = arrayList;
        notifyDataSetChanged();
    }
}
