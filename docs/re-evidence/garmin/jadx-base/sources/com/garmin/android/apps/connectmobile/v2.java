package com.garmin.android.apps.connectmobile;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "T", "<init>", "()V", "b", "a", "Lcom/garmin/android/apps/connectmobile/v2$a;", "Lcom/garmin/android/apps/connectmobile/v2$b;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class v2<T> {
    public /* synthetic */ v2(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private v2() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2$a;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "responseCode", "", "errorResponse", "<init>", "(Ljava/lang/Exception;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends v2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f47383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f47384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f47385c;

        public /* synthetic */ a(Exception exc, Integer num, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(exc, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Exception getF47383a() {
            return this.f47383a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getF47384b() {
            return this.f47384b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f47383a, aVar.f47383a) && p005kotlin.jvm.internal.s.g(this.f47384b, aVar.f47384b) && p005kotlin.jvm.internal.s.g(this.f47385c, aVar.f47385c);
        }

        public final int hashCode() {
            int iHashCode = this.f47383a.hashCode() * 31;
            Integer num = this.f47384b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f47385c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Error(exception=");
            sb3.append(this.f47383a);
            sb3.append(", responseCode=");
            sb3.append(this.f47384b);
            sb3.append(", errorResponse=");
            return am.j.o(this.f47385c, ")", sb3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc, Integer num, String str) {
            super(null);
            exc.getClass();
            this.f47383a = exc;
            this.f47384b = num;
            this.f47385c = str;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\f\b\u0001\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2$b;", "", "T", "Lcom/garmin/android/apps/connectmobile/v2;", "data", "", "responseCode", "Lokhttp3/HttpUrl;", "requestUrl", "Lokhttp3/Headers;", "headers", "<init>", "(Ljava/lang/Object;ILokhttp3/HttpUrl;Lokhttp3/Headers;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b<T> extends v2<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f47386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HttpUrl f47388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Headers f47389d;

        public /* synthetic */ b(Object obj, int i14, HttpUrl httpUrl, Headers headers, int i15, p005kotlin.jvm.internal.j jVar) {
            this(obj, i14, (i15 & 4) != 0 ? null : httpUrl, (i15 & 8) != 0 ? null : headers);
        }

        public static b a(b bVar, Object obj) {
            int i14 = bVar.f47387b;
            HttpUrl httpUrl = bVar.f47388c;
            Headers headers = bVar.f47389d;
            bVar.getClass();
            return new b(obj, i14, httpUrl, headers);
        }

        public final T b() {
            return this.f47386a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f47386a, bVar.f47386a) && this.f47387b == bVar.f47387b && p005kotlin.jvm.internal.s.g(this.f47388c, bVar.f47388c) && p005kotlin.jvm.internal.s.g(this.f47389d, bVar.f47389d);
        }

        public final int hashCode() {
            T t7 = this.f47386a;
            int iD = r1.q2.d(this.f47387b, (t7 == null ? 0 : t7.hashCode()) * 31, 31);
            HttpUrl httpUrl = this.f47388c;
            int iHashCode = (iD + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31;
            Headers headers = this.f47389d;
            return iHashCode + (headers != null ? headers.hashCode() : 0);
        }

        public final String toString() {
            return "Success(data=" + this.f47386a + ", responseCode=" + this.f47387b + ", requestUrl=" + this.f47388c + ", headers=" + this.f47389d + ")";
        }

        public b(T t7, int i14, HttpUrl httpUrl, Headers headers) {
            super(null);
            this.f47386a = t7;
            this.f47387b = i14;
            this.f47388c = httpUrl;
            this.f47389d = headers;
        }
    }
}
