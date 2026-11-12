package com.huami.jac.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p010navigation.NavDirections;
import com.alipay.sdk.m.u.i;
import com.huami.jac.ui.amazfit.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class JacCardResultFragmentDirections {

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
            return this.a.containsKey("backToJac") == toDetail.a.containsKey("backToJac") && getBackToJac() == toDetail.getBackToJac() && getActionId() == toDetail.getActionId();
        }

        @Override // androidx.p010navigation.NavDirections
        public int getActionId() {
            return R.id.to_detail;
        }

        @Override // androidx.p010navigation.NavDirections
        @NonNull
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.a.containsKey("backToJac")) {
                bundle.putBoolean("backToJac", ((Boolean) this.a.get("backToJac")).booleanValue());
            } else {
                bundle.putBoolean("backToJac", false);
            }
            return bundle;
        }

        public boolean getBackToJac() {
            return ((Boolean) this.a.get("backToJac")).booleanValue();
        }

        public int hashCode() {
            return (((getBackToJac() ? 1 : 0) + 31) * 31) + getActionId();
        }

        @NonNull
        public ToDetail setBackToJac(boolean z) {
            this.a.put("backToJac", Boolean.valueOf(z));
            return this;
        }

        public String toString() {
            return "ToDetail(actionId=" + getActionId() + "){backToJac=" + getBackToJac() + i.d;
        }
    }

    private JacCardResultFragmentDirections() {
    }

    @NonNull
    public static ToDetail toDetail() {
        return new ToDetail();
    }
}
