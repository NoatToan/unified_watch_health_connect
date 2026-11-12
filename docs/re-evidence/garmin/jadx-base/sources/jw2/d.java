package jw2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.annotations.SerializedName;
import cx2.g;
import gw2.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljw2/d;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f101374a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ljw2/d$a;", "", "<init>", "()V", "b", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: jw2.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljw2/d$a$a;", "", "", "handle", "text", "", "formatArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getHandle", "()Ljava/lang/String;", "b", "getText", "c", "Ljava/util/List;", "getFormatArgs", "()Ljava/util/List;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1949a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @SerializedName("handle")
            private final String handle;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @SerializedName("text")
            private final String text;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @SerializedName("formatArgs")
            private final List<String> formatArgs;

            public C1949a(String str, String str2, List<String> list) {
                this.handle = str;
                this.text = str2;
                this.formatArgs = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1949a)) {
                    return false;
                }
                C1949a c1949a = (C1949a) obj;
                return s.g(this.handle, c1949a.handle) && s.g(this.text, c1949a.text) && s.g(this.formatArgs, c1949a.formatArgs);
            }

            public final int hashCode() {
                String str = this.handle;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.text;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<String> list = this.formatArgs;
                return iHashCode2 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                String str = this.handle;
                String str2 = this.text;
                return z.c(p6.b.i("FormattableString(handle=", str, ", text=", str2, ", formatArgs="), this.formatArgs, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Ljw2/d$a$b;", "", "Ljw2/d$a$a;", "title", "message", "neutralText", "<init>", "(Ljw2/d$a$a;Ljw2/d$a$a;Ljw2/d$a$a;)V", "a", "Ljw2/d$a$a;", "getTitle", "()Ljw2/d$a$a;", "b", "getMessage", "c", "getNeutralText", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @SerializedName("title")
            private final C1949a title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @SerializedName("message")
            private final C1949a message;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @SerializedName("neutralText")
            private final C1949a neutralText;

            public b(C1949a c1949a, C1949a c1949a2, C1949a c1949a3) {
                this.title = c1949a;
                this.message = c1949a2;
                this.neutralText = c1949a3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return s.g(this.title, bVar.title) && s.g(this.message, bVar.message) && s.g(this.neutralText, bVar.neutralText);
            }

            public final int hashCode() {
                C1949a c1949a = this.title;
                int iHashCode = (c1949a == null ? 0 : c1949a.hashCode()) * 31;
                C1949a c1949a2 = this.message;
                int iHashCode2 = (iHashCode + (c1949a2 == null ? 0 : c1949a2.hashCode())) * 31;
                C1949a c1949a3 = this.neutralText;
                return iHashCode2 + (c1949a3 != null ? c1949a3.hashCode() : 0);
            }

            public final String toString() {
                return "InformationMessage(title=" + this.title + ", message=" + this.message + ", neutralText=" + this.neutralText + ")";
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static jw2.a a(Context context, String str) {
            HashMap map;
            Boolean bool;
            Boolean bool2;
            HashMap map2;
            Map map3;
            Map map4;
            context.getClass();
            if (str == null) {
                return new jw2.a(false, false, null, null, 15, null);
            }
            com.garmin.realtimesettings.app.util.a.f52669a.getClass();
            HashMap mapB = com.garmin.realtimesettings.app.util.a.C1130a.b(str);
            Object obj = mapB.get(i.UPDATED_SETTINGS.f79975a);
            tv2.b bVar = null;
            Map map5 = null;
            bVar = null;
            try {
                if (!(obj instanceof HashMap)) {
                    obj = null;
                }
                map = (HashMap) obj;
            } catch (ClassCastException unused) {
                map = null;
            }
            Object obj2 = mapB.get(i.EXIT_INSTANTIATION.f79975a);
            try {
                if (!(obj2 instanceof Boolean)) {
                    obj2 = null;
                }
                bool = (Boolean) obj2;
            } catch (ClassCastException unused2) {
                bool = null;
            }
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Object obj3 = mapB.get(i.INVALIDATE.f79975a);
            try {
                if (!(obj3 instanceof Boolean)) {
                    obj3 = null;
                }
                bool2 = (Boolean) obj3;
            } catch (ClassCastException unused3) {
                bool2 = null;
            }
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Object obj4 = mapB.get(i.INFORMATION_MESSAGE.f79975a);
            try {
                if (!(obj4 instanceof HashMap)) {
                    obj4 = null;
                }
                map2 = (HashMap) obj4;
            } catch (ClassCastException unused4) {
                map2 = null;
            }
            if (map2 != null && !map2.isEmpty()) {
                tv2.a.f166658a.getClass();
                if (map2.isEmpty()) {
                    bVar = new tv2.b(new tv2.c(null, null, null, null, context.getString(R.string.unable_to_update_settings), 15, null), new tv2.c(null, null, null, null, context.getString(R.string.unable_to_update_settings_description), 15, null), new tv2.c(null, null, null, null, context.getString(R.string.lbl_ok), 15, null));
                } else {
                    Object obj5 = map2.get(i.NEUTRAL_TEXT.f79975a);
                    try {
                        if (!(obj5 instanceof Map)) {
                            obj5 = null;
                        }
                        map3 = (Map) obj5;
                    } catch (ClassCastException unused5) {
                        map3 = null;
                    }
                    tv2.c cVarB = g.b(map3);
                    Object obj6 = map2.get(i.TITLE.f79975a);
                    try {
                        if (!(obj6 instanceof Map)) {
                            obj6 = null;
                        }
                        map4 = (Map) obj6;
                    } catch (ClassCastException unused6) {
                        map4 = null;
                    }
                    tv2.c cVarB2 = g.b(map4);
                    Object obj7 = map2.get(i.MESSAGE.f79975a);
                    try {
                        if (!(obj7 instanceof Map)) {
                            obj7 = null;
                        }
                        map5 = (Map) obj7;
                    } catch (ClassCastException unused7) {
                    }
                    bVar = new tv2.b(cVarB2, g.b(map5), cVarB);
                }
            }
            return new jw2.a(zBooleanValue, zBooleanValue2, map, bVar);
        }

        private a() {
        }
    }
}
