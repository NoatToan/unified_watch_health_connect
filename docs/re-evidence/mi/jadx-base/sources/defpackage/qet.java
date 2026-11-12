package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class qet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31458a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31459b = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof qet)) {
            return false;
        }
        qet qetVar = (qet) obj;
        return !TextUtils.isEmpty(qetVar.f31459b) && qetVar.f31459b.equals(this.f31459b);
    }
}
