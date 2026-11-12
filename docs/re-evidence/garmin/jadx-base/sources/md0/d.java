package md0;

import java.util.List;
import n72.k;
import n72.r;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmd0/d;", "Lm72/i;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements m72.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f117899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f117900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f117901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f117902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f117903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f117904f;

    public d() {
        int iA = k.a();
        c.f117892a.getClass();
        this.f117899a = new r(iA, "Dialogs", "", null, c.f117893b, 8, null);
        this.f117900b = new r(k.a(), "Progress Bars", "Horizontal progress bars which support multiple values and spacers", null, c.f117894c, 8, null);
        this.f117901c = new r(k.a(), "User Profile Image", "", null, c.f117895d, 8, null);
        this.f117902d = new r(k.a(), "Expandable Text Container", "A text container that truncates text over a certain number of lines and allows expanding/collapsing the text.", null, c.f117896e, 8, null);
        this.f117903e = new r(k.a(), "Follow Item View", "Display a single user in user list", null, c.f117897f, 8, null);
        this.f117904f = new r(k.a(), "Animation Examples", "Examples of animations used in GCM", null, c.f117898g, 8, null);
    }

    @Override // m72.i
    public final List<n72.i> a() {
        return x.k(this.f117899a, this.f117900b, this.f117901c, this.f117902d, this.f117903e, this.f117904f);
    }
}
