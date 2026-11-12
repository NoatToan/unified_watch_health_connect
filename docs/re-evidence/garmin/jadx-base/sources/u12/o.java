package u12;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u1.y1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lu12/o;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f167804f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f167805a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f167807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PrivacyType f167808d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f167806b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.l<? super PrivacyType, Unit> f167809e = new y1(3);

    static {
        new a(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        int size = this.f167806b.size();
        if (this.f167805a != null) {
            size++;
        }
        return this.f167807c != null ? size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        if (this.f167805a == null || i14 != 0) {
            return (this.f167807c == null || i14 != getItemCount() - 1) ? 2 : 1;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String str;
        f0Var.getClass();
        if (f0Var instanceof l) {
            l lVar = (l) f0Var;
            String str2 = "";
            if (i14 != 0 ? (str = this.f167807c) != null : (str = this.f167805a) != null) {
                str2 = str;
            }
            ((TextView) lVar.itemView.findViewById(R.id.description)).setText(str2);
            lVar.itemView.setClickable(false);
            return;
        }
        if (f0Var instanceof n) {
            if (this.f167805a != null) {
                i14--;
            }
            PrivacyType privacyType = (PrivacyType) this.f167806b.get(i14);
            n nVar = (n) f0Var;
            boolean z14 = privacyType == this.f167808d;
            privacyType.getClass();
            View view2 = nVar.itemView;
            ((TextView) view2.findViewById(R.id.checkable_row_name)).setText(privacyType.getF28797a());
            ((TextView) view2.findViewById(R.id.checkable_row_hint)).setText(privacyType.getF28798b());
            View viewFindViewById = view2.findViewById(R.id.checkable_row_hint);
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(0);
            ImageView imageView = (ImageView) view2.findViewById(R.id.checkable_row_img);
            imageView.getClass();
            imageView.setVisibility(z14 ? 0 : 8);
            s0.r(view2, new m(z14));
            Context context = view2.getContext();
            context.getClass();
            if (c22.b.e(context)) {
                Context context2 = view2.getContext();
                context2.getClass();
                Resources resources = view2.getResources();
                resources.getClass();
                int iC = (int) c22.b.c(context2, xy2.b.n(resources, 20.0f), 1.8f);
                imageView.getLayoutParams().width = iC;
                imageView.getLayoutParams().height = iC;
            }
            f0Var.itemView.setOnClickListener(new e(1, this, privacyType));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return i14 == 1 ? new l(n23.j.b(viewGroup, R.layout.privacy_type_description_row, viewGroup, false)) : new n(viewGroup);
    }

    public final void r(List<? extends PrivacyType> list) {
        list.getClass();
        ArrayList arrayList = this.f167806b;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lu12/o$a;", "", "<init>", "()V", "", "ITEM_TYPE_HEADER", "I", "ITEM_TYPE_PRIVACY", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
