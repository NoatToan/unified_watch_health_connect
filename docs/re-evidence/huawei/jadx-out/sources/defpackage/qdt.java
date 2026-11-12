package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class qdt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("trendChangeItem")
    private int f46033c;

    @SerializedName("dataExceptionItem")
    private int d;

    public int a() {
        return this.f46033c;
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        return "DataStatictics{dataExceptionItem=" + this.d + ", trendChangeItem=" + this.f46033c + '}';
    }
}
