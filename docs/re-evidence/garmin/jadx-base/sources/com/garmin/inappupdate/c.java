package com.garmin.inappupdate;

import ht1.v;
import i63.h;
import o13.m;
import o13.n;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.inappupdate.c[], still in use, count: 1, list:
  (r0v1 com.garmin.inappupdate.c[]) from 0x0057: CONSTRUCTOR (r0v1 com.garmin.inappupdate.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/inappupdate/c;", "", "", "googleUpdatePriority", "promptDelaySeconds", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;)V", "Companion", "a", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@h
public final class c {
    NO_PROMPT(0, 0),
    PROMPT_ONCE(1, 0),
    /* JADX INFO: Fake field, exist only in values array */
    PROMPT_WEEKLY(2, Integer.valueOf(DateTimeConstants.SECONDS_PER_WEEK)),
    /* JADX INFO: Fake field, exist only in values array */
    PROMPT_DAILY(3, Integer.valueOf(DateTimeConstants.SECONDS_PER_DAY)),
    PROMPT_CONFIGURABLE(4, null),
    PROMPT_REQUIRED_UPDATE(5, 0);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f52405c = m.a(n.PUBLICATION, new v(3));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f52411i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f52413b;

    static {
        f52411i = new w13.c(new c[]{r0, r1, r2, r3, r4, r5});
    }

    public /* synthetic */ c(String str, int i14, int i15, Integer num, int i16, j jVar) {
        this(i15, (i16 & 2) != 0 ? null : num);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f52410h.clone();
    }

    /* JADX INFO: renamed from: com.garmin.inappupdate.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/inappupdate/c$a;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/inappupdate/c;", "serializer", "()Li63/c;", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<c> serializer() {
            return (i63.c) c.f52405c.getValue();
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    private c(int i14, Integer num) {
        super(str, i);
        this.f52412a = i14;
        this.f52413b = num;
    }
}
