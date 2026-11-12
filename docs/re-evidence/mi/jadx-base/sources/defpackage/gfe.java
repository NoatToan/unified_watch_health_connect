package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class gfe extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f18920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<LevelBarView.LevelItem> f18921b;
    public LayoutInflater c;
    public int d;

    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinearLayout f18922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f18923b;

        public a(View view) {
            super(view);
            this.f18922a = (LinearLayout) view.findViewById(eri.Qa);
            this.f18923b = (TextView) view.findViewById(eri.na);
        }
    }

    public gfe(Context context, List<LevelBarView.LevelItem> list, int i) {
        this.d = 0;
        this.f18920a = context;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("error params");
        }
        this.c = LayoutInflater.from(this.f18920a);
        this.f18921b = list;
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f18921b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        Drawable drawableE;
        LinearLayout linearLayout = aVar.f18922a;
        int iB = q3b.b(this.d, i);
        linearLayout.setGravity(iB);
        LevelBarView.LevelItem levelItem = this.f18921b.get(i);
        TextView textView = aVar.f18923b;
        ((LinearLayout.LayoutParams) textView.getLayoutParams()).gravity = iB;
        textView.setText(levelItem.c);
        textView.setTextColor(this.f18920a.getResources().getColor(levelItem.f11684b));
        int i2 = levelItem.e;
        if (i2 != 0) {
            drawableE = ni4.e(this.f18920a, i2);
            if (drawableE != null && levelItem.f) {
                k47.n(drawableE, this.f18920a.getResources().getColor(levelItem.f11683a));
            }
            drawableE.setBounds(0, 0, drawableE.getIntrinsicWidth(), drawableE.getIntrinsicHeight());
        } else {
            drawableE = ni4.e(this.f18920a, pni.c);
            if (drawableE != null) {
                k47.n(drawableE, this.f18920a.getResources().getColor(levelItem.f11683a));
                drawableE.setBounds(0, 0, drawableE.getIntrinsicWidth(), drawableE.getIntrinsicHeight());
            }
        }
        textView.setCompoundDrawablesRelative(drawableE, null, null, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.c.inflate(jui.l7, viewGroup, false));
    }
}
