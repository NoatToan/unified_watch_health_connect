package com.garmin.gfdi.file;

import java.util.LinkedHashSet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/gfdi/file/e;", "", "", "rawValue", "<init>", "(Ljava/lang/String;II)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum e {
    READ(128),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE(64),
    /* JADX INFO: Fake field, exist only in values array */
    ERASE(32),
    ARCHIVE(16),
    /* JADX INFO: Fake field, exist only in values array */
    APPEND(8),
    /* JADX INFO: Fake field, exist only in values array */
    CRYPTO(4);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52394b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52398a;

    e(int i14) {
        this.f52398a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/gfdi/file/e$a;", "", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static LinkedHashSet a(int i14) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (e eVar : e.values()) {
                if ((eVar.f52398a & i14) != 0) {
                    linkedHashSet.add(eVar);
                }
            }
            return linkedHashSet;
        }

        private a() {
        }
    }
}
