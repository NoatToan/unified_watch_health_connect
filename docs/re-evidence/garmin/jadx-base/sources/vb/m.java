package vb;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Splitter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Splitter f176783d = Splitter.on(CoreConstants.COLON_CHAR);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Splitter f176784e = Splitter.on('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f176785a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f176786b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f176787c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f176788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f176789b;

        public a(int i14, long j8, int i15) {
            this.f176788a = j8;
            this.f176789b = i15;
        }
    }
}
