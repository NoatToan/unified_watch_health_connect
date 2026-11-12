package com.huami.wallet.accessdoor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huami.nfc.door.entity.DoorCardExtraEntity;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.utils.ImageUtils;
import com.loopeer.cardstack.CardStackView;
import com.loopeer.cardstack.StackAdapter;

/* JADX INFO: loaded from: classes15.dex */
public class AccessDoorListAdapter extends StackAdapter<DoorInfoAndDefaultCard> {
    private OnItemClick e;

    public interface OnItemClick {
        void onItemClick(int i, DoorInfoAndDefaultCard doorInfoAndDefaultCard);
    }

    public static class a extends CardStackView.ViewHolder {
        public View c;
        public Context d;
        public ImageView e;
        public TextView f;
        public OnItemClick g;
        public TextView h;

        public a(View view) {
            super(view);
            this.c = view;
            this.d = view.getContext();
            this.e = (ImageView) view.findViewById(R.id.card_image);
            this.f = (TextView) view.findViewById(R.id.tv_card_name);
            this.h = (TextView) view.findViewById(R.id.tv_list_encryption_card_tip);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(int i, DoorInfoAndDefaultCard doorInfoAndDefaultCard, View view) {
            OnItemClick onItemClick = this.g;
            if (onItemClick != null) {
                onItemClick.onItemClick(i, doorInfoAndDefaultCard);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(OnItemClick onItemClick) {
            this.g = onItemClick;
        }

        public void c(final DoorInfoAndDefaultCard doorInfoAndDefaultCard, final int i) {
            ImageUtils.loadImage(this.e, doorInfoAndDefaultCard.getDoorCardInfo().getCardArt());
            this.f.setText(doorInfoAndDefaultCard.getDoorCardInfo().getName());
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.huami.wallet.accessdoor.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.d(i, doorInfoAndDefaultCard, view);
                }
            });
            DoorCardExtraEntity extra = doorInfoAndDefaultCard.getDoorCardInfo().getExtra();
            this.h.setVisibility((extra == null || extra.getDataType() == null || extra.getDataType().intValue() != 1) ? false : true ? 0 : 8);
        }

        @Override // com.loopeer.cardstack.CardStackView.ViewHolder
        public void onItemExpand(boolean z) {
            System.out.println("holder onItemExpand");
        }
    }

    public AccessDoorListAdapter(Context context) {
        super(context);
    }

    @Override // com.loopeer.cardstack.StackAdapter, com.loopeer.cardstack.CardStackView.Adapter
    public int getItemCount() {
        return super.getItemCount();
    }

    @Override // com.loopeer.cardstack.CardStackView.Adapter
    public CardStackView.ViewHolder onCreateView(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.door_card_item, viewGroup, false);
        a aVar = new a(viewInflate);
        viewInflate.setTag(aVar);
        return aVar;
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.e = onItemClick;
    }

    @Override // com.loopeer.cardstack.StackAdapter
    public void bindView(DoorInfoAndDefaultCard doorInfoAndDefaultCard, int i, CardStackView.ViewHolder viewHolder) {
        a aVar = (a) viewHolder;
        aVar.c(doorInfoAndDefaultCard, i);
        aVar.e(this.e);
    }
}
