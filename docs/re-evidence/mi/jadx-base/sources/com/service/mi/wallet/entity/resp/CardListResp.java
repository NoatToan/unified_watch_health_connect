package com.service.mi.wallet.entity.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.service.mi.BankCard;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CardListResp extends BaseWalletResponse implements Parcelable {
    public static final Parcelable.Creator<CardListResp> CREATOR = new Parcelable.Creator<CardListResp>() { // from class: com.service.mi.wallet.entity.resp.CardListResp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CardListResp createFromParcel(Parcel parcel) {
            return new CardListResp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CardListResp[] newArray(int i) {
            return new CardListResp[i];
        }
    };
    private List<BankCard> cardList;

    public CardListResp(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<BankCard> getCardList() {
        return this.cardList;
    }

    public void setCardList(List<BankCard> list) {
        this.cardList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.cardList);
    }

    public CardListResp(Parcel parcel) {
        this.cardList = parcel.createTypedArrayList(BankCard.CREATOR);
    }
}
