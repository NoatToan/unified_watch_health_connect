package zy2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzy2/c;", "", "<init>", "()V", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f207527a = new c();

    private c() {
    }

    public final b a(String str) {
        Logger logger = LoggerFactory.getLogger(str);
        logger.getClass();
        return new b(str, logger);
    }
}
