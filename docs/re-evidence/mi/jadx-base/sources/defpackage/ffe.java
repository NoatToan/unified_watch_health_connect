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

/* JADX INFO: loaded from: classes8.dex */
public class ffe extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<LevelBarView.LevelItem> f17732b;
    public LayoutInflater c;
    public int d;

    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinearLayout f17733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f17734b;

        public a(View view) {
            super(view);
            this.f17733a = (LinearLayout) view.findViewById(bri.d2);
            this.f17734b = (TextView) view.findViewById(bri.M1);
        }
    }

    public ffe(Context context, List<LevelBarView.LevelItem> list, int i) {
        this.d = 0;
        this.f17731a = context;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("error params");
        }
        this.c = LayoutInflater.from(this.f17731a);
        this.f17732b = list;
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f17732b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        LinearLayout linearLayout = aVar.f17733a;
        int iB = q3b.b(this.d, i);
        linearLayout.setGravity(iB);
        LevelBarView.LevelItem levelItem = this.f17732b.get(i);
        TextView textView = aVar.f17734b;
        ((LinearLayout.LayoutParams) textView.getLayoutParams()).gravity = iB;
        textView.setText(levelItem.c);
        textView.setTextColor(this.f17731a.getResources().getColor(levelItem.f11684b));
        Drawable drawable = this.f17731a.getResources().getDrawable(lni.f25244a);
        k47.n(drawable, this.f17731a.getResources().getColor(levelItem.f11683a));
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.c.inflate(gui.N, viewGroup, false));
    }
}
