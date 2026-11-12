package x21;

import android.speech.SpeechRecognizer;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx21/d;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f188497a;

    public d(c cVar) {
        this.f188497a = cVar;
    }

    @Override // p3.h0
    public final void dispose() {
        Object bVar;
        g gVar = this.f188497a.f188496f;
        gVar.h();
        SpeechRecognizer speechRecognizer = gVar.f188511i;
        if (speechRecognizer != null) {
            try {
                int i14 = q.f128596b;
                speechRecognizer.destroy();
                bVar = Unit.INSTANCE;
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            q.a(bVar);
        }
        gVar.f188511i = null;
        gVar.f188515m = null;
    }
}
