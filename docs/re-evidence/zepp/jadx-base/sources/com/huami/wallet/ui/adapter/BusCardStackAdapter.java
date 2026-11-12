package com.huami.wallet.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.huami.lib.qrcode.gallery.QRCodeGalleryActivity;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.ui.R;
import com.loopeer.cardstack.CardStackView;
import com.loopeer.cardstack.StackAdapter;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes16.dex */
public class BusCardStackAdapter extends StackAdapter<BusCardSimple2> {
    private final FragmentManager e;

    public class a implements ViewGroup.OnHierarchyChangeListener {
        public a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            b bVar = (b) view2.getTag();
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public static class b extends CardStackView.ViewHolder {
        public final FragmentManager c;

        public b(View view, FragmentManager fragmentManager) {
            super(view);
            this.c = fragmentManager;
        }

        public void a(BusCardSimple2 busCardSimple2, int i) {
            this.itemView.setId(b(i));
            this.itemView.setLayoutParams(new CardStackView.LayoutParams(-1, -1));
        }

        public int b(int i) {
            return i + QRCodeGalleryActivity.REQUEST_CODE;
        }

        public String c(int i, String str) {
            return "BusDetail-" + i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str;
        }

        public void d() {
        }

        @Override // com.loopeer.cardstack.CardStackView.ViewHolder
        public void onItemExpand(boolean z) {
        }
    }

    public BusCardStackAdapter(Context context, FragmentManager fragmentManager, CardStackView cardStackView) {
        super(context);
        this.e = fragmentManager;
        cardStackView.setOnHierarchyChangeListener(new a());
    }

    @Override // com.loopeer.cardstack.CardStackView.Adapter
    public CardStackView.ViewHolder onCreateView(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wl_empty_shell, viewGroup, false);
        b bVar = new b(viewInflate, this.e);
        viewInflate.setTag(bVar);
        return bVar;
    }

    @Override // com.loopeer.cardstack.StackAdapter
    public void bindView(BusCardSimple2 busCardSimple2, int i, CardStackView.ViewHolder viewHolder) {
        ((b) viewHolder).a(busCardSimple2, i);
    }
}
