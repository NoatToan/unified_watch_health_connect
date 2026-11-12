package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.distribute.IDataAdapter;
import com.xiaomi.fitness.widget.view.DurationTextView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class opo extends RecyclerView.Adapter<RecyclerView.d0> implements IDataAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<qpo> f29369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f29370b;
    public e c;
    public View.OnClickListener d;
    public LayoutInflater e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29371k;
    public String l;
    public boolean m;

    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f29372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f29373b;
        public ImageView c;

        public a(View view) {
            super(view);
            this.f29372a = (ImageView) view.findViewById(eri.C7);
            this.f29373b = (TextView) view.findViewById(eri.Kn);
            this.c = (ImageView) view.findViewById(eri.u7);
        }

        public void a(int i, String str, int i2) {
            if (i != -1) {
                this.f29372a.setImageResource(i);
            } else {
                this.f29372a.setVisibility(8);
            }
            this.f29373b.setText(str);
            this.c.setVisibility(i2);
        }
    }

    public static class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f29374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f29375b;
        public TextView c;
        public DurationTextView d;
        public TextView e;
        public ImageView f;
        public e g;

        public b(View view) {
            super(view);
            this.f29374a = (TextView) view.findViewById(eri.f442do);
            this.f29375b = (TextView) view.findViewById(eri.ho);
            this.c = (TextView) view.findViewById(eri.fo);
            this.d = (DurationTextView) view.findViewById(eri.p4);
            this.e = (TextView) view.findViewById(eri.Uj);
            this.f = (ImageView) view.findViewById(eri.Z8);
        }

        public void b(final qpo qpoVar, final int i) {
            if (qpoVar.e) {
                this.d.setVisibility(0);
                this.d.setDuration(qpoVar.f);
                this.f29375b.setText("");
            } else {
                this.d.setVisibility(8);
                this.f29375b.setText(qpoVar.f31728b);
            }
            if (TextUtils.isEmpty(qpoVar.d)) {
                this.e.setVisibility(8);
            } else {
                Drawable drawable = qpoVar.i;
                if (drawable != null) {
                    this.e.setBackground(drawable);
                }
                int i2 = qpoVar.h;
                if (i2 != 0) {
                    this.e.setTextColor(i2);
                }
                this.e.setVisibility(0);
                this.e.setText(qpoVar.d);
            }
            this.f29374a.setText(qpoVar.f31727a);
            this.c.setText(qpoVar.c);
            if (!qpoVar.g) {
                this.f.setVisibility(8);
                return;
            }
            this.f.setVisibility(0);
            if (this.g != null) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: npo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f28236a.c(qpoVar, i, view);
                    }
                });
            }
        }

        public final /* synthetic */ void c(qpo qpoVar, int i, View view) {
            this.g.onClick(qpoVar, i);
        }

        public void setOnItemClickListener(e eVar) {
            this.g = eVar;
        }
    }

    public static class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f29376a;

        public c(View view) {
            super(view);
            this.f29376a = (TextView) view.findViewById(eri.jl);
        }

        public void bindData(String str) {
            this.f29376a.setText(str);
        }
    }

    public static class d extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f29377a;

        public d(View view) {
            super(view);
            this.f29377a = (TextView) view.findViewById(eri.ho);
        }

        public void bindData(String str) {
            this.f29377a.setText(str);
        }
    }

    public interface e {
        default void onBottomClick(boolean z) {
        }

        void onClick(qpo qpoVar, int i);

        default void onHeaderClick() {
        }
    }

    public opo(Context context, List<qpo> list) {
        this.g = 0;
        this.h = 0;
        this.j = -1;
        this.f29371k = 8;
        this.m = false;
        this.f29369a = list;
        this.f29370b = context;
        this.f = 0;
        this.e = LayoutInflater.from(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.onHeaderClick();
        }
    }

    public int getContentItemCount() {
        return this.f29369a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f + getContentItemCount() + this.g + this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.f;
        if (i2 != 0 && i < i2) {
            return 101;
        }
        if (this.g == 0 || i != getItemCount() - 1) {
            return (this.h == 0 || i != getItemCount() - 1) ? 1 : 102;
        }
        return 2;
    }

    public void hideFooterFold() {
        this.g = 0;
    }

    @Override // com.xiaomi.fitness.widget.distribute.IDataAdapter
    public boolean isFooterView(int i) {
        return this.g != 0 && i == getItemCount() - 1;
    }

    @Override // com.xiaomi.fitness.widget.distribute.IDataAdapter
    public boolean isHeaderView(int i) {
        int i2 = this.f;
        return i2 != 0 && i < i2;
    }

    public boolean k() {
        return this.m;
    }

    public boolean l(int i) {
        return this.h != 0 && i == getItemCount() - 1;
    }

    public final /* synthetic */ void n(View view) {
        this.c.onBottomClick(this.m);
    }

    public void notifyDataChanged() {
        notifyDataSetChanged();
    }

    public void o(int i, View.OnClickListener onClickListener) {
        this.f29371k = i;
        this.d = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            aVar.a(this.j, this.i, this.f29371k);
            if (this.f29371k == 0) {
                View.OnClickListener onClickListener = this.d;
                if (onClickListener != null) {
                    aVar.c.setOnClickListener(onClickListener);
                }
                if (this.c != null) {
                    aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: hpo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f20323a.m(view);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (d0Var instanceof b) {
            b bVar = (b) d0Var;
            qpo qpoVar = this.f29369a.get(i - this.f);
            if (qpoVar != null) {
                bVar.setOnItemClickListener(this.c);
                bVar.b(qpoVar, i);
                return;
            }
            return;
        }
        if (!(d0Var instanceof c)) {
            if (d0Var instanceof d) {
                ((d) d0Var).bindData(this.l);
            }
        } else {
            c cVar = (c) d0Var;
            cVar.bindData(this.l);
            if (this.c != null) {
                cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: jpo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f23007a.n(view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 101) {
            return new a(this.e.inflate(jui.R6, viewGroup, false));
        }
        if (i == 2) {
            return new c(this.e.inflate(jui.G6, viewGroup, false));
        }
        return i == 102 ? new d(this.e.inflate(jui.Q6, viewGroup, false)) : new b(this.e.inflate(jui.S6, viewGroup, false));
    }

    public void p(int i, boolean z) {
        this.g = 1;
        this.l = this.f29370b.getString(i);
        this.m = z;
    }

    public void q(int i, boolean z) {
        this.h = 1;
        this.l = this.f29370b.getString(i);
        this.m = z;
    }

    public void setHeaderViewTitle(int i) {
        this.i = this.f29370b.getString(i);
    }

    public void setOnItemClickListener(e eVar) {
        this.c = eVar;
    }

    public opo(Context context, List<qpo> list, int i, int i2) {
        this(context, list, context.getString(i), i2);
    }

    public opo(Context context, List<qpo> list, String str, int i) {
        this.f = 1;
        this.g = 0;
        this.h = 0;
        this.f29371k = 8;
        this.m = false;
        this.f29370b = context;
        this.f29369a = list;
        this.i = str;
        this.j = i;
        this.e = LayoutInflater.from(context);
    }
}
