package g63;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg63/o;", "Output", "", "", "Lg63/m;", "operations", "followedBy", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<m<Output>> f76149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o<Output>> f76150b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(List<? extends m<? super Output>> list, List<? extends o<? super Output>> list2) {
        list.getClass();
        list2.getClass();
        this.f76149a = list;
        this.f76150b = list2;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(h0.k0(this.f76149a, ", ", null, null, null, 62));
        sb3.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        return a0.m(sb3, h0.k0(this.f76150b, ";", null, null, null, 62), CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
