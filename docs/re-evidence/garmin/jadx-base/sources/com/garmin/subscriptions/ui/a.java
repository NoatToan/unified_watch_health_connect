package com.garmin.subscriptions.ui;

import android.net.Uri;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/garmin/subscriptions/ui/a;", "", "Landroid/net/Uri;", "url", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "b", "c", "a", "Lcom/garmin/subscriptions/ui/a$b;", "Lcom/garmin/subscriptions/ui/a$c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1133a f52778c = new C1133a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f52779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52780b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/subscriptions/ui/a$b;", "Lcom/garmin/subscriptions/ui/a;", "Landroid/net/Uri;", "url", "<init>", "(Landroid/net/Uri;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f52781d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri) {
            super(uri, "mobi.inthepocket.bcmc.bancontact", null);
            uri.getClass();
            this.f52781d = uri;
        }

        @Override // com.garmin.subscriptions.ui.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getF52779a() {
            return this.f52781d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f52781d, ((b) obj).f52781d);
        }

        public final int hashCode() {
            return this.f52781d.hashCode();
        }

        public final String toString() {
            return "Payconiq(url=" + this.f52781d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/subscriptions/ui/a$c;", "Lcom/garmin/subscriptions/ui/a;", "Landroid/net/Uri;", "url", "<init>", "(Landroid/net/Uri;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f52782d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri) {
            super(uri, "com.revolut.revolut", null);
            uri.getClass();
            this.f52782d = uri;
        }

        @Override // com.garmin.subscriptions.ui.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getF52779a() {
            return this.f52782d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f52782d, ((c) obj).f52782d);
        }

        public final int hashCode() {
            return this.f52782d.hashCode();
        }

        public final String toString() {
            return "Revolut(url=" + this.f52782d + ")";
        }
    }

    private a(Uri uri, String str) {
        this.f52779a = uri;
        this.f52780b = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Uri getF52779a() {
        return this.f52779a;
    }

    /* JADX INFO: renamed from: com.garmin.subscriptions.ui.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/subscriptions/ui/a$a;", "", "<init>", "()V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1133a {
        public /* synthetic */ C1133a(j jVar) {
            this();
        }

        private C1133a() {
        }
    }

    public /* synthetic */ a(Uri uri, String str, j jVar) {
        this(uri, str);
    }
}
