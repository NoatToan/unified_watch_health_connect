package oe;

import android.graphics.Rect;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Loe/d;", "Loe/c;", "Lme/b;", "featureBounds", "Loe/d$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "Loe/c$c;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Lme/b;Loe/d$b;Loe/c$c;)V", "a", "b", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f131207d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me.b f131208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final b type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    public final c.C2494c state;

    public d(me.b bVar, b bVar2, c.C2494c c2494c) {
        bVar.getClass();
        bVar2.getClass();
        c2494c.getClass();
        this.f131208a = bVar;
        this.type = bVar2;
        this.state = c2494c;
        f131207d.getClass();
        if (bVar.b() == 0 && bVar.a() == 0) {
            vb.h.s("Bounds must be non zero");
            throw null;
        }
        if (bVar.f117950a == 0 || bVar.f117951b == 0) {
            return;
        }
        vb.h.s("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    @Override // oe.c
    public final boolean a() {
        b.f131211b.getClass();
        b bVar = b.f131213d;
        b bVar2 = this.type;
        if (bVar2.equals(bVar)) {
            return true;
        }
        return bVar2.equals(b.f131212c) && this.state.equals(c.C2494c.f131205c);
    }

    @Override // oe.c
    public final c.a b() {
        me.b bVar = this.f131208a;
        return (bVar.b() == 0 || bVar.a() == 0) ? c.a.f131198b : c.a.f131199c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        d dVar = (d) obj;
        return this.f131208a.equals(dVar.f131208a) && this.type.equals(dVar.type) && this.state.equals(dVar.state);
    }

    @Override // oe.a
    public final Rect getBounds() {
        return this.f131208a.c();
    }

    @Override // oe.c
    public final c.b getOrientation() {
        me.b bVar = this.f131208a;
        return bVar.b() > bVar.a() ? c.b.f131202c : c.b.f131201b;
    }

    @Override // oe.c
    public final c.C2494c getState() {
        return this.state;
    }

    public final int hashCode() {
        return this.state.hashCode() + ((this.type.hashCode() + (this.f131208a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return d.class.getSimpleName() + " { " + this.f131208a + ", type=" + this.type + ", state=" + this.state + " }";
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Loe/d$b;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f131211b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f131212c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f131213d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f131214a;

        private b(String str) {
            this.f131214a = str;
        }

        /* JADX INFO: renamed from: toString, reason: from getter */
        public final String getF131214a() {
            return this.f131214a;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loe/d$b$a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loe/d$a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
