package xn2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxn2/a;", "", "EventHandler", "Lbr2/h;", "Lsy2/e;", "Lvq2/e;", "Lyn2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<EventHandler> extends br2.h implements sy2.e<EventHandler>, vq2.e, yn2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EventHandler f191683a;

    @Override // sy2.e
    public final void a(EventHandler eventhandler) {
        eventhandler.getClass();
        this.f191683a = eventhandler;
    }

    @Override // sy2.e
    public final EventHandler b() {
        EventHandler eventhandler = this.f191683a;
        if (eventhandler != null) {
            return eventhandler;
        }
        p005kotlin.jvm.internal.s.m("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f191683a = (EventHandler) ((sy2.e) context).b();
        } catch (Throwable unused) {
            u6().finish();
        }
    }
}
