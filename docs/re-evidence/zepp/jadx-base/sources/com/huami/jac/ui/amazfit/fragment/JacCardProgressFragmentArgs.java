package com.huami.jac.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p010navigation.NavArgs;
import com.alipay.sdk.m.u.i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class JacCardProgressFragmentArgs implements NavArgs {
    private final HashMap a;

    private JacCardProgressFragmentArgs() {
        this.a = new HashMap();
    }

    @NonNull
    public static JacCardProgressFragmentArgs fromBundle(@NonNull Bundle bundle) {
        JacCardProgressFragmentArgs jacCardProgressFragmentArgs = new JacCardProgressFragmentArgs();
        bundle.setClassLoader(JacCardProgressFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("action");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        }
        jacCardProgressFragmentArgs.a.put("action", string);
        if (!bundle.containsKey("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("token");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        jacCardProgressFragmentArgs.a.put("token", string2);
        if (!bundle.containsKey("keyToken")) {
            throw new IllegalArgumentException("Required argument \"keyToken\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("keyToken");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"keyToken\" is marked as non-null but was passed a null value.");
        }
        jacCardProgressFragmentArgs.a.put("keyToken", string3);
        return jacCardProgressFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JacCardProgressFragmentArgs jacCardProgressFragmentArgs = (JacCardProgressFragmentArgs) obj;
        if (this.a.containsKey("action") != jacCardProgressFragmentArgs.a.containsKey("action")) {
            return false;
        }
        if (getAction() == null ? jacCardProgressFragmentArgs.getAction() != null : !getAction().equals(jacCardProgressFragmentArgs.getAction())) {
            return false;
        }
        if (this.a.containsKey("token") != jacCardProgressFragmentArgs.a.containsKey("token")) {
            return false;
        }
        if (getToken() == null ? jacCardProgressFragmentArgs.getToken() != null : !getToken().equals(jacCardProgressFragmentArgs.getToken())) {
            return false;
        }
        if (this.a.containsKey("keyToken") != jacCardProgressFragmentArgs.a.containsKey("keyToken")) {
            return false;
        }
        return getKeyToken() == null ? jacCardProgressFragmentArgs.getKeyToken() == null : getKeyToken().equals(jacCardProgressFragmentArgs.getKeyToken());
    }

    @NonNull
    public String getAction() {
        return (String) this.a.get("action");
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
        return (((((getAction() != null ? getAction().hashCode() : 0) + 31) * 31) + (getToken() != null ? getToken().hashCode() : 0)) * 31) + (getKeyToken() != null ? getKeyToken().hashCode() : 0);
    }

    @NonNull
    public Bundle toBundle() {
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

    public String toString() {
        return "JacCardProgressFragmentArgs{action=" + getAction() + ", token=" + getToken() + ", keyToken=" + getKeyToken() + i.d;
    }

    public static class Builder {
        private final HashMap a;

        public Builder(JacCardProgressFragmentArgs jacCardProgressFragmentArgs) {
            HashMap map = new HashMap();
            this.a = map;
            map.putAll(jacCardProgressFragmentArgs.a);
        }

        @NonNull
        public JacCardProgressFragmentArgs build() {
            return new JacCardProgressFragmentArgs(this.a);
        }

        @NonNull
        public String getAction() {
            return (String) this.a.get("action");
        }

        @NonNull
        public String getKeyToken() {
            return (String) this.a.get("keyToken");
        }

        @NonNull
        public String getToken() {
            return (String) this.a.get("token");
        }

        @NonNull
        public Builder setAction(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
            }
            this.a.put("action", str);
            return this;
        }

        @NonNull
        public Builder setKeyToken(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"keyToken\" is marked as non-null but was passed a null value.");
            }
            this.a.put("keyToken", str);
            return this;
        }

        @NonNull
        public Builder setToken(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
            }
            this.a.put("token", str);
            return this;
        }

        public Builder(@NonNull String str, @NonNull String str2, @NonNull String str3) {
            HashMap map = new HashMap();
            this.a = map;
            if (str != null) {
                map.put("action", str);
                if (str2 != null) {
                    map.put("token", str2);
                    if (str3 != null) {
                        map.put("keyToken", str3);
                        return;
                    }
                    throw new IllegalArgumentException("Argument \"keyToken\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        }
    }

    private JacCardProgressFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }
}
