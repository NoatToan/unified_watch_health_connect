package defpackage;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt16;

/* JADX INFO: loaded from: classes3.dex */
public class wdt implements Layout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @yn(1)
    public UInt16 f37882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @yn(2)
    public boolean f37883b;

    public AppCardsResponse a() {
        p3 p3VarA = p3.a(this.f37882a.ensureValue().intValue());
        if (p3VarA == null) {
            return null;
        }
        return new AppCardsResponse(p3VarA, this.f37883b);
    }
}
