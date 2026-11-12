package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes14.dex */
public class pdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("actionId")
    private String f45196a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.ACTION_TYPE)
    private int f45197c;

    public String d() {
        return this.f45196a;
    }

    public void d(String str) {
        this.f45196a = str;
    }

    public int c() {
        return this.f45197c;
    }

    public void b(int i) {
        this.f45197c = i;
    }
}
