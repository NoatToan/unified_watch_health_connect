package com.xiaomi.fitness.nfc.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.sesdk.OrderData;
import defpackage.mri;
import defpackage.sui;
import defpackage.wni;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class j extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<OrderData.Coupon> f12608a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f12609b;
    public b c;

    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f12610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f12611b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public ImageView g;

        public a(View view) {
            super(view);
            this.f12611b = view.findViewById(mri.T0);
            this.d = (TextView) view.findViewById(mri.N4);
            this.e = (TextView) view.findViewById(mri.m);
            this.c = (TextView) view.findViewById(mri.S4);
            this.f = (TextView) view.findViewById(mri.f1);
            this.g = (ImageView) view.findViewById(mri.l4);
        }

        public final /* synthetic */ void b(OrderData.Coupon coupon, View view) {
            b bVar = this.f12610a;
            if (bVar != null) {
                bVar.onItemClick(coupon);
            }
        }

        public void c(final OrderData.Coupon coupon) {
            this.c.setText(coupon.getTitle());
            this.d.setText(coupon.getExpireDesc());
            this.e.setText(coupon.getDiscountAmount());
            this.f.setText(coupon.getDiscountDesc());
            boolean z = false;
            if (coupon.isValid()) {
                this.f12611b.setClickable(true);
                OrderData.Coupon coupon2 = zl3.g().f41418a;
                ImageView imageView = this.g;
                if (coupon2 != null && coupon2.getCouponId() == coupon.getCouponId()) {
                    z = true;
                }
                imageView.setSelected(z);
            } else {
                this.f12611b.setClickable(false);
                this.f12611b.setBackgroundResource(wni.p);
            }
            this.g.setOnClickListener(new View.OnClickListener() { // from class: fm4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17925a.b(coupon, view);
                }
            });
        }

        public void setItemClickListener(b bVar) {
            this.f12610a = bVar;
        }
    }

    public interface b {
        void onItemClick(OrderData.Coupon coupon);
    }

    public j(Context context) {
        this.f12609b = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f12608a.size();
    }

    public OrderData.Coupon i(int i) {
        if (i < 0 || i >= this.f12608a.size()) {
            return null;
        }
        return this.f12608a.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        OrderData.Coupon couponI = i(i);
        if (couponI == null) {
            return;
        }
        aVar.c(couponI);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        a aVar = new a(this.f12609b.inflate(sui.l, viewGroup, false));
        aVar.setItemClickListener(this.c);
        return aVar;
    }

    public void l(List<OrderData.Coupon> list) {
        this.f12608a.clear();
        if (list != null) {
            this.f12608a.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void setListener(b bVar) {
        this.c = bVar;
    }
}
