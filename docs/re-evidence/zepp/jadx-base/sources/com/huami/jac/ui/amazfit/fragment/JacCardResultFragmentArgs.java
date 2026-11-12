package com.huami.jac.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p010navigation.NavArgs;
import com.alipay.sdk.m.u.i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class JacCardResultFragmentArgs implements NavArgs {
    private final HashMap a;

    private JacCardResultFragmentArgs() {
        this.a = new HashMap();
    }

    @NonNull
    public static JacCardResultFragmentArgs fromBundle(@NonNull Bundle bundle) {
        JacCardResultFragmentArgs jacCardResultFragmentArgs = new JacCardResultFragmentArgs();
        bundle.setClassLoader(JacCardResultFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("isSuccess")) {
            throw new IllegalArgumentException("Required argument \"isSuccess\" is missing and does not have an android:defaultValue");
        }
        jacCardResultFragmentArgs.a.put("isSuccess", Boolean.valueOf(bundle.getBoolean("isSuccess")));
        if (bundle.containsKey("errorMsg")) {
            jacCardResultFragmentArgs.a.put("errorMsg", bundle.getString("errorMsg"));
        } else {
            jacCardResultFragmentArgs.a.put("errorMsg", null);
        }
        if (bundle.containsKey("errorCode")) {
            jacCardResultFragmentArgs.a.put("errorCode", bundle.getString("errorCode"));
        } else {
            jacCardResultFragmentArgs.a.put("errorCode", null);
        }
        return jacCardResultFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JacCardResultFragmentArgs jacCardResultFragmentArgs = (JacCardResultFragmentArgs) obj;
        if (this.a.containsKey("isSuccess") != jacCardResultFragmentArgs.a.containsKey("isSuccess") || getIsSuccess() != jacCardResultFragmentArgs.getIsSuccess() || this.a.containsKey("errorMsg") != jacCardResultFragmentArgs.a.containsKey("errorMsg")) {
            return false;
        }
        if (getErrorMsg() == null ? jacCardResultFragmentArgs.getErrorMsg() != null : !getErrorMsg().equals(jacCardResultFragmentArgs.getErrorMsg())) {
            return false;
        }
        if (this.a.containsKey("errorCode") != jacCardResultFragmentArgs.a.containsKey("errorCode")) {
            return false;
        }
        return getErrorCode() == null ? jacCardResultFragmentArgs.getErrorCode() == null : getErrorCode().equals(jacCardResultFragmentArgs.getErrorCode());
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
        return "JacCardResultFragmentArgs{isSuccess=" + getIsSuccess() + ", errorMsg=" + getErrorMsg() + ", errorCode=" + getErrorCode() + i.d;
    }

    public static class Builder {
        private final HashMap a;

        public Builder(JacCardResultFragmentArgs jacCardResultFragmentArgs) {
            HashMap map = new HashMap();
            this.a = map;
            map.putAll(jacCardResultFragmentArgs.a);
        }

        @NonNull
        public JacCardResultFragmentArgs build() {
            return new JacCardResultFragmentArgs(this.a);
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

    private JacCardResultFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }
}
