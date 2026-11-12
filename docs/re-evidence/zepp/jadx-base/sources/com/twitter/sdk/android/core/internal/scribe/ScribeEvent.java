package com.twitter.sdk.android.core.internal.scribe;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ScribeEvent {
    private static final String f = "2";

    @SerializedName("event_namespace")
    public final EventNamespace a;

    @SerializedName(AuthHandler.d)
    public final String b;

    @SerializedName("format_version")
    public final String c;

    @SerializedName("_category_")
    public final String d;

    @SerializedName("items")
    public final List<ScribeItem> e;

    public static class Transform implements EventTransform<ScribeEvent> {
        private final Gson a;

        public Transform(Gson gson) {
            this.a = gson;
        }

        @Override // com.twitter.sdk.android.core.internal.scribe.EventTransform
        public byte[] toBytes(ScribeEvent scribeEvent) throws IOException {
            return this.a.toJson(scribeEvent).getBytes("UTF-8");
        }
    }

    public ScribeEvent(String str, EventNamespace eventNamespace, long j) {
        this(str, eventNamespace, j, Collections.emptyList());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScribeEvent scribeEvent = (ScribeEvent) obj;
        String str = this.d;
        if (str == null ? scribeEvent.d != null : !str.equals(scribeEvent.d)) {
            return false;
        }
        EventNamespace eventNamespace = this.a;
        if (eventNamespace == null ? scribeEvent.a != null : !eventNamespace.equals(scribeEvent.a)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? scribeEvent.c != null : !str2.equals(scribeEvent.c)) {
            return false;
        }
        String str3 = this.b;
        if (str3 == null ? scribeEvent.b != null : !str3.equals(scribeEvent.b)) {
            return false;
        }
        List<ScribeItem> list = this.e;
        List<ScribeItem> list2 = scribeEvent.e;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        EventNamespace eventNamespace = this.a;
        int iHashCode = (eventNamespace != null ? eventNamespace.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<ScribeItem> list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("event_namespace=");
        sb.append(this.a);
        sb.append(", ts=");
        sb.append(this.b);
        sb.append(", format_version=");
        sb.append(this.c);
        sb.append(", _category_=");
        sb.append(this.d);
        sb.append(", items=");
        sb.append("[" + TextUtils.join(", ", this.e) + "]");
        return sb.toString();
    }

    public ScribeEvent(String str, EventNamespace eventNamespace, long j, List<ScribeItem> list) {
        this.d = str;
        this.a = eventNamespace;
        this.b = String.valueOf(j);
        this.c = "2";
        this.e = Collections.unmodifiableList(list);
    }
}
