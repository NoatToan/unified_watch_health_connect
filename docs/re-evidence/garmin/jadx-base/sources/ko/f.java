package ko;

import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import e23.p;
import java.util.List;
import p005kotlin.Unit;
import po.a0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f105715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.h f105716c;

    public /* synthetic */ f(RecyclerView.h hVar, int i14, int i15) {
        this.f105714a = i15;
        this.f105716c = hVar;
        this.f105715b = i14;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        switch (this.f105714a) {
            case 0:
                g gVar = (g) this.f105716c;
                compoundButton.getClass();
                p<Integer, Boolean, Unit> pVar = gVar.f105719c;
                List<e> list = gVar.f105717a;
                int i14 = this.f105715b;
                pVar.invoke(Integer.valueOf(list.get(i14).f105708a), Boolean.valueOf(z14));
                gVar.f105717a.get(i14).f105713f = z14;
                break;
            default:
                a0 a0Var = (a0) this.f105716c;
                compoundButton.getClass();
                a0Var.f138816b.invoke(a0Var.f138815a.get(this.f105715b).f148348a, Boolean.valueOf(z14));
                break;
        }
    }
}
