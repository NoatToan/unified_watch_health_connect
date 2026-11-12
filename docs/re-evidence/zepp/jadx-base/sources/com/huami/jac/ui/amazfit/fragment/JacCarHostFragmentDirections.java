package com.huami.jac.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p010navigation.ActionOnlyNavDirections;
import androidx.p010navigation.NavDirections;
import com.alipay.sdk.m.u.i;
import com.huami.jac.ui.amazfit.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class JacCarHostFragmentDirections {

    public static class ToCheck implements NavDirections {
        private final HashMap a;

        private ToCheck(@NonNull String str, @NonNull String str2, @NonNull String str3) {
            HashMap map = new HashMap();
            this.a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
            }
            map.put("action", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
            }
            map.put("token", str2);
            if (str3 == null) {
                throw new IllegalArgumentException("Argument \"keyToken\" is marked as non-null but was passed a null value.");
            }
            map.put("keyToken", str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ToCheck toCheck = (ToCheck) obj;
            if (this.a.containsKey("action") != toCheck.a.containsKey("action")) {
                return false;
            }
            if (getAction() == null ? toCheck.getAction() != null : !getAction().equals(toCheck.getAction())) {
                return false;
            }
            if (this.a.containsKey("token") != toCheck.a.containsKey("token")) {
                return false;
            }
            if (getToken() == null ? toCheck.getToken() != null : !getToken().equals(toCheck.getToken())) {
                return false;
            }
            if (this.a.containsKey("keyToken") != toCheck.a.containsKey("keyToken")) {
                return false;
            }
            if (getKeyToken() == null ? toCheck.getKeyToken() == null : getKeyToken().equals(toCheck.getKeyToken())) {
                return getActionId() == toCheck.getActionId();
            }
            return false;
        }

        @NonNull
        public String getAction() {
            return (String) this.a.get("action");
        }

        @Override // androidx.p010navigation.NavDirections
        public int getActionId() {
            return R.id.to_check;
        }

        @Override // androidx.p010navigation.NavDirections
        @NonNull
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.a.containsKey("action")) {
                bundle.putString("action", (String) this.a.get("action"));
            }
            if (this.a.containsKey("token")) {
                bundle.putString("token", (String) this.a.get("token"));
            }
            if (this.a.containsKey("keyToken")) {
                bundle.putString("keyToken", (String) this.a.get("keyToken"));
            }
            return bundle;
        }

        @NonNull
        public String getKeyToken() {
            return (String) this.a.get("keyToken");
        }

        @NonNull
        public String getToken() {
            return (String) this.a.get("token");
        }

        public int hashCode() {
            return (((((((getAction() != null ? getAction().hashCode() : 0) + 31) * 31) + (getToken() != null ? getToken().hashCode() : 0)) * 31) + (getKeyToken() != null ? getKeyToken().hashCode() : 0)) * 31) + getActionId();
        }

        @NonNull
        public ToCheck setAction(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
            }
            this.a.put("action", str);
            return this;
        }

        @NonNull
        public ToCheck setKeyToken(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"keyToken\" is marked as non-null but was passed a null value.");
            }
            this.a.put("keyToken", str);
            return this;
        }

        @NonNull
        public ToCheck setToken(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
            }
            this.a.put("token", str);
            return this;
        }

        public String toString() {
            return "ToCheck(actionId=" + getActionId() + "){action=" + getAction() + ", token=" + getToken() + ", keyToken=" + getKeyToken() + i.d;
        }
    }

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

    private JacCarHostFragmentDirections() {
    }

    @NonNull
    public static ToCheck toCheck(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return new ToCheck(str, str2, str3);
    }

    @NonNull
    public static ToDetail toDetail() {
        return new ToDetail();
    }

    @NonNull
    public static NavDirections toNoCard() {
        return new ActionOnlyNavDirections(R.id.to_no_card);
    }
}
