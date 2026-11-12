package com.garmin.android.apps.connectmobile.userprofile.editimage;

import android.net.Uri;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f;", "", "Landroid/net/Uri;", "imageUri", "<init>", "(Landroid/net/Uri;)V", "a", JWKParameterNames.RSA_EXPONENT, "d", "c", "b", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$a;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$b;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$c;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$d;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$e;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f46701a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$a;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f;", "Landroid/net/Uri;", "imageUri", "", "avatarUUID", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f46702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, String str) {
            super(uri, null);
            uri.getClass();
            str.getClass();
            this.f46702b = uri;
            this.f46703c = str;
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.editimage.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getF46701a() {
            return this.f46702b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f46702b, aVar.f46702b) && s.g(this.f46703c, aVar.f46703c);
        }

        public final int hashCode() {
            return this.f46703c.hashCode() + (this.f46702b.hashCode() * 31);
        }

        public final String toString() {
            return "AvatarImage(imageUri=" + this.f46702b + ", avatarUUID=" + this.f46703c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$b;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f46704b = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            Uri uri = Uri.EMPTY;
            uri.getClass();
            super(uri, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1054510659;
        }

        public final String toString() {
            return "DefaultImage";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$c;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f;", "Landroid/net/Uri;", "imageUri", "<init>", "(Landroid/net/Uri;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f46705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri) {
            super(uri, null);
            uri.getClass();
            this.f46705b = uri;
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.editimage.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getF46701a() {
            return this.f46705b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f46705b, ((c) obj).f46705b);
        }

        public final int hashCode() {
            return this.f46705b.hashCode();
        }

        public final String toString() {
            return "LocalImage(imageUri=" + this.f46705b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$d;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f;", "Landroid/net/Uri;", "imageUri", "<init>", "(Landroid/net/Uri;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f46706b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Uri uri) {
            super(uri, null);
            uri.getClass();
            this.f46706b = uri;
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.editimage.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getF46701a() {
            return this.f46706b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && s.g(this.f46706b, ((d) obj).f46706b);
        }

        public final int hashCode() {
            return this.f46706b.hashCode();
        }

        public final String toString() {
            return "ProfileImage(imageUri=" + this.f46706b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f$e;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/f;", "Landroid/net/Uri;", "imageUri", "", "themedAvatarUUID", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f46707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46708c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Uri uri, String str) {
            super(uri, null);
            uri.getClass();
            str.getClass();
            this.f46707b = uri;
            this.f46708c = str;
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.editimage.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getF46701a() {
            return this.f46707b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f46707b, eVar.f46707b) && s.g(this.f46708c, eVar.f46708c);
        }

        public final int hashCode() {
            return this.f46708c.hashCode() + (this.f46707b.hashCode() * 31);
        }

        public final String toString() {
            return "ThemedImage(imageUri=" + this.f46707b + ", themedAvatarUUID=" + this.f46708c + ")";
        }
    }

    private f(Uri uri) {
        this.f46701a = uri;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Uri getF46701a() {
        return this.f46701a;
    }

    public /* synthetic */ f(Uri uri, j jVar) {
        this(uri);
    }
}
