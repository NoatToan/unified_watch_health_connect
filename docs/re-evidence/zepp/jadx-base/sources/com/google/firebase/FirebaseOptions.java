package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import com.xmlywind.sdk.common.Constants;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseOptions {
    private static final String h = "google_api_key";
    private static final String i = "google_app_id";
    private static final String j = "firebase_database_url";
    private static final String k = "ga_trackingId";
    private static final String l = "gcm_defaultSenderId";
    private static final String m = "google_storage_bucket";
    private static final String n = "project_id";
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public static final class Builder {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        public Builder() {
        }

        @NonNull
        public FirebaseOptions build() {
            return new FirebaseOptions(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
        }

        @NonNull
        public Builder setApiKey(@NonNull String str) {
            this.a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @NonNull
        public Builder setApplicationId(@NonNull String str) {
            this.b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @NonNull
        public Builder setDatabaseUrl(@Nullable String str) {
            this.c = str;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setGaTrackingId(@Nullable String str) {
            this.d = str;
            return this;
        }

        @NonNull
        public Builder setGcmSenderId(@Nullable String str) {
            this.e = str;
            return this;
        }

        @NonNull
        public Builder setProjectId(@Nullable String str) {
            this.g = str;
            return this;
        }

        @NonNull
        public Builder setStorageBucket(@Nullable String str) {
            this.f = str;
            return this;
        }

        public Builder(@NonNull FirebaseOptions firebaseOptions) {
            this.b = firebaseOptions.b;
            this.a = firebaseOptions.a;
            this.c = firebaseOptions.c;
            this.d = firebaseOptions.d;
            this.e = firebaseOptions.e;
            this.f = firebaseOptions.f;
            this.g = firebaseOptions.g;
        }
    }

    @Nullable
    public static FirebaseOptions fromResource(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString(i);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new FirebaseOptions(string, stringResourceValueReader.getString(h), stringResourceValueReader.getString(j), stringResourceValueReader.getString(k), stringResourceValueReader.getString(l), stringResourceValueReader.getString(m), stringResourceValueReader.getString(n));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return Objects.equal(this.b, firebaseOptions.b) && Objects.equal(this.a, firebaseOptions.a) && Objects.equal(this.c, firebaseOptions.c) && Objects.equal(this.d, firebaseOptions.d) && Objects.equal(this.e, firebaseOptions.e) && Objects.equal(this.f, firebaseOptions.f) && Objects.equal(this.g, firebaseOptions.g);
    }

    @NonNull
    public String getApiKey() {
        return this.a;
    }

    @NonNull
    public String getApplicationId() {
        return this.b;
    }

    @Nullable
    public String getDatabaseUrl() {
        return this.c;
    }

    @Nullable
    @KeepForSdk
    public String getGaTrackingId() {
        return this.d;
    }

    @Nullable
    public String getGcmSenderId() {
        return this.e;
    }

    @Nullable
    public String getProjectId() {
        return this.g;
    }

    @Nullable
    public String getStorageBucket() {
        return this.f;
    }

    public int hashCode() {
        return Objects.hashCode(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.b).add(Constants.APPKEY, this.a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }

    private FirebaseOptions(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}
