package com.huami.xiaopeng.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p010navigation.NavDirections;
import com.alipay.sdk.m.u.i;
import com.huami.xiaopeng.ui.amazfit.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class CardResultFragmentDirections {

    public static class ToDetail implements NavDirections {
        private final HashMap a;

        private ToDetail() {
            this.a = new HashMap();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ToDetail toDetail = (ToDetail) obj;
            return this.a.containsKey("backToXp") == toDetail.a.containsKey("backToXp") && getBackToXp() == toDetail.getBackToXp() && getActionId() == toDetail.getActionId();
        }

        @Override // androidx.p010navigation.NavDirections
        public int getActionId() {
            return R.id.to_detail;
        }

        @Override // androidx.p010navigation.NavDirections
        @NonNull
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.a.containsKey("backToXp")) {
                bundle.putBoolean("backToXp", ((Boolean) this.a.get("backToXp")).booleanValue());
            } else {
                bundle.putBoolean("backToXp", false);
            }
            return bundle;
        }

        public boolean getBackToXp() {
            return ((Boolean) this.a.get("backToXp")).booleanValue();
        }

        public int hashCode() {
            return (((getBackToXp() ? 1 : 0) + 31) * 31) + getActionId();
        }

        @NonNull
        public ToDetail setBackToXp(boolean z) {
            this.a.put("backToXp", Boolean.valueOf(z));
            return this;
        }

        public String toString() {
            return "ToDetail(actionId=" + getActionId() + "){backToXp=" + getBackToXp() + i.d;
        }
    }

    private CardResultFragmentDirections() {
    }

    @NonNull
    public static ToDetail toDetail() {
        return new ToDetail();
    }
}
