package zy;

import d53.u;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\rB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzy/l;", "", "", "replyText", "", "isOnDevice", "", "sortOrder", "title", "info", "itemType", "<init>", "(Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;I)V", "(Ljava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;I)V", "onDevice", "(Ljava/lang/String;ZII)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements Comparable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f207415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f207416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f207417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f207418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f207419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f207420g;

    public l(String str, boolean z14, int i14, String str2, String str3, int i15) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f207414a = str;
        this.f207415b = z14;
        this.f207416c = i14;
        this.f207417d = str2;
        this.f207418e = str3;
        this.f207419f = i15;
        this.f207420g = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        l lVar2 = lVar;
        lVar2.getClass();
        String str = lVar2.f207417d;
        int i14 = this.f207419f;
        int i15 = lVar2.f207419f;
        if (i14 != i15) {
            return i14 - i15;
        }
        String str2 = this.f207417d;
        if (i14 != 0) {
            if (i14 == 1) {
                return this.f207416c - lVar2.f207416c;
            }
            if (i14 != 2) {
                if (i14 == 3) {
                    return u.l(this.f207414a, lVar2.f207414a);
                }
                if (i14 != 4) {
                    return u.l(str2, str);
                }
            }
        }
        return u.l(str2, str);
    }

    public final String toString() {
        boolean z14 = this.f207415b;
        int i14 = this.f207416c;
        int i15 = this.f207419f;
        StringBuilder sbD = zl.a.d("TextReplyItem{mReplyText='", this.f207414a, "', mOnDevice=", z14, ", mSortOrder=");
        wr.g.t(i14, ", mTitle='", this.f207417d, "', mInfo='", sbD);
        sbD.append(this.f207418e);
        sbD.append("', mItemType=");
        sbD.append(i15);
        sbD.append(StringSubstitutor.DEFAULT_VAR_END);
        return sbD.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, int i14) {
        this(str, "", i14);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, int i14) {
        this("", false, -1, str, str2, i14);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, boolean z14, int i14, int i15) {
        this(str, z14, i14, "", "", i15);
        str.getClass();
    }
}
