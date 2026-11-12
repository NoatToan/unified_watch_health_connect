package com.huami.jac.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p010navigation.NavDirections;
import com.alipay.sdk.m.u.i;
import com.huami.jac.ui.amazfit.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class JacCarCheckFragmentDirections {

    public static class ToProgress implements NavDirections {
        private final HashMap a;

        private ToProgress(@NonNull String str, @NonNull String str2, @NonNull String str3) {
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
            ToProgress toProgress = (ToProgress) obj;
            if (this.a.containsKey("action") != toProgress.a.containsKey("action")) {
                return false;
            }
            if (getAction() == null ? toProgress.getAction() != null : !getAction().equals(toProgress.getAction())) {
                return false;
            }
            if (this.a.containsKey("token") != toProgress.a.containsKey("token")) {
                return false;
            }
            if (getToken() == null ? toProgress.getToken() != null : !getToken().equals(toProgress.getToken())) {
                return false;
            }
            if (this.a.containsKey("keyToken") != toProgress.a.containsKey("keyToken")) {
                return false;
            }
            if (getKeyToken() == null ? toProgress.getKeyToken() == null : getKeyToken().equals(toProgress.getKeyToken())) {
                return getActionId() == toProgress.getActionId();
            }
            return false;
        }

        @NonNull
        public String getAction() {
            return (String) this.a.get("action");
        }

        @Override // androidx.p010navigation.NavDirections
        public int getActionId() {
            return R.id.to_progress;
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
        public ToProgress setAction(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
            }
            this.a.put("action", str);
            return this;
        }

        @NonNull
        public ToProgress setKeyToken(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"keyToken\" is marked as non-null but was passed a null value.");
            }
            this.a.put("keyToken", str);
            return this;
        }

        @NonNull
        public ToProgress setToken(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
            }
            this.a.put("token", str);
            return this;
        }

        public String toString() {
            return "ToProgress(actionId=" + getActionId() + "){action=" + getAction() + ", token=" + getToken() + ", keyToken=" + getKeyToken() + i.d;
        }
    }

    private JacCarCheckFragmentDirections() {
    }

    @NonNull
    public static ToProgress toProgress(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return new ToProgress(str, str2, str3);
    }
}
