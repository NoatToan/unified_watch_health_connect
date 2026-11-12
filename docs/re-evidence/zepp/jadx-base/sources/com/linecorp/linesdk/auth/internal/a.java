package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.linecorp.linesdk.LineApiError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class a {
    public static final com.linecorp.linesdk.auth.internal.b b = new com.linecorp.linesdk.auth.internal.b(6, 9, 0);

    @NonNull
    public final d a;

    /* JADX INFO: renamed from: com.linecorp.linesdk.auth.internal.a$a, reason: collision with other inner class name */
    @VisibleForTesting
    public static class C0730a {

        @NonNull
        public final Intent a;

        @Nullable
        public final Bundle b;
        public final boolean c;

        public C0730a(@NonNull Intent intent, @Nullable Bundle bundle, boolean z) {
            this.a = intent;
            this.b = bundle;
            this.c = z;
        }
    }

    public static class b {

        @NonNull
        public final Intent a;

        @Nullable
        public final Bundle b;

        @NonNull
        public final String c;
        public final boolean d;

        @VisibleForTesting
        public b(@NonNull Intent intent, @Nullable Bundle bundle, @NonNull String str, boolean z) {
            this.a = intent;
            this.b = bundle;
            this.c = str;
            this.d = z;
        }
    }

    public static class c {

        @Nullable
        public final String a;

        @Nullable
        private final String b;

        @Nullable
        private final String c;

        @Nullable
        private final String d;

        public c(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @NonNull
        @VisibleForTesting
        public static c a(@NonNull String str) {
            return new c(null, null, null, str);
        }

        public final boolean b() {
            return !TextUtils.isEmpty(this.a);
        }

        public final boolean c() {
            return TextUtils.isEmpty(this.d) && !b();
        }

        @NonNull
        public final LineApiError d() {
            if (!c()) {
                return new LineApiError(this.d);
            }
            try {
                return new LineApiError(new JSONObject().putOpt("error", this.b).putOpt("error_description", this.c).toString());
            } catch (JSONException e) {
                return new LineApiError(e);
            }
        }
    }

    public a(@NonNull d dVar) {
        this.a = dVar;
    }

    @NonNull
    public static List<Intent> a(@NonNull Uri uri, @NonNull Collection<ResolveInfo> collection, @Nullable Bundle bundle) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ResolveInfo resolveInfo : collection) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            arrayList.add(intent);
        }
        return arrayList;
    }
}
