package wo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u000bB'\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lwo/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lwo/d$a;", "Lwo/a;", "chartTypeSelection", "Lkotlin/Function1;", "", "", "callback", "<init>", "(Lwo/a;Le23/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wo.a f186404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Integer, Unit> f186405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f186406c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwo/d$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lwo/d;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f186407d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Button f186408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f186409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f186410c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, View view2) {
            super(view2);
            view2.getClass();
            this.f186410c = dVar;
            Button button = (Button) view2;
            this.f186408a = button;
            button.setOnClickListener(new u12.e(28, dVar, this));
        }

        public final void d(int i14, String str, boolean z14) {
            this.f186409b = i14;
            Button button = this.f186408a;
            button.setText(str);
            button.setSelected(getBindingAdapterPosition() == this.f186410c.f186406c);
            button.setEnabled(z14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(wo.a aVar, l<? super Integer, Unit> lVar) {
        Set<Integer> setKeySet;
        this.f186404a = aVar;
        this.f186405b = lVar;
        this.f186406c = (aVar == null || (setKeySet = aVar.f186398b.keySet()) == null) ? 0 : h0.f0(setKeySet, aVar.f186397a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        wo.a aVar = this.f186404a;
        if (aVar != null) {
            return aVar.f186398b.size();
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        wo.a aVar2 = this.f186404a;
        if (aVar2 == null) {
            String string = aVar.itemView.getContext().getString(R.string.lbl_speed);
            string.getClass();
            aVar.d(0, string, false);
            return;
        }
        Set<Map.Entry<Integer, String>> setEntrySet = aVar2.f186398b.entrySet();
        setEntrySet.getClass();
        List listB1 = h0.b1(setEntrySet);
        Object key = ((Map.Entry) listB1.get(i14)).getKey();
        key.getClass();
        int iIntValue = ((Number) key).intValue();
        String str = (String) ((Map.Entry) listB1.get(i14)).getValue();
        if (str == null) {
            str = "";
        }
        aVar.d(iIntValue, str, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, j.b(viewGroup, R.layout.view_display_chip, viewGroup, false));
    }
}
