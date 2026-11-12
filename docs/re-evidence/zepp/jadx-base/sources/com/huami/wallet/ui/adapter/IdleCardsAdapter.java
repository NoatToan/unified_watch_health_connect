package com.huami.wallet.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.utils.ImageLoadUtils;
import com.loopeer.cardstack.CardStackView;
import com.loopeer.cardstack.StackAdapter;

/* JADX INFO: loaded from: classes16.dex */
public class IdleCardsAdapter extends StackAdapter<BusCardSimple2> {
    public OnItemClick e;

    public static class CardViewHolder extends CardStackView.ViewHolder {
        public View c;
        public Context d;
        public ImageView e;
        public OnItemClick f;

        public CardViewHolder(View view) {
            super(view);
            this.c = view;
            this.d = view.getContext();
            this.e = (ImageView) view.findViewById(R.id.card_image);
            System.out.println("CardViewHolder constructor");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, BusCardSimple2 busCardSimple2, View view) {
            OnItemClick onItemClick = this.f;
            if (onItemClick != null) {
                onItemClick.onItemClick(i, busCardSimple2);
            }
        }

        public OnItemClick getOnItemClick() {
            return this.f;
        }

        public void onBind(final BusCardSimple2 busCardSimple2, final int i) {
            ImageLoadUtils.loadImageInRoundRect(this.e, busCardSimple2.imageUrl, this.d.getResources().getDimensionPixelOffset(R.dimen.wl_image_round_rect_radius));
            this.c.setOnClickListener(new View.OnClickListener() { // from class: qc4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(i, busCardSimple2, view);
                }
            });
            System.out.println("holder onBind");
        }

        @Override // com.loopeer.cardstack.CardStackView.ViewHolder
        public void onItemExpand(boolean z) {
            System.out.println("holder onItemExpand");
        }

        public void setOnItemClick(OnItemClick onItemClick) {
            this.f = onItemClick;
        }
    }

    public interface OnItemClick {
        void onItemClick(int i, BusCardSimple2 busCardSimple2);
    }

    public IdleCardsAdapter(Context context) {
        super(context);
    }

    @Override // com.loopeer.cardstack.StackAdapter, com.loopeer.cardstack.CardStackView.Adapter
    public int getItemCount() {
        return super.getItemCount();
    }

    public OnItemClick getOnItemClick() {
        return this.e;
    }

    @Override // com.loopeer.cardstack.CardStackView.Adapter
    public CardStackView.ViewHolder onCreateView(ViewGroup viewGroup, int i) {
        CardViewHolder cardViewHolder = new CardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item, viewGroup, false));
        System.out.println("onCreateView");
        return cardViewHolder;
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.e = onItemClick;
    }

    @Override // com.loopeer.cardstack.StackAdapter
    public void bindView(BusCardSimple2 busCardSimple2, int i, CardStackView.ViewHolder viewHolder) {
        CardViewHolder cardViewHolder = (CardViewHolder) viewHolder;
        cardViewHolder.onBind(busCardSimple2, i);
        cardViewHolder.setOnItemClick(this.e);
    }
}
