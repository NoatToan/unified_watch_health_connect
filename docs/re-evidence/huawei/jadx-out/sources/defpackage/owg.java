package defpackage;

import com.huawei.hms.common.internal.Preconditions;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class owg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<owf> f44912a;
    private String d;

    public owg(String str, List<owf> list) {
        Preconditions.checkNotNull(str);
        this.d = str;
        this.f44912a = list;
    }

    public List<owf> c() {
        return this.f44912a;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "DataType{%s%s}", this.d, this.f44912a);
    }
}
