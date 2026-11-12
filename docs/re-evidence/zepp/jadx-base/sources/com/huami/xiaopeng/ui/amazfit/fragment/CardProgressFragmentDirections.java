package com.huami.xiaopeng.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p010navigation.NavDirections;
import com.alipay.sdk.m.u.i;
import com.huami.xiaopeng.ui.amazfit.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class CardProgressFragmentDirections {

    public static class ToResult implements NavDirections {
        private final HashMap a;

        private ToResult(boolean z) {
            HashMap map = new HashMap();
            this.a = map;
            map.put("isSuccess", Boolean.valueOf(z));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ToResult toResult = (ToResult) obj;
            if (this.a.containsKey("isSuccess") != toResult.a.containsKey("isSuccess") || getIsSuccess() != toResult.getIsSuccess() || this.a.containsKey("errorMsg") != toResult.a.containsKey("errorMsg")) {
                return false;
            }
            if (getErrorMsg() == null ? toResult.getErrorMsg() != null : !getErrorMsg().equals(toResult.getErrorMsg())) {
                return false;
            }
            if (this.a.containsKey("errorCode") != toResult.a.containsKey("errorCode")) {
                return false;
            }
            if (getErrorCode() == null ? toResult.getErrorCode() == null : getErrorCode().equals(toResult.getErrorCode())) {
                return getActionId() == toResult.getActionId();
            }
            return false;
        }

        @Override // androidx.p010navigation.NavDirections
        public int getActionId() {
            return R.id.to_result;
        }

        @Override // androidx.p010navigation.NavDirections
        @NonNull
        public Bundle getArguments() {
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
            return (((((((getIsSuccess() ? 1 : 0) + 31) * 31) + (getErrorMsg() != null ? getErrorMsg().hashCode() : 0)) * 31) + (getErrorCode() != null ? getErrorCode().hashCode() : 0)) * 31) + getActionId();
        }

        @NonNull
        public ToResult setErrorCode(@Nullable String str) {
            this.a.put("errorCode", str);
            return this;
        }

        @NonNull
        public ToResult setErrorMsg(@Nullable String str) {
            this.a.put("errorMsg", str);
            return this;
        }

        @NonNull
        public ToResult setIsSuccess(boolean z) {
            this.a.put("isSuccess", Boolean.valueOf(z));
            return this;
        }

        public String toString() {
            return "ToResult(actionId=" + getActionId() + "){isSuccess=" + getIsSuccess() + ", errorMsg=" + getErrorMsg() + ", errorCode=" + getErrorCode() + i.d;
        }
    }

    private CardProgressFragmentDirections() {
    }

    @NonNull
    public static ToResult toResult(boolean z) {
        return new ToResult(z);
    }
}
