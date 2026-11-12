package md;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmd/j;", "", "", TtmlNode.ATTR_ID, "sequence", "", Constants.MessagePayloadKeys.FROM, "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements Comparable<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f117864d;

    public j(int i14, int i15, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f117861a = i14;
        this.f117862b = i15;
        this.f117863c = str;
        this.f117864d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        j jVar2 = jVar;
        jVar2.getClass();
        int i14 = this.f117861a - jVar2.f117861a;
        return i14 == 0 ? this.f117862b - jVar2.f117862b : i14;
    }
}
