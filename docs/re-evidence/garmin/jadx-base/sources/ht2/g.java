package ht2;

import d53.w;
import i3.e5;
import java.util.LinkedHashMap;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rBi\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lht2/g;", "", "", "enabled", "", "minimumVersion", "priorityZeroVersion", "priorityOneVersion", "priorityTwoVersion", "priorityThreeVersion", "priorityFourVersion", "priorityFiveVersion", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "b", "a", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i63.h
public final class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f85646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f85647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f85648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f85649h;

    public /* synthetic */ g(int i14, boolean z14, String str, String str2, String str3, String str4, String str5, String str6, String str7, u1 u1Var) {
        this.f85642a = (i14 & 1) == 0 ? true : z14;
        if ((i14 & 2) == 0) {
            this.f85643b = null;
        } else {
            this.f85643b = str;
        }
        if ((i14 & 4) == 0) {
            this.f85644c = null;
        } else {
            this.f85644c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f85645d = null;
        } else {
            this.f85645d = str3;
        }
        if ((i14 & 16) == 0) {
            this.f85646e = null;
        } else {
            this.f85646e = str4;
        }
        if ((i14 & 32) == 0) {
            this.f85647f = null;
        } else {
            this.f85647f = str5;
        }
        if ((i14 & 64) == 0) {
            this.f85648g = null;
        } else {
            this.f85648g = str6;
        }
        if ((i14 & 128) == 0) {
            this.f85649h = null;
        } else {
            this.f85649h = str7;
        }
    }

    public static void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(str, (str2 == null || w.J(str2)) ? null : new o13.p(str2, Long.valueOf(gl1.d.c0(str2))));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Config(enabled=");
        sb3.append(this.f85642a);
        sb3.append(", minimumVersion=");
        sb3.append(this.f85643b);
        sb3.append(", priorityZeroVersion=");
        sn.a.t(sb3, this.f85644c, ", priorityOneVersion=", this.f85645d, ", priorityTwoVersion=");
        sn.a.t(sb3, this.f85646e, ", priorityThreeVersion=", this.f85647f, ", priorityFourVersion=");
        return e5.h(sb3, this.f85648g, ", priorityFiveVersion=", this.f85649h, ")");
    }

    /* JADX INFO: renamed from: ht2.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lht2/g$b;", "", "<init>", "()V", "Li63/c;", "Lht2/g;", "serializer", "()Li63/c;", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f85650a;
        }

        private Companion() {
        }
    }

    public g() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null);
    }

    public g(boolean z14, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f85642a = z14;
        this.f85643b = str;
        this.f85644c = str2;
        this.f85645d = str3;
        this.f85646e = str4;
        this.f85647f = str5;
        this.f85648g = str6;
        this.f85649h = str7;
    }

    public /* synthetic */ g(boolean z14, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7);
    }
}
