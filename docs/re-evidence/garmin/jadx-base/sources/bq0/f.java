package bq0;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class f extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.k f19488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.c f19489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f19490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19491d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<k> f19494g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f19496i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19492e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseBooleanArray f19495h = new SparseBooleanArray(0);

    public class a implements y {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [bq0.b, java.lang.Object] */
        @Override // androidx.recyclerview.widget.y
        public final void a(int i14, int i15) {
            f fVar = f.this;
            int i16 = i14 + 2;
            fVar.f19495h.delete(i16);
            fVar.t();
            if (fVar.f19496i != null) {
                fVar.f19496i.R5(fVar.u());
            }
            fVar.notifyItemRangeRemoved(i16, i15);
        }

        @Override // androidx.recyclerview.widget.y
        public final void b(int i14, int i15, Object obj) {
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [bq0.b, java.lang.Object] */
        @Override // androidx.recyclerview.widget.y
        public final void c(int i14, int i15) {
            f fVar = f.this;
            SparseBooleanArray sparseBooleanArrayClone = fVar.f19495h.clone();
            fVar.f19495h = new SparseBooleanArray(0);
            for (int i16 = 0; i16 < sparseBooleanArrayClone.size(); i16++) {
                SparseBooleanArray sparseBooleanArray = fVar.f19495h;
                if (i16 < i14) {
                    sparseBooleanArray.put(sparseBooleanArrayClone.keyAt(i16), sparseBooleanArrayClone.get(sparseBooleanArrayClone.keyAt(i16)));
                } else {
                    sparseBooleanArray.put(sparseBooleanArrayClone.keyAt(i16) + i14, sparseBooleanArrayClone.get(sparseBooleanArrayClone.keyAt(i16)));
                }
            }
            for (int i17 = 0; i17 < i15; i17++) {
                fVar.f19495h.put(i14 + i17 + 2, true);
            }
            fVar.t();
            if (fVar.f19496i != null) {
                fVar.f19496i.R5(fVar.u());
            }
            fVar.notifyItemRangeInserted(i14 + 2, i15);
        }

        @Override // androidx.recyclerview.widget.y
        public final void d(int i14, int i15) {
        }
    }

    public class b extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f19498a;

        public b(View view2) {
            super(view2);
            ImageView imageView = (ImageView) view2.findViewById(R.id.iv_image);
            this.f19498a = imageView;
            if (imageView != null) {
                view2.setOnClickListener(this);
            }
        }

        public final void d(int i14) {
            int itemViewType = getItemViewType();
            f fVar = f.this;
            if (itemViewType != 2) {
                boolean z14 = fVar.f19492e;
                View view2 = this.itemView;
                if (z14) {
                    view2.setBackgroundResource(R.color.palette_interface_100);
                    return;
                } else {
                    view2.setBackgroundResource(R.color.palette_interface_54);
                    return;
                }
            }
            boolean z15 = fVar.f19492e;
            ImageView imageView = this.f19498a;
            if (!z15 || fVar.f19495h.get(i14)) {
                imageView.clearColorFilter();
            } else {
                imageView.setColorFilter(Color.argb(102, 255, 255, 255), PorterDuff.Mode.SRC_ATOP);
            }
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [bq0.b, java.lang.Object] */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (getItemViewType() != 2 || bindingAdapterPosition == -1) {
                return;
            }
            f fVar = f.this;
            boolean z14 = fVar.f19495h.get(bindingAdapterPosition);
            k kVar = (fVar.f19494g == null || fVar.getItemViewType(bindingAdapterPosition) == 0 || fVar.getItemViewType(bindingAdapterPosition) == 1) ? null : fVar.f19494g.get(bindingAdapterPosition - 2);
            if (z14) {
                boolean z15 = !fVar.f19495h.get(bindingAdapterPosition);
                boolean z16 = fVar.f19495h.get(bindingAdapterPosition);
                fVar.f19495h.put(bindingAdapterPosition, z15);
                if (z16 != z15) {
                    fVar.notifyItemChanged(bindingAdapterPosition);
                }
                fVar.t();
            } else if (fVar.u() == fVar.f19491d) {
                fVar.A();
            } else {
                boolean z17 = !fVar.f19495h.get(bindingAdapterPosition);
                boolean z18 = fVar.f19495h.get(bindingAdapterPosition);
                fVar.f19495h.put(bindingAdapterPosition, z17);
                if (z18 != z17) {
                    fVar.notifyItemChanged(bindingAdapterPosition);
                }
                fVar.t();
            }
            if (fVar.f19496i != null) {
                fVar.f19496i.R5(fVar.u());
            }
        }
    }

    public f(i.c cVar, int i14) {
        this.f19489b = cVar;
        this.f19491d = i14;
        this.f19488a = com.bumptech.glide.b.c(cVar).e(cVar);
        this.f19493f = (int) ((cVar.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
        this.f19490c = (LayoutInflater) cVar.getSystemService("layout_inflater");
    }

    public final void A() {
        new androidx.appcompat.app.e.a(this.f19489b).setTitle(R.string.social_group_photo_limit_reached).setMessage(R.string.activities_photo_limit_message_2).setPositiveButton(R.string.lbl_ok, new ag0.e(17)).show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        List<k> list = this.f19494g;
        if (list != null) {
            return list.size() + 2;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        if (i14 == 0) {
            return 0;
        }
        return i14 == 1 ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        int itemViewType = getItemViewType(i14);
        if (itemViewType != 2) {
            if (itemViewType == 0) {
                final int i15 = 0;
                bVar.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: bq0.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f19487b;

                    {
                        this.f19487b = this;
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [bq0.b, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [bq0.b, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ?? r14;
                        ?? r15;
                        switch (i15) {
                            case 0:
                                f fVar = this.f19487b;
                                if (fVar.f19491d == fVar.u() || (r14 = fVar.f19496i) == 0) {
                                    fVar.A();
                                } else {
                                    r14.y8();
                                }
                                break;
                            default:
                                f fVar2 = this.f19487b;
                                if (fVar2.f19491d == fVar2.u() || (r15 = fVar2.f19496i) == 0) {
                                    fVar2.A();
                                } else {
                                    r15.I7();
                                }
                                break;
                        }
                    }
                });
                bVar.d(i14);
                return;
            } else {
                if (itemViewType == 1) {
                    final int i16 = 1;
                    bVar.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: bq0.e

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f19487b;

                        {
                            this.f19487b = this;
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [bq0.b, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r0v3, types: [bq0.b, java.lang.Object] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ?? r14;
                            ?? r15;
                            switch (i16) {
                                case 0:
                                    f fVar = this.f19487b;
                                    if (fVar.f19491d == fVar.u() || (r14 = fVar.f19496i) == 0) {
                                        fVar.A();
                                    } else {
                                        r14.y8();
                                    }
                                    break;
                                default:
                                    f fVar2 = this.f19487b;
                                    if (fVar2.f19491d == fVar2.u() || (r15 = fVar2.f19496i) == 0) {
                                        fVar2.A();
                                    } else {
                                        r15.I7();
                                    }
                                    break;
                            }
                        }
                    });
                    bVar.d(i14);
                    return;
                }
                return;
            }
        }
        List<k> list = this.f19494g;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bumptech.glide.j jVarM = this.f19488a.d(Drawable.class).H(((this.f19494g == null || getItemViewType(i14) == 0 || getItemViewType(i14) == 1) ? null : this.f19494g.get(i14 - 2)).f19509a).M();
        ImageView imageView = bVar.f19498a;
        f fVar = f.this;
        jVarM.E(imageView);
        boolean z14 = fVar.f19495h.get(i14);
        KeyEvent.Callback callback = bVar.itemView;
        if (callback instanceof Checkable) {
            ((Checkable) callback).setChecked(z14);
        }
        boolean z15 = this.f19495h.get(i14);
        ImageView imageView2 = bVar.f19498a;
        if (z15) {
            int i17 = fVar.f19493f;
            imageView2.setPadding(i17, i17, i17, i17);
            imageView2.setBackgroundResource(2131232816);
            imageView2.setImageAlpha(102);
        } else {
            imageView2.setPadding(0, 0, 0, 0);
            imageView2.setBackgroundResource(0);
            imageView2.setImageAlpha(255);
        }
        bVar.d(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        if (i14 == 2) {
            return new b(this.f19490c.inflate(R.layout.image_cell_layout, viewGroup, false));
        }
        i.c cVar = this.f19489b;
        return i14 == 1 ? new b(new ro1.p(cVar, null, 0, false)) : new b(new ro1.p(cVar));
    }

    public final void r(k kVar) {
        List<k> list = this.f19494g;
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.f19494g = arrayList;
            arrayList.add(kVar);
            notifyItemInserted(0);
            return;
        }
        if (this.f19494g.contains(kVar)) {
            return;
        }
        this.f19494g.add(0, kVar);
        notifyItemInserted(0);
    }

    public final void t() {
        if (this.f19492e) {
            this.f19492e = false;
            notifyDataSetChanged();
            return;
        }
        boolean z14 = u() == this.f19491d;
        this.f19492e = z14;
        if (z14) {
            notifyDataSetChanged();
        }
    }

    public final int u() {
        int i14 = 0;
        for (int i15 = 0; i15 < this.f19495h.size(); i15++) {
            SparseBooleanArray sparseBooleanArray = this.f19495h;
            i14 += sparseBooleanArray.get(sparseBooleanArray.keyAt(i15)) ? 1 : 0;
        }
        return i14;
    }

    public final ArrayList<k> x() {
        ArrayList<k> arrayList = new ArrayList<>();
        if (this.f19494g != null) {
            for (int i14 = 0; i14 < this.f19495h.size(); i14++) {
                int iKeyAt = this.f19495h.keyAt(i14);
                if (this.f19495h.get(iKeyAt)) {
                    arrayList.add(this.f19494g.get(iKeyAt - 2));
                }
            }
        }
        return arrayList;
    }

    public final void z(List<k> list) {
        List<k> list2;
        if (list == null || (list2 = this.f19494g) == null || list2.isEmpty()) {
            this.f19494g = list;
            this.f19495h = new SparseBooleanArray(0);
            notifyDataSetChanged();
        } else {
            List<k> list3 = this.f19494g;
            this.f19494g = list;
            androidx.recyclerview.widget.o.a(new g(list3, list)).b(new a());
        }
    }
}
