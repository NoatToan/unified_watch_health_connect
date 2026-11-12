package qu0;

import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqu0/a;", "", "Lpu0/b;", "recipient", "", "bottomLine", "", "isMessenger", "displayError", "Lkotlin/Function0;", "", "onRecipientClicked", "<init>", "(Lpu0/b;Ljava/lang/String;ZZLe23/a;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu0.b f147866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f147869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f147870e;

    public a(pu0.b bVar, String str, boolean z14, boolean z15, e23.a<Unit> aVar) {
        bVar.getClass();
        str.getClass();
        this.f147866a = bVar;
        this.f147867b = str;
        this.f147868c = z14;
        this.f147869d = z15;
        this.f147870e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f147866a, aVar.f147866a) && s.g(this.f147867b, aVar.f147867b) && this.f147868c == aVar.f147868c && this.f147869d == aVar.f147869d && s.g(this.f147870e, aVar.f147870e);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(g.j(this.f147866a.hashCode() * 31, 31, this.f147867b), 31, this.f147868c), 31, this.f147869d);
        e23.a<Unit> aVar = this.f147870e;
        return iG + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GroupItem(recipient=");
        sb3.append(this.f147866a);
        sb3.append(", bottomLine=");
        sb3.append(this.f147867b);
        sb3.append(", isMessenger=");
        kg.f.q(", displayError=", ", onRecipientClicked=", sb3, this.f147868c, this.f147869d);
        return j.i(sb3, this.f147870e, ")");
    }

    public /* synthetic */ a(pu0.b bVar, String str, boolean z14, boolean z15, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, str, z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? null : aVar);
    }
}
