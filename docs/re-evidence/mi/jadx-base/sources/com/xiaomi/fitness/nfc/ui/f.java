package com.xiaomi.fitness.nfc.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.utils.CoilUtils;
import defpackage.av6;
import defpackage.ehe;
import defpackage.mri;
import defpackage.o0j;
import defpackage.pli;
import defpackage.rji;
import defpackage.sui;
import defpackage.wni;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class f<T extends CardWrapper> extends ehe<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentManager f12572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f12573b;
    public String c;
    public c d;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.d0 f12574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CardWrapper f12575b;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.f$a$a, reason: collision with other inner class name */
        public class C0690a extends av6 {
            public C0690a() {
            }

            @Override // defpackage.av6
            public void onDialogClick(String str, DialogInterface dialogInterface, int i) {
                super.onDialogClick(str, dialogInterface, i);
                if (i == -1) {
                    dialogInterface.dismiss();
                }
            }
        }

        public a(RecyclerView.d0 d0Var, CardWrapper cardWrapper) {
            this.f12574a = d0Var;
            this.f12575b = cardWrapper;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int adapterPosition = this.f12574a.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            if (!this.f12575b.isCloudTransit() || this.f12575b.isServiceAvailable()) {
                if (f.this.d != null) {
                    f.this.d.onItemClick(adapterPosition);
                }
            } else {
                CommonDialog commonDialogCreate = new CommonDialog.c("CardListAdapter.onClick").setDialogTitle(o0j.p2).setDialogDescriptionString(new DialogParams.DialogDescriptionString(this.f12575b.getTips())).setPositiveText(o0j.common_known).create();
                commonDialogCreate.addDialogCallback(new C0690a());
                commonDialogCreate.showIfNeed(f.this.f12572a);
            }
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinearLayout f12577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f12578b;
        public TextView c;
        public TextView d;
        public TextView e;
        public ImageView f;
        public ImageView g;
        public View h;
        public TextView i;

        public b(View view) {
            super(view);
            this.f12577a = (LinearLayout) view.findViewById(mri.Q);
            this.f12578b = (TextView) view.findViewById(mri.j0);
            this.c = (TextView) view.findViewById(mri.k0);
            this.e = (TextView) view.findViewById(mri.n0);
            this.g = (ImageView) view.findViewById(mri.p0);
            this.d = (TextView) view.findViewById(mri.l0);
            this.f = (ImageView) view.findViewById(mri.o0);
            this.h = view.findViewById(mri.m0);
            this.i = (TextView) view.findViewById(mri.P);
        }
    }

    public interface c {
        void onItemClick(int i);
    }

    public f(Context context, FragmentManager fragmentManager) {
        super(new ArrayList());
        this.f12573b = context;
        this.f12572a = fragmentManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    public boolean k(int i) {
        if (i >= getCount()) {
            return false;
        }
        T t = this.mList.get(i);
        return t.mHasIssue || t.isServiceAvailable() || t.isCloudTransit();
    }

    public final void l(f<T>.b bVar, CardWrapper cardWrapper) {
        bVar.e.setText("");
        bVar.d.setText("");
        if (cardWrapper.mHasIssue) {
            bVar.e.setTextColor(this.f12573b.getResources().getColor(rji.g));
            bVar.e.setText(o0j.A1);
            if (!TextUtils.isEmpty(cardWrapper.detailDescription)) {
                bVar.d.setText(cardWrapper.detailDescription);
            }
            bVar.h.setVisibility(TextUtils.equals(cardWrapper.mAid, this.c) ? 0 : 8);
            if (cardWrapper.hasTransferOutOrder()) {
                if (TextUtils.isEmpty(cardWrapper.userIdMismatchDesc)) {
                    bVar.e.setText(o0j.y1);
                    bVar.e.setTextColor(this.f12573b.getResources().getColor(rji.g));
                } else {
                    bVar.e.setTextColor(this.f12573b.getResources().getColor(rji.f));
                    bVar.e.setText(o0j.T6);
                }
            }
        } else if (cardWrapper.isCloudTransit()) {
            if (!TextUtils.isEmpty(cardWrapper.getCardBalanceTitle())) {
                bVar.f12578b.setText(cardWrapper.getCardBalanceTitle());
            }
            bVar.d.setText(cardWrapper.mCardName);
            bVar.e.setText(this.f12573b.getString(cardWrapper.isServiceAvailable() ? o0j.C1 : o0j.D1));
            bVar.e.setTextColor(cardWrapper.isServiceAvailable() ? this.f12573b.getResources().getColor(rji.g) : this.f12573b.getResources().getColor(rji.f));
        } else {
            if (!TextUtils.isEmpty(cardWrapper.detailDescription)) {
                bVar.d.setText(cardWrapper.detailDescription);
            }
            bVar.e.setTextColor(this.f12573b.getResources().getColor(rji.e));
            if (!cardWrapper.isServiceAvailable()) {
                bVar.e.setText(TextUtils.isEmpty(cardWrapper.getServiceStatusDesc()) ? this.f12573b.getString(o0j.e8) : cardWrapper.getServiceStatusDesc());
            } else if (cardWrapper.hasIssueNoComplete()) {
                if (TextUtils.isEmpty(cardWrapper.userIdMismatchDesc)) {
                    bVar.e.setTextColor(this.f12573b.getResources().getColor(rji.g));
                    bVar.e.setText(o0j.w1);
                } else {
                    bVar.e.setTextColor(this.f12573b.getResources().getColor(rji.f));
                    bVar.e.setText(o0j.T6);
                }
            } else if (!cardWrapper.hasTransferInOrder()) {
                bVar.e.setText(TextUtils.isEmpty(cardWrapper.getServiceStatusDesc()) ? this.f12573b.getString(o0j.z1) : cardWrapper.getServiceStatusDesc());
            } else if (TextUtils.isEmpty(cardWrapper.userIdMismatchDesc)) {
                bVar.e.setTextColor(this.f12573b.getResources().getColor(rji.g));
                bVar.e.setText(o0j.x1);
            } else {
                bVar.e.setTextColor(this.f12573b.getResources().getColor(rji.f));
                bVar.e.setText(o0j.T6);
            }
        }
        bVar.c.setText(cardWrapper.getLabel());
        bVar.c.setVisibility(TextUtils.isEmpty(cardWrapper.getLabel()) ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 d0Var, int i) {
        if (i >= getCount()) {
            return;
        }
        T t = this.mList.get(i);
        f<T>.b bVar = (b) d0Var;
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.e);
        int dimensionPixelSize2 = AppUtil.getApp().getResources().getDimensionPixelSize(pli.o);
        ((LinearLayout.LayoutParams) bVar.i.getLayoutParams()).leftMargin = dimensionPixelSize;
        bVar.f12577a.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        CoilUtils.load(bVar.f, t.getCardFace(), wni.j);
        bVar.f12578b.setText(t.mCardName);
        bVar.h.setVisibility(8);
        bVar.g.setVisibility(k(i) ? 0 : 8);
        if (i == 0) {
            if (t.isCloudTransit()) {
                bVar.i.setText(this.f12573b.getString(o0j.v1));
                bVar.i.setVisibility(0);
            } else {
                bVar.i.setText(t.mGroupName);
                bVar.i.setVisibility(0);
            }
        } else if (TextUtils.isEmpty(t.mGroupName)) {
            bVar.i.setVisibility(8);
        } else {
            if (t.mGroupName.equals(this.mList.get(i - 1).mGroupName)) {
                bVar.i.setVisibility(8);
            } else {
                bVar.i.setText(t.mGroupName);
                bVar.i.setVisibility(0);
            }
        }
        l(bVar, t);
        bVar.f12577a.setOnClickListener(new a(d0Var, t));
        bVar.f12577a.setEnabled(k(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(sui.i, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull RecyclerView.d0 d0Var) {
        super.onViewAttachedToWindow(d0Var);
    }

    public void setItemClickListener(c cVar) {
        this.d = cVar;
    }

    public void updateData(List<T> list) {
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }
}
