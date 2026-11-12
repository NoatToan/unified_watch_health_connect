package ca0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lca0/b2;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public enum b2 {
    /* JADX INFO: Fake field, exist only in values array */
    STARTUP_CONSENTS,
    /* JADX INFO: Fake field, exist only in values array */
    DISCOVERY,
    PAIRING,
    BLE_CONNECTION_MODE,
    DEVICE_MIGRATION,
    USER_PROFILE,
    DEVICE_CUSTOMIZATION,
    PERMISSIONS,
    CONSENT,
    FAVORITE_ACTIVITIES,
    SYNC,
    GESTURE_TUTORIAL,
    IN_REACH,
    WIFI,
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHPAD,
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_TUTORIAL,
    /* JADX INFO: Fake field, exist only in values array */
    END_FLOW;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26124a = o13.m.a(o13.n.PUBLICATION, new a2(6));

    /* JADX INFO: renamed from: ca0.b2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca0/b2$a;", "", "<init>", "()V", "Li63/c;", "Lca0/b2;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b2> serializer() {
            return (i63.c) b2.f26124a.getValue();
        }

        private Companion() {
        }
    }
}
