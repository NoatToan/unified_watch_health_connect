package com.huami.xiaopeng.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p010navigation.NavArgs;
import com.alipay.sdk.m.u.i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class CardResultFragmentArgs implements NavArgs {
    private final HashMap a;

    private CardResultFragmentArgs() {
        this.a = new HashMap();
    }

    @NonNull
    public static CardResultFragmentArgs fromBundle(@NonNull Bundle bundle) {
        CardResultFragmentArgs cardResultFragmentArgs = new CardResultFragmentArgs();
        bundle.setClassLoader(CardResultFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("isSuccess")) {
            throw new IllegalArgumentException("Required argument \"isSuccess\" is missing and does not have an android:defaultValue");
        }
        cardResultFragmentArgs.a.put("isSuccess", Boolean.valueOf(bundle.getBoolean("isSuccess")));
        if (bundle.containsKey("errorMsg")) {
            cardResultFragmentArgs.a.put("errorMsg", bundle.getString("errorMsg"));
        } else {
            cardResultFragmentArgs.a.put("errorMsg", null);
        }
        if (bundle.containsKey("errorCode")) {
            cardResultFragmentArgs.a.put("errorCode", bundle.getString("errorCode"));
        } else {
            cardResultFragmentArgs.a.put("errorCode", null);
        }
        return cardResultFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CardResultFragmentArgs cardResultFragmentArgs = (CardResultFragmentArgs) obj;
        if (this.a.containsKey("isSuccess") != cardResultFragmentArgs.a.containsKey("isSuccess") || getIsSuccess() != cardResultFragmentArgs.getIsSuccess() || this.a.containsKey("errorMsg") != cardResultFragmentArgs.a.containsKey("errorMsg")) {
            return false;
        }
        if (getErrorMsg() == null ? cardResultFragmentArgs.getErrorMsg() != null : !getErrorMsg().equals(cardResultFragmentArgs.getErrorMsg())) {
            return false;
        }
        if (this.a.containsKey("errorCode") != cardResultFragmentArgs.a.containsKey("errorCode")) {
            return false;
        }
        return getErrorCode() == null ? cardResultFragmentArgs.getErrorCode() == null : getErrorCode().equals(cardResultFragmentArgs.getErrorCode());
    }

    @Nullable
    public String getErrorCode() {
        return (String) this.a.get("errorCode");
    }

    @Nullable
    public String getErrorMsg() {
        return (String) this.a.get("errorMsg");
    }

    public boolean getIsSuccess() {
        return ((Boolean) this.a.get("isSuccess")).booleanValue();
    }

    public int hashCode() {
        return (((((getIsSuccess() ? 1 : 0) + 31) * 31) + (getErrorMsg() != null ? getErrorMsg().hashCode() : 0)) * 31) + (getErrorCode() != null ? getErrorCode().hashCode() : 0);
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.a.containsKey("isSuccess")) {
            bundle.putBoolean("isSuccess", ((Boolean) this.a.get("isSuccess")).booleanValue());
        }
        if (this.a.containsKey("errorMsg")) {
            bundle.putString("errorMsg", (String) this.a.get("errorMsg"));
        } else {
            bundle.putString("errorMsg", null);
        }
        if (this.a.containsKey("errorCode")) {
            bundle.putString("errorCode", (String) this.a.get("errorCode"));
        } else {
            bundle.putString("errorCode", null);
        }
        return bundle;
    }

    public String toString() {
        return "CardResultFragmentArgs{isSuccess=" + getIsSuccess() + ", errorMsg=" + getErrorMsg() + ", errorCode=" + getErrorCode() + i.d;
    }

    public static class Builder {
        private final HashMap a;

        public Builder(CardResultFragmentArgs cardResultFragmentArgs) {
            HashMap map = new HashMap();
            this.a = map;
            map.putAll(cardResultFragmentArgs.a);
        }

        @NonNull
        public CardResultFragmentArgs build() {
            return new CardResultFragmentArgs(this.a);
        }

        @Nullable
        public String getErrorCode() {
            return (String) this.a.get("errorCode");
        }

        @Nullable
        public String getErrorMsg() {
            return (String) this.a.get("errorMsg");
        }

        public boolean getIsSuccess() {
            return ((Boolean) this.a.get("isSuccess")).booleanValue();
        }

        @NonNull
        public Builder setErrorCode(@Nullable String str) {
            this.a.put("errorCode", str);
            return this;
        }

        @NonNull
        public Builder setErrorMsg(@Nullable String str) {
            this.a.put("errorMsg", str);
            return this;
        }

        @NonNull
        public Builder setIsSuccess(boolean z) {
            this.a.put("isSuccess", Boolean.valueOf(z));
            return this;
        }

        public Builder(boolean z) {
            HashMap map = new HashMap();
            this.a = map;
            map.put("isSuccess", Boolean.valueOf(z));
        }
    }

    private CardResultFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }
}
