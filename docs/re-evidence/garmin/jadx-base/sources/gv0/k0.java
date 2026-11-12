package gv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lgv0/k0;", "", "<init>", "()V", "b", "c", "a", "Lgv0/k0$a;", "Lgv0/k0$b;", "Lgv0/k0$c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class k0 {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgv0/k0$a;", "Lgv0/k0;", "", "title", "message", "Lpu0/b;", "contact", "recipient", "oldRecipient", "", "resend", "isMessengerInvite", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpu0/b;Lpu0/b;Lpu0/b;ZZ)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final pu0.b f79304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pu0.b f79305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final pu0.b f79306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f79307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f79308g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, pu0.b bVar, pu0.b bVar2, pu0.b bVar3, boolean z14, boolean z15) {
            super(null);
            str.getClass();
            str2.getClass();
            bVar.getClass();
            bVar2.getClass();
            this.f79302a = str;
            this.f79303b = str2;
            this.f79304c = bVar;
            this.f79305d = bVar2;
            this.f79306e = bVar3;
            this.f79307f = z14;
            this.f79308g = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f79302a, aVar.f79302a) && p005kotlin.jvm.internal.s.g(this.f79303b, aVar.f79303b) && p005kotlin.jvm.internal.s.g(this.f79304c, aVar.f79304c) && p005kotlin.jvm.internal.s.g(this.f79305d, aVar.f79305d) && p005kotlin.jvm.internal.s.g(this.f79306e, aVar.f79306e) && this.f79307f == aVar.f79307f && this.f79308g == aVar.f79308g;
        }

        public final int hashCode() {
            int iHashCode = (this.f79305d.hashCode() + ((this.f79304c.hashCode() + wr.g.j(this.f79302a.hashCode() * 31, 31, this.f79303b)) * 31)) * 31;
            pu0.b bVar = this.f79306e;
            return Boolean.hashCode(this.f79308g) + q6.f.g((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f79307f);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("ConfirmationRequired(title=", this.f79302a, ", message=", this.f79303b, ", contact=");
            sbI.append(this.f79304c);
            sbI.append(", recipient=");
            sbI.append(this.f79305d);
            sbI.append(", oldRecipient=");
            sbI.append(this.f79306e);
            sbI.append(", resend=");
            sbI.append(this.f79307f);
            sbI.append(", isMessengerInvite=");
            return hb.a.k(sbI, this.f79308g, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgv0/k0$b;", "Lgv0/k0;", "", "recipientId", "", "resend", "<init>", "(Ljava/lang/String;Z)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79310b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z14) {
            super(null);
            str.getClass();
            this.f79309a = str;
            this.f79310b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f79309a, bVar.f79309a) && this.f79310b == bVar.f79310b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f79310b) + (this.f79309a.hashCode() * 31);
        }

        public final String toString() {
            return n23.j.g("InviteToMessenger(recipientId=", this.f79309a, ", resend=", this.f79310b, ")");
        }
    }

    public /* synthetic */ k0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private k0() {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgv0/k0$c;", "Lgv0/k0;", "Lpu0/b;", "contact", "recipient", "oldRecipient", "", "resend", "<init>", "(Lpu0/b;Lpu0/b;Lpu0/b;Z)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pu0.b f79311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final pu0.b f79312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final pu0.b f79313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f79314d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pu0.b bVar, pu0.b bVar2, pu0.b bVar3, boolean z14) {
            super(null);
            bVar.getClass();
            bVar2.getClass();
            this.f79311a = bVar;
            this.f79312b = bVar2;
            this.f79313c = bVar3;
            this.f79314d = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f79311a, cVar.f79311a) && p005kotlin.jvm.internal.s.g(this.f79312b, cVar.f79312b) && p005kotlin.jvm.internal.s.g(this.f79313c, cVar.f79313c) && this.f79314d == cVar.f79314d;
        }

        public final int hashCode() {
            int iHashCode = (this.f79312b.hashCode() + (this.f79311a.hashCode() * 31)) * 31;
            pu0.b bVar = this.f79313c;
            return Boolean.hashCode(this.f79314d) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
        }

        public final String toString() {
            return "SendSmsOptIn(contact=" + this.f79311a + ", recipient=" + this.f79312b + ", oldRecipient=" + this.f79313c + ", resend=" + this.f79314d + ")";
        }

        public /* synthetic */ c(pu0.b bVar, pu0.b bVar2, pu0.b bVar3, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, bVar2, (i14 & 4) != 0 ? null : bVar3, z14);
        }
    }
}
