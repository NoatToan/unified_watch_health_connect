package com.huami.jac.ui.amazfit.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p010navigation.NavArgs;
import com.alipay.sdk.m.u.i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class JacCardDetailFragmentArgs implements NavArgs {
    private final HashMap a;

    private JacCardDetailFragmentArgs() {
        this.a = new HashMap();
    }

    @NonNull
    public static JacCardDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
        JacCardDetailFragmentArgs jacCardDetailFragmentArgs = new JacCardDetailFragmentArgs();
        bundle.setClassLoader(JacCardDetailFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("backToJac")) {
            jacCardDetailFragmentArgs.a.put("backToJac", Boolean.valueOf(bundle.getBoolean("backToJac")));
        } else {
            jacCardDetailFragmentArgs.a.put("backToJac", Boolean.FALSE);
        }
        return jacCardDetailFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JacCardDetailFragmentArgs jacCardDetailFragmentArgs = (JacCardDetailFragmentArgs) obj;
        return this.a.containsKey("backToJac") == jacCardDetailFragmentArgs.a.containsKey("backToJac") && getBackToJac() == jacCardDetailFragmentArgs.getBackToJac();
    }

    public boolean getBackToJac() {
        return ((Boolean) this.a.get("backToJac")).booleanValue();
    }

    public int hashCode() {
        return 31 + (getBackToJac() ? 1 : 0);
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.a.containsKey("backToJac")) {
            bundle.putBoolean("backToJac", ((Boolean) this.a.get("backToJac")).booleanValue());
        } else {
            bundle.putBoolean("backToJac", false);
        }
        return bundle;
    }

    public String toString() {
        return "JacCardDetailFragmentArgs{backToJac=" + getBackToJac() + i.d;
    }

    public static class Builder {
        private final HashMap a;

        public Builder(JacCardDetailFragmentArgs jacCardDetailFragmentArgs) {
            HashMap map = new HashMap();
            this.a = map;
            map.putAll(jacCardDetailFragmentArgs.a);
        }

        @NonNull
        public JacCardDetailFragmentArgs build() {
            return new JacCardDetailFragmentArgs(this.a);
        }

        public boolean getBackToJac() {
            return ((Boolean) this.a.get("backToJac")).booleanValue();
        }

        @NonNull
        public Builder setBackToJac(boolean z) {
            this.a.put("backToJac", Boolean.valueOf(z));
            return this;
        }

        public Builder() {
            this.a = new HashMap();
        }
    }

    private JacCardDetailFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }
}
