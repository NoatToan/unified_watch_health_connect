package vd1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvd1/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lpd1/b;", "userReminderDTO", "", "layoutResource", "Lvd1/a;", "timesListener", "<init>", "(Lpd1/b;ILvd1/a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd1.b f177445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f177446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f177447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f177448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f177449e;

    public b(pd1.b bVar, int i14, a aVar) {
        bVar.getClass();
        aVar.getClass();
        this.f177445a = bVar;
        this.f177446b = i14;
        this.f177447c = aVar;
        int i15 = gt2.c.f79010a;
        this.f177448d = gt2.b.f79005a.h("PregnancyReminderTimesAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        List<Integer> listH = this.f177445a.h();
        if (listH != null) {
            return listH.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        List<Integer> listH = this.f177445a.h();
        Integer num = listH != null ? listH.get(i14) : null;
        this.f177448d.debug("onBindViewHolder: position=[" + i14 + "], item=[" + num + "]");
        if (f0Var instanceof f) {
            f fVar = (f) f0Var;
            boolean z14 = this.f177449e;
            TextView textView = fVar.f177469b;
            wd1.c.a aVar = wd1.c.f184378a;
            List listC = w.c(num);
            aVar.getClass();
            textView.setText(wd1.c.a.a(listC));
            ImageView imageView = fVar.f177470c;
            imageView.setVisibility(z14 ? 0 : 8);
            imageView.setOnClickListener(new u12.e(19, fVar, num));
            View view2 = fVar.itemView;
            if (z14) {
                view2.setOnClickListener(fVar);
                fVar.itemView.setClickable(true);
            } else {
                view2.setOnClickListener(null);
                fVar.itemView.setClickable(false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f177446b, viewGroup, false);
        viewInflate.getClass();
        return new f(viewInflate, this.f177447c);
    }
}
