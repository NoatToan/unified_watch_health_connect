package com.twitter.sdk.android.core.internal;

import android.text.TextUtils;
import com.twitter.sdk.android.core.models.User;

/* JADX INFO: loaded from: classes18.dex */
public final class UserUtils {

    public enum AvatarSize {
        NORMAL("_normal"),
        BIGGER("_bigger"),
        MINI("_mini"),
        ORIGINAL("_original"),
        REASONABLY_SMALL("_reasonably_small");

        private final String suffix;

        AvatarSize(String str) {
            this.suffix = str;
        }

        public String a() {
            return this.suffix;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AvatarSize.values().length];
            a = iArr;
            try {
                iArr[AvatarSize.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AvatarSize.BIGGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AvatarSize.MINI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AvatarSize.ORIGINAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AvatarSize.REASONABLY_SMALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private UserUtils() {
    }

    public static CharSequence formatScreenName(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        if (charSequence.charAt(0) == '@') {
            return charSequence;
        }
        return "@" + ((Object) charSequence);
    }

    public static String getProfileImageUrlHttps(User user, AvatarSize avatarSize) {
        String str;
        if (user == null || (str = user.profileImageUrlHttps) == null) {
            return null;
        }
        if (avatarSize == null || str == null) {
            return str;
        }
        int i = a.a[avatarSize.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? str.replace(AvatarSize.NORMAL.a(), avatarSize.a()) : str;
    }
}
