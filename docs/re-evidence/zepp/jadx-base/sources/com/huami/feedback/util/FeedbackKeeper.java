package com.huami.feedback.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/feedback/util/FeedbackKeeper;", "", "<init>", "()V", "Companion", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class FeedbackKeeper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "feedback";

    @NotNull
    private static final String b = "contact";

    @NotNull
    private static final String c = "autoUpload";

    @NotNull
    private static final String d = "autoUploadTime";
    private static SharedPreferences e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\nH\u0002J\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0002J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u0010\u0019\u001a\u00020\u0005R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/feedback/util/FeedbackKeeper$Companion;", "", "", "key", "value", "", "e", "c", "", "f", "", "b", GoogleApiAvailabilityLight.a, "a", "(Ljava/lang/String;)Ljava/lang/Boolean;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, PointCategory.INIT, "contact", "saveContact", "getContact", "getAutoUpload", "()Ljava/lang/Boolean;", "saveAutoUpload", "getUploadLogTime", "saveUploadLogTime", "AUTO_UPLOAD", "Ljava/lang/String;", "AUTO_UPLOAD_TIME", "CONTACT", "KEEPER_NAME", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "()V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Boolean a(String key) {
            SharedPreferences sharedPreferences = FeedbackKeeper.e;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            if (!sharedPreferences.contains(key)) {
                return null;
            }
            SharedPreferences sharedPreferences2 = FeedbackKeeper.e;
            return Boolean.valueOf((sharedPreferences2 != null ? sharedPreferences2 : null).getBoolean(key, false));
        }

        private final long b(String key) {
            SharedPreferences sharedPreferences = FeedbackKeeper.e;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            return sharedPreferences.getLong(key, 0L);
        }

        private final String c(String key) {
            SharedPreferences sharedPreferences = FeedbackKeeper.e;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            return sharedPreferences.getString(key, null);
        }

        private final void d(String key, long value) {
            SharedPreferences sharedPreferences = FeedbackKeeper.e;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            sharedPreferences.edit().putLong(key, value).apply();
        }

        private final void e(String key, String value) {
            SharedPreferences sharedPreferences = FeedbackKeeper.e;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString(key, value).apply();
        }

        private final void f(String key, boolean value) {
            SharedPreferences sharedPreferences = FeedbackKeeper.e;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            sharedPreferences.edit().putBoolean(key, value).apply();
        }

        @Nullable
        public final Boolean getAutoUpload() {
            return a(FeedbackKeeper.c);
        }

        @Nullable
        public final String getContact() {
            return c("contact");
        }

        public final long getUploadLogTime() {
            return b(FeedbackKeeper.d);
        }

        public final void init(@NotNull Context context) {
            FeedbackKeeper.e = context.getSharedPreferences("feedback", 0);
        }

        public final void saveAutoUpload(boolean value) {
            f(FeedbackKeeper.c, value);
        }

        public final void saveContact(@NotNull String contact) {
            e("contact", contact);
        }

        public final void saveUploadLogTime() {
            d(FeedbackKeeper.d, System.currentTimeMillis());
        }
    }
}
