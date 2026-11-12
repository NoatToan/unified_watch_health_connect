package com.huami.utils.easypermission;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.fragment.app.Fragment;
import com.huami.utils.easypermission.helper.PermissionHelper;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public final class PermissionRequest {
    private final PermissionHelper a;
    private final String[] b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final int g;
    private final String h;

    public static final class Builder {
        private final PermissionHelper a;
        private final int b;
        private final String[] c;
        private String d;
        private String e;
        private String f;
        private int g = -1;
        private String h;

        public Builder(@NonNull Activity activity, int i, @NonNull @Size(min = 1) String... strArr) {
            this.a = PermissionHelper.newInstance(activity);
            this.b = i;
            this.c = strArr;
        }

        @NonNull
        public PermissionRequest build() {
            if (this.d == null) {
                this.d = this.a.getContext().getString(R.string.easypermission_rationale_ask);
            }
            if (this.e == null) {
                this.e = this.a.getContext().getString(android.R.string.ok);
            }
            if (this.f == null) {
                this.f = this.a.getContext().getString(android.R.string.cancel);
            }
            return new PermissionRequest(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h);
        }

        @NonNull
        public Builder setNegativeButtonText(@Nullable String str) {
            this.f = str;
            return this;
        }

        @NonNull
        public Builder setPositiveButtonText(@Nullable String str) {
            this.e = str;
            return this;
        }

        @NonNull
        public Builder setRationale(@Nullable String str) {
            this.d = str;
            return this;
        }

        public Builder setRequestKey(String str) {
            this.h = str;
            return this;
        }

        @NonNull
        public Builder setTheme(@StyleRes int i) {
            this.g = i;
            return this;
        }

        @NonNull
        public Builder setNegativeButtonText(@StringRes int i) {
            this.f = this.a.getContext().getString(i);
            return this;
        }

        @NonNull
        public Builder setPositiveButtonText(@StringRes int i) {
            this.e = this.a.getContext().getString(i);
            return this;
        }

        @NonNull
        public Builder setRationale(@StringRes int i) {
            this.d = this.a.getContext().getString(i);
            return this;
        }

        public Builder(@NonNull Fragment fragment, int i, @NonNull @Size(min = 1) String... strArr) {
            this.a = PermissionHelper.newInstance(fragment);
            this.b = i;
            this.c = strArr;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PermissionRequest.class != obj.getClass()) {
            return false;
        }
        PermissionRequest permissionRequest = (PermissionRequest) obj;
        return Arrays.equals(this.b, permissionRequest.b) && this.c == permissionRequest.c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PermissionHelper getHelper() {
        return this.a;
    }

    @NonNull
    public String getNegativeButtonText() {
        return this.f;
    }

    @NonNull
    public String[] getPerms() {
        return (String[]) this.b.clone();
    }

    @NonNull
    public String getPositiveButtonText() {
        return this.e;
    }

    @NonNull
    public String getRationale() {
        return this.d;
    }

    public int getRequestCode() {
        return this.c;
    }

    public String getRequestKey() {
        return this.h;
    }

    @StyleRes
    public int getTheme() {
        return this.g;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.b) * 31) + this.c;
    }

    public String toString() {
        return "PermissionRequest{mHelper=" + this.a + ", mPerms=" + Arrays.toString(this.b) + ", mRequestCode=" + this.c + ", mRationale='" + this.d + "', mPositiveButtonText='" + this.e + "', mNegativeButtonText='" + this.f + "', mTheme=" + this.g + '}';
    }

    private PermissionRequest(PermissionHelper permissionHelper, String[] strArr, int i, String str, String str2, String str3, int i2, String str4) {
        this.a = permissionHelper;
        this.b = (String[]) strArr.clone();
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i2;
        this.h = str4;
    }
}
