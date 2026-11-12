package sy2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sy2.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\u00028\u00008\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lsy2/a;", "Lsy2/d;", "PresenterType", "Lsy2/c;", "<init>", "()V", "b", "Lsy2/d;", "J0", "()Lsy2/d;", "K0", "(Lsy2/d;)V", "presenter", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<PresenterType extends d<?, ?>> implements c<PresenterType> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public PresenterType presenter;

    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public PresenterType b() {
        PresenterType presentertype = this.presenter;
        if (presentertype != null) {
            return presentertype;
        }
        s.m("presenter");
        throw null;
    }

    @Override // sy2.c
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void a(PresenterType presentertype) {
        presentertype.getClass();
        this.presenter = presentertype;
    }
}
