package l20;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ll20/m;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum m {
    NONE(1),
    AUTO_LIVE_TRACK(2),
    PRIMARY(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f109021b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109026a;

    m(int i14) {
        this.f109026a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll20/m$a;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001c  */
        /* JADX WARN: Code duplicated, block: B:15:0x001f A[RETURN] */
        public static m a(Integer num) {
            for (m mVar : m.values()) {
                int i14 = mVar.f109026a;
                if (num != null && i14 == num.intValue()) {
                    if (mVar == null) {
                        return m.NONE;
                    }
                    return mVar;
                }
            }
            mVar = null;
            if (mVar == null) {
                return m.NONE;
            }
            return mVar;
        }

        private a() {
        }
    }
}
