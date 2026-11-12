package da2;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58912b;

    public k(String str, String str2) {
        this.f58912b = null;
        this.f58911a = str;
        this.f58912b = TextUtils.isEmpty(str2) ? str : str2;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        stringBuffer.append(this.f58911a);
        stringBuffer.append(", ");
        stringBuffer.append(this.f58912b);
        stringBuffer.append(", ]");
        return stringBuffer.toString();
    }
}
