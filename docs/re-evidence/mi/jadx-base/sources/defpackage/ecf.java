package defpackage;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ecf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("medals")
    public List<a> f16485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("totalGot")
    public int f16486b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("data")
        public List<C0923a> f16487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("category")
        public String f16488b;

        @SerializedName("categoryId")
        public int c;

        /* JADX INFO: renamed from: ecf$a$a, reason: collision with other inner class name */
        public static class C0923a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16489a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @SerializedName("medalClass")
            public int f16490b;

            @SerializedName("icon")
            public String c;

            @SerializedName("priority")
            public int d;

            @SerializedName("type")
            public int e;

            @SerializedName("got")
            public boolean f;

            @SerializedName("gotTime")
            public long g;

            @SerializedName("pop")
            public boolean h;

            @SerializedName("condition")
            public String i;

            @SerializedName("copywriting")
            public String j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            @SerializedName("displayProgress")
            public boolean f16491k;

            @SerializedName("name")
            public String l;

            @SerializedName("medalType")
            public String m;

            @SerializedName(BroadcastsKt.SILENT_PUSHING_PROGRESS)
            public int n;

            @SerializedName("id")
            public Long o;

            @SerializedName("dareUrl")
            public String p;

            @SerializedName("detailUrl")
            public String q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            @SerializedName("detailName")
            public String f16492r;

            @SerializedName("category")
            public int s;

            @SerializedName("progressValue")
            public int t;

            @SerializedName("progressTarget")
            public int u;

            @SerializedName("progressUnit")
            public String v;

            @SerializedName("gotCount")
            public int w;

            @SerializedName("rank")
            public int x;

            public String toString() {
                return "MedalData{turnId=" + this.f16489a + ", medalClass=" + this.f16490b + ", icon='" + this.c + "', priority=" + this.d + ", type=" + this.e + ", got=" + this.f + ", gotTime=" + this.g + ", pop=" + this.h + ", condition='" + this.i + "', copywriting='" + this.j + "', displayProgress=" + this.f16491k + ", name='" + this.l + "', medalType='" + this.m + "', progress=" + this.n + ", id=" + this.o + ", dareUrl='" + this.p + "', detailUrl='" + this.q + "', detailName='" + this.f16492r + "', category=" + this.s + ", progressValue=" + this.t + ", progressTarget=" + this.u + ", progressUnit=" + this.v + ", gotCount=" + this.w + ", rank=" + this.x + AbstractJsonLexerKt.END_OBJ;
            }
        }
    }
}
