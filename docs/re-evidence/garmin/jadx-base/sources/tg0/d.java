package tg0;

import android.widget.TextView;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tg0.d.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0003\b\t\nB\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Ltg0/d;", "Ltg0/d$b;", "TextModelImpl", "Lid1/c$a;", "Ltg0/d$c;", "mConfigurator", "<init>", "(Ltg0/d$c;)V", "c", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d<TextModelImpl extends b> implements id1.c.a<TextModelImpl> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltg0/d$a;", "Lid1/c$c;", "Landroid/widget/TextView;", "mTextView", "Lid1/c$d;", "mDelegate", "<init>", "(Ltg0/d;Landroid/widget/TextView;Lid1/c$d;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends id1.c.AbstractC1775c<TextModelImpl> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f164496c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, TextView textView, id1.c.d dVar2) {
            super(textView, dVar2);
            textView.getClass();
            dVar2.getClass();
            this.f164496c = textView;
            dVar.getClass();
        }

        @Override // id1.c.AbstractC1775c
        public final void e(id1.c.e eVar) {
            b bVar = (b) eVar;
            String text = bVar.getText();
            TextView textView = this.f164496c;
            textView.setText(text);
            l<TextView, Unit> lVarB = bVar.b();
            if (lVarB != null) {
                lVarB.invoke(textView);
            }
        }
    }

    public interface b extends id1.c.e {
        @Override // id1.c.e
        default boolean a(id1.c.e eVar) {
            eVar.getClass();
            return (eVar instanceof b) && s.g(getText(), ((b) eVar).getText());
        }

        l<TextView, Unit> b();

        String getText();
    }

    public interface c {
    }

    public /* synthetic */ d(c cVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : cVar);
    }

    public d(c cVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
