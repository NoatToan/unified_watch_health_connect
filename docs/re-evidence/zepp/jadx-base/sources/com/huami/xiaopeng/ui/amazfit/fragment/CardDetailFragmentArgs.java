package com.huami.xiaopeng.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p010navigation.NavArgs;
import com.alipay.sdk.m.u.i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class CardDetailFragmentArgs implements NavArgs {
    private final HashMap a;

    private CardDetailFragmentArgs() {
        this.a = new HashMap();
    }

    @NonNull
    public static CardDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
        CardDetailFragmentArgs cardDetailFragmentArgs = new CardDetailFragmentArgs();
        bundle.setClassLoader(CardDetailFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("backToXp")) {
            cardDetailFragmentArgs.a.put("backToXp", Boolean.valueOf(bundle.getBoolean("backToXp")));
        } else {
            cardDetailFragmentArgs.a.put("backToXp", Boolean.FALSE);
        }
        return cardDetailFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CardDetailFragmentArgs cardDetailFragmentArgs = (CardDetailFragmentArgs) obj;
        return this.a.containsKey("backToXp") == cardDetailFragmentArgs.a.containsKey("backToXp") && getBackToXp() == cardDetailFragmentArgs.getBackToXp();
    }

    public boolean getBackToXp() {
        return ((Boolean) this.a.get("backToXp")).booleanValue();
    }

    public int hashCode() {
        return 31 + (getBackToXp() ? 1 : 0);
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.a.containsKey("backToXp")) {
            bundle.putBoolean("backToXp", ((Boolean) this.a.get("backToXp")).booleanValue());
        } else {
            bundle.putBoolean("backToXp", false);
        }
        return bundle;
    }

    public String toString() {
        return "CardDetailFragmentArgs{backToXp=" + getBackToXp() + i.d;
    }

    public static class Builder {
        private final HashMap a;

        public Builder(CardDetailFragmentArgs cardDetailFragmentArgs) {
            HashMap map = new HashMap();
            this.a = map;
            map.putAll(cardDetailFragmentArgs.a);
        }

        @NonNull
        public CardDetailFragmentArgs build() {
            return new CardDetailFragmentArgs(this.a);
        }

        public boolean getBackToXp() {
            return ((Boolean) this.a.get("backToXp")).booleanValue();
        }

        @NonNull
        public Builder setBackToXp(boolean z) {
            this.a.put("backToXp", Boolean.valueOf(z));
            return this;
        }

        public Builder() {
            this.a = new HashMap();
        }
    }

    private CardDetailFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }
}
