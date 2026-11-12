package com.garmin.android.apps.connectmobile.activities;

import androidx.annotation.Keep;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.u;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;
import w13.b;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fj\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "", "", TtmlNode.ATTR_ID, "", "categoryAccessRule", "badgesCategoryAccessRule", "drawableResourceID", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V", "I", "getId", "()I", "Ljava/lang/String;", "getCategoryAccessRule", "()Ljava/lang/String;", "getBadgesCategoryAccessRule", "getDrawableResourceID", "getLabelResourceID", "labelResourceID", "getDescriptionResourceID", "descriptionResourceID", "Companion", "b", "ONLY_ME", "MY_CONNECTIONS", "MY_GROUPS_AND_CONNECTIONS", "EVERYONE", "CUSTOM", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum PrivacyType {
    ONLY_ME { // from class: com.garmin.android.apps.connectmobile.activities.PrivacyType.f

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28798b;

        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getDescriptionResourceID, reason: from getter */
        public final int getF28798b() {
            return this.f28798b;
        }

        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getLabelResourceID, reason: from getter */
        public final int getF28797a() {
            return this.f28797a;
        }
    },
    MY_CONNECTIONS { // from class: com.garmin.android.apps.connectmobile.activities.PrivacyType.d
        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getDescriptionResourceID */
        public final int getF28798b() {
            return R.string.privacy_my_followers_description;
        }

        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getLabelResourceID */
        public final int getF28797a() {
            return R.string.privacy_my_followers;
        }
    },
    MY_GROUPS_AND_CONNECTIONS { // from class: com.garmin.android.apps.connectmobile.activities.PrivacyType.e
        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getDescriptionResourceID */
        public final int getF28798b() {
            return R.string.privacy_my_followers_groups_description;
        }

        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getLabelResourceID */
        public final int getF28797a() {
            return R.string.privacy_my_followers_groups;
        }
    },
    EVERYONE { // from class: com.garmin.android.apps.connectmobile.activities.PrivacyType.c

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28796b;

        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getDescriptionResourceID, reason: from getter */
        public final int getF28798b() {
            return this.f28796b;
        }

        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getLabelResourceID, reason: from getter */
        public final int getF28797a() {
            return this.f28795a;
        }
    },
    CUSTOM { // from class: com.garmin.android.apps.connectmobile.activities.PrivacyType.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28793a = R.string.lbl_custom;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28794b = R.string.privacy_custom_description;

        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getDescriptionResourceID, reason: from getter */
        public final int getF28798b() {
            return this.f28794b;
        }

        @Override // com.garmin.android.apps.connectmobile.activities.PrivacyType
        /* JADX INFO: renamed from: getLabelResourceID, reason: from getter */
        public final int getF28797a() {
            return this.f28793a;
        }
    };

    private final String badgesCategoryAccessRule;
    private final String categoryAccessRule;
    private final int drawableResourceID;
    private final int id;
    private static final /* synthetic */ w13.a $ENTRIES = b.g(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    PrivacyType(int i14, String str, String str2, int i15) {
        this.id = i14;
        this.categoryAccessRule = str;
        this.badgesCategoryAccessRule = str2;
        this.drawableResourceID = i15;
    }

    public static final PrivacyType getByAccessRule(String str, PrivacyType privacyType) {
        INSTANCE.getClass();
        return Companion.a(str, privacyType);
    }

    public static final PrivacyType getByBadgesAccessRule(String str, PrivacyType privacyType) {
        INSTANCE.getClass();
        return Companion.c(str, privacyType);
    }

    public static w13.a<PrivacyType> getEntries() {
        return $ENTRIES;
    }

    public final String getBadgesCategoryAccessRule() {
        return this.badgesCategoryAccessRule;
    }

    public final String getCategoryAccessRule() {
        return this.categoryAccessRule;
    }

    /* JADX INFO: renamed from: getDescriptionResourceID */
    public abstract int getF28798b();

    public final int getDrawableResourceID() {
        return this.drawableResourceID;
    }

    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getLabelResourceID */
    public abstract int getF28797a();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.PrivacyType$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/PrivacyType$b;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static PrivacyType a(String str, PrivacyType privacyType) {
            PrivacyType next;
            privacyType.getClass();
            Iterator<PrivacyType> it = PrivacyType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u.q(str, next.getCategoryAccessRule(), true));
            PrivacyType privacyType2 = next;
            return privacyType2 == null ? privacyType : privacyType2;
        }

        public static /* synthetic */ PrivacyType b(Companion companion, String str) {
            PrivacyType privacyType = PrivacyType.ONLY_ME;
            companion.getClass();
            return a(str, privacyType);
        }

        public static PrivacyType c(String str, PrivacyType privacyType) {
            PrivacyType next;
            privacyType.getClass();
            Iterator<PrivacyType> it = PrivacyType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(str, next.getBadgesCategoryAccessRule()));
            PrivacyType privacyType2 = next;
            return privacyType2 == null ? privacyType : privacyType2;
        }

        public static List d() {
            return x.k(PrivacyType.ONLY_ME, PrivacyType.MY_CONNECTIONS, PrivacyType.MY_GROUPS_AND_CONNECTIONS, PrivacyType.EVERYONE);
        }

        private Companion() {
        }
    }

    /* synthetic */ PrivacyType(int i14, String str, String str2, int i15, j jVar) {
        this(i14, str, str2, i15);
    }
}
